package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdmissionWhitelistPattern extends StObject {
  
  /** An image name pattern to allowlist, in the form `registry/path/to/image`. This supports a trailing `*` as a wildcard, but this is allowed only in text after the `registry/` part. */
  var namePattern: js.UndefOr[String] = js.undefined
}
object AdmissionWhitelistPattern {
  
  @scala.inline
  def apply(): AdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdmissionWhitelistPattern]
  }
  
  @scala.inline
  implicit class AdmissionWhitelistPatternMutableBuilder[Self <: AdmissionWhitelistPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamePattern(value: String): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
  }
}
