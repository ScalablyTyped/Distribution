package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response that returns all Types supported by Deployment Manager
  */
trait SchemaTypesListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A list of resource types supported by Deployment Manager.
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.undefined
}
object SchemaTypesListResponse {
  
  @scala.inline
  def apply(): SchemaTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypesListResponse]
  }
  
  @scala.inline
  implicit class SchemaTypesListResponseMutableBuilder[Self <: SchemaTypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[SchemaType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: SchemaType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
