package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderBodyAttributes
  extends StObject
     with SVGPathAttributes {
  
  var lateralArea: js.UndefOr[String | Double] = js.undefined
}
object CylinderBodyAttributes {
  
  inline def apply(): CylinderBodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderBodyAttributes]
  }
  
  extension [Self <: CylinderBodyAttributes](x: Self) {
    
    inline def setLateralArea(value: String | Double): Self = StObject.set(x, "lateralArea", value.asInstanceOf[js.Any])
    
    inline def setLateralAreaUndefined: Self = StObject.set(x, "lateralArea", js.undefined)
  }
}
