package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkBooleans.`true`
import typings.hellosignSdk.hellosignSdkStrings.pdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geturl extends StObject {
  
  var file_type: pdf
  
  var get_url: `true`
}
object Geturl {
  
  inline def apply(): Geturl = {
    val __obj = js.Dynamic.literal(file_type = "pdf", get_url = true)
    __obj.asInstanceOf[Geturl]
  }
  
  extension [Self <: Geturl](x: Self) {
    
    inline def setFile_type(value: pdf): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setGet_url(value: `true`): Self = StObject.set(x, "get_url", value.asInstanceOf[js.Any])
  }
}
