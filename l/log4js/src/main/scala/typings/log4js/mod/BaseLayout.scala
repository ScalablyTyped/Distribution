package typings.log4js.mod

import typings.log4js.log4jsStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayout
  extends StObject
     with Layout {
  
  var `type`: basic
}
object BaseLayout {
  
  @scala.inline
  def apply(): BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[BaseLayout]
  }
  
  @scala.inline
  implicit class BaseLayoutMutableBuilder[Self <: BaseLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
