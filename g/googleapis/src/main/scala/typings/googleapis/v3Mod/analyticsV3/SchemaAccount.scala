package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Effective
import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccount extends StObject {
  
  /**
    * Child link for an account entry. Points to the list of web properties for this account.
    */
  var childLink: js.UndefOr[Href | Null] = js.undefined
  
  /**
    * Time the account was created.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics account.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Permissions the user has for this account.
    */
  var permissions: js.UndefOr[Effective | Null] = js.undefined
  
  /**
    * Link for this account.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time the account was last modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    inline def setChildLinkNull: Self = StObject.set(x, "childLink", null)
    
    inline def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredNull: Self = StObject.set(x, "starred", null)
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
