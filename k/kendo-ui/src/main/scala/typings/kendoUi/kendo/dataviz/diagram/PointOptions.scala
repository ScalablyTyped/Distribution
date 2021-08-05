package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object PointOptions {
  
  inline def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  
  extension [Self <: PointOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
