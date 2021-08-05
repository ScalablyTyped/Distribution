package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Request for updating a specified company.
  */
trait SchemaUpdateCompanyRequest extends StObject {
  
  /**
    * Required.  The company resource to replace the current resource in the
    * system.
    */
  var company: js.UndefOr[SchemaCompany] = js.undefined
  
  /**
    * Optional but strongly recommended for the best service experience.  If
    * update_mask is provided, only the specified fields in company are
    * updated. Otherwise all the fields are updated.  A field mask to specify
    * the company fields to be updated. Only top level fields of Company are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateCompanyRequest {
  
  inline def apply(): SchemaUpdateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCompanyRequest]
  }
  
  extension [Self <: SchemaUpdateCompanyRequest](x: Self) {
    
    inline def setCompany(value: SchemaCompany): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
