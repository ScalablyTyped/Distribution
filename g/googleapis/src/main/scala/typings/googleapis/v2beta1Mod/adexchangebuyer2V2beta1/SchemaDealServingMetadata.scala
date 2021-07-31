package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message captures metadata about the serving status of a deal.
  */
trait SchemaDealServingMetadata extends StObject {
  
  /**
    * Tracks which parties (if any) have paused a deal. @OutputOnly
    */
  var dealPauseStatus: js.UndefOr[SchemaDealPauseStatus] = js.undefined
}
object SchemaDealServingMetadata {
  
  @scala.inline
  def apply(): SchemaDealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadata]
  }
  
  @scala.inline
  implicit class SchemaDealServingMetadataMutableBuilder[Self <: SchemaDealServingMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDealPauseStatus(value: SchemaDealPauseStatus): Self = StObject.set(x, "dealPauseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealPauseStatusUndefined: Self = StObject.set(x, "dealPauseStatus", js.undefined)
  }
}
