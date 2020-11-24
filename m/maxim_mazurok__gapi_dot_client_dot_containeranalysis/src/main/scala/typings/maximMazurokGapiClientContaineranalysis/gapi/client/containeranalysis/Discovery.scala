package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Discovery extends js.Object {
  
  /** Required. Immutable. The kind of analysis that is handled by this discovery. */
  var analysisKind: js.UndefOr[String] = js.native
}
object Discovery {
  
  @scala.inline
  def apply(): Discovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discovery]
  }
  
  @scala.inline
  implicit class DiscoveryOps[Self <: Discovery] (val x: Self) extends AnyVal {
    
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
    def setAnalysisKind(value: String): Self = this.set("analysisKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisKind: Self = this.set("analysisKind", js.undefined)
  }
}
