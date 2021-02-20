package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a linked account.
  */
@js.native
trait SchemaAccountRef extends StObject {
  
  /**
    * Link for this account.
    */
  var href: js.UndefOr[String] = js.native
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Analytics account reference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAccountRef {
  
  @scala.inline
  def apply(): SchemaAccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountRef]
  }
  
  @scala.inline
  implicit class SchemaAccountRefMutableBuilder[Self <: SchemaAccountRef] (val x: Self) extends AnyVal {
    
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
