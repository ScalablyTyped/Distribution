package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists to web browser's local storage object
  * @constructor LokiLocalStorageAdapter
  */
@JSGlobal("LokiLocalStorageAdapter")
@js.native
class LokiLocalStorageAdapter () extends js.Object {
  /**
    * deleteDatabase() - delete the database from localstorage, will throw an error if it
    * can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  def deleteDatabase(
    dbname: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /**
    * loadDatabase() - Load data from localstorage
    * @param dbname - the name of the database to load
    * @param callback - the callback to handle the result
    */
  def loadDatabase(
    dbname: java.lang.String,
    callback: js.Function1[/* dataOrError */ js.Any | stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  def saveDatabase(
    dbname: java.lang.String,
    dbstring: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}

