package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object SegmentOptions {
  
  inline def apply(): SegmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
