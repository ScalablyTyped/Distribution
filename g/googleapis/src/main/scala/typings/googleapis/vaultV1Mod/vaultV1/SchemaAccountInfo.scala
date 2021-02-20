package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accounts to search
  */
@js.native
trait SchemaAccountInfo extends StObject {
  
  /**
    * A set of accounts to search.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAccountInfo {
  
  @scala.inline
  def apply(): SchemaAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountInfo]
  }
  
  @scala.inline
  implicit class SchemaAccountInfoMutableBuilder[Self <: SchemaAccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
