package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents targeting about where the ads can appear, e.g., certain sites or
  * mobile applications. Different placement targeting types will be logically
  * OR&#39;ed.
  */
trait SchemaPlacementTargeting extends StObject {
  
  /**
    * Mobile application targeting information in a deal. This doesn&#39;t
    * apply to Auction Packages.
    */
  var mobileApplicationTargeting: js.UndefOr[SchemaMobileApplicationTargeting] = js.undefined
  
  /**
    * URLs to be included/excluded.
    */
  var urlTargeting: js.UndefOr[SchemaUrlTargeting] = js.undefined
}
object SchemaPlacementTargeting {
  
  inline def apply(): SchemaPlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTargeting]
  }
  
  extension [Self <: SchemaPlacementTargeting](x: Self) {
    
    inline def setMobileApplicationTargeting(value: SchemaMobileApplicationTargeting): Self = StObject.set(x, "mobileApplicationTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileApplicationTargetingUndefined: Self = StObject.set(x, "mobileApplicationTargeting", js.undefined)
    
    inline def setUrlTargeting(value: SchemaUrlTargeting): Self = StObject.set(x, "urlTargeting", value.asInstanceOf[js.Any])
    
    inline def setUrlTargetingUndefined: Self = StObject.set(x, "urlTargeting", js.undefined)
  }
}
