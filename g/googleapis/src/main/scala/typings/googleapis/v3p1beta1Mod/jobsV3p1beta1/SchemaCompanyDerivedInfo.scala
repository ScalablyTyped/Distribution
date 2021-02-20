package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Derived details about the company.
  */
@js.native
trait SchemaCompanyDerivedInfo extends StObject {
  
  /**
    * A structured headquarters location of the company, resolved from
    * Company.hq_location if provided.
    */
  var headquartersLocation: js.UndefOr[SchemaLocation] = js.native
}
object SchemaCompanyDerivedInfo {
  
  @scala.inline
  def apply(): SchemaCompanyDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanyDerivedInfo]
  }
  
  @scala.inline
  implicit class SchemaCompanyDerivedInfoMutableBuilder[Self <: SchemaCompanyDerivedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadquartersLocation(value: SchemaLocation): Self = StObject.set(x, "headquartersLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersLocationUndefined: Self = StObject.set(x, "headquartersLocation", js.undefined)
  }
}
