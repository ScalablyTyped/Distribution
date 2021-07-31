package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Effective
import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics account entry.
  */
trait SchemaAccount extends StObject {
  
  /**
    * Child link for an account entry. Points to the list of web properties for
    * this account.
    */
  var childLink: js.UndefOr[Href] = js.undefined
  
  /**
    * Time the account was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics account.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Permissions the user has for this account.
    */
  var permissions: js.UndefOr[Effective] = js.undefined
  
  /**
    * Link for this account.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time the account was last modified.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
