package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListMetricDescriptors response.
  */
@js.native
trait SchemaListMetricDescriptorsResponse extends StObject {
  
  /**
    * The metric descriptors that are available to the project and that match
    * the value of filter, if present.
    */
  var metricDescriptors: js.UndefOr[js.Array[SchemaMetricDescriptor]] = js.native
  
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListMetricDescriptorsResponse {
  
  @scala.inline
  def apply(): SchemaListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMetricDescriptorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListMetricDescriptorsResponseMutableBuilder[Self <: SchemaListMetricDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricDescriptors(value: js.Array[SchemaMetricDescriptor]): Self = StObject.set(x, "metricDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDescriptorsUndefined: Self = StObject.set(x, "metricDescriptors", js.undefined)
    
    @scala.inline
    def setMetricDescriptorsVarargs(value: SchemaMetricDescriptor*): Self = StObject.set(x, "metricDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
