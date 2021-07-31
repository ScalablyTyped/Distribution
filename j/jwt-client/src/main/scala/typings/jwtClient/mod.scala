package typings.jwtClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forget")().asInstanceOf[Unit]
  
  @scala.inline
  def get(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[String]
  
  @scala.inline
  def keep(value: JWTObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keep")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def keep(value: JWTObject, key: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keep")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def keep(value: JWTObject, key: js.Any, storate: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keep")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any], storate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def keep(value: JWTObject, key: Unit, storate: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keep")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any], storate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Read a string value (normally an HTTP header)
    * from JSON Web Token to an Object
    */ 
  @scala.inline
  def read(header: String): JWTObject = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(header.asInstanceOf[js.Any]).asInstanceOf[JWTObject]
  
  @scala.inline
  def remember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remember")().asInstanceOf[Unit]
  
  @scala.inline
  def validate(value: JWTObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validate(value: JWTObject, issuer: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validate(value: JWTObject, issuer: js.Any, audience: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], audience.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validate(value: JWTObject, issuer: Unit, audience: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], audience.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Given a JWT object, stringify it back to
    * its JWT representation.
    */ 
  @scala.inline
  def write(value: JWTObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait JWTHeader extends StObject {
    
    var alg: String
    
    var typ: String
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
  
  trait JWTObject extends StObject {
    
    var claim: js.Any
    
    var header: JWTHeader
    
    var signature: String
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
