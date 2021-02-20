package typings.jwkToPem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwk-to-pem", JSImport.Namespace)
  @js.native
  def apply(jwk: JWK): String = js.native
  @JSImport("jwk-to-pem", JSImport.Namespace)
  @js.native
  def apply(jwk: JWK, opts: Options): String = js.native
  
  @js.native
  trait EC extends JWK {
    
    var crv: String = js.native
    
    var kty: typings.jwkToPem.jwkToPemStrings.EC = js.native
    
    var x: String = js.native
    
    var y: String = js.native
  }
  object EC {
    
    @scala.inline
    def apply(crv: String, kty: typings.jwkToPem.jwkToPemStrings.EC, x: String, y: String): EC = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EC]
    }
    
    @scala.inline
    implicit class ECMutableBuilder[Self <: EC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: typings.jwkToPem.jwkToPemStrings.EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ECPrivate extends JWK {
    
    var crv: String = js.native
    
    var d: String = js.native
    
    var kty: typings.jwkToPem.jwkToPemStrings.EC = js.native
    
    var x: js.UndefOr[String] = js.native
    
    var y: js.UndefOr[String] = js.native
  }
  object ECPrivate {
    
    @scala.inline
    def apply(crv: String, d: String, kty: typings.jwkToPem.jwkToPemStrings.EC): ECPrivate = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECPrivate]
    }
    
    @scala.inline
    implicit class ECPrivateMutableBuilder[Self <: ECPrivate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: typings.jwkToPem.jwkToPemStrings.EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jwkToPem.mod.EC
    - typings.jwkToPem.mod.ECPrivate
    - typings.jwkToPem.mod.RSA
  */
  trait JWK extends StObject
  object JWK {
    
    @scala.inline
    def EC(crv: String, kty: typings.jwkToPem.jwkToPemStrings.EC, x: String, y: String): typings.jwkToPem.mod.EC = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwkToPem.mod.EC]
    }
    
    @scala.inline
    def ECPrivate(crv: String, d: String, kty: typings.jwkToPem.jwkToPemStrings.EC): typings.jwkToPem.mod.ECPrivate = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwkToPem.mod.ECPrivate]
    }
    
    @scala.inline
    def RSA(e: String, kty: typings.jwkToPem.jwkToPemStrings.RSA, n: String): typings.jwkToPem.mod.RSA = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwkToPem.mod.RSA]
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var `private`: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(`private`: Boolean): Options = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RSA extends JWK {
    
    var d: js.UndefOr[String] = js.native
    
    var dp: js.UndefOr[String] = js.native
    
    var dq: js.UndefOr[String] = js.native
    
    var e: String = js.native
    
    var kty: typings.jwkToPem.jwkToPemStrings.RSA = js.native
    
    var n: String = js.native
    
    var p: js.UndefOr[String] = js.native
    
    var q: js.UndefOr[String] = js.native
    
    var qi: js.UndefOr[String] = js.native
  }
  object RSA {
    
    @scala.inline
    def apply(e: String, kty: typings.jwkToPem.jwkToPemStrings.RSA, n: String): RSA = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSA]
    }
    
    @scala.inline
    implicit class RSAMutableBuilder[Self <: RSA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      @scala.inline
      def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: typings.jwkToPem.jwkToPemStrings.RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    }
  }
}
