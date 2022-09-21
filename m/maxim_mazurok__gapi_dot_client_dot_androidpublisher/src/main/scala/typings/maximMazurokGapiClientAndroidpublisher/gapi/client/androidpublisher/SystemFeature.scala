package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemFeature extends StObject {
  
  /** The name of the feature. */
  var name: js.UndefOr[String] = js.undefined
}
object SystemFeature {
  
  inline def apply(): SystemFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemFeature]
  }
  
  extension [Self <: SystemFeature](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
