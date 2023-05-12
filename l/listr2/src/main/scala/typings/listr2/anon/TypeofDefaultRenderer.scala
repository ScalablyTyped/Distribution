package typings.listr2.anon

import typings.listr2.mod.ListrDefaultRendererOptions
import typings.listr2.mod.ListrDefaultRendererTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDefaultRenderer extends StObject {
  
  /* static member */
  var nonTTY: Boolean
  
  /* static member */
  var rendererOptions: ListrDefaultRendererOptions
  
  /* static member */
  var rendererTaskOptions: ListrDefaultRendererTaskOptions
}
object TypeofDefaultRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: ListrDefaultRendererOptions,
    rendererTaskOptions: ListrDefaultRendererTaskOptions
  ): TypeofDefaultRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDefaultRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDefaultRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrDefaultRendererOptions): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrDefaultRendererTaskOptions): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
