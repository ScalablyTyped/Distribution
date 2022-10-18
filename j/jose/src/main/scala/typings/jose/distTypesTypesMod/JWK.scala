package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jose.anon.D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWK
  extends StObject
     with /* propName */ StringDictionary[Any] {
  
  /** JWK "alg" (Algorithm) Parameter. */
  var alg: js.UndefOr[String] = js.undefined
  
  var crv: js.UndefOr[String] = js.undefined
  
  var d: js.UndefOr[String] = js.undefined
  
  var dp: js.UndefOr[String] = js.undefined
  
  var dq: js.UndefOr[String] = js.undefined
  
  var e: js.UndefOr[String] = js.undefined
  
  /** JWK "ext" (Extractable) Parameter. */
  var ext: js.UndefOr[Boolean] = js.undefined
  
  var k: js.UndefOr[String] = js.undefined
  
  /** JWK "key_ops" (Key Operations) Parameter. */
  var key_ops: js.UndefOr[js.Array[String]] = js.undefined
  
  /** JWK "kid" (Key ID) Parameter. */
  var kid: js.UndefOr[String] = js.undefined
  
  /** JWK "kty" (Key Type) Parameter. */
  var kty: js.UndefOr[String] = js.undefined
  
  var n: js.UndefOr[String] = js.undefined
  
  var oth: js.UndefOr[js.Array[D]] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var qi: js.UndefOr[String] = js.undefined
  
  /** JWK "use" (Public Key Use) Parameter. */
  var use: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[String] = js.undefined
  
  /** JWK "x5c" (X.509 Certificate Chain) Parameter. */
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  
  /** JWK "x5t" (X.509 Certificate SHA-1 Thumbprint) Parameter. */
  var x5t: js.UndefOr[String] = js.undefined
  
  /** "x5t#S256" (X.509 Certificate SHA-256 Thumbprint) Parameter. */
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
  
  /** JWK "x5u" (X.509 URL) Parameter. */
  var x5u: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[String] = js.undefined
}
object JWK {
  
  inline def apply(): JWK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWK]
  }
  
  extension [Self <: JWK](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKey_ops(value: js.Array[String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    inline def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
    
    inline def setKey_opsVarargs(value: String*): Self = StObject.set(x, "key_ops", js.Array(value*))
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setOth(value: js.Array[D]): Self = StObject.set(x, "oth", value.asInstanceOf[js.Any])
    
    inline def setOthUndefined: Self = StObject.set(x, "oth", js.undefined)
    
    inline def setOthVarargs(value: D*): Self = StObject.set(x, "oth", js.Array(value*))
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    
    inline def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
    
    inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    
    inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
    
    inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    
    inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
    
    inline def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
    
    inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
