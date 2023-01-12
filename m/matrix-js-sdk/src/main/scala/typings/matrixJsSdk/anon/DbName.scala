package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbName extends StObject {
  
  var dbName: js.UndefOr[String] = js.undefined
  
  var indexedDB: Any
  
  var workerApi: js.UndefOr[Any] = js.undefined
  
  var workerScript: js.UndefOr[String] = js.undefined
}
object DbName {
  
  inline def apply(indexedDB: Any): DbName = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DbName] (val x: Self) extends AnyVal {
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setIndexedDB(value: Any): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    
    inline def setWorkerApi(value: Any): Self = StObject.set(x, "workerApi", value.asInstanceOf[js.Any])
    
    inline def setWorkerApiUndefined: Self = StObject.set(x, "workerApi", js.undefined)
    
    inline def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
    
    inline def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
  }
}
