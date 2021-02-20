package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsSetInventoryVerificationContactResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsSetInventoryVerificationContactResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaLiasettingsSetInventoryVerificationContactResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsSetInventoryVerificationContactResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsSetInventoryVerificationContactResponseMutableBuilder[Self <: SchemaLiasettingsSetInventoryVerificationContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
