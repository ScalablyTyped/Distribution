package typings.hellosignEmbedded

import typings.hellosignEmbedded.mod.HelloSign.SignerRole
import typings.hellosignEmbedded.mod.HelloSign.Singature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CcEmailAddresses extends StObject {
    
    var ccEmailAddresses: js.Array[String] = js.native
    
    var message: String = js.native
    
    var signatures: js.Array[Singature] = js.native
    
    var title: String = js.native
  }
  object CcEmailAddresses {
    
    @scala.inline
    def apply(
      ccEmailAddresses: js.Array[String],
      message: String,
      signatures: js.Array[Singature],
      title: String
    ): CcEmailAddresses = {
      val __obj = js.Dynamic.literal(ccEmailAddresses = ccEmailAddresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcEmailAddresses]
    }
    
    @scala.inline
    implicit class CcEmailAddressesMutableBuilder[Self <: CcEmailAddresses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCcEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcEmailAddressesVarargs(value: String*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatures(value: js.Array[Singature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignaturesVarargs(value: Singature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CcRoles extends StObject {
    
    var ccRoles: String = js.native
    
    var message: String = js.native
    
    var signerRoles: SignerRole = js.native
    
    var title: String = js.native
  }
  object CcRoles {
    
    @scala.inline
    def apply(ccRoles: String, message: String, signerRoles: SignerRole, title: String): CcRoles = {
      val __obj = js.Dynamic.literal(ccRoles = ccRoles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signerRoles = signerRoles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcRoles]
    }
    
    @scala.inline
    implicit class CcRolesMutableBuilder[Self <: CcRoles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCcRoles(value: String): Self = StObject.set(x, "ccRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerRoles(value: SignerRole): Self = StObject.set(x, "signerRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
