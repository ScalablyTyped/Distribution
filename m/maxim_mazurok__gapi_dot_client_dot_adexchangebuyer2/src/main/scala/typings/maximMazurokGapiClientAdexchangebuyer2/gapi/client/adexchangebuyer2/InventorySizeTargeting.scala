package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySizeTargeting extends StObject {
  
  /** A list of inventory sizes to be excluded. */
  var excludedInventorySizes: js.UndefOr[js.Array[AdSize]] = js.undefined
  
  /** A list of inventory sizes to be included. */
  var targetedInventorySizes: js.UndefOr[js.Array[AdSize]] = js.undefined
}
object InventorySizeTargeting {
  
  @scala.inline
  def apply(): InventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySizeTargeting]
  }
  
  @scala.inline
  implicit class InventorySizeTargetingMutableBuilder[Self <: InventorySizeTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedInventorySizes(value: js.Array[AdSize]): Self = StObject.set(x, "excludedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedInventorySizesUndefined: Self = StObject.set(x, "excludedInventorySizes", js.undefined)
    
    @scala.inline
    def setExcludedInventorySizesVarargs(value: AdSize*): Self = StObject.set(x, "excludedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setTargetedInventorySizes(value: js.Array[AdSize]): Self = StObject.set(x, "targetedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedInventorySizesUndefined: Self = StObject.set(x, "targetedInventorySizes", js.undefined)
    
    @scala.inline
    def setTargetedInventorySizesVarargs(value: AdSize*): Self = StObject.set(x, "targetedInventorySizes", js.Array(value :_*))
  }
}
