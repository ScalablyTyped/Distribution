package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supported type of renderers for each type in the listr. */
trait SupportedRenderer extends StObject {
  
  var nonTTY: Boolean
  
  var renderer: ListrRendererFactory
}
object SupportedRenderer {
  
  inline def apply(nonTTY: Boolean, renderer: ListrRendererFactory): SupportedRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedRenderer]
  }
  
  extension [Self <: SupportedRenderer](x: Self) {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ListrRendererFactory): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
