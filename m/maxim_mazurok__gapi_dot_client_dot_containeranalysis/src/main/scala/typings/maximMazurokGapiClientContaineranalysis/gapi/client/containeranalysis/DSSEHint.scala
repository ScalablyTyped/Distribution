package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSSEHint extends StObject {
  
  /** Required. The human readable name of this attestation authority, for example "cloudbuild-prod". */
  var humanReadableName: js.UndefOr[String] = js.undefined
}
object DSSEHint {
  
  inline def apply(): DSSEHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSSEHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DSSEHint] (val x: Self) extends AnyVal {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
