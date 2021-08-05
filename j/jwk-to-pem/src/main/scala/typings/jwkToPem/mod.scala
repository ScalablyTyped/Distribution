package typings.jwkToPem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(jwk: JWK): String = ^.asInstanceOf[js.Dynamic].apply(jwk.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(jwk: JWK, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(jwk.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jwk-to-pem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EC
    extends StObject
       with JWK {
    
    var crv: String
    
    var kty: typings.jwkToPem.jwkToPemStrings.EC
    
    var x: String
    
    var y: String
  }
  object EC {
    
    inline def apply(crv: String, x: String, y: String): EC = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EC]
    }
    
    extension [Self <: EC](x: Self) {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setKty(value: typings.jwkToPem.jwkToPemStrings.EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ECPrivate
    extends StObject
       with JWK {
    
    var crv: String
    
    var d: String
    
    var kty: typings.jwkToPem.jwkToPemStrings.EC
    
    var x: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[String] = js.undefined
  }
  object ECPrivate {
    
    inline def apply(crv: String, d: String): ECPrivate = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = "EC")
      __obj.asInstanceOf[ECPrivate]
    }
    
    extension [Self <: ECPrivate](x: Self) {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setKty(value: typings.jwkToPem.jwkToPemStrings.EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jwkToPem.mod.EC
    - typings.jwkToPem.mod.ECPrivate
    - typings.jwkToPem.mod.RSA
  */
  trait JWK extends StObject
  object JWK {
    
    inline def EC(crv: String, x: String, y: String): typings.jwkToPem.mod.EC = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwkToPem.mod.EC]
    }
    
    inline def ECPrivate(crv: String, d: String): typings.jwkToPem.mod.ECPrivate = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = "EC")
      __obj.asInstanceOf[typings.jwkToPem.mod.ECPrivate]
    }
    
    inline def RSA(e: String, n: String): typings.jwkToPem.mod.RSA = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwkToPem.mod.RSA]
    }
  }
  
  trait Options extends StObject {
    
    var `private`: Boolean
  }
  object Options {
    
    inline def apply(`private`: Boolean): Options = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSA
    extends StObject
       with JWK {
    
    var d: js.UndefOr[String] = js.undefined
    
    var dp: js.UndefOr[String] = js.undefined
    
    var dq: js.UndefOr[String] = js.undefined
    
    var e: String
    
    var kty: typings.jwkToPem.jwkToPemStrings.RSA
    
    var n: String
    
    var p: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[String] = js.undefined
    
    var qi: js.UndefOr[String] = js.undefined
  }
  object RSA {
    
    inline def apply(e: String, n: String): RSA = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSA]
    }
    
    extension [Self <: RSA](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setKty(value: typings.jwkToPem.jwkToPemStrings.RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
      
      inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    }
  }
}
