package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadata extends StObject {
  
  /**
    * The creation time for this document or object in the search result.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options that specify how to display a structured data search result.
    */
  var displayOptions: js.UndefOr[SchemaResultDisplayMetadata] = js.undefined
  
  /**
    * Indexed fields in structured data, returned as a generic named property.
    */
  var fields: js.UndefOr[js.Array[SchemaNamedProperty]] = js.undefined
  
  /**
    * Mime type of the search result.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Object type of the search result.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Owner (usually creator) of the document or object of the search result.
    */
  var owner: js.UndefOr[SchemaPerson] = js.undefined
  
  /**
    * The named source for the result, such as Gmail.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * The thumbnail URL of the result.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last modified date for the object in the search result. If not set in the item, the value returned here is empty. When `updateTime` is used for calculating freshness and is not set, this value defaults to 2 years from the current time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadata {
  
  inline def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  extension [Self <: SchemaMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayOptions(value: SchemaResultDisplayMetadata): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setFields(value: js.Array[SchemaNamedProperty]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaNamedProperty*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOwner(value: SchemaPerson): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
