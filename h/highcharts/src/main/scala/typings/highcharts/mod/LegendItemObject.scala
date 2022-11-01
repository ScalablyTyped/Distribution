package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendItemObject extends StObject {
  
  var item: js.UndefOr[SVGElement] = js.undefined
  
  var line: js.UndefOr[SVGElement] = js.undefined
  
  var symbol: js.UndefOr[SVGElement] = js.undefined
}
object LegendItemObject {
  
  inline def apply(): LegendItemObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemObject]
  }
  
  extension [Self <: LegendItemObject](x: Self) {
    
    inline def setItem(value: SVGElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLine(value: SVGElement): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setSymbol(value: SVGElement): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
