package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoDetails extends js.Object {
  
  var signatures: js.UndefOr[js.Array[GrafeasV1beta1IntotoSignature]] = js.native
  
  var signed: js.UndefOr[Link] = js.native
}
object GrafeasV1beta1IntotoDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1IntotoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1IntotoDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1IntotoDetailsOps[Self <: GrafeasV1beta1IntotoDetails] (val x: Self) extends AnyVal {
    
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
    def setSignaturesVarargs(value: GrafeasV1beta1IntotoSignature*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[GrafeasV1beta1IntotoSignature]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatures: Self = this.set("signatures", js.undefined)
    
    @scala.inline
    def setSigned(value: Link): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}
