package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubsetting extends StObject {
  
  var policy: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubsetting {
  
  inline def apply(): SchemaSubsetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubsetting]
  }
  
  extension [Self <: SchemaSubsetting](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
