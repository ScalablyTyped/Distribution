package typings.ipp.mod

import typings.ipp.anon.Documentnaturallanguage
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDocumentRequest extends StObject {
  
  var data: js.UndefOr[Buffer] = js.native
  
  var `operation-attributes-tag`: Documentnaturallanguage = js.native
}
object SendDocumentRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Documentnaturallanguage): SendDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentRequest]
  }
  
  @scala.inline
  implicit class SendDocumentRequestMutableBuilder[Self <: SendDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Documentnaturallanguage): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
