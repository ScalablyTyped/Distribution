package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoSignature extends StObject {
  
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
  implicit class GrafeasV1beta1IntotoSignatureMutableBuilder[Self <: GrafeasV1beta1IntotoSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
    
    @scala.inline
    def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
  }
}
