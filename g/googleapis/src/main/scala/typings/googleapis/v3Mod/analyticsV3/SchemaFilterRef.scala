package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a profile filter link.
  */
trait SchemaFilterRef extends StObject {
  
  /**
    * Account ID to which this filter belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link for this filter.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * Filter ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind value for filter reference.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this filter.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaFilterRef {
  
  @scala.inline
  def apply(): SchemaFilterRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterRef]
  }
  
  @scala.inline
  implicit class SchemaFilterRefMutableBuilder[Self <: SchemaFilterRef] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
