package typings.grommet.anon

import typings.grommet.grommetStrings.Africa
import typings.grommet.grommetStrings.Asia
import typings.grommet.grommetStrings.Australia
import typings.grommet.grommetStrings.Europe
import typings.grommet.grommetStrings.`North America`
import typings.grommet.grommetStrings.`South America`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)
  
  var onClick: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* hovered */ Boolean, Unit]] = js.undefined
}
object Name {
  
  inline def apply(name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setName(value: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: /* name */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: /* hovered */ Boolean => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
