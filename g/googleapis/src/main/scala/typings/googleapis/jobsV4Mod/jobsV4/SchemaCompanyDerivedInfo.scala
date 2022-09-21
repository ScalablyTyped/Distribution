package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompanyDerivedInfo extends StObject {
  
  /**
    * A structured headquarters location of the company, resolved from Company.headquarters_address if provided.
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
