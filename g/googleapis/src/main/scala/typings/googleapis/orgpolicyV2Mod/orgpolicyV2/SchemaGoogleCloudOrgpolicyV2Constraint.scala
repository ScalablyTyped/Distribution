package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2Constraint extends StObject {
  
  /**
    * Defines this constraint as being a BooleanConstraint.
    */
  var booleanConstraint: js.UndefOr[SchemaGoogleCloudOrgpolicyV2ConstraintBooleanConstraint] = js.undefined
  
  /**
    * The evaluation behavior of this constraint in the absence of 'Policy'.
    */
  var constraintDefault: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed description of what this `Constraint` controls as well as how and where it is enforced. Mutable.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name. Mutable.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines this constraint as being a ListConstraint.
    */
  var listConstraint: js.UndefOr[SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint] = js.undefined
  
  /**
    * Immutable. The resource name of the Constraint. Must be in one of the following forms: * `projects/{project_number\}/constraints/{constraint_name\}` * `folders/{folder_id\}/constraints/{constraint_name\}` * `organizations/{organization_id\}/constraints/{constraint_name\}` For example, "/projects/123/constraints/compute.disableSerialPortAccess".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2Constraint {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2Constraint]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2Constraint](x: Self) {
    
    inline def setBooleanConstraint(value: SchemaGoogleCloudOrgpolicyV2ConstraintBooleanConstraint): Self = StObject.set(x, "booleanConstraint", value.asInstanceOf[js.Any])
    
    inline def setBooleanConstraintUndefined: Self = StObject.set(x, "booleanConstraint", js.undefined)
    
    inline def setConstraintDefault(value: String): Self = StObject.set(x, "constraintDefault", value.asInstanceOf[js.Any])
    
    inline def setConstraintDefaultNull: Self = StObject.set(x, "constraintDefault", null)
    
    inline def setConstraintDefaultUndefined: Self = StObject.set(x, "constraintDefault", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setListConstraint(value: SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint): Self = StObject.set(x, "listConstraint", value.asInstanceOf[js.Any])
    
    inline def setListConstraintUndefined: Self = StObject.set(x, "listConstraint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
