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
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setName(value: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
