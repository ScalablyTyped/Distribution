package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListMonitoredResourceDescriptors.
  */
trait SchemaListMonitoredResourceDescriptorsResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resource descriptors.
    */
  var resourceDescriptors: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.undefined
}
object SchemaListMonitoredResourceDescriptorsResponse {
  
  @scala.inline
  def apply(): SchemaListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMonitoredResourceDescriptorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListMonitoredResourceDescriptorsResponseMutableBuilder[Self <: SchemaListMonitoredResourceDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResourceDescriptors(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = StObject.set(x, "resourceDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDescriptorsUndefined: Self = StObject.set(x, "resourceDescriptors", js.undefined)
    
    @scala.inline
    def setResourceDescriptorsVarargs(value: SchemaMonitoredResourceDescriptor*): Self = StObject.set(x, "resourceDescriptors", js.Array(value :_*))
  }
}
