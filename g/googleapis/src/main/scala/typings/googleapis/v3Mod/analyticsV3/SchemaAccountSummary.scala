package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics AccountSummary. An AccountSummary is a
  * lightweight tree comprised of properties/profiles.
  */
trait SchemaAccountSummary extends StObject {
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics AccountSummary.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of web properties under this account.
    */
  var webProperties: js.UndefOr[js.Array[SchemaWebPropertySummary]] = js.undefined
}
object SchemaAccountSummary {
  
  @scala.inline
  def apply(): SchemaAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountSummary]
  }
  
  @scala.inline
  implicit class SchemaAccountSummaryMutableBuilder[Self <: SchemaAccountSummary] (val x: Self) extends AnyVal {
    
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
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setWebProperties(value: js.Array[SchemaWebPropertySummary]): Self = StObject.set(x, "webProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertiesUndefined: Self = StObject.set(x, "webProperties", js.undefined)
    
    @scala.inline
    def setWebPropertiesVarargs(value: SchemaWebPropertySummary*): Self = StObject.set(x, "webProperties", js.Array(value :_*))
  }
}
