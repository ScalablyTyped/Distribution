package typings.log4js.mod

import typings.log4js.log4jsStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayout extends Layout {
  
  var `type`: basic = js.native
}
object BaseLayout {
  
  @scala.inline
  def apply(`type`: basic): BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayout]
  }
  
  @scala.inline
  implicit class BaseLayoutMutableBuilder[Self <: BaseLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
