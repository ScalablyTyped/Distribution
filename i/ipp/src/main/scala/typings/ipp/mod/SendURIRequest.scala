package typings.ipp.mod

import typings.ipp.anon.Documenturi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendURIRequest extends StObject {
  
  var `operation-attributes-tag`: Documenturi = js.native
}
object SendURIRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Documenturi): SendURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendURIRequest]
  }
  
  @scala.inline
  implicit class SendURIRequestMutableBuilder[Self <: SendURIRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Documenturi): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
