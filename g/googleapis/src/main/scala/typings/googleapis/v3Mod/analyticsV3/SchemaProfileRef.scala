package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a linked view (profile).
  */
@js.native
trait SchemaProfileRef extends StObject {
  
  /**
    * Account ID to which this view (profile) belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Link for this view (profile).
    */
  var href: js.UndefOr[String] = js.native
  
  /**
    * View (Profile) ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for the web property to which this view (profile) belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Analytics view (profile) reference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this view (profile).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this view (profile)
    * belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaProfileRef {
  
  @scala.inline
  def apply(): SchemaProfileRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileRef]
  }
  
  @scala.inline
  implicit class SchemaProfileRefMutableBuilder[Self <: SchemaProfileRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
