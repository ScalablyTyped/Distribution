package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a remarketing list&#39;s sharing information.
  * Sharing allows other accounts or advertisers to target to your remarketing
  * lists. This resource can be used to manage remarketing list sharing to
  * other accounts and advertisers.
  */
@js.native
trait SchemaRemarketingListShare extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListShare&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var remarketingListId: js.UndefOr[String] = js.native
  
  /**
    * Accounts that the remarketing list is shared with.
    */
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Advertisers that the remarketing list is shared with.
    */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRemarketingListShare {
  
  @scala.inline
  def apply(): SchemaRemarketingListShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListShare]
  }
  
  @scala.inline
  implicit class SchemaRemarketingListShareMutableBuilder[Self <: SchemaRemarketingListShare] (val x: Self) extends AnyVal {
    
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
