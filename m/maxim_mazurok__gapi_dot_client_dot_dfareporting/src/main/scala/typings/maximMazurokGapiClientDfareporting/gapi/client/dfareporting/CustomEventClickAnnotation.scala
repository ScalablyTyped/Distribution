package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventClickAnnotation extends js.Object {
  
  /** The Google click ID. Use this field to annotate the click associated with the gclid. */
  var gclid: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventClickAnnotation". */
  var kind: js.UndefOr[String] = js.native
}
object CustomEventClickAnnotation {
  
  @scala.inline
  def apply(): CustomEventClickAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventClickAnnotation]
  }
  
  @scala.inline
  implicit class CustomEventClickAnnotationOps[Self <: CustomEventClickAnnotation] (val x: Self) extends AnyVal {
    
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
    def setGclid(value: String): Self = this.set("gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGclid: Self = this.set("gclid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
