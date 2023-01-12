package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialStateConfig extends StObject {
  
  /** The Key Database (db). */
  var dbs: js.UndefOr[js.Array[FileContentBuffer]] = js.undefined
  
  /** The forbidden key database (dbx). */
  var dbxs: js.UndefOr[js.Array[FileContentBuffer]] = js.undefined
  
  /** The Key Exchange Key (KEK). */
  var keks: js.UndefOr[js.Array[FileContentBuffer]] = js.undefined
  
  /** The Platform Key (PK). */
  var pk: js.UndefOr[FileContentBuffer] = js.undefined
}
object InitialStateConfig {
  
  inline def apply(): InitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialStateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialStateConfig] (val x: Self) extends AnyVal {
    
    inline def setDbs(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "dbs", value.asInstanceOf[js.Any])
    
    inline def setDbsUndefined: Self = StObject.set(x, "dbs", js.undefined)
    
    inline def setDbsVarargs(value: FileContentBuffer*): Self = StObject.set(x, "dbs", js.Array(value*))
    
    inline def setDbxs(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "dbxs", value.asInstanceOf[js.Any])
    
    inline def setDbxsUndefined: Self = StObject.set(x, "dbxs", js.undefined)
    
    inline def setDbxsVarargs(value: FileContentBuffer*): Self = StObject.set(x, "dbxs", js.Array(value*))
    
    inline def setKeks(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "keks", value.asInstanceOf[js.Any])
    
    inline def setKeksUndefined: Self = StObject.set(x, "keks", js.undefined)
    
    inline def setKeksVarargs(value: FileContentBuffer*): Self = StObject.set(x, "keks", js.Array(value*))
    
    inline def setPk(value: FileContentBuffer): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
  }
}
