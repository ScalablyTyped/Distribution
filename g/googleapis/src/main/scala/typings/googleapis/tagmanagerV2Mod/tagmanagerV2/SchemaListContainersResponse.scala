package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Containers Response.
  */
trait SchemaListContainersResponse extends StObject {
  
  /**
    * All Containers of a GTM Account.
    */
  var container: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListContainersResponse {
  
  @scala.inline
  def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  
  @scala.inline
  implicit class SchemaListContainersResponseMutableBuilder[Self <: SchemaListContainersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: js.Array[SchemaContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVarargs(value: SchemaContainer*): Self = StObject.set(x, "container", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
