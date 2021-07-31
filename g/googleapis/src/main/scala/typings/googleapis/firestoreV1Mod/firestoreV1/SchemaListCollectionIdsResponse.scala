package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from Firestore.ListCollectionIds.
  */
trait SchemaListCollectionIdsResponse extends StObject {
  
  /**
    * The collection ids.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A page token that may be used to continue the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCollectionIdsResponse {
  
  @scala.inline
  def apply(): SchemaListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCollectionIdsResponse]
  }
  
  @scala.inline
  implicit class SchemaListCollectionIdsResponseMutableBuilder[Self <: SchemaListCollectionIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    @scala.inline
    def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
