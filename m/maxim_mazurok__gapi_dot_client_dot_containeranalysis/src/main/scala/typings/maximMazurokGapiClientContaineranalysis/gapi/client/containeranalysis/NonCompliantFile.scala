package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonCompliantFile extends StObject {
  
  /** Command to display the non-compliant files. */
  var displayCommand: js.UndefOr[String] = js.undefined
  
  /** Empty if `display_command` is set. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Explains why a file is non compliant for a CIS check. */
  var reason: js.UndefOr[String] = js.undefined
}
object NonCompliantFile {
  
  inline def apply(): NonCompliantFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonCompliantFile]
  }
  
  extension [Self <: NonCompliantFile](x: Self) {
    
    inline def setDisplayCommand(value: String): Self = StObject.set(x, "displayCommand", value.asInstanceOf[js.Any])
    
    inline def setDisplayCommandUndefined: Self = StObject.set(x, "displayCommand", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
