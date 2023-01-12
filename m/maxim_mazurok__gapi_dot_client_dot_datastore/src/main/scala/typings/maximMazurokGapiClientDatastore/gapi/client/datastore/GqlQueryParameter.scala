package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GqlQueryParameter extends StObject {
  
  /** A query cursor. Query cursors are returned in query result batches. */
  var cursor: js.UndefOr[String] = js.undefined
  
  /** A value parameter. */
  var value: js.UndefOr[Value] = js.undefined
}
object GqlQueryParameter {
  
  inline def apply(): GqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GqlQueryParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GqlQueryParameter] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
