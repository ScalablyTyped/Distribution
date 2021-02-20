package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Tag.Tag> */
@js.native
trait PartialTag extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[tag] = js.native
}
object PartialTag {
  
  @scala.inline
  def apply(): PartialTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTag]
  }
  
  @scala.inline
  implicit class PartialTagMutableBuilder[Self <: PartialTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
