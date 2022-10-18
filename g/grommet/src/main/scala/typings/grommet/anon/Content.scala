package typings.grommet.anon

import typings.grommet.componentsDropMod.DropProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var dropProps: js.UndefOr[DropProps] = js.undefined
  
  var location: js.Array[Double]
  
  var name: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* hovered */ Boolean, Unit]] = js.undefined
}
object Content {
  
  inline def apply(location: js.Array[Double]): Content = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
    
    inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
    
    inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: /* name */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: /* hovered */ Boolean => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
