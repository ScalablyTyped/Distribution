package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression
  extends StObject
     with Expression
     with CoreExpression {
  
  @JSName("type")
  var type_ThisExpression: typings.jsep.jsepStrings.ThisExpression
}
object ThisExpression {
  
  inline def apply(): ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThisExpression] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.jsep.jsepStrings.ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
