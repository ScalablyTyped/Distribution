package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends js.Object {
  
  /** Required. The human readable name of this attestation authority, for example "qa". */
  var humanReadableName: js.UndefOr[String] = js.native
}
object Hint {
  
  @scala.inline
  def apply(): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
    
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
    def setHumanReadableName(value: String): Self = this.set("humanReadableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanReadableName: Self = this.set("humanReadableName", js.undefined)
  }
}
