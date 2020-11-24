package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
  var edge: Boolean = js.native
  
  var mozilla: Boolean = js.native
  
  var msie: Boolean = js.native
  
  var opera: Boolean = js.native
  
  var safari: Boolean = js.native
  
  var version: String = js.native
  
  var webkit: Boolean = js.native
}
object Edge {
  
  @scala.inline
  def apply(
    edge: Boolean,
    mozilla: Boolean,
    msie: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): Edge = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozilla(value: Boolean): Self = this.set("mozilla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsie(value: Boolean): Self = this.set("msie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
  }
}
