package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Derived details about the company.
  */
trait SchemaCompanyDerivedInfo extends StObject {
  
  /**
    * A structured headquarters location of the company, resolved from
    * Company.hq_location if provided.
    */
  var headquartersLocation: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaCompanyDerivedInfo {
  
  inline def apply(): SchemaCompanyDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanyDerivedInfo]
  }
  
  extension [Self <: SchemaCompanyDerivedInfo](x: Self) {
    
    inline def setHeadquartersLocation(value: SchemaLocation): Self = StObject.set(x, "headquartersLocation", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersLocationUndefined: Self = StObject.set(x, "headquartersLocation", js.undefined)
  }
}
