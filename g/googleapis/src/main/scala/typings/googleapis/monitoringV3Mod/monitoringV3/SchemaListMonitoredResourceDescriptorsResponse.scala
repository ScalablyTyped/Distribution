package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListMonitoredResourceDescriptors response.
  */
@js.native
trait SchemaListMonitoredResourceDescriptorsResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The monitored resource descriptors that are available to this project and
    * that match filter, if present.
    */
  var resourceDescriptors: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.native
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
