package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppDevExperienceFeatureState extends StObject {
  
  /**
    * Status of subcomponent that detects configured Service Mesh resources.
    */
  var networkingInstallSucceeded: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaAppDevExperienceFeatureState {
  
  inline def apply(): SchemaAppDevExperienceFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppDevExperienceFeatureState]
  }
  
  extension [Self <: SchemaAppDevExperienceFeatureState](x: Self) {
    
    inline def setNetworkingInstallSucceeded(value: SchemaStatus): Self = StObject.set(x, "networkingInstallSucceeded", value.asInstanceOf[js.Any])
    
    inline def setNetworkingInstallSucceededUndefined: Self = StObject.set(x, "networkingInstallSucceeded", js.undefined)
  }
}
