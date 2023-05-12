package typings.listr2.anon

import typings.listr2.mod.ListrVerboseRendererOptions
import typings.listr2.mod.ListrVerboseRendererTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerboseRenderer extends StObject {
  
  /* static member */
  var nonTTY: Boolean
  
  /* static member */
  var rendererOptions: ListrVerboseRendererOptions
  
  /* static member */
  var rendererTaskOptions: ListrVerboseRendererTaskOptions
}
object TypeofVerboseRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: ListrVerboseRendererOptions,
    rendererTaskOptions: ListrVerboseRendererTaskOptions
  ): TypeofVerboseRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerboseRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofVerboseRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrVerboseRendererOptions): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrVerboseRendererTaskOptions): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
