package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the size of an ad unit that can be targeted on an ad request. It
  * only applies to Private Auction, AdX Preferred Deals and Auction Packages.
  * This targeting does not apply to Programmatic Guaranteed and Preferred
  * Deals in Ad Manager.
  */
@js.native
trait SchemaInventorySizeTargeting extends StObject {
  
  /**
    * A list of inventory sizes to be excluded.
    */
  var excludedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  
  /**
    * A list of inventory sizes to be included.
    */
  var targetedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
}
object SchemaInventorySizeTargeting {
  
  @scala.inline
  def apply(): SchemaInventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySizeTargeting]
  }
  
  @scala.inline
  implicit class SchemaInventorySizeTargetingMutableBuilder[Self <: SchemaInventorySizeTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedInventorySizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "excludedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedInventorySizesUndefined: Self = StObject.set(x, "excludedInventorySizes", js.undefined)
    
    @scala.inline
    def setExcludedInventorySizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "excludedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setTargetedInventorySizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "targetedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedInventorySizesUndefined: Self = StObject.set(x, "targetedInventorySizes", js.undefined)
    
    @scala.inline
    def setTargetedInventorySizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "targetedInventorySizes", js.Array(value :_*))
  }
}
