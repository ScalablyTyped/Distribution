package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemarketingListShare extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListShare". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Remarketing list ID. This is a read-only, auto-generated field. */
  var remarketingListId: js.UndefOr[String] = js.undefined
  
  /** Accounts that the remarketing list is shared with. */
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Advertisers that the remarketing list is shared with. */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RemarketingListShare {
  
  @scala.inline
  def apply(): RemarketingListShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingListShare]
  }
  
  @scala.inline
  implicit class RemarketingListShareMutableBuilder[Self <: RemarketingListShare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRemarketingListId(value: String): Self = StObject.set(x, "remarketingListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListIdUndefined: Self = StObject.set(x, "remarketingListId", js.undefined)
    
    @scala.inline
    def setSharedAccountIds(value: js.Array[String]): Self = StObject.set(x, "sharedAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountIdsUndefined: Self = StObject.set(x, "sharedAccountIds", js.undefined)
    
    @scala.inline
    def setSharedAccountIdsVarargs(value: String*): Self = StObject.set(x, "sharedAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setSharedAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "sharedAdvertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAdvertiserIdsUndefined: Self = StObject.set(x, "sharedAdvertiserIds", js.undefined)
    
    @scala.inline
    def setSharedAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "sharedAdvertiserIds", js.Array(value :_*))
  }
}
