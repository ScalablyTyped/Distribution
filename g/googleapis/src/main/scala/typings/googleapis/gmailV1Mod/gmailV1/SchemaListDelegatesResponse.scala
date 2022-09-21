package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDelegatesResponse extends StObject {
  
  /**
    * List of the user's delegates (with any verification status). If an account doesn't have delegates, this field doesn't appear.
    */
  var delegates: js.UndefOr[js.Array[SchemaDelegate]] = js.undefined
}
object SchemaListDelegatesResponse {
  
  inline def apply(): SchemaListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDelegatesResponse]
  }
  
  extension [Self <: SchemaListDelegatesResponse](x: Self) {
    
    inline def setDelegates(value: js.Array[SchemaDelegate]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    inline def setDelegatesVarargs(value: SchemaDelegate*): Self = StObject.set(x, "delegates", js.Array(value*))
  }
}
