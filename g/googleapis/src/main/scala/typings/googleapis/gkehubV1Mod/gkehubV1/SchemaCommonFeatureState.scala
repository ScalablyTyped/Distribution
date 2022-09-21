package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommonFeatureState extends StObject {
  
  /**
    * Appdevexperience specific state.
    */
  var appdevexperience: js.UndefOr[SchemaAppDevExperienceFeatureState] = js.undefined
  
  /**
    * Output only. The "running state" of the Feature in this Hub.
    */
  var state: js.UndefOr[SchemaFeatureState] = js.undefined
}
object SchemaCommonFeatureState {
  
  inline def apply(): SchemaCommonFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommonFeatureState]
  }
  
  extension [Self <: SchemaCommonFeatureState](x: Self) {
    
    inline def setAppdevexperience(value: SchemaAppDevExperienceFeatureState): Self = StObject.set(x, "appdevexperience", value.asInstanceOf[js.Any])
    
    inline def setAppdevexperienceUndefined: Self = StObject.set(x, "appdevexperience", js.undefined)
    
    inline def setState(value: SchemaFeatureState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
