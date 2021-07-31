package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /** The creation time for this document or object in the search result. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Options that specify how to display a structured data search result. */
  var displayOptions: js.UndefOr[ResultDisplayMetadata] = js.undefined
  
  /** Indexed fields in structured data, returned as a generic named property. */
  var fields: js.UndefOr[js.Array[NamedProperty]] = js.undefined
  
  /** Mime type of the search result. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Object type of the search result. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /** Owner (usually creator) of the document or object of the search result. */
  var owner: js.UndefOr[Person] = js.undefined
  
  /** The named source for the result, such as Gmail. */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The last modified date for the object in the search result. If not set in the item, the value returned here is empty. When `updateTime` is used for calculating freshness and is not
    * set, this value defaults to 2 years from the current time.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Metadata {
  
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: ResultDisplayMetadata): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[NamedProperty]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: NamedProperty*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOwner(value: Person): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
