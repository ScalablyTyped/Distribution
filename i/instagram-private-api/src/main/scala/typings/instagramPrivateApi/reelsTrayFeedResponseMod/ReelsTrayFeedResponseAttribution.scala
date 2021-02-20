package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseAttribution extends StObject {
  
  var name: String = js.native
}
object ReelsTrayFeedResponseAttribution {
  
  @scala.inline
  def apply(name: String): ReelsTrayFeedResponseAttribution = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseAttribution]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseAttributionMutableBuilder[Self <: ReelsTrayFeedResponseAttribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
