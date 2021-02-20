package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CylinderBodyAttributes extends SVGPathAttributes {
  
  var lateralArea: js.UndefOr[String | Double] = js.native
}
object CylinderBodyAttributes {
  
  @scala.inline
  def apply(): CylinderBodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderBodyAttributes]
  }
  
  @scala.inline
  implicit class CylinderBodyAttributesMutableBuilder[Self <: CylinderBodyAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLateralArea(value: String | Double): Self = StObject.set(x, "lateralArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateralAreaUndefined: Self = StObject.set(x, "lateralArea", js.undefined)
  }
}
