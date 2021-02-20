package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operator extends StObject {
  
  var id: String = js.native
  
  var name: String = js.native
  
  var `type`: operator = js.native
}
object Operator {
  
  @scala.inline
  def apply(id: String, name: String, `type`: operator): Operator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
  
  @scala.inline
  implicit class OperatorMutableBuilder[Self <: Operator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
