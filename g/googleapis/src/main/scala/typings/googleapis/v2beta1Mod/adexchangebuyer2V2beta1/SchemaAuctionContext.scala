package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The auction type the restriction applies to.
  */
trait SchemaAuctionContext extends StObject {
  
  /**
    * The auction types this restriction applies to.
    */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAuctionContext {
  
  @scala.inline
  def apply(): SchemaAuctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuctionContext]
  }
  
  @scala.inline
  implicit class SchemaAuctionContextMutableBuilder[Self <: SchemaAuctionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuctionTypes(value: js.Array[String]): Self = StObject.set(x, "auctionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTypesUndefined: Self = StObject.set(x, "auctionTypes", js.undefined)
    
    @scala.inline
    def setAuctionTypesVarargs(value: String*): Self = StObject.set(x, "auctionTypes", js.Array(value :_*))
  }
}
