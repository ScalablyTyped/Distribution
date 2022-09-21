package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaControl extends StObject {
  
  /**
    * Output only. List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
    */
  var associatedServingConfigIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A facet specification to perform faceted search.
    */
  var facetSpec: js.UndefOr[SchemaGoogleCloudRetailV2alphaSearchRequestFacetSpec] = js.undefined
  
  /**
    * Immutable. Fully qualified name `projects/x/locations/global/catalogs/x/controls/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
    */
  var rule: js.UndefOr[SchemaGoogleCloudRetailV2alphaRule] = js.undefined
  
  /**
    * Required. Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment. If no solution type is provided at creation time, will default to SOLUTION_TYPE_SEARCH.
    */
  var solutionTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaControl {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaControl]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaControl](x: Self) {
    
    inline def setAssociatedServingConfigIds(value: js.Array[String]): Self = StObject.set(x, "associatedServingConfigIds", value.asInstanceOf[js.Any])
    
    inline def setAssociatedServingConfigIdsNull: Self = StObject.set(x, "associatedServingConfigIds", null)
    
    inline def setAssociatedServingConfigIdsUndefined: Self = StObject.set(x, "associatedServingConfigIds", js.undefined)
    
    inline def setAssociatedServingConfigIdsVarargs(value: String*): Self = StObject.set(x, "associatedServingConfigIds", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFacetSpec(value: SchemaGoogleCloudRetailV2alphaSearchRequestFacetSpec): Self = StObject.set(x, "facetSpec", value.asInstanceOf[js.Any])
    
    inline def setFacetSpecUndefined: Self = StObject.set(x, "facetSpec", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRule(value: SchemaGoogleCloudRetailV2alphaRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "solutionTypes", value.asInstanceOf[js.Any])
    
    inline def setSolutionTypesNull: Self = StObject.set(x, "solutionTypes", null)
    
    inline def setSolutionTypesUndefined: Self = StObject.set(x, "solutionTypes", js.undefined)
    
    inline def setSolutionTypesVarargs(value: String*): Self = StObject.set(x, "solutionTypes", js.Array(value*))
  }
}
