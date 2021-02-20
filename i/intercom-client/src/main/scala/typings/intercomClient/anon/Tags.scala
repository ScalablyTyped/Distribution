package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.tagDotlist
import typings.intercomClient.userMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tags extends StObject {
  
  var tags: js.Array[Tag] = js.native
  
  var `type`: tagDotlist = js.native
}
object Tags {
  
  @scala.inline
  def apply(tags: js.Array[Tag], `type`: tagDotlist): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  @scala.inline
  implicit class TagsMutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: tagDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
