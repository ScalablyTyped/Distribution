package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailureDetail extends StObject {
  
  /**
    * A description of the failure.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailureDetail {
  
  inline def apply(): SchemaFailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureDetail]
  }
  
  extension [Self <: SchemaFailureDetail](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
