package typings.jqueryTools

import typings.jqueryTools.JQueryTools.ToolsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var tools: ToolsStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(tools: ToolsStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tools = tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTools(value: ToolsStatic): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
  }
}
