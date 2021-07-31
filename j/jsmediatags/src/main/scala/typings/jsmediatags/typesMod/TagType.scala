package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagType extends StObject {
  
  var tags: Tags
  
  var `type`: String
}
object TagType {
  
  @scala.inline
  def apply(tags: Tags, `type`: String): TagType = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagType]
  }
  
  @scala.inline
  implicit class TagTypeMutableBuilder[Self <: TagType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
