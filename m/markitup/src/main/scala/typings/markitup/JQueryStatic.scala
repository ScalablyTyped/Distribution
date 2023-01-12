package typings.markitup

import typings.markitup.MarkItUp.Options
import typings.markitup.MarkItUp.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def markItUp(): JQuery
  def markItUp(settings: Options): JQuery
  @JSName("markItUp")
  var markItUp_Original: Static
}
object JQueryStatic {
  
  inline def apply(markItUp: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(markItUp = markItUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setMarkItUp(value: Static): Self = StObject.set(x, "markItUp", value.asInstanceOf[js.Any])
  }
}
