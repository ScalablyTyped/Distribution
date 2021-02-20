package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google service account
  */
@js.native
trait SchemaGoogleServiceAccount extends StObject {
  
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.native
}
object SchemaGoogleServiceAccount {
  
  @scala.inline
  def apply(): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
  
  @scala.inline
  implicit class SchemaGoogleServiceAccountMutableBuilder[Self <: SchemaGoogleServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
