package typings.grommet.anon

import typings.grommet.grommetStrings.Africa
import typings.grommet.grommetStrings.Asia
import typings.grommet.grommetStrings.Australia
import typings.grommet.grommetStrings.Europe
import typings.grommet.grommetStrings.`North America`
import typings.grommet.grommetStrings.`South America`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
  var color: js.UndefOr[String | Dark] = js.native
  
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`) = js.native
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object Name {
  
  @scala.inline
  def apply(name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String | Dark): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* repeated */ js.Any => _): Self = this.set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
  }
}
