package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogView extends StObject {
  
  /**
    * Output only. The creation timestamp of the view.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes this view.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of the view.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogView {
  
  inline def apply(): SchemaLogView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogView]
  }
  
  extension [Self <: SchemaLogView](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
