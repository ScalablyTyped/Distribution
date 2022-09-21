package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePushedEvent extends StObject {
  
  /** The path of the file being pushed. */
  var filePath: js.UndefOr[String] = js.undefined
}
object FilePushedEvent {
  
  inline def apply(): FilePushedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePushedEvent]
  }
  
  extension [Self <: FilePushedEvent](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
