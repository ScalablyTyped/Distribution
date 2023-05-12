package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.BackgroundColor
import typings.gorillaEngine.anon.Border
import typings.gorillaEngine.anon.Enabled
import typings.gorillaEngine.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modulation extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var centerLine: js.UndefOr[BackgroundColor] = js.undefined
  
  var centerValue: Value
  
  var color: js.UndefOr[String] = js.undefined
  
  var indication: js.UndefOr[Enabled] = js.undefined
  
  var legacyCompatibility: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Any] = js.undefined
  
  def setValues(values: Any): Unit
  
  var tooltip: Border
  
  var values: Any
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Modulation {
  
  inline def apply(centerValue: Value, setValues: Any => Unit, tooltip: Border, values: Any): Modulation = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], setValues = js.Any.fromFunction1(setValues), tooltip = tooltip.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modulation] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCenterLine(value: BackgroundColor): Self = StObject.set(x, "centerLine", value.asInstanceOf[js.Any])
    
    inline def setCenterLineUndefined: Self = StObject.set(x, "centerLine", js.undefined)
    
    inline def setCenterValue(value: Value): Self = StObject.set(x, "centerValue", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndication(value: Enabled): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setLegacyCompatibility(value: Boolean): Self = StObject.set(x, "legacyCompatibility", value.asInstanceOf[js.Any])
    
    inline def setLegacyCompatibilityUndefined: Self = StObject.set(x, "legacyCompatibility", js.undefined)
    
    inline def setResolution(value: Any): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSetValues(value: Any => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    inline def setTooltip(value: Border): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
