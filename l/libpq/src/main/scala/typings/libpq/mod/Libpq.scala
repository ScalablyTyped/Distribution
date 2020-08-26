package typings.libpq.mod

import typings.libpq.libpqBooleans.`true`
import typings.node.bufferMod.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Libpq extends EventEmitter {
  /**
    * Current connection state.
    */
  var connected: Boolean = js.native
  /**
    * Issues a request to cancel the currently executing query on this instance of libpq.
    *
    * @returns true if the cancel request was sent; a string error message if
    *                             the cancel request failed for any reason. The string will
    *                             contain the error message provided by libpq.
    */
  def cancel(): `true` | String = js.native
  /**
    * Manually frees the memory associated with a PGresult pointer. Generally this is called
    * for you, but if you absolutely want to free the pointer yourself, you can.
    */
  def clear(): Unit = js.native
  /**
    * @returns the status string associated with a result. Something akin to INSERT 3 0
    *                   if you inserted 3 rows.
    */
  def cmdStatus(): String = js.native
  /**
    * @returns the number of tuples (rows) affected by the command. Even though this is a
    *                   number, it is returned as a string to mirror libpq's behavior.
    */
  def cmdTuples(): String = js.native
  def connect(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /**
    * (async) Connects to a PostgreSQL backend server process.
    *
    * This function actually calls the PQconnectdb blocking connection method in a background
    * thread within node's internal thread-pool. There is a way to do non-blocking network I/O
    * for some of the connecting with libpq directly, but it still blocks when your local file
    * system looking for config files, SSL certificates, .pgpass file, and doing possible dns
    * resolution. Because of this, the best way to get fully non-blocking is to juse use
    * libuv_queue_work and let node do it's magic and so that's what I do. This function does
    * not block.
    *
    * @param connectParams an optional string
    * @param callback mandatory. It is called when the connection has successfully been
    *                            established.
    */
  def connect(connectParams: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /**
    * (sync) Attempts to connect to a PostgreSQL server. BLOCKS until it either succeedes, or
    * fails. If it fails it will throw an exception.
    *
    * @param connectionParams an optional string
    */
  def connectSync(): Unit = js.native
  def connectSync(connectionParams: String): Unit = js.native
  /**
    * Reads waiting data from the socket. If the socket is not readable and you call this it will
    * block so be careful and only call it within the readable callback for the most part.
    *
    * @returns true if data was read; false if there was an error. You can access
    *                    error details with [[Libpq.errorMessage]].
    */
  def consumeInput(): Boolean = js.native
  /**
    * Retrieves the last error message from the connection. This is intended to be used after most
    * functions which return an error code to get more detailed error information about the
    * connection. You can also check this before issuing queries to see if your connection has
    * been lost.
    */
  def errorMessage(): String = js.native
  /**
    * Exact copy of the PQescapeIdentifier function within libpq. Requires an established
    * connection but does not perform any I/O.
    */
  def escapeIdentifier(input: String): String = js.native
  /**
    * Exact copy of the PQescapeLiteral function within libpq. Requires an established connection
    * but does not perform any I/O.
    */
  def escapeLiteral(input: String): String = js.native
  /**
    * (sync) Sends a command to the backend and blocks until a result is received.
    *
    * @param [commandText=""] a required string of the query.
    */
  def exec(): Unit = js.native
  def exec(commandText: String): Unit = js.native
  /**
    * (sync) Sends a command and parameters to the backend and blocks until a result is received.
    *
    * @param [commandText=""] a required string of the query.
    * @param [parameters=[]] a required array of string values
    *                                                  corresponding to each parameter in the
    *                                                  commandText.
    */
  def execParams(): Unit = js.native
  def execParams(commandText: js.UndefOr[scala.Nothing], parameters: js.Array[String | Double]): Unit = js.native
  def execParams(commandText: String): Unit = js.native
  def execParams(commandText: String, parameters: js.Array[String | Double]): Unit = js.native
  /**
    * (sync) Sends a command to the server to execute a previously prepared statement. Blocks
    * until the results are returned.
    *
    * @param [statementName=""] a required string of the name of the prepared statement.
    * @param [parameters=[]] the parameters to pass to the prepared
    *                                                  statement.
    */
  def execPrepared(): Unit = js.native
  def execPrepared(statementName: js.UndefOr[scala.Nothing], parameters: js.Array[String | Double]): Unit = js.native
  def execPrepared(statementName: String): Unit = js.native
  def execPrepared(statementName: String, parameters: js.Array[String | Double]): Unit = js.native
  /**
    * Disconnects from the backend and cleans up all memory used by the libpq connection.
    */
  def finish(): Unit = js.native
  /**
    * Flushes buffered data to the socket.
    *
    * @returns 1 if socket is not write-ready at which case you should call
    *                   [[Libpq.writable]] with a callback and wait for the socket to be writable
    *                   and then call [[Libpq.flush]] again; 0 if all data was flushed; -1 if
    *                   there was an error.
    */
  def flush(): Double = js.native
  /**
    * Retrieve the name of the field (column) at the given offset. Offset starts at 0.
    */
  def fname(fieldNumber: Double): String = js.native
  /**
    * Retrieve the Oid of the field (column) at the given offset. Offset starts at 0.
    */
  def ftype(fieldNumber: Double): Double = js.native
  /**
    * After issuing a successfuly command like COPY table TO stdout gets copy data from the
    * connection.
    *
    * @param [async=false] a boolean. Pass false to block waiting for data from the
    *                                backend. Defaults to false.
    *
    * @returns a node buffer if there is data available; 0 if the copy is still in
    *                          progress (only if you have called [[Libpq.setNonBlocking]](true));
    *                          -1 if the copy is completed; -2 if there was an error.
    */
  def getCopyData(): Buffer | Double = js.native
  def getCopyData(async: Boolean): Buffer | Double = js.native
  /**
    * Parses received data from the server into a PGresult struct and sets a pointer internally to
    * the connection object to this result.
    *
    * Warning: this function will block if libpq is waiting on async results to be returned from
    * the server. Call [[Libpq.isBusy]] to determine if this command will block.
    *
    * @returns true if libpq was able to read buffered data & parse a result object;
    *                    false if there are no results waiting to be parsed. Generally doing async
    *                    style queries you'll call this repeadedly until it returns false and then
    *                    use the result accessor methods to pull results out of the current result
    *                    set.
    */
  def getResult(): Boolean = js.native
  /**
    * @returns true if the value at the given offsets is actually null. Otherwise
    *                    returns false. This is because [[Libpq.getvalue]] returns an empty
    *                    string for both an actual empty string and for a null value. Weird, huh?
    */
  def getisnull(tupleNumber: Double, fieldNumber: Double): Boolean = js.native
  /**
    * Retrieve the text value at a given tuple (row) and field (column) offset. Both offsets start
    * at 0. A null value is returned as the empty string ''.
    */
  def getvalue(tupleNumber: Double): String = js.native
  def getvalue(tupleNumber: Double, fieldNumber: Double): String = js.native
  /**
    * @returns true if calling [[Libpq.consumeInput]] would block waiting for more
    * data; false if all data has been read from the socket. Once this returns false it is
    * safe to call [[Libpq.getResult]].
    */
  def isBusy(): Boolean = js.native
  /**
    * @returns true if non-blocking mode is enabled; false if disabled.
    */
  def isNonBlocking(): Boolean = js.native
  /**
    * Retrieve the number of fields (columns) from the result.
    */
  def nfields(): Double = js.native
  /**
    * Checks for NOTIFY messages that have come in. If any have been received they will be in the
    * following format:
    *
    * @example ```ts
    *
    * var msg = {
    *   relname: 'name of channel',
    *   extra: 'message passed to notify command',
    *   be_pid: 130
    * }
    * ```
    */
  def notifies(): NotifyMsg = js.native
  /**
    * Retrieve the number of tuples (rows) from the result.
    */
  def ntuples(): Double = js.native
  /**
    * (sync) Sends a named statement to the server to be prepared for later execution. blocks
    * until a result from the prepare operation is received.
    *
    * @param statementName a required string of name of the statement to prepare.
    * @param commandText a required string of the query.
    * @param nParams a count of the number of parameters in the commandText.
    */
  def prepare(statementName: String, commandText: String, nParams: Double): Unit = js.native
  /**
    * After issuing a successful command like COPY table FROM stdin you can start putting buffers
    * directly into the databse with this function.
    *
    * @param buffer a required node buffer of text data such as
    *                        Buffer('column1\tcolumn2\n')
    *
    * @returns 1 if sent succesfully; 0 if the command would block (only if you have
    *                   called [[Libpq.setNonBlocking]](true)); -1 if there was an error sending
    *                   the command.
    */
  def putCopyData(buffer: Buffer): Double = js.native
  /**
    * Signals the backed your copy procedure is complete. If you pass errorMessage it will be sent
    * to the backend and effectively cancel the copy operation.
    *
    * @param [errorMessage] an optional string you can pass to cancel the copy operation.
    *
    * @returns 1 if sent succesfully; 0 if the command would block (only if you have
    *                   called [[Libpq.setNonBlocking]](true)); -1 if there was an error sending
    *                   the command.
    */
  def putCopyEnd(): Double = js.native
  def putCopyEnd(errorMessage: String): Double = js.native
  /**
    * Retrieves detailed error information from the current result object. Very similar to
    * PQresultErrorField() except instead of passing a fieldCode and retrieving a single field,
    * retrieves all fields from the error at once on a single object. The object returned is a
    * simple hash, not an instance of an error object.
    *
    * If you wanted to access PG_DIAG_MESSAGE_DETAIL you would do the following:
    * @example ```ts
    *
    * console.log(pq.errorFields().messageDetail);
    * ```
    */
  def resultErrorFields(): ResultError = js.native
  /**
    * Retrieves the error message from the result. This will return null if the result does not
    * have an error.
    */
  def resultErrorMessage(): String = js.native
  /**
    * @returns either PGRES_COMMAND_OK or PGRES_FATAL_ERROR depending on the status of
    * the last executed command.
    */
  def resultStatus(): String = js.native
  /**
    * (async) Sends a request to the backend to prepare a named statement with the given name.
    *
    * @param statementName a required string of name of the statement to prepare.
    * @param commandText a required string of the query.
    * @param nParams a count of the number of parameters in the commandText.
    * @returns true if the command was sent succesfully or false if it failed to send.
    */
  def sendPrepare(statementName: String, commandText: String, nParams: Double): Boolean = js.native
  /**
    * (async) Sends a query to the server to be processed.
    *
    * @param [commandText=""] a required string containing the query text.
    * @returns true if the command was sent succesfully or false if it failed to send.
    */
  def sendQuery(): Boolean = js.native
  def sendQuery(commandText: String): Boolean = js.native
  /**
    * (async) Sends a query and to the server to be processed.
    *
    * @param [commandText=""] a required string containing the query text.
    * @param [parameters=[]] an array of parameters as strings used in
    *                                                  the parameterized query.
    * @returns true if the command was sent succesfully or false if it failed to send.
    */
  def sendQueryParams(): Boolean = js.native
  def sendQueryParams(commandText: js.UndefOr[scala.Nothing], parameters: js.Array[String | Double]): Boolean = js.native
  def sendQueryParams(commandText: String): Boolean = js.native
  def sendQueryParams(commandText: String, parameters: js.Array[String | Double]): Boolean = js.native
  /**
    * (async) Sends a request to execute a previously prepared statement.
    *
    * @param [statementName=""] a required string of the name of the prepared statement.
    * @param [parameters=[]] the parameters to pass to the prepared statement.
    * @returns true if the command was sent succesfully or false if it failed to send.
    */
  def sendQueryPrepared(): Boolean = js.native
  def sendQueryPrepared(statementName: js.UndefOr[scala.Nothing], parameters: js.Array[String]): Boolean = js.native
  def sendQueryPrepared(statementName: String): Boolean = js.native
  def sendQueryPrepared(statementName: String, parameters: js.Array[String]): Boolean = js.native
  /**
    * @returns the version of the connected PostgreSQL backend server as a number.
    */
  def serverVersion(): Double = js.native
  /**
    * Toggle the socket blocking on write.
    *
    * @param [nonBlocking] true to set the connection to use non-blocking writes, false to
    *                                use blocking writes.
    *
    * @returns true if the socket's state was succesfully toggled, false if there was
    *                    an error.
    */
  def setNonBlocking(): Boolean = js.native
  def setNonBlocking(nonBlocking: Boolean): Boolean = js.native
  /**
    * @returns an int representing the file descriptor for the socket used internally by
    *                   the connection.
    */
  def socket(): Double = js.native
  /**
    * This uses libuv to start a read watcher on the socket open to the backend. As soon as this
    * socket becomes readable the pq instance will emit a readable event. It is up to you to call
    * [[Libpq.consumeInput]] one or more times to clear this read notification or it will
    * continue to emit read events over and over and over. The exact flow is outlined [here] under
    * the documentation for PQisBusy.
    */
  def startReader(): Unit = js.native
  /**
    * Tells libuv to stop the read watcher on the connection socket.
    */
  def stopReader(): Unit = js.native
  /**
    * Call this to make sure the socket has flushed all data to the operating system. Once the
    * socket is writable, your callback will be called. Usefully when using PQsetNonBlocking
    * and PQflush for async writing.
    */
  def writable(callback: js.Function0[Unit]): this.type = js.native
}

