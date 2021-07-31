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
  
  @scala.inline
  def apply(): SchemaMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApplicationTargeting]
  }
  
  @scala.inline
  implicit class SchemaMobileApplicationTargetingMutableBuilder[Self <: SchemaMobileApplicationTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstPartyTargeting(value: SchemaFirstPartyMobileApplicationTargeting): Self = StObject.set(x, "firstPartyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyTargetingUndefined: Self = StObject.set(x, "firstPartyTargeting", js.undefined)
  }
}
