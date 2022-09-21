package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetIosReopenAttributionRequest extends StObject {
  
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * FDL link to be verified from an app universal link open. The FDL link can be one of: 1) short FDL. e.g. .page.link/, or 2) long FDL. e.g. .page.link/?{query params\}, or 3) Invite FDL. e.g. .page.link/i/
    */
  var requestedLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google SDK version. Version takes the form "$major.$minor.$patch"
    */
  var sdkVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetIosReopenAttributionRequest {
  
  inline def apply(): SchemaGetIosReopenAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosReopenAttributionRequest]
  }
  
  extension [Self <: SchemaGetIosReopenAttributionRequest](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setRequestedLink(value: String): Self = StObject.set(x, "requestedLink", value.asInstanceOf[js.Any])
    
    inline def setRequestedLinkNull: Self = StObject.set(x, "requestedLink", null)
    
    inline def setRequestedLinkUndefined: Self = StObject.set(x, "requestedLink", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionNull: Self = StObject.set(x, "sdkVersion", null)
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
