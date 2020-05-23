package typings.lokijs.global

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.anon.AsyncResponses
import typings.lokijs.anon.Lastsave
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_LokiMemoryAdapter")
@js.native
class _LokiMemoryAdapter ()
  extends typings.lokijs.LokiMemoryAdapter {
  /* CompleteClass */
  override var hashStore: StringDictionary[Lastsave] = js.native
  /* CompleteClass */
  override var options: AsyncResponses = js.native
  /**
    * Deletes a database from its in-memory store.
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - function to call when done
    */
  /* CompleteClass */
  @JSName("deleteDatabase")
  override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /* CompleteClass */
  override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  /**
    * Saves a serialized database to its in-memory store.
    * (Loki persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - adapter callback to return load result to caller
    */
  /* CompleteClass */
  @JSName("saveDatabase")
  override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
}

