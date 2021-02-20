package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgeRangeTargetingOptionDetails extends StObject {
  
  /** Output only. The age range of an audience. */
  var ageRange: js.UndefOr[String] = js.native
}
object AgeRangeTargetingOptionDetails {
  
  @scala.inline
  def apply(): AgeRangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AgeRangeTargetingOptionDetailsMutableBuilder[Self <: AgeRangeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
  }
}
