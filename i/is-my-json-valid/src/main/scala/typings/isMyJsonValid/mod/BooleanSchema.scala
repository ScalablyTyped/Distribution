package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanSchema extends _AnySchema {
  
  var `type`: boolean = js.native
}
object BooleanSchema {
  
  @scala.inline
  def apply(`type`: boolean): BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanSchema]
  }
  
  @scala.inline
  implicit class BooleanSchemaMutableBuilder[Self <: BooleanSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
