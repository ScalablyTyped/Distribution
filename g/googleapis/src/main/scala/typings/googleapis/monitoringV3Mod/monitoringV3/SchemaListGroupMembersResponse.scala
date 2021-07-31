package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListGroupMembers response.
  */
trait SchemaListGroupMembersResponse extends StObject {
  
  /**
    * A set of monitored resources in the group.
    */
  var members: js.UndefOr[js.Array[SchemaMonitoredResource]] = js.undefined
  
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of elements matching this request.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object SchemaListGroupMembersResponse {
  
  @scala.inline
  def apply(): SchemaListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupMembersResponse]
  }
  
  @scala.inline
  implicit class SchemaListGroupMembersResponseMutableBuilder[Self <: SchemaListGroupMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[SchemaMonitoredResource]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: SchemaMonitoredResource*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
