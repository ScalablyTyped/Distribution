package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListUsableSubnetworksResponse is the response of
  * ListUsableSubnetworksRequest.
  */
trait SchemaListUsableSubnetworksResponse extends StObject {
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `page_size`, use the
    * `next_page_token` as a value for the query parameter `page_token` in the
    * next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of usable subnetworks in the specified network project.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaUsableSubnetwork]] = js.undefined
}
object SchemaListUsableSubnetworksResponse {
  
  @scala.inline
  def apply(): SchemaListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUsableSubnetworksResponse]
  }
  
  @scala.inline
  implicit class SchemaListUsableSubnetworksResponseMutableBuilder[Self <: SchemaListUsableSubnetworksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubnetworks(value: js.Array[SchemaUsableSubnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: SchemaUsableSubnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
  }
}
