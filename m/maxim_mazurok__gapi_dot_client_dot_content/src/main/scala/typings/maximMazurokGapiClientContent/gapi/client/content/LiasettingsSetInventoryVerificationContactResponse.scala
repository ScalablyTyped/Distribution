package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiasettingsSetInventoryVerificationContactResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#liasettingsSetInventoryVerificationContactResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object LiasettingsSetInventoryVerificationContactResponse {
  
  inline def apply(): LiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsSetInventoryVerificationContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiasettingsSetInventoryVerificationContactResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
