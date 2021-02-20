package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents targeting information for operating systems.
  */
@js.native
trait SchemaOperatingSystemTargeting extends StObject {
  
  /**
    * IDs of operating systems to be included/excluded.
    */
  var operatingSystemCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
  
  /**
    * IDs of operating system versions to be included/excluded.
    */
  var operatingSystemVersionCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
}
object SchemaOperatingSystemTargeting {
  
  @scala.inline
  def apply(): SchemaOperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemTargeting]
  }
  
  @scala.inline
  implicit class SchemaOperatingSystemTargetingMutableBuilder[Self <: SchemaOperatingSystemTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatingSystemCriteria(value: SchemaCriteriaTargeting): Self = StObject.set(x, "operatingSystemCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemCriteriaUndefined: Self = StObject.set(x, "operatingSystemCriteria", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionCriteria(value: SchemaCriteriaTargeting): Self = StObject.set(x, "operatingSystemVersionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionCriteriaUndefined: Self = StObject.set(x, "operatingSystemVersionCriteria", js.undefined)
  }
}
