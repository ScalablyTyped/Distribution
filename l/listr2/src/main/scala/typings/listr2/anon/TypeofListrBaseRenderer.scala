package typings.listr2.anon

import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListrBaseRenderer extends StObject {
  
  /* static member */
  var nonTTY: Boolean
  
  /* static member */
  var rendererOptions: Record[PropertyKey, Any]
  
  /* static member */
  var rendererTaskOptions: Record[PropertyKey, Any]
}
object TypeofListrBaseRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: Record[PropertyKey, Any],
    rendererTaskOptions: Record[PropertyKey, Any]
  ): TypeofListrBaseRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListrBaseRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofListrBaseRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: Record[PropertyKey, Any]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: Record[PropertyKey, Any]): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
