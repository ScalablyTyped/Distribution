package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventImpressionAnnotation extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventImpressionAnnotation". */
  var kind: js.UndefOr[String] = js.native
  
  /** The path impression ID. Use this field to annotate the impression associated with the pathImpressionId. */
  var pathImpressionId: js.UndefOr[String] = js.native
}
object CustomEventImpressionAnnotation {
  
  @scala.inline
  def apply(): CustomEventImpressionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventImpressionAnnotation]
  }
  
  @scala.inline
  implicit class CustomEventImpressionAnnotationOps[Self <: CustomEventImpressionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPathImpressionId(value: String): Self = this.set("pathImpressionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathImpressionId: Self = this.set("pathImpressionId", js.undefined)
  }
}
