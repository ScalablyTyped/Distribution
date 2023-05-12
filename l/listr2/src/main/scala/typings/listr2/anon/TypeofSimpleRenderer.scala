package typings.listr2.anon

import typings.listr2.mod.ListrSimpleRendererOptions
import typings.listr2.mod.ListrSimpleRendererTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSimpleRenderer extends StObject {
  
  /* static member */
  var nonTTY: Boolean
  
  /* static member */
  var rendererOptions: ListrSimpleRendererOptions
  
  /* static member */
  var rendererTaskOptions: ListrSimpleRendererTaskOptions
}
object TypeofSimpleRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: ListrSimpleRendererOptions,
    rendererTaskOptions: ListrSimpleRendererTaskOptions
  ): TypeofSimpleRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSimpleRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSimpleRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrSimpleRendererOptions): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrSimpleRendererTaskOptions): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
