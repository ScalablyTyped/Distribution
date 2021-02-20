package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends StObject {
  
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
  implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
