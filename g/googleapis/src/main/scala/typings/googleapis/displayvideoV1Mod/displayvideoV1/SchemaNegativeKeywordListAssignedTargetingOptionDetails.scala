package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNegativeKeywordListAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the negative keyword list. Should refer to the negative_keyword_list_id field of a NegativeKeywordList resource.
    */
  var negativeKeywordListId: js.UndefOr[String | Null] = js.undefined
}
object SchemaNegativeKeywordListAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaNegativeKeywordListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNegativeKeywordListAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaNegativeKeywordListAssignedTargetingOptionDetails](x: Self) {
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdNull: Self = StObject.set(x, "negativeKeywordListId", null)
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
  }
}
