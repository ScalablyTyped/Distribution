package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a targetable remarketing list. Remarketing enables
  * you to create lists of users who have performed specific actions on a site,
  * then target ads to members of those lists. This resource is a read-only
  * view of a remarketing list to be used to faciliate targeting ads to
  * specific lists. Remarketing lists that are owned by your advertisers and
  * those that are shared to your advertisers or account are accessible via
  * this resource. To manage remarketing lists that are owned by your
  * advertisers, use the RemarketingLists resource.
  */
@js.native
trait SchemaTargetableRemarketingList extends StObject {
  
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated
    * field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether this targetable remarketing list is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Dimension value for the advertiser ID that owns this targetable
    * remarketing list.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the advertiser.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Targetable remarketing list description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Targetable remarketing list ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetableRemarketingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Number of days that a user should remain in the targetable remarketing
    * list without an impression.
    */
  var lifeSpan: js.UndefOr[String] = js.native
  
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String] = js.native
  
  /**
    * Product from which this targetable remarketing list was originated.
    */
  var listSource: js.UndefOr[String] = js.native
  
  /**
    * Name of the targetable remarketing list. Is no greater than 128
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this remarketing list. This is a read-only,
    * auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String] = js.native
}
object SchemaTargetableRemarketingList {
  
  @scala.inline
  def apply(): SchemaTargetableRemarketingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetableRemarketingList]
  }
  
  @scala.inline
  implicit class SchemaTargetableRemarketingListMutableBuilder[Self <: SchemaTargetableRemarketingList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLifeSpan(value: String): Self = StObject.set(x, "lifeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeSpanUndefined: Self = StObject.set(x, "lifeSpan", js.undefined)
    
    @scala.inline
    def setListSize(value: String): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSizeUndefined: Self = StObject.set(x, "listSize", js.undefined)
    
    @scala.inline
    def setListSource(value: String): Self = StObject.set(x, "listSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSourceUndefined: Self = StObject.set(x, "listSource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
