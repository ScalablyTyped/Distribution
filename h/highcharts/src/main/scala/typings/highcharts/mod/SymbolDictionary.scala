package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolDictionary
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[js.Function]] {
  
  var arc: js.UndefOr[js.Function] = js.undefined
  
  var callout: js.UndefOr[js.Function] = js.undefined
  
  var circle: js.UndefOr[js.Function] = js.undefined
  
  var diamond: js.UndefOr[js.Function] = js.undefined
  
  var square: js.UndefOr[js.Function] = js.undefined
  
  var triangle: js.UndefOr[js.Function] = js.undefined
}
object SymbolDictionary {
  
  @scala.inline
  def apply(): SymbolDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolDictionary]
  }
  
  @scala.inline
  implicit class SymbolDictionaryMutableBuilder[Self <: SymbolDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: js.Function): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setCallout(value: js.Function): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setCircle(value: js.Function): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setDiamond(value: js.Function): Self = StObject.set(x, "diamond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiamondUndefined: Self = StObject.set(x, "diamond", js.undefined)
    
    @scala.inline
    def setSquare(value: js.Function): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    @scala.inline
    def setTriangle(value: js.Function): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
  }
}
