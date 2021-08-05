package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftIconColor extends StObject {
  
  var leftIconColor: js.UndefOr[String] = js.undefined
  
  var nestedLevelDepth: js.UndefOr[Double] = js.undefined
  
  var rightIconColor: js.UndefOr[String] = js.undefined
  
  var secondaryTextColor: js.UndefOr[String] = js.undefined
}
object LeftIconColor {
  
  inline def apply(): LeftIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftIconColor]
  }
  
  extension [Self <: LeftIconColor](x: Self) {
    
    inline def setLeftIconColor(value: String): Self = StObject.set(x, "leftIconColor", value.asInstanceOf[js.Any])
    
    inline def setLeftIconColorUndefined: Self = StObject.set(x, "leftIconColor", js.undefined)
    
    inline def setNestedLevelDepth(value: Double): Self = StObject.set(x, "nestedLevelDepth", value.asInstanceOf[js.Any])
    
    inline def setNestedLevelDepthUndefined: Self = StObject.set(x, "nestedLevelDepth", js.undefined)
    
    inline def setRightIconColor(value: String): Self = StObject.set(x, "rightIconColor", value.asInstanceOf[js.Any])
    
    inline def setRightIconColorUndefined: Self = StObject.set(x, "rightIconColor", js.undefined)
    
    inline def setSecondaryTextColor(value: String): Self = StObject.set(x, "secondaryTextColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTextColorUndefined: Self = StObject.set(x, "secondaryTextColor", js.undefined)
  }
}
