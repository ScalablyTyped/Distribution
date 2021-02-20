package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GqlQueryParameter extends StObject {
  
  /** A query cursor. Query cursors are returned in query result batches. */
  var cursor: js.UndefOr[String] = js.native
  
  /** A value parameter. */
  var value: js.UndefOr[Value] = js.native
}
object GqlQueryParameter {
  
  @scala.inline
  def apply(): GqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GqlQueryParameter]
  }
  
  @scala.inline
  implicit class GqlQueryParameterMutableBuilder[Self <: GqlQueryParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
