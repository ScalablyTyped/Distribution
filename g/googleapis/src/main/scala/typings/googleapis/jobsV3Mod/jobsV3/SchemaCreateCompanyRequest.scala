package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  The Request of the CreateCompany method.
  */
trait SchemaCreateCompanyRequest extends StObject {
  
  /**
    * Required.  The company to be created.
    */
  var company: js.UndefOr[SchemaCompany] = js.undefined
}
object SchemaCreateCompanyRequest {
  
  inline def apply(): SchemaCreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCompanyRequest]
  }
  
  extension [Self <: SchemaCreateCompanyRequest](x: Self) {
    
    inline def setCompany(value: SchemaCompany): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
  }
}
