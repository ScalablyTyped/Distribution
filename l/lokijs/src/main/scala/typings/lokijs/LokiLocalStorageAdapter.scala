package typings.lokijs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A loki persistence adapter which persists to web browser's local storage object
  * @constructor LokiLocalStorageAdapter
  */
trait LokiLocalStorageAdapter extends StObject {
  
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
  
  inline def apply(
    deleteDatabase: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    loadDatabase: (String, js.Function1[/* dataOrError */ js.Any | Error, Unit]) => Unit,
    saveDatabase: (String, String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
  ): LokiLocalStorageAdapter = {
    val __obj = js.Dynamic.literal(deleteDatabase = js.Any.fromFunction2(deleteDatabase), loadDatabase = js.Any.fromFunction2(loadDatabase), saveDatabase = js.Any.fromFunction3(saveDatabase))
    __obj.asInstanceOf[LokiLocalStorageAdapter]
  }
  
  extension [Self <: LokiLocalStorageAdapter](x: Self) {
    
    inline def setDeleteDatabase(value: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2(value))
    
    inline def setLoadDatabase(value: (String, js.Function1[/* dataOrError */ js.Any | Error, Unit]) => Unit): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction2(value))
    
    inline def setSaveDatabase(value: (String, String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3(value))
  }
}
