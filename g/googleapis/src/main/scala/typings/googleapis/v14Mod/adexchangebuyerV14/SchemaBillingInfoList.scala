package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A billing info feed lists Billing Info the Ad Exchange buyer account has
  * access to. Each entry in the feed corresponds to a single billing info.
  */
trait SchemaBillingInfoList extends StObject {
  
  /**
    * A list of billing info relevant for your account.
    */
  var items: js.UndefOr[js.Array[SchemaBillingInfo]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBillingInfoList {
  
  @scala.inline
  def apply(): SchemaBillingInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfoList]
  }
  
  @scala.inline
  implicit class SchemaBillingInfoListMutableBuilder[Self <: SchemaBillingInfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaBillingInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBillingInfo*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
