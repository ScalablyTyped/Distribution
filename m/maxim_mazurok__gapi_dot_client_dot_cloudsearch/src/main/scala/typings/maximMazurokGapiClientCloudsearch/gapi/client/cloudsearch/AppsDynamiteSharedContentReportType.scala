package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedContentReportType extends StObject {
  
  /** Required. Google-defined system violation, covering the most common violations. */
  var systemViolation: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedContentReportType {
  
  inline def apply(): AppsDynamiteSharedContentReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedContentReportType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedContentReportType] (val x: Self) extends AnyVal {
    
    inline def setSystemViolation(value: String): Self = StObject.set(x, "systemViolation", value.asInstanceOf[js.Any])
    
    inline def setSystemViolationUndefined: Self = StObject.set(x, "systemViolation", js.undefined)
  }
}
