package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A regular posted comment.
  */
@js.native
trait SchemaPost extends StObject {
  
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}
object SchemaPost {
  
  @scala.inline
  def apply(): SchemaPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPost]
  }
  
  @scala.inline
  implicit class SchemaPostMutableBuilder[Self <: SchemaPost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
