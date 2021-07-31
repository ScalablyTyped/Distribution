package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementStrategy extends StObject {
  
  /** Account ID of this placement strategy.This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** ID of this placement strategy. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementStrategy". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this placement strategy. This is a required field. It must be less than 256 characters long and unique among placement strategies of the same account. */
  var name: js.UndefOr[String] = js.undefined
}
object PlacementStrategy {
  
  @scala.inline
  def apply(): PlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStrategy]
  }
  
  @scala.inline
  implicit class PlacementStrategyMutableBuilder[Self <: PlacementStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
