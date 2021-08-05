package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile application targeting settings.
  */
trait SchemaMobileApplicationTargeting extends StObject {
  
  /**
    * Publisher owned apps to be targeted or excluded by the publisher to
    * display the ads in.
    */
  var firstPartyTargeting: js.UndefOr[SchemaFirstPartyMobileApplicationTargeting] = js.undefined
}
object SchemaMobileApplicationTargeting {
  
  inline def apply(): SchemaMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApplicationTargeting]
  }
  
  extension [Self <: SchemaMobileApplicationTargeting](x: Self) {
    
    inline def setFirstPartyTargeting(value: SchemaFirstPartyMobileApplicationTargeting): Self = StObject.set(x, "firstPartyTargeting", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyTargetingUndefined: Self = StObject.set(x, "firstPartyTargeting", js.undefined)
  }
}
