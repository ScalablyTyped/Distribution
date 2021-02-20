package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullSchema extends _AnySchema {
  
  var `type`: `null` = js.native
}
object NullSchema {
  
  @scala.inline
  def apply(`type`: `null`): NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullSchema]
  }
  
  @scala.inline
  implicit class NullSchemaMutableBuilder[Self <: NullSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
