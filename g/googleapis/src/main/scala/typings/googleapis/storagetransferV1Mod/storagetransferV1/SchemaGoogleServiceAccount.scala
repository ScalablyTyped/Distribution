package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google service account
  */
trait SchemaGoogleServiceAccount extends StObject {
  
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.undefined
}
object SchemaGoogleServiceAccount {
  
  inline def apply(): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
  
  extension [Self <: SchemaGoogleServiceAccount](x: Self) {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
