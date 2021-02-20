package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseAttribution extends StObject {
  
  var name: String = js.native
}
object TagFeedResponseAttribution {
  
  @scala.inline
  def apply(name: String): TagFeedResponseAttribution = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseAttribution]
  }
  
  @scala.inline
  implicit class TagFeedResponseAttributionMutableBuilder[Self <: TagFeedResponseAttribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
