package typings.listr2.anon

import typings.listr2.mod.ListrTestRendererOptions
import typings.listr2.mod.ListrTestRendererTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTestRenderer extends StObject {
  
  /* static member */
  var nonTTY: Boolean
  
  /* static member */
  var rendererOptions: ListrTestRendererOptions
  
  /* static member */
  var rendererTaskOptions: ListrTestRendererTaskOptions
}
object TypeofTestRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: ListrTestRendererOptions,
    rendererTaskOptions: ListrTestRendererTaskOptions
  ): TypeofTestRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTestRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTestRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrTestRendererOptions): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrTestRendererTaskOptions): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
