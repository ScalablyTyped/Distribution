package typings.googleapis.v12Mod.adexchangebuyerV12

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An account feed lists Ad Exchange buyer accounts that the user has access
  * to. Each entry in the feed corresponds to a single buyer account.
  */
@js.native
trait SchemaAccountsList extends StObject {
  
  /**
    * A list of accounts.
    */
  var items: js.UndefOr[js.Array[SchemaAccount]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccountsList {
  
  @scala.inline
  def apply(): SchemaAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsList]
  }
  
  @scala.inline
  implicit class SchemaAccountsListMutableBuilder[Self <: SchemaAccountsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaAccount]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaAccount*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
