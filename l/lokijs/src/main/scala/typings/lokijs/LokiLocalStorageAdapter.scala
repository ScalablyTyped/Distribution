package typings.lokijs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists to web browser's local storage object
  * @constructor LokiLocalStorageAdapter
  */
@js.native
trait LokiLocalStorageAdapter extends js.Object {
  /**
    * deleteDatabase() - delete the database from localstorage, will throw an error if it
    * can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /**
    * loadDatabase() - Load data from localstorage
    * @param dbname - the name of the database to load
    * @param callback - the callback to handle the result
    */
  def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ js.Any | Error, Unit]): Unit = js.native
  /**
    * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  def saveDatabase(dbname: String, dbstring: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
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
  @scala.inline
  implicit class LokiLocalStorageAdapterOps[Self <: LokiLocalStorageAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteDatabase(value: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit): Self = this.set("deleteDatabase", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadDatabase(value: (String, js.Function1[/* dataOrError */ js.Any | Error, Unit]) => Unit): Self = this.set("loadDatabase", js.Any.fromFunction2(value))
    @scala.inline
    def setSaveDatabase(value: (String, String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit): Self = this.set("saveDatabase", js.Any.fromFunction3(value))
  }
  
}

