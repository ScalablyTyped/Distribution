package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOutputRendererOptions extends StObject {
  
  /**
    * Pass your implementation of process output class to write to stdout and stderr.
    *
    * @default 'ProcessOutput'
    * @global global option that can not be temperated with subtasks
    */
  var processOutput: js.UndefOr[ProcessOutput] = js.undefined
}
object ProcessOutputRendererOptions {
  
  inline def apply(): ProcessOutputRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOutputRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessOutputRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setProcessOutput(value: ProcessOutput): Self = StObject.set(x, "processOutput", value.asInstanceOf[js.Any])
    
    inline def setProcessOutputUndefined: Self = StObject.set(x, "processOutput", js.undefined)
  }
}
