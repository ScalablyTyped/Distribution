package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGuaranteedOrdersResponse extends StObject {
  
  /**
    * The list of guaranteed orders. This list will be absent if empty.
    */
  var guaranteedOrders: js.UndefOr[js.Array[SchemaGuaranteedOrder]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGuaranteedOrders` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGuaranteedOrdersResponse {
  
  inline def apply(): SchemaListGuaranteedOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuaranteedOrdersResponse]
  }
  
  extension [Self <: SchemaListGuaranteedOrdersResponse](x: Self) {
    
    inline def setGuaranteedOrders(value: js.Array[SchemaGuaranteedOrder]): Self = StObject.set(x, "guaranteedOrders", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrdersUndefined: Self = StObject.set(x, "guaranteedOrders", js.undefined)
    
    inline def setGuaranteedOrdersVarargs(value: SchemaGuaranteedOrder*): Self = StObject.set(x, "guaranteedOrders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
