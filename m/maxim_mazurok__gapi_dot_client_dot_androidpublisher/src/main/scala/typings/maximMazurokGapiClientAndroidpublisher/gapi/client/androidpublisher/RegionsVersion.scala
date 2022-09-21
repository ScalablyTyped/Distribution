package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionsVersion extends StObject {
  
  /** Required. A string representing version of the available regions being used for the specified resource. The current version is 2022/01. */
  var version: js.UndefOr[String] = js.undefined
}
object RegionsVersion {
  
  inline def apply(): RegionsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionsVersion]
  }
  
  extension [Self <: RegionsVersion](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
