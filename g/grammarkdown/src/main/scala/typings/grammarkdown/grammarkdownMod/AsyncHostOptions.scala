package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncHostOptions extends HostBaseOptions {
  
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.native
  
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.native
}
object AsyncHostOptions {
  
  @scala.inline
  def apply(): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncHostOptions]
  }
  
  @scala.inline
  implicit class AsyncHostOptionsMutableBuilder[Self <: AsyncHostOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadFile(value: ReadFileCallback | LegacyReadFileCallback | `false`): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    
    @scala.inline
    def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback | `false`): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
