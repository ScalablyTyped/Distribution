package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Assignment.
  */
@js.native
trait SchemaPlacementAssignment extends StObject {
  
  /**
    * Whether this placement assignment is active. When true, the placement
    * will be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the placement to be assigned. This is a required field.
    */
  var placementId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the placement. This is a read-only,
    * auto-generated field.
    */
  var placementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether the placement to be assigned requires SSL. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
}
object SchemaPlacementAssignment {
  
  @scala.inline
  def apply(): SchemaPlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementAssignment]
  }
  
  @scala.inline
  implicit class SchemaPlacementAssignmentMutableBuilder[Self <: SchemaPlacementAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "placementIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdDimensionValueUndefined: Self = StObject.set(x, "placementIdDimensionValue", js.undefined)
    
    @scala.inline
    def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
  }
}
