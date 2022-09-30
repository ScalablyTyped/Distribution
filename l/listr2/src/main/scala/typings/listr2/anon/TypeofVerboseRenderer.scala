package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerboseRenderer extends StObject {
  
  /** designates whether this renderer can output to a non-tty console */
  /* static member */
  var nonTTY: Boolean
  
  /** renderer options for the verbose renderer */
  /* static member */
  var rendererOptions: LogEmptyTitle
}
object TypeofVerboseRenderer {
  
  inline def apply(nonTTY: Boolean, rendererOptions: LogEmptyTitle): TypeofVerboseRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerboseRenderer]
  }
  
  extension [Self <: TypeofVerboseRenderer](x: Self) {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: LogEmptyTitle): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
  }
}
