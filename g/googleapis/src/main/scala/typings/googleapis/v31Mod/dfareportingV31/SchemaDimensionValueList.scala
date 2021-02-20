package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the list of DimensionValue resources.
  */
@js.native
trait SchemaDimensionValueList extends StObject {
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The dimension values returned in this response.
    */
  var items: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  /**
    * The kind of list this is, in this case dfareporting#dimensionValueList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Continuation token used to page through dimension values. To retrieve the
    * next page of results, set the next request&#39;s &quot;pageToken&quot; to
    * the value of this field. The page token is only valid for a limited
    * amount of time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDimensionValueList {
  
  @scala.inline
  def apply(): SchemaDimensionValueList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValueList]
  }
  
  @scala.inline
  implicit class SchemaDimensionValueListMutableBuilder[Self <: SchemaDimensionValueList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
