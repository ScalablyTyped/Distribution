package typings.kakaoJsSdk.anon

import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: FileList
}
object File {
  
  inline def apply(file: FileList): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: FileList): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
