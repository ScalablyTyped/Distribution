package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeRestrictions extends StObject {
  
  /** The format of the environment that the creatives will be displayed in. */
  var creativeFormat: js.UndefOr[String] = js.native
  
  var creativeSpecifications: js.UndefOr[js.Array[CreativeSpecification]] = js.native
  
  /** Skippable video ads allow viewers to skip ads after 5 seconds. */
  var skippableAdType: js.UndefOr[String] = js.native
}
object CreativeRestrictions {
  
  @scala.inline
  def apply(): CreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeRestrictions]
  }
  
  @scala.inline
  implicit class CreativeRestrictionsMutableBuilder[Self <: CreativeRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    @scala.inline
    def setCreativeSpecifications(value: js.Array[CreativeSpecification]): Self = StObject.set(x, "creativeSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSpecificationsUndefined: Self = StObject.set(x, "creativeSpecifications", js.undefined)
    
    @scala.inline
    def setCreativeSpecificationsVarargs(value: CreativeSpecification*): Self = StObject.set(x, "creativeSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
