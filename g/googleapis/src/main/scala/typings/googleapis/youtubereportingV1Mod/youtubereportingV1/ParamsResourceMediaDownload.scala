package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMediaDownload
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the media that is being downloaded.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceMediaDownload {
  
  inline def apply(): ParamsResourceMediaDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMediaDownload]
  }
  
  extension [Self <: ParamsResourceMediaDownload](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
