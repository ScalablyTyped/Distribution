package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeConditions extends StObject {
  
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.native
  
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.native
}
object ExcludeConditions {
  
  @scala.inline
  def apply(): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeConditions]
  }
  
  @scala.inline
  implicit class ExcludeConditionsMutableBuilder[Self <: ExcludeConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeConditions(value: ExclusionDuration): Self = StObject.set(x, "excludeConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeConditionsUndefined: Self = StObject.set(x, "excludeConditions", js.undefined)
    
    @scala.inline
    def setIncludeConditions(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
