package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response that returns all Composite Types supported by Deployment Manager
  */
trait SchemaCompositeTypesListResponse extends StObject {
  
  /**
    * Output only. A list of resource composite types supported by Deployment
    * Manager.
    */
  var compositeTypes: js.UndefOr[js.Array[SchemaCompositeType]] = js.undefined
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCompositeTypesListResponse {
  
  @scala.inline
  def apply(): SchemaCompositeTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeTypesListResponse]
  }
  
  @scala.inline
  implicit class SchemaCompositeTypesListResponseMutableBuilder[Self <: SchemaCompositeTypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeTypes(value: js.Array[SchemaCompositeType]): Self = StObject.set(x, "compositeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeTypesUndefined: Self = StObject.set(x, "compositeTypes", js.undefined)
    
    @scala.inline
    def setCompositeTypesVarargs(value: SchemaCompositeType*): Self = StObject.set(x, "compositeTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
