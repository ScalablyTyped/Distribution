package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollisionArrays extends StObject {
  
  var iconBox: js.UndefOr[SingleCollisionBox] = js.undefined
  
  var iconFeatureIndex: js.UndefOr[Double] = js.undefined
  
  var textBox: js.UndefOr[SingleCollisionBox] = js.undefined
  
  var textFeatureIndex: js.UndefOr[Double] = js.undefined
  
  var verticalIconBox: js.UndefOr[SingleCollisionBox] = js.undefined
  
  var verticalIconFeatureIndex: js.UndefOr[Double] = js.undefined
  
  var verticalTextBox: js.UndefOr[SingleCollisionBox] = js.undefined
  
  var verticalTextFeatureIndex: js.UndefOr[Double] = js.undefined
}
object CollisionArrays {
  
  inline def apply(): CollisionArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollisionArrays]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollisionArrays] (val x: Self) extends AnyVal {
    
    inline def setIconBox(value: SingleCollisionBox): Self = StObject.set(x, "iconBox", value.asInstanceOf[js.Any])
    
    inline def setIconBoxUndefined: Self = StObject.set(x, "iconBox", js.undefined)
    
    inline def setIconFeatureIndex(value: Double): Self = StObject.set(x, "iconFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setIconFeatureIndexUndefined: Self = StObject.set(x, "iconFeatureIndex", js.undefined)
    
    inline def setTextBox(value: SingleCollisionBox): Self = StObject.set(x, "textBox", value.asInstanceOf[js.Any])
    
    inline def setTextBoxUndefined: Self = StObject.set(x, "textBox", js.undefined)
    
    inline def setTextFeatureIndex(value: Double): Self = StObject.set(x, "textFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setTextFeatureIndexUndefined: Self = StObject.set(x, "textFeatureIndex", js.undefined)
    
    inline def setVerticalIconBox(value: SingleCollisionBox): Self = StObject.set(x, "verticalIconBox", value.asInstanceOf[js.Any])
    
    inline def setVerticalIconBoxUndefined: Self = StObject.set(x, "verticalIconBox", js.undefined)
    
    inline def setVerticalIconFeatureIndex(value: Double): Self = StObject.set(x, "verticalIconFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setVerticalIconFeatureIndexUndefined: Self = StObject.set(x, "verticalIconFeatureIndex", js.undefined)
    
    inline def setVerticalTextBox(value: SingleCollisionBox): Self = StObject.set(x, "verticalTextBox", value.asInstanceOf[js.Any])
    
    inline def setVerticalTextBoxUndefined: Self = StObject.set(x, "verticalTextBox", js.undefined)
    
    inline def setVerticalTextFeatureIndex(value: Double): Self = StObject.set(x, "verticalTextFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setVerticalTextFeatureIndexUndefined: Self = StObject.set(x, "verticalTextFeatureIndex", js.undefined)
  }
}
