package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response for listing creatives.
  */
@js.native
trait SchemaListCreativesResponse extends StObject {
  
  /**
    * The list of creatives.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativesRequest.page_token field in the subsequent call to
    * `ListCreatives` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCreativesResponse {
  
  @scala.inline
  def apply(): SchemaListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativesResponse]
  }
  
  @scala.inline
  implicit class SchemaListCreativesResponseMutableBuilder[Self <: SchemaListCreativesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatives(value: js.Array[SchemaCreative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    @scala.inline
    def setCreativesVarargs(value: SchemaCreative*): Self = StObject.set(x, "creatives", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
