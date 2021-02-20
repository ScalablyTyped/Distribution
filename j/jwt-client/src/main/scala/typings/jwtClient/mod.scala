package typings.jwtClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-client", "forget")
  @js.native
  def forget(): Unit = js.native
  
  @JSImport("jwt-client", "get")
  @js.native
  def get(): String = js.native
  
  @JSImport("jwt-client", "keep")
  @js.native
  def keep(value: JWTObject): Unit = js.native
  @JSImport("jwt-client", "keep")
  @js.native
  def keep(value: JWTObject, key: js.UndefOr[scala.Nothing], storate: js.Any): Unit = js.native
  @JSImport("jwt-client", "keep")
  @js.native
  def keep(value: JWTObject, key: js.Any): Unit = js.native
  @JSImport("jwt-client", "keep")
  @js.native
  def keep(value: JWTObject, key: js.Any, storate: js.Any): Unit = js.native
  
  /**
    * Read a string value (normally an HTTP header)
    * from JSON Web Token to an Object
    */ 
  @JSImport("jwt-client", "read")
  @js.native
  def read(header: String): JWTObject = js.native
  
  @JSImport("jwt-client", "remember")
  @js.native
  def remember(): Unit = js.native
  
  @JSImport("jwt-client", "validate")
  @js.native
  def validate(value: JWTObject): Boolean = js.native
  @JSImport("jwt-client", "validate")
  @js.native
  def validate(value: JWTObject, issuer: js.UndefOr[scala.Nothing], audience: js.Any): Boolean = js.native
  @JSImport("jwt-client", "validate")
  @js.native
  def validate(value: JWTObject, issuer: js.Any): Boolean = js.native
  @JSImport("jwt-client", "validate")
  @js.native
  def validate(value: JWTObject, issuer: js.Any, audience: js.Any): Boolean = js.native
  
  /**
    * Given a JWT object, stringify it back to
    * its JWT representation.
    */ 
  @JSImport("jwt-client", "write")
  @js.native
  def write(value: JWTObject): String = js.native
  
  @js.native
  trait JWTHeader extends StObject {
    
    var alg: String = js.native
    
    var typ: String = js.native
  }
  object JWTHeader {
    
    @scala.inline
    def apply(alg: String, typ: String): JWTHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTHeader]
    }
    
    @scala.inline
    implicit class JWTHeaderMutableBuilder[Self <: JWTHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JWTObject extends StObject {
    
    var claim: js.Any = js.native
    
    var header: JWTHeader = js.native
    
    var signature: String = js.native
  }
  object JWTObject {
    
    @scala.inline
    def apply(claim: js.Any, header: JWTHeader, signature: String): JWTObject = {
      val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTObject]
    }
    
    @scala.inline
    implicit class JWTObjectMutableBuilder[Self <: JWTObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClaim(value: js.Any): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: JWTHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
