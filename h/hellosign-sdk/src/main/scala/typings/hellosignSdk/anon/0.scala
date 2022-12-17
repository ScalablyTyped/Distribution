package typings.hellosignSdk.anon

import typings.hellosignSdk.hellosignSdkStrings.zip
import typings.hellosignSdk.mod.FilesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with FilesOptions {
  
  var file_type: zip
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(file_type = "zip")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFile_type(value: zip): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
  }
}
