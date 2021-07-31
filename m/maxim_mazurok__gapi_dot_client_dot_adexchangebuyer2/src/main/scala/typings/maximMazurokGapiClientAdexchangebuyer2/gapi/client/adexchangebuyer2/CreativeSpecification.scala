package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeSpecification extends StObject {
  
  /** Companion sizes may be filled in only when this is a video creative. */
  var creativeCompanionSizes: js.UndefOr[js.Array[AdSize]] = js.undefined
  
  /** The size of the creative. */
  var creativeSize: js.UndefOr[AdSize] = js.undefined
}
object CreativeSpecification {
  
  @scala.inline
  def apply(): CreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeSpecification]
  }
  
  @scala.inline
  implicit class CreativeSpecificationMutableBuilder[Self <: CreativeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeCompanionSizes(value: js.Array[AdSize]): Self = StObject.set(x, "creativeCompanionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeCompanionSizesUndefined: Self = StObject.set(x, "creativeCompanionSizes", js.undefined)
    
    @scala.inline
    def setCreativeCompanionSizesVarargs(value: AdSize*): Self = StObject.set(x, "creativeCompanionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeSize(value: AdSize): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
