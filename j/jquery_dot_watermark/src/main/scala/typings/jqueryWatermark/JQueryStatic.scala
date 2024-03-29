package typings.jqueryWatermark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var watermark: Watermark
}
object JQueryStatic {
  
  inline def apply(watermark: Watermark): JQueryStatic = {
    val __obj = js.Dynamic.literal(watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setWatermark(value: Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
