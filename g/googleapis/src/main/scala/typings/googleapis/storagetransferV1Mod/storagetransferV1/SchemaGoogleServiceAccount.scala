package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleServiceAccount extends StObject {
  
  /**
    * Email address of the service account.
    */
  var accountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the service account.
    */
  var subjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleServiceAccount {
  
  inline def apply(): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
  
  extension [Self <: SchemaGoogleServiceAccount](x: Self) {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailNull: Self = StObject.set(x, "accountEmail", null)
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
    
    inline def setSubjectId(value: String): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdNull: Self = StObject.set(x, "subjectId", null)
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
