package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsSetInventoryVerificationContactResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsSetInventoryVerificationContactResponse". */
  var kind: js.UndefOr[String] = js.native
}
object LiasettingsSetInventoryVerificationContactResponse {
  
  @scala.inline
  def apply(): LiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsSetInventoryVerificationContactResponse]
  }
  
  @scala.inline
  implicit class LiasettingsSetInventoryVerificationContactResponseMutableBuilder[Self <: LiasettingsSetInventoryVerificationContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
