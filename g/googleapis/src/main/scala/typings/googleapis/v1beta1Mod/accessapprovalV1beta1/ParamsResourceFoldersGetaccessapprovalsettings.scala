package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersGetaccessapprovalsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the AccessApprovalSettings to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersGetaccessapprovalsettings {
  
  inline def apply(): ParamsResourceFoldersGetaccessapprovalsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersGetaccessapprovalsettings]
  }
  
  extension [Self <: ParamsResourceFoldersGetaccessapprovalsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
