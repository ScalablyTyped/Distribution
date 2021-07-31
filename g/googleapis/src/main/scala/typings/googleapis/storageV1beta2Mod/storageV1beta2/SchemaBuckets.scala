package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of buckets.
  */
trait SchemaBuckets extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucket]] = js.undefined
  
  /**
    * The kind of item this is. For lists of buckets, this is always
    * storage#buckets.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaBuckets {
  
  @scala.inline
  def apply(): SchemaBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuckets]
  }
  
  @scala.inline
  implicit class SchemaBucketsMutableBuilder[Self <: SchemaBuckets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaBucket]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBucket*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
