package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabaseType extends StObject {
  
  /**
    * The database engine.
    */
  var engine: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The database provider.
    */
  var provider: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabaseType {
  
  inline def apply(): SchemaDatabaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseType]
  }
  
  extension [Self <: SchemaDatabaseType](x: Self) {
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineNull: Self = StObject.set(x, "engine", null)
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
