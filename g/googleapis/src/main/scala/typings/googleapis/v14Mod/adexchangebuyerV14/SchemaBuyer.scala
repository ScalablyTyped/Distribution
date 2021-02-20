package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBuyer extends StObject {
  
  /**
    * Adx account id of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
}
object SchemaBuyer {
  
  @scala.inline
  def apply(): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuyer]
  }
  
  @scala.inline
  implicit class SchemaBuyerMutableBuilder[Self <: SchemaBuyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
