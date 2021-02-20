package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCancelTestOrderByCustomerResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCancelTestOrderByCustomerResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOrdersCancelTestOrderByCustomerResponse {
  
  @scala.inline
  def apply(): SchemaOrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerResponse]
  }
  
  @scala.inline
  implicit class SchemaOrdersCancelTestOrderByCustomerResponseMutableBuilder[Self <: SchemaOrdersCancelTestOrderByCustomerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
