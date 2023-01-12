package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeConditions extends StObject {
  
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.undefined
}
object IncludeConditions {
  
  inline def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeConditions] (val x: Self) extends AnyVal {
    
    inline def setIncludeConditions(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
