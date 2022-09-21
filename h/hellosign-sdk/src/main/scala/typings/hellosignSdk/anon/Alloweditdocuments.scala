package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alloweditdocuments extends StObject {
  
  var allow_edit_documents: js.UndefOr[Boolean] = js.undefined
  
  var allow_edit_signers: js.UndefOr[Boolean] = js.undefined
}
object Alloweditdocuments {
  
  inline def apply(): Alloweditdocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alloweditdocuments]
  }
  
  extension [Self <: Alloweditdocuments](x: Self) {
    
    inline def setAllow_edit_documents(value: Boolean): Self = StObject.set(x, "allow_edit_documents", value.asInstanceOf[js.Any])
    
    inline def setAllow_edit_documentsUndefined: Self = StObject.set(x, "allow_edit_documents", js.undefined)
    
    inline def setAllow_edit_signers(value: Boolean): Self = StObject.set(x, "allow_edit_signers", value.asInstanceOf[js.Any])
    
    inline def setAllow_edit_signersUndefined: Self = StObject.set(x, "allow_edit_signers", js.undefined)
  }
}
