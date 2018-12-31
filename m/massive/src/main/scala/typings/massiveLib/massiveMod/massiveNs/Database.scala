package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database
  extends /* tableName */ org.scalablytyped.runtime.StringDictionary[Writable | js.Any] {
  def attach(entities: js.Array[_]): js.Promise[js.Array[_]] = js.native
  /** Attach an entity to the connected instance. */
  def attach(entities: AnyObject[_]): js.Promise[js.Array[_]] = js.native
  /** Remove all attached entities from the instance, returning it to the pre- introspection state. */
  def clean(): scala.Unit = js.native
  /** Clones the database handle for a task or transaction, replacing the internal instance with a dedicated connection. */
  def clone(conn: ConnectionInfo): Database = js.native
  /** Create a new document table and attach it to the Database for usage. */
  def createDocumentTable(location: java.lang.String): js.Promise[scala.Unit] = js.native
  /**  Create an extension. */
  def createExtension(extensionName: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Create a new schema in the database. */
  def createSchema(schemaName: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Forget an entity. */
  def detach(entityPath: java.lang.String): scala.Unit = js.native
  /** Drop an extension. */
  def dropExtension(extensionName: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Drop a schema and remove it and its owned objects from the Database. */
  def dropSchema(schemaName: java.lang.String): js.Promise[scala.Unit] = js.native
  def dropSchema(schemaName: java.lang.String, options: DropOptions): js.Promise[scala.Unit] = js.native
  /** Drop a table and remove it from the Database. */
  def dropTable(tablePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def dropTable(tablePath: java.lang.String, options: DropOptions): js.Promise[scala.Unit] = js.native
  /** List all the functions and scripts attached to the connected instance. */
  def listFunctions(): js.Promise[js.Array[_]] = js.native
  /** List all the non-pk sequences attached to the connected instance. */
  def listSequences(): js.Promise[js.Array[_]] = js.native
  /** List all the tables attached to the connected instance. */
  def listTables(): js.Promise[js.Array[_]] = js.native
  /** List all the views attached to the connected instance. */
  def listViews(): js.Promise[js.Array[_]] = js.native
  def query(query: java.lang.String): js.Promise[_] = js.native
  def query(query: java.lang.String, params: js.Array[java.lang.String]): js.Promise[_] = js.native
  def query(query: java.lang.String, params: js.Array[java.lang.String], options: ResultProcessingOptions): js.Promise[_] = js.native
  def query(query: Delete): js.Promise[_] = js.native
  def query(query: Delete, params: js.Array[java.lang.String]): js.Promise[_] = js.native
  def query(query: Delete, params: js.Array[java.lang.String], options: ResultProcessingOptions): js.Promise[_] = js.native
  def query(query: Insert): js.Promise[_] = js.native
  def query(query: Insert, params: js.Array[java.lang.String]): js.Promise[_] = js.native
  def query(query: Insert, params: js.Array[java.lang.String], options: ResultProcessingOptions): js.Promise[_] = js.native
  /** Execute a query. */
  def query(query: Select): js.Promise[_] = js.native
  def query(query: Select, params: js.Array[java.lang.String]): js.Promise[_] = js.native
  def query(query: Select, params: js.Array[java.lang.String], options: ResultProcessingOptions): js.Promise[_] = js.native
  def query(query: Update): js.Promise[_] = js.native
  def query(query: Update, params: js.Array[java.lang.String]): js.Promise[_] = js.native
  def query(query: Update, params: js.Array[java.lang.String], options: ResultProcessingOptions): js.Promise[_] = js.native
  /**
    * Synchronize the database API with the current state by scanning for tables, views, functions, and scripts.
    * Objects and files which no longer exist are cleared and new objects and files added.
    */
  def reload(): js.Promise[Database] = js.native
  /** Save a document. */
  def saveDoc(collection: java.lang.String, doc: AnyObject[_]): js.Promise[_] = js.native
  /** Begin a task, returning a copy of the connected instance which will route all queries made in the callback through the task scope. */
  def withConnection(cb: js.Function1[/* withTask */ js.Any, _]): js.Promise[_] = js.native
  def withConnection(cb: js.Function1[/* withTask */ js.Any, _], options: AnyObject[_]): js.Promise[_] = js.native
  /** Begin a transaction, returning a copy of the connected instance which will route all queries made in the callback through the transaction scope. */
  def withTransaction(cb: js.Function1[/* withTx */ js.Any, _]): js.Promise[_] = js.native
  def withTransaction(cb: js.Function1[/* withTx */ js.Any, _], options: AnyObject[_]): js.Promise[_] = js.native
}

