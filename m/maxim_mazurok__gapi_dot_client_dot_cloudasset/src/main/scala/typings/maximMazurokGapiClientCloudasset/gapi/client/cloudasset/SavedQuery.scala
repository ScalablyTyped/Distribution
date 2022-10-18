package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedQuery extends StObject {
  
  /** The query content. */
  var content: js.UndefOr[QueryContent] = js.undefined
  
  /** Output only. The create time of this saved query. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The account's email address who has created this saved query. */
  var creator: js.UndefOr[String] = js.undefined
  
  /** The description of this saved query. This value should be fewer than 255 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Labels applied on the resource. This value should not contain more than 10 entries. The key and value of each entry must be non-empty and fewer than 64 characters. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. The last update time of this saved query. */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The account's email address who has updated this saved query most recently. */
  var lastUpdater: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the saved query. The format must be: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id *
    * organizations/organization_number/savedQueries/saved_query_id
    */
  var name: js.UndefOr[String] = js.undefined
}
object SavedQuery {
  
  inline def apply(): SavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedQuery]
  }
  
  extension [Self <: SavedQuery](x: Self) {
    
    inline def setContent(value: QueryContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setLastUpdater(value: String): Self = StObject.set(x, "lastUpdater", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterUndefined: Self = StObject.set(x, "lastUpdater", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
