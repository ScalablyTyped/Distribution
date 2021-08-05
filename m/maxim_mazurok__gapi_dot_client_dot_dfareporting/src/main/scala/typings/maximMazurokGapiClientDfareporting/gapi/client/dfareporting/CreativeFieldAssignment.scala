package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeFieldAssignment extends StObject {
  
  /** ID of the creative field. */
  var creativeFieldId: js.UndefOr[String] = js.undefined
  
  /** ID of the creative field value. */
  var creativeFieldValueId: js.UndefOr[String] = js.undefined
}
object CreativeFieldAssignment {
  
  inline def apply(): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
  
  extension [Self <: CreativeFieldAssignment](x: Self) {
    
    inline def setCreativeFieldId(value: String): Self = StObject.set(x, "creativeFieldId", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldIdUndefined: Self = StObject.set(x, "creativeFieldId", js.undefined)
    
    inline def setCreativeFieldValueId(value: String): Self = StObject.set(x, "creativeFieldValueId", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldValueIdUndefined: Self = StObject.set(x, "creativeFieldValueId", js.undefined)
  }
}
