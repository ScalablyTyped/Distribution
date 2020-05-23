package typings.lokijs.global

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists to web browser's local storage object
  * @constructor LokiLocalStorageAdapter
  */
@JSGlobal("LokiLocalStorageAdapter")
@js.native
class LokiLocalStorageAdapter ()
  extends typings.lokijs.LokiLocalStorageAdapter {
  /**
    * deleteDatabase() - delete the database from localstorage, will throw an error if it
    * can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  /* CompleteClass */
  override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /**
    * loadDatabase() - Load data from localstorage
    * @param dbname - the name of the database to load
    * @param callback - the callback to handle the result
    */
  /* CompleteClass */
  override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ js.Any | Error, Unit]): Unit = js.native
  /**
    * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  /* CompleteClass */
  override def saveDatabase(dbname: String, dbstring: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
}

