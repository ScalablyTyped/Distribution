package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidFcmOptions extends StObject {
  
  /**
    * Label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidFcmOptions {
  
  inline def apply(): SchemaAndroidFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidFcmOptions]
  }
  
  extension [Self <: SchemaAndroidFcmOptions](x: Self) {
    
    inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsLabelNull: Self = StObject.set(x, "analyticsLabel", null)
    
    inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
  }
}
