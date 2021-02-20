package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies an account and how to log into it.
  */
@js.native
trait SchemaAccount extends StObject {
  
  /**
    * An automatic google login account.
    */
  var googleAuto: js.UndefOr[SchemaGoogleAuto] = js.native
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleAuto(value: SchemaGoogleAuto): Self = StObject.set(x, "googleAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAutoUndefined: Self = StObject.set(x, "googleAuto", js.undefined)
  }
}
