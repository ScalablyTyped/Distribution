package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersBigqueryexportsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the big query export to delete. Its format is organizations/{organization\}/bigQueryExports/{export_id\}, folders/{folder\}/bigQueryExports/{export_id\}, or projects/{project\}/bigQueryExports/{export_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersBigqueryexportsDelete {
  
  inline def apply(): ParamsResourceFoldersBigqueryexportsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersBigqueryexportsDelete]
  }
  
  extension [Self <: ParamsResourceFoldersBigqueryexportsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
