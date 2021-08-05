package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies an account and how to log into it.
  */
trait SchemaAccount extends StObject {
  
  /**
    * An automatic google login account.
    */
  var googleAuto: js.UndefOr[SchemaGoogleAuto] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setGoogleAuto(value: SchemaGoogleAuto): Self = StObject.set(x, "googleAuto", value.asInstanceOf[js.Any])
    
    inline def setGoogleAutoUndefined: Self = StObject.set(x, "googleAuto", js.undefined)
  }
}
