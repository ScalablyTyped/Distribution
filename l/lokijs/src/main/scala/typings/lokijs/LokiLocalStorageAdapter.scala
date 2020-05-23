package typings.lokijs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists to web browser's local storage object
  * @constructor LokiLocalStorageAdapter
  */
trait LokiLocalStorageAdapter extends js.Object {
  /**
    * deleteDatabase() - delete the database from localstorage, will throw an error if it
    * can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
  /**
    * loadDatabase() - Load data from localstorage
    * @param dbname - the name of the database to load
    * @param callback - the callback to handle the result
    */
  def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ js.Any | Error, Unit]): Unit
  /**
    * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  def saveDatabase(dbname: String, dbstring: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
}

object LokiLocalStorageAdapter {
  @scala.inline
  def apply(
    deleteDatabase: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    loadDatabase: (String, js.Function1[/* dataOrError */ js.Any | Error, Unit]) => Unit,
    saveDatabase: (String, String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
  ): LokiLocalStorageAdapter = {
    val __obj = js.Dynamic.literal(deleteDatabase = js.Any.fromFunction2(deleteDatabase), loadDatabase = js.Any.fromFunction2(loadDatabase), saveDatabase = js.Any.fromFunction3(saveDatabase))
    __obj.asInstanceOf[LokiLocalStorageAdapter]
  }
}

