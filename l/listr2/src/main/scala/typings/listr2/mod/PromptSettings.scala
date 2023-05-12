package typings.listr2.mod

import typings.node.fsMod.WriteStream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptSettings extends StObject {
  
  var enquirer: js.UndefOr[typings.enquirer.mod.^[js.Object]] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var stdout: js.UndefOr[WriteStream | Writable] = js.undefined
}
object PromptSettings {
  
  inline def apply(): PromptSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptSettings] (val x: Self) extends AnyVal {
    
    inline def setEnquirer(value: typings.enquirer.mod.^[js.Object]): Self = StObject.set(x, "enquirer", value.asInstanceOf[js.Any])
    
    inline def setEnquirerUndefined: Self = StObject.set(x, "enquirer", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStdout(value: WriteStream | Writable): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
  }
}
