package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCategoryTargetingOptionDetails extends StObject {
  
  /** Output only. The name of the app collection. */
  var displayName: js.UndefOr[String] = js.native
}
object AppCategoryTargetingOptionDetails {
  
  @scala.inline
  def apply(): AppCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCategoryTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AppCategoryTargetingOptionDetailsMutableBuilder[Self <: AppCategoryTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
