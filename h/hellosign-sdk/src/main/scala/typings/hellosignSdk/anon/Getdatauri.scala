package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkBooleans.`true`
import typings.hellosignSdk.hellosignSdkStrings.pdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Getdatauri extends StObject {
  
  var file_type: pdf
  
  var get_data_uri: `true`
}
object Getdatauri {
  
  inline def apply(): Getdatauri = {
    val __obj = js.Dynamic.literal(file_type = "pdf", get_data_uri = true)
    __obj.asInstanceOf[Getdatauri]
  }
  
  extension [Self <: Getdatauri](x: Self) {
    
    inline def setFile_type(value: pdf): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setGet_data_uri(value: `true`): Self = StObject.set(x, "get_data_uri", value.asInstanceOf[js.Any])
  }
}
