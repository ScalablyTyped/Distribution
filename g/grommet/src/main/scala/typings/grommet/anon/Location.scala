package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var location: js.Array[Double]
  
  var name: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object Location {
  
  inline def apply(location: js.Array[Double]): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
