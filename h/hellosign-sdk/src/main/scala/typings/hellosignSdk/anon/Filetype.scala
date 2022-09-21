package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkStrings.pdf
import typings.hellosignSdk.mod.FilesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filetype
  extends StObject
     with FilesOptions {
  
  var file_type: pdf
  
  var get_data_uri: js.UndefOr[Boolean] = js.undefined
  
  var get_url: js.UndefOr[Boolean] = js.undefined
}
object Filetype {
  
  inline def apply(): Filetype = {
    val __obj = js.Dynamic.literal(file_type = "pdf")
    __obj.asInstanceOf[Filetype]
  }
  
  extension [Self <: Filetype](x: Self) {
    
    inline def setFile_type(value: pdf): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setGet_data_uri(value: Boolean): Self = StObject.set(x, "get_data_uri", value.asInstanceOf[js.Any])
    
    inline def setGet_data_uriUndefined: Self = StObject.set(x, "get_data_uri", js.undefined)
    
    inline def setGet_url(value: Boolean): Self = StObject.set(x, "get_url", value.asInstanceOf[js.Any])
    
    inline def setGet_urlUndefined: Self = StObject.set(x, "get_url", js.undefined)
  }
}
