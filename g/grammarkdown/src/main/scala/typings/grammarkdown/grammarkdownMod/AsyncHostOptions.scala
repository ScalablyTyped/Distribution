package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncHostOptions
  extends StObject
     with HostBaseOptions {
  
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.undefined
  
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.undefined
}
object AsyncHostOptions {
  
  inline def apply(): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncHostOptions]
  }
  
  extension [Self <: AsyncHostOptions](x: Self) {
    
    inline def setReadFile(value: ReadFileCallback | LegacyReadFileCallback | `false`): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
    
    inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    
    inline def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback | `false`): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
    
    inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
