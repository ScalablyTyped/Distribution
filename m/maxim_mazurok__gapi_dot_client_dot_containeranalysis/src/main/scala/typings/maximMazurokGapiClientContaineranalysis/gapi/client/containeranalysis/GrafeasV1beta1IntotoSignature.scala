package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoSignature extends js.Object {
  
  var keyid: js.UndefOr[String] = js.native
  
  var sig: js.UndefOr[String] = js.native
}
object GrafeasV1beta1IntotoSignature {
  
  @scala.inline
  def apply(): GrafeasV1beta1IntotoSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1IntotoSignature]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1IntotoSignatureOps[Self <: GrafeasV1beta1IntotoSignature] (val x: Self) extends AnyVal {
    
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
    def setKeyid(value: String): Self = this.set("keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyid: Self = this.set("keyid", js.undefined)
    
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSig: Self = this.set("sig", js.undefined)
  }
}
