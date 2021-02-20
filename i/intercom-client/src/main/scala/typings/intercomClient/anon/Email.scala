package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var segment_id: js.UndefOr[String] = js.native
  
  var tag_id: js.UndefOr[String] = js.native
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setSegment_id(value: String): Self = StObject.set(x, "segment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment_idUndefined: Self = StObject.set(x, "segment_id", js.undefined)
    
    @scala.inline
    def setTag_id(value: String): Self = StObject.set(x, "tag_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_idUndefined: Self = StObject.set(x, "tag_id", js.undefined)
  }
}
