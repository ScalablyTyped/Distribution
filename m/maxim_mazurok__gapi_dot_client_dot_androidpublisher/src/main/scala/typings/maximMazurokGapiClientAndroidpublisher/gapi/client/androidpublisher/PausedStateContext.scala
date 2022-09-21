package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PausedStateContext extends StObject {
  
  /** Time at which the subscription will be automatically resumed. */
  var autoResumeTime: js.UndefOr[String] = js.undefined
}
object PausedStateContext {
  
  inline def apply(): PausedStateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PausedStateContext]
  }
  
  extension [Self <: PausedStateContext](x: Self) {
    
    inline def setAutoResumeTime(value: String): Self = StObject.set(x, "autoResumeTime", value.asInstanceOf[js.Any])
    
    inline def setAutoResumeTimeUndefined: Self = StObject.set(x, "autoResumeTime", js.undefined)
  }
}
