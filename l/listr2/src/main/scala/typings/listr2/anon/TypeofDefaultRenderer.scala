package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDefaultRenderer extends StObject {
  
  /** designates whether this renderer can output to a non-tty console */
  /* static member */
  var nonTTY: Boolean
  
  /** renderer options for the defauult renderer */
  /* static member */
  var rendererOptions: ClearOutput
  
  /** per task options for the default renderer */
  /* static member */
  var rendererTaskOptions: BottomBar
}
object TypeofDefaultRenderer {
  
  inline def apply(nonTTY: Boolean, rendererOptions: ClearOutput, rendererTaskOptions: BottomBar): TypeofDefaultRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDefaultRenderer]
  }
  
  extension [Self <: TypeofDefaultRenderer](x: Self) {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ClearOutput): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: BottomBar): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
