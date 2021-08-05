package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hint extends StObject {
  
  /** Required. The human readable name of this attestation authority, for example "qa". */
  var humanReadableName: js.UndefOr[String] = js.undefined
}
object Hint {
  
  inline def apply(): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hint]
  }
  
  extension [Self <: Hint](x: Self) {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
