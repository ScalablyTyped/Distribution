package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The reason and details for a disapproval.
  */
@js.native
trait SchemaDisapproval extends StObject {
  
  /**
    * Additional details about the reason for disapproval.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The categorized reason for disapproval.
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaDisapproval {
  
  @scala.inline
  def apply(): SchemaDisapproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisapproval]
  }
  
  @scala.inline
  implicit class SchemaDisapprovalMutableBuilder[Self <: SchemaDisapproval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
