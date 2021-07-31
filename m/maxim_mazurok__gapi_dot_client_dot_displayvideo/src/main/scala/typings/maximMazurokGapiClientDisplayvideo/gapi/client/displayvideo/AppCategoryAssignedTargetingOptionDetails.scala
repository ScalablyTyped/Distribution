package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCategoryAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the app category. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_APP_CATEGORY`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object AppCategoryAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): AppCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCategoryAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AppCategoryAssignedTargetingOptionDetailsMutableBuilder[Self <: AppCategoryAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
