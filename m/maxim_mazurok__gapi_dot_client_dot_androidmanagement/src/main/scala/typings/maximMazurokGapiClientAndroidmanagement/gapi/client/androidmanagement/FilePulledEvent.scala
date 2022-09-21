package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePulledEvent extends StObject {
  
  /** The path of the file being pulled. */
  var filePath: js.UndefOr[String] = js.undefined
}
object FilePulledEvent {
  
  inline def apply(): FilePulledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePulledEvent]
  }
  
  extension [Self <: FilePulledEvent](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
