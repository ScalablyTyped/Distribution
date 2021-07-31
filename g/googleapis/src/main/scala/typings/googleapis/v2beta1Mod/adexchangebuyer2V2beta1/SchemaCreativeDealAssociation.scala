package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The association between a creative and a deal.
  */
trait SchemaCreativeDealAssociation extends StObject {
  
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the creative associated with the deal.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * The externalDealId for the deal associated with the creative.
    */
  var dealsId: js.UndefOr[String] = js.undefined
}
object SchemaCreativeDealAssociation {
  
  @scala.inline
  def apply(): SchemaCreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealAssociation]
  }
  
  @scala.inline
  implicit class SchemaCreativeDealAssociationMutableBuilder[Self <: SchemaCreativeDealAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setDealsId(value: String): Self = StObject.set(x, "dealsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsIdUndefined: Self = StObject.set(x, "dealsId", js.undefined)
  }
}
