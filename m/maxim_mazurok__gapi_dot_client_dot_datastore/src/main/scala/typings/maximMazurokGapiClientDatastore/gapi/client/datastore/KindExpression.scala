package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KindExpression extends StObject {
  
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.undefined
}
object KindExpression {
  
  inline def apply(): KindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KindExpression]
  }
  
  extension [Self <: KindExpression](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
