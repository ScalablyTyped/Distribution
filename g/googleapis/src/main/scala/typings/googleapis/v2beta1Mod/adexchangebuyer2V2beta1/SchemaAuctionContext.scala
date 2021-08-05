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
  
  inline def apply(): SchemaAuctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuctionContext]
  }
  
  extension [Self <: SchemaAuctionContext](x: Self) {
    
    inline def setAuctionTypes(value: js.Array[String]): Self = StObject.set(x, "auctionTypes", value.asInstanceOf[js.Any])
    
    inline def setAuctionTypesUndefined: Self = StObject.set(x, "auctionTypes", js.undefined)
    
    inline def setAuctionTypesVarargs(value: String*): Self = StObject.set(x, "auctionTypes", js.Array(value :_*))
  }
}
