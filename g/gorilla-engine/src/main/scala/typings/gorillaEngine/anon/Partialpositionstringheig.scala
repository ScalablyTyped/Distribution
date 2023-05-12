package typings.gorillaEngine.anon

import typings.gorillaEngine.GorillaEngine.UI.GridMeasure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  position :string,   height :number,   minTickSpacing :number,   minLabelSpacing :number,   enabled :boolean,   backgroundColor :string,   backgroundImage :string,   measures :std.Array<gorilla-engine.GorillaEngine.UI.GridMeasure>, addMeasure (measure : gorilla-engine.GorillaEngine.UI.GridMeasure): void}> */
trait Partialpositionstringheig extends StObject {
  
  var addMeasure: js.UndefOr[js.Function1[/* measure */ GridMeasure, Unit]] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var measures: js.UndefOr[js.Array[GridMeasure]] = js.undefined
  
  var minLabelSpacing: js.UndefOr[Double] = js.undefined
  
  var minTickSpacing: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object Partialpositionstringheig {
  
  inline def apply(): Partialpositionstringheig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpositionstringheig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialpositionstringheig] (val x: Self) extends AnyVal {
    
    inline def setAddMeasure(value: /* measure */ GridMeasure => Unit): Self = StObject.set(x, "addMeasure", js.Any.fromFunction1(value))
    
    inline def setAddMeasureUndefined: Self = StObject.set(x, "addMeasure", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMeasures(value: js.Array[GridMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: GridMeasure*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setMinLabelSpacing(value: Double): Self = StObject.set(x, "minLabelSpacing", value.asInstanceOf[js.Any])
    
    inline def setMinLabelSpacingUndefined: Self = StObject.set(x, "minLabelSpacing", js.undefined)
    
    inline def setMinTickSpacing(value: Double): Self = StObject.set(x, "minTickSpacing", value.asInstanceOf[js.Any])
    
    inline def setMinTickSpacingUndefined: Self = StObject.set(x, "minTickSpacing", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
