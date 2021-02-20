package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.anon.WebUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryCta extends StObject {
  
  var links: js.Array[WebUri] = js.native
}
object StoryCta {
  
  @scala.inline
  def apply(links: js.Array[WebUri]): StoryCta = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryCta]
  }
  
  @scala.inline
  implicit class StoryCtaMutableBuilder[Self <: StoryCta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[WebUri]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: WebUri*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
