package typings
package lokijsLib

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
  def deleteDatabase_MLokiFsAdapter(
    dbname: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def loadDatabase(dbname: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * saveDatabase() - save data to file, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  @JSName("saveDatabase")
  def saveDatabase_MLokiFsAdapter(
    dbname: java.lang.String,
    dbstring: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  @JSName("saveDatabase")
  def saveDatabase_MLokiFsAdapter(
    dbname: java.lang.String,
    dbstring: stdLib.Uint8Array,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}

