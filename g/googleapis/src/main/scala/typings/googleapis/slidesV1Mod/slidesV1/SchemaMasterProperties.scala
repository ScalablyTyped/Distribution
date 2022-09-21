package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMasterProperties extends StObject {
  
  /**
    * The human-readable name of the master.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMasterProperties {
  
  inline def apply(): SchemaMasterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterProperties]
  }
  
  extension [Self <: SchemaMasterProperties](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
