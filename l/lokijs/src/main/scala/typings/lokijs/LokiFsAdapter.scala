package typings.lokijs

import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists using node fs module
  * @constructor LokiFsAdapter
  */
@JSGlobal("LokiFsAdapter")
@js.native
class LokiFsAdapter () extends LokiPersistenceAdapter {
  /**
    * deleteDatabase() - delete the database file, will throw an error if the
    * file can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  @JSName("deleteDatabase")
  def deleteDatabase_MLokiFsAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /* CompleteClass */
  override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  /**
    * saveDatabase() - save data to file, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  @JSName("saveDatabase")
  def saveDatabase_MLokiFsAdapter(dbname: String, dbstring: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  @JSName("saveDatabase")
  def saveDatabase_MLokiFsAdapter(
    dbname: String,
    dbstring: Uint8Array,
    callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
}

