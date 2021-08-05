package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Guest OS features.
  */
trait SchemaGuestOsFeature extends StObject {
  
  /**
    * The ID of a supported feature. Read  Enabling guest operating system
    * features to see a list of available options.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGuestOsFeature {
  
  inline def apply(): SchemaGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestOsFeature]
  }
  
  extension [Self <: SchemaGuestOsFeature](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
