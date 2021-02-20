package typings.ionic.definitionsMod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellRunOptions extends IShellOutputOptions {
  
  var killOnExit: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[WritableStream] = js.native
  
  var truncateErrorOutput: js.UndefOr[Double] = js.native
}
object IShellRunOptions {
  
  @scala.inline
  def apply(): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellRunOptions]
  }
  
  @scala.inline
  implicit class IShellRunOptionsMutableBuilder[Self <: IShellRunOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKillOnExit(value: Boolean): Self = StObject.set(x, "killOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillOnExitUndefined: Self = StObject.set(x, "killOnExit", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setTruncateErrorOutput(value: Double): Self = StObject.set(x, "truncateErrorOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateErrorOutputUndefined: Self = StObject.set(x, "truncateErrorOutput", js.undefined)
  }
}
