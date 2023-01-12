package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceDetails extends StObject {
  
  /** Optional. A description of the space. It could describe the space's discussion topic, functional purpose, or participants. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. The space's rules, expectations, and etiquette. */
  var guidelines: js.UndefOr[String] = js.undefined
}
object SpaceDetails {
  
  inline def apply(): SpaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpaceDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
    
    inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
  }
}
