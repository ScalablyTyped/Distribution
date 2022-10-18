package typings.ionic.definitionsMod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellRunOptions
  extends StObject
     with IShellOutputOptions {
  
  var killOnExit: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[WritableStream] = js.undefined
  
  var truncateErrorOutput: js.UndefOr[Double] = js.undefined
}
object IShellRunOptions {
  
  inline def apply(): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellRunOptions]
  }
  
  extension [Self <: IShellRunOptions](x: Self) {
    
    inline def setKillOnExit(value: Boolean): Self = StObject.set(x, "killOnExit", value.asInstanceOf[js.Any])
    
    inline def setKillOnExitUndefined: Self = StObject.set(x, "killOnExit", js.undefined)
    
    inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setTruncateErrorOutput(value: Double): Self = StObject.set(x, "truncateErrorOutput", value.asInstanceOf[js.Any])
    
    inline def setTruncateErrorOutputUndefined: Self = StObject.set(x, "truncateErrorOutput", js.undefined)
  }
}
