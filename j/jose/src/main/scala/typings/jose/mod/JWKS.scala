package typings.jose.mod

import typings.jose.joseStrings.EC
import typings.jose.joseStrings.OKP
import typings.jose.joseStrings.RSA
import typings.jose.joseStrings.oct
import typings.jose.mod.JWK.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWKS {
  
  @JSImport("jose", "JWKS.KeyStore")
  @js.native
  class KeyStore () extends _ConsumeKeyInput {
    def this(keys: js.Array[Key]) = this()
    
    def add(key: Key): Unit = js.native
    
    def all(): js.Array[Key] = js.native
    def all(parameters: KeyQuery): js.Array[Key] = js.native
    
    def generate(kty: keyType): js.Promise[Unit] = js.native
    def generate(
      kty: keyType,
      crvOrSize: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Unit] = js.native
    def generate(
      kty: keyType,
      crvOrSize: js.UndefOr[scala.Nothing],
      parameters: BasicParameters,
      `private`: Boolean
    ): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Double): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Curves): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): js.Promise[Unit] = js.native
    def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    
    def generateSync(kty: keyType): Unit = js.native
    def generateSync(
      kty: keyType,
      crvOrSize: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): Unit = js.native
    def generateSync(
      kty: keyType,
      crvOrSize: js.UndefOr[scala.Nothing],
      parameters: BasicParameters,
      `private`: Boolean
    ): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Double): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Curves): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): Unit = js.native
    def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(
      kty: OKP,
      crv: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(
      kty: RSA,
      bitlength: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct, bitlength: Double): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): Unit = js.native
    
    @JSName("generate")
    def generate_EC(kty: EC): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(
      kty: OKP,
      crv: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(
      kty: RSA,
      bitlength: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      `private`: Boolean
    ): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_oct(kty: oct): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_oct(kty: oct, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_oct(kty: oct, bitlength: Double): js.Promise[Unit] = js.native
    @JSName("generate")
    def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[Unit] = js.native
    
    def get(): Key = js.native
    def get(parameters: KeyQuery): Key = js.native
    
    def remove(key: Key): Unit = js.native
    
    val size: Double = js.native
    
    def toJWKS(): JSONWebKeySet = js.native
    def toJWKS(`private`: Boolean): JSONWebKeySet = js.native
  }
  object KeyStore {
    
    /*
      * @deprecated in favor of JWKS.asKeyStore
      */
    /* static member */
    @JSImport("jose", "JWKS.KeyStore.fromJWKS")
    @js.native
    def fromJWKS(jwks: JSONWebKeySet): KeyStore = js.native
  }
  
  @JSImport("jose", "JWKS.asKeyStore")
  @js.native
  def asKeyStore(jwks: JSONWebKeySet): KeyStore = js.native
  @JSImport("jose", "JWKS.asKeyStore")
  @js.native
  def asKeyStore(jwks: JSONWebKeySet, options: JWKSImportOptions): KeyStore = js.native
  
  @js.native
  trait JWKSImportOptions extends ImportOptions {
    
    var ignoreErrors: js.UndefOr[Boolean] = js.native
  }
  object JWKSImportOptions {
    
    @scala.inline
    def apply(): JWKSImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWKSImportOptions]
    }
    
    @scala.inline
    implicit class JWKSImportOptionsMutableBuilder[Self <: JWKSImportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    }
  }
  
  @js.native
  trait KeyQuery extends BasicParameters {
    
    var crv: js.UndefOr[String] = js.native
    
    var kty: js.UndefOr[keyType] = js.native
    
    var thumbprint: js.UndefOr[String] = js.native
    
    var x5t: js.UndefOr[String] = js.native
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.native
  }
  object KeyQuery {
    
    @scala.inline
    def apply(): KeyQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyQuery]
    }
    
    @scala.inline
    implicit class KeyQueryMutableBuilder[Self <: KeyQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
      
      @scala.inline
      def setKty(value: keyType): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      @scala.inline
      def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
      
      @scala.inline
      def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
    }
  }
}
