package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersApprovalrequestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the approval request to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersApprovalrequestsGet {
  
  inline def apply(): ParamsResourceFoldersApprovalrequestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersApprovalrequestsGet]
  }
  
  extension [Self <: ParamsResourceFoldersApprovalrequestsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
