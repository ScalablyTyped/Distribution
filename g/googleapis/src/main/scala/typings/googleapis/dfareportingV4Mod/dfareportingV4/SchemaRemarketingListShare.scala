package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemarketingListShare extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListShare".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var remarketingListId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Accounts that the remarketing list is shared with.
    */
  var sharedAccountIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Advertisers that the remarketing list is shared with.
    */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemarketingListShare {
  
  inline def apply(): SchemaRemarketingListShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListShare]
  }
  
  extension [Self <: SchemaRemarketingListShare](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRemarketingListId(value: String): Self = StObject.set(x, "remarketingListId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListIdNull: Self = StObject.set(x, "remarketingListId", null)
    
    inline def setRemarketingListIdUndefined: Self = StObject.set(x, "remarketingListId", js.undefined)
    
    inline def setSharedAccountIds(value: js.Array[String]): Self = StObject.set(x, "sharedAccountIds", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountIdsNull: Self = StObject.set(x, "sharedAccountIds", null)
    
    inline def setSharedAccountIdsUndefined: Self = StObject.set(x, "sharedAccountIds", js.undefined)
    
    inline def setSharedAccountIdsVarargs(value: String*): Self = StObject.set(x, "sharedAccountIds", js.Array(value*))
    
    inline def setSharedAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "sharedAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setSharedAdvertiserIdsNull: Self = StObject.set(x, "sharedAdvertiserIds", null)
    
    inline def setSharedAdvertiserIdsUndefined: Self = StObject.set(x, "sharedAdvertiserIds", js.undefined)
    
    inline def setSharedAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "sharedAdvertiserIds", js.Array(value*))
  }
}
