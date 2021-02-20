package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseSharingFrictionInfo extends StObject {
  
  var bloks_app_url: Null = js.native
  
  var should_have_sharing_friction: Boolean = js.native
}
object TopicalExploreFeedResponseSharingFrictionInfo {
  
  @scala.inline
  def apply(bloks_app_url: Null, should_have_sharing_friction: Boolean): TopicalExploreFeedResponseSharingFrictionInfo = {
    val __obj = js.Dynamic.literal(bloks_app_url = bloks_app_url.asInstanceOf[js.Any], should_have_sharing_friction = should_have_sharing_friction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseSharingFrictionInfo]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseSharingFrictionInfoMutableBuilder[Self <: TopicalExploreFeedResponseSharingFrictionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBloks_app_url(value: Null): Self = StObject.set(x, "bloks_app_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_have_sharing_friction(value: Boolean): Self = StObject.set(x, "should_have_sharing_friction", value.asInstanceOf[js.Any])
  }
}
