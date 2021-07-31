package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a web property reference.
  */
trait SchemaWebPropertyRef extends StObject {
  
  /**
    * Account ID to which this web property belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link for this web property.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /**
    * Analytics web property reference.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this web property.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaWebPropertyRef {
  
  @scala.inline
  def apply(): SchemaWebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebPropertyRef]
  }
  
  @scala.inline
  implicit class SchemaWebPropertyRefMutableBuilder[Self <: SchemaWebPropertyRef] (val x: Self) extends AnyVal {
    
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
  }
}
