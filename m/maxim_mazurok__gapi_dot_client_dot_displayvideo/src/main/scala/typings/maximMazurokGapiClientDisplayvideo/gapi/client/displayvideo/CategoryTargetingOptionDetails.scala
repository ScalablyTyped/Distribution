package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the category. */
  var displayName: js.UndefOr[String] = js.native
}
object CategoryTargetingOptionDetails {
  
  @scala.inline
  def apply(): CategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class CategoryTargetingOptionDetailsMutableBuilder[Self <: CategoryTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
