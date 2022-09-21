package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsLabelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the account that owns the label.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the label to delete.
    */
  var labelId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsLabelsDelete {
  
  inline def apply(): ParamsResourceAccountsLabelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsLabelsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsLabelsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
