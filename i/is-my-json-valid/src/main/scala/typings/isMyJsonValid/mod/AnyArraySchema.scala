package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyArraySchema
  extends ArraySchema[AnySchema]
     with _AnySchema
object AnyArraySchema {
  
  @scala.inline
  def apply(items: AnySchema, `type`: array): AnyArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyArraySchema]
  }
}
