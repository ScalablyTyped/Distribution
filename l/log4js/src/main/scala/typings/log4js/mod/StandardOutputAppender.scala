package typings.log4js.mod

import typings.log4js.log4jsStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardOutputAppender extends StObject {
  
  // (defaults to ColoredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  var `type`: stdout
}
object StandardOutputAppender {
  
  inline def apply(): StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stdout")
    __obj.asInstanceOf[StandardOutputAppender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardOutputAppender] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: stdout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
