package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseSharingFrictionInfo extends StObject {
  
  var bloks_app_url: Null
  
  var should_have_sharing_friction: Boolean
}
object TopicalExploreFeedResponseSharingFrictionInfo {
  
  inline def apply(bloks_app_url: Null, should_have_sharing_friction: Boolean): TopicalExploreFeedResponseSharingFrictionInfo = {
    val __obj = js.Dynamic.literal(bloks_app_url = bloks_app_url.asInstanceOf[js.Any], should_have_sharing_friction = should_have_sharing_friction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseSharingFrictionInfo]
  }
  
  extension [Self <: TopicalExploreFeedResponseSharingFrictionInfo](x: Self) {
    
    inline def setBloks_app_url(value: Null): Self = StObject.set(x, "bloks_app_url", value.asInstanceOf[js.Any])
    
    inline def setShould_have_sharing_friction(value: Boolean): Self = StObject.set(x, "should_have_sharing_friction", value.asInstanceOf[js.Any])
  }
}
