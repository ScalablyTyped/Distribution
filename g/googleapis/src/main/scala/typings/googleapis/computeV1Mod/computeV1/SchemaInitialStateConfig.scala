package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInitialStateConfig extends StObject {
  
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.undefined
  
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.undefined
  
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.undefined
  
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[SchemaFileContentBuffer] = js.undefined
}
object SchemaInitialStateConfig {
  
  inline def apply(): SchemaInitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitialStateConfig]
  }
  
  extension [Self <: SchemaInitialStateConfig](x: Self) {
    
    inline def setDbs(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "dbs", value.asInstanceOf[js.Any])
    
    inline def setDbsUndefined: Self = StObject.set(x, "dbs", js.undefined)
    
    inline def setDbsVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "dbs", js.Array(value*))
    
    inline def setDbxs(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "dbxs", value.asInstanceOf[js.Any])
    
    inline def setDbxsUndefined: Self = StObject.set(x, "dbxs", js.undefined)
    
    inline def setDbxsVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "dbxs", js.Array(value*))
    
    inline def setKeks(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "keks", value.asInstanceOf[js.Any])
    
    inline def setKeksUndefined: Self = StObject.set(x, "keks", js.undefined)
    
    inline def setKeksVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "keks", js.Array(value*))
    
    inline def setPk(value: SchemaFileContentBuffer): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
  }
}
