package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Third-party Tracking URL.
  */
@js.native
trait SchemaThirdPartyTrackingUrl extends StObject {
  
  /**
    * Third-party URL type for in-stream video and in-stream audio creatives.
    */
  var thirdPartyUrlType: js.UndefOr[String] = js.native
  
  /**
    * URL for the specified third-party URL type.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaThirdPartyTrackingUrl {
  
  @scala.inline
  def apply(): SchemaThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyTrackingUrl]
  }
  
  @scala.inline
  implicit class SchemaThirdPartyTrackingUrlMutableBuilder[Self <: SchemaThirdPartyTrackingUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThirdPartyUrlType(value: String): Self = StObject.set(x, "thirdPartyUrlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyUrlTypeUndefined: Self = StObject.set(x, "thirdPartyUrlType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
