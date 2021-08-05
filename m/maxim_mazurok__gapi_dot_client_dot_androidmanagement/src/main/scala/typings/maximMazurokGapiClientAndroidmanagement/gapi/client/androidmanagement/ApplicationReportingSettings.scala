package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationReportingSettings extends StObject {
  
  /** Whether removed apps are included in application reports. */
  var includeRemovedApps: js.UndefOr[Boolean] = js.undefined
}
object ApplicationReportingSettings {
  
  inline def apply(): ApplicationReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationReportingSettings]
  }
  
  extension [Self <: ApplicationReportingSettings](x: Self) {
    
    inline def setIncludeRemovedApps(value: Boolean): Self = StObject.set(x, "includeRemovedApps", value.asInstanceOf[js.Any])
    
    inline def setIncludeRemovedAppsUndefined: Self = StObject.set(x, "includeRemovedApps", js.undefined)
  }
}
