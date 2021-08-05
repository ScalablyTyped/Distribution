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
  
  inline def apply(): SymbolDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolDictionary]
  }
  
  extension [Self <: SymbolDictionary](x: Self) {
    
    inline def setArc(value: js.Function): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setCallout(value: js.Function): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setCircle(value: js.Function): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setDiamond(value: js.Function): Self = StObject.set(x, "diamond", value.asInstanceOf[js.Any])
    
    inline def setDiamondUndefined: Self = StObject.set(x, "diamond", js.undefined)
    
    inline def setSquare(value: js.Function): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setTriangle(value: js.Function): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    
    inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
  }
}
