package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A direct deals feed lists Direct Deals the Ad Exchange buyer account has
  * access to. This includes direct deals set up for the buyer account as well
  * as its merged stream seats.
  */
trait SchemaDirectDealsList extends StObject {
  
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[SchemaDirectDeal]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDirectDealsList {
  
  @scala.inline
  def apply(): SchemaDirectDealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDealsList]
  }
  
  @scala.inline
  implicit class SchemaDirectDealsListMutableBuilder[Self <: SchemaDirectDealsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectDeals(value: js.Array[SchemaDirectDeal]): Self = StObject.set(x, "directDeals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDealsUndefined: Self = StObject.set(x, "directDeals", js.undefined)
    
    @scala.inline
    def setDirectDealsVarargs(value: SchemaDirectDeal*): Self = StObject.set(x, "directDeals", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
