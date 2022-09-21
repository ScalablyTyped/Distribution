package typings.jspdf.mod

import typings.jspdf.jspdfStrings.`annot-forms`
import typings.jspdf.jspdfStrings.copy
import typings.jspdf.jspdfStrings.modify
import typings.jspdf.jspdfStrings.print
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionOptions extends StObject {
  
  var ownerPassword: js.UndefOr[String] = js.undefined
  
  var userPassword: js.UndefOr[String] = js.undefined
  
  var userPermissions: js.UndefOr[js.Array[print | modify | copy | `annot-forms`]] = js.undefined
}
object EncryptionOptions {
  
  inline def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  extension [Self <: EncryptionOptions](x: Self) {
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    
    inline def setUserPermissions(value: js.Array[print | modify | copy | `annot-forms`]): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
    
    inline def setUserPermissionsUndefined: Self = StObject.set(x, "userPermissions", js.undefined)
    
    inline def setUserPermissionsVarargs(value: (print | modify | copy | `annot-forms`)*): Self = StObject.set(x, "userPermissions", js.Array(value*))
  }
}
