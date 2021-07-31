package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ListInstances.
  */
trait SchemaListInstancesResponse extends StObject {
  
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.undefined
  
  /**
    * `next_page_token` can be sent in a subsequent ListInstances call to fetch
    * more of the matching instances.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListInstancesResponse {
  
  @scala.inline
  def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaListInstancesResponseMutableBuilder[Self <: SchemaListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
