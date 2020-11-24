package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1ImageDetails extends js.Object {
  
  /** Required. Immutable. The child image derived from the base image. */
  var derivedImage: js.UndefOr[Derived] = js.native
}
object GrafeasV1beta1ImageDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1ImageDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1ImageDetailsOps[Self <: GrafeasV1beta1ImageDetails] (val x: Self) extends AnyVal {
    
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
    def setDerivedImage(value: Derived): Self = this.set("derivedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDerivedImage: Self = this.set("derivedImage", js.undefined)
  }
}
