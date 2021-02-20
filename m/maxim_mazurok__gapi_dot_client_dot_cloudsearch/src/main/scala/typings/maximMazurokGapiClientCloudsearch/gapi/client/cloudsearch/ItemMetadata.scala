package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemMetadata extends StObject {
  
  /**
    * The name of the container for this item. Deletion of the container item leads to automatic deletion of this item. Note: ACLs are not inherited from a container item. To provide ACL
    * inheritance for an item, use the inheritAclFrom field. The maximum length is 1536 characters.
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * The BCP-47 language code for the item, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. The maximum length is
    * 32 characters.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /** The time when the item was created in the source repository. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Hashing value provided by the API caller. This can be used with the items.push method to calculate modified state. The maximum length is 2048 characters. */
  var hash: js.UndefOr[String] = js.native
  
  /** A list of interactions for the item. Interactions are used to improve Search quality, but are not exposed to end users. The maximum number of elements is 1000. */
  var interactions: js.UndefOr[js.Array[Interaction]] = js.native
  
  /** Additional keywords or phrases that should match the item. Used internally for user generated content. The maximum number of elements is 100. The maximum length is 8192 characters. */
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  /** The original mime-type of ItemContent.content in the source repository. The maximum length is 256 characters. */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The type of the item. This should correspond to the name of an object definition in the schema registered for the data source. For example, if the schema for the data source
    * contains an object definition with name 'document', then item indexing requests for objects of that type should set objectType to 'document'. The maximum length is 256 characters.
    */
  var objectType: js.UndefOr[String] = js.native
  
  /** Additional search quality metadata of the item */
  var searchQualityMetadata: js.UndefOr[SearchQualityMetadata] = js.native
  
  /**
    * Link to the source repository serving the data. Search results apply this link to the title. Whitespace or special characters may cause Cloud Search result links to trigger a
    * redirect notice; to avoid this, encode the URL. The maximum length is 2048 characters.
    */
  var sourceRepositoryUrl: js.UndefOr[String] = js.native
  
  /** The title of the item. If given, this will be the displayed title of the Search result. The maximum length is 2048 characters. */
  var title: js.UndefOr[String] = js.native
  
  /** The time when the item was last modified in the source repository. */
  var updateTime: js.UndefOr[String] = js.native
}
object ItemMetadata {
  
  @scala.inline
  def apply(): ItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemMetadata]
  }
  
  @scala.inline
  implicit class ItemMetadataMutableBuilder[Self <: ItemMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    @scala.inline
    def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setSearchQualityMetadata(value: SearchQualityMetadata): Self = StObject.set(x, "searchQualityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchQualityMetadataUndefined: Self = StObject.set(x, "searchQualityMetadata", js.undefined)
    
    @scala.inline
    def setSourceRepositoryUrl(value: String): Self = StObject.set(x, "sourceRepositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryUrlUndefined: Self = StObject.set(x, "sourceRepositoryUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
