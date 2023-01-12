package typings.hellosignEmbedded

import typings.hellosignEmbedded.mod.HelloSign.SignerRole
import typings.hellosignEmbedded.mod.HelloSign.Singature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CcEmailAddresses extends StObject {
    
    var ccEmailAddresses: js.Array[String]
    
    var message: String
    
    var signatures: js.Array[Singature]
    
    var title: String
  }
  object CcEmailAddresses {
    
    inline def apply(
      ccEmailAddresses: js.Array[String],
      message: String,
      signatures: js.Array[Singature],
      title: String
    ): CcEmailAddresses = {
      val __obj = js.Dynamic.literal(ccEmailAddresses = ccEmailAddresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcEmailAddresses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CcEmailAddresses] (val x: Self) extends AnyVal {
      
      inline def setCcEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
      
      inline def setCcEmailAddressesVarargs(value: String*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[Singature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: Singature*): Self = StObject.set(x, "signatures", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait CcRoles extends StObject {
    
    var ccRoles: String
    
    var message: String
    
    var signerRoles: SignerRole
    
    var title: String
  }
  object CcRoles {
    
    inline def apply(ccRoles: String, message: String, signerRoles: SignerRole, title: String): CcRoles = {
      val __obj = js.Dynamic.literal(ccRoles = ccRoles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signerRoles = signerRoles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcRoles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CcRoles] (val x: Self) extends AnyVal {
      
      inline def setCcRoles(value: String): Self = StObject.set(x, "ccRoles", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSignerRoles(value: SignerRole): Self = StObject.set(x, "signerRoles", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
