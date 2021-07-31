package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List container versions response.
  */
trait SchemaListContainerVersionsResponse extends StObject {
  
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListContainerVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListContainerVersionsResponseMutableBuilder[Self <: SchemaListContainerVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerVersionHeader(value: js.Array[SchemaContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
    
    @scala.inline
    def setContainerVersionHeaderVarargs(value: SchemaContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
