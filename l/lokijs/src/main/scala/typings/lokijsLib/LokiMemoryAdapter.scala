package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In in-memory persistence adapter for an in-memory database.
  * This simple 'key/value' adapter is intended for unit testing and diagnostics.
  *
  * @param [options] - memory adapter options
  * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
  * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
  * @constructor LokiMemoryAdapter
  */
@JSGlobal("LokiMemoryAdapter")
@js.native
class LokiMemoryAdapter () extends LokiPersistenceAdapter {
  def this(options: Anon_AsyncResponses) = this()
  var hashStore: org.scalablytyped.runtime.StringDictionary[Anon_Lastsave] = js.native
  var options: Anon_AsyncResponses = js.native
  /**
    * Deletes a database from its in-memory store.
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - function to call when done
    */
  @JSName("deleteDatabase")
  def deleteDatabase_MLokiMemoryAdapter(
    dbname: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def loadDatabase(dbname: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Saves a serialized database to its in-memory store.
    * (Loki persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - adapter callback to return load result to caller
    */
  @JSName("saveDatabase")
  def saveDatabase_MLokiMemoryAdapter(
    dbname: java.lang.String,
    dbstring: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}

