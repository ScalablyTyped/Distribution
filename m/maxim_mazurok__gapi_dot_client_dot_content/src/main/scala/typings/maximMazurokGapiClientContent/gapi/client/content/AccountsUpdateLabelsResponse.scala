package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsUpdateLabelsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsUpdateLabelsResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountsUpdateLabelsResponse {
  
  inline def apply(): AccountsUpdateLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsUpdateLabelsResponse]
  }
  
  extension [Self <: AccountsUpdateLabelsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
