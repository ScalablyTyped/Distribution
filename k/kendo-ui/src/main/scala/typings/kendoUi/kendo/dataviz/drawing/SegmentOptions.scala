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
  
  extension [Self <: SegmentOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
