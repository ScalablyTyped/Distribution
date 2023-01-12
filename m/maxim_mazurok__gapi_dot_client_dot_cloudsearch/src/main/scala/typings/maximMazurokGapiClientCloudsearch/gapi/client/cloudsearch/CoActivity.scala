package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoActivity extends StObject {
  
  /** The title of the activity in this co-activity session. For example, this might be the title of the video being co-watched, or the name of the round of a game being co-played. */
  var activityTitle: js.UndefOr[String] = js.undefined
  
  /** Identifies the app handling this co-activity. */
  var coActivityApp: js.UndefOr[String] = js.undefined
}
object CoActivity {
  
  inline def apply(): CoActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoActivity] (val x: Self) extends AnyVal {
    
    inline def setActivityTitle(value: String): Self = StObject.set(x, "activityTitle", value.asInstanceOf[js.Any])
    
    inline def setActivityTitleUndefined: Self = StObject.set(x, "activityTitle", js.undefined)
    
    inline def setCoActivityApp(value: String): Self = StObject.set(x, "coActivityApp", value.asInstanceOf[js.Any])
    
    inline def setCoActivityAppUndefined: Self = StObject.set(x, "coActivityApp", js.undefined)
  }
}
