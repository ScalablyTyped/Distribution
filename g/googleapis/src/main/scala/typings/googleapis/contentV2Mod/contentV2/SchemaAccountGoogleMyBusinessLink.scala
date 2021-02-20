package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountGoogleMyBusinessLink extends StObject {
  
  /**
    * The GMB email address of which a specific account within a GMB account. A
    * sample account within a GMB account could be a business account with set
    * of locations, managed under the GMB account.
    */
  var gmbEmail: js.UndefOr[String] = js.native
  
  /**
    * Status of the link between this Merchant Center account and the GMB
    * account.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaAccountGoogleMyBusinessLink {
  
  @scala.inline
  def apply(): SchemaAccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountGoogleMyBusinessLink]
  }
  
  @scala.inline
  implicit class SchemaAccountGoogleMyBusinessLinkMutableBuilder[Self <: SchemaAccountGoogleMyBusinessLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
