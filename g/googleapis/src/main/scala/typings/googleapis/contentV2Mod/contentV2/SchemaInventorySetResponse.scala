package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInventorySetResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventorySetResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaInventorySetResponse {
  
  @scala.inline
  def apply(): SchemaInventorySetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySetResponse]
  }
  
  @scala.inline
  implicit class SchemaInventorySetResponseMutableBuilder[Self <: SchemaInventorySetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
