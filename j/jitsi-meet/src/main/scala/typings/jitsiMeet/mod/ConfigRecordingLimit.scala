package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRecordingLimit extends StObject {
  
  var appName: js.UndefOr[String] = js.undefined
  
  var appURL: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object ConfigRecordingLimit {
  
  inline def apply(): ConfigRecordingLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRecordingLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigRecordingLimit] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAppURL(value: String): Self = StObject.set(x, "appURL", value.asInstanceOf[js.Any])
    
    inline def setAppURLUndefined: Self = StObject.set(x, "appURL", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
