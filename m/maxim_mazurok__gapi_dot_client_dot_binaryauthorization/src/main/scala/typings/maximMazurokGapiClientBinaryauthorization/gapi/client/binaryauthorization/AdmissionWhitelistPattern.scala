package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdmissionWhitelistPattern extends js.Object {
  
  /** An image name pattern to allowlist, in the form `registry/path/to/image`. This supports a trailing `*` as a wildcard, but this is allowed only in text after the `registry/` part. */
  var namePattern: js.UndefOr[String] = js.native
}
object AdmissionWhitelistPattern {
  
  @scala.inline
  def apply(): AdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdmissionWhitelistPattern]
  }
  
  @scala.inline
  implicit class AdmissionWhitelistPatternOps[Self <: AdmissionWhitelistPattern] (val x: Self) extends AnyVal {
    
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
    def setNamePattern(value: String): Self = this.set("namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePattern: Self = this.set("namePattern", js.undefined)
  }
}
