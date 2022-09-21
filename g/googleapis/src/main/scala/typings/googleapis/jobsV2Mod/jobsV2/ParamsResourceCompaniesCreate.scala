package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCompaniesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCompany] = js.undefined
}
object ParamsResourceCompaniesCreate {
  
  inline def apply(): ParamsResourceCompaniesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompaniesCreate]
  }
  
  extension [Self <: ParamsResourceCompaniesCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaCompany): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
