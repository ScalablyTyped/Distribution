package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec extends StObject {
  
  /**
    * The condition under which query expansion should occur. Default to Condition.DISABLED.
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to pin unexpanded results. If this field is set to true, unexpanded products are always at the top of the search results, followed by the expanded results.
    */
  var pinUnexpandedResults: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setPinUnexpandedResults(value: Boolean): Self = StObject.set(x, "pinUnexpandedResults", value.asInstanceOf[js.Any])
    
    inline def setPinUnexpandedResultsNull: Self = StObject.set(x, "pinUnexpandedResults", null)
    
    inline def setPinUnexpandedResultsUndefined: Self = StObject.set(x, "pinUnexpandedResults", js.undefined)
  }
}
