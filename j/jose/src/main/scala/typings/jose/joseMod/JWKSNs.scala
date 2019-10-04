package typings.jose.joseMod

import typings.jose.joseMod.JWKNs.Key
import typings.jose.joseMod.JWKSNs.JWKSImportOptions
import typings.jose.joseMod.JWKSNs.KeyQuery
import typings.jose.joseMod.JWKSNs.KeyStore
import typings.jose.joseStrings.EC
import typings.jose.joseStrings.OKP
import typings.jose.joseStrings.RSA
import typings.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWKS")
@js.native
object JWKSNs extends js.Object {
  trait JWKSImportOptions extends ImportOptions {
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  }
  
  trait KeyQuery extends BasicParameters {
    var kty: js.UndefOr[keyType] = js.undefined
    var x5t: js.UndefOr[String] = js.undefined
    var `x5t#S256`: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class KeyStore () extends js.Object {
    def this(keys: js.Array[Key]) = this()
    var size: Double = js.native
    def add(key: Key): Unit = js.native
    def all(): js.Array[Key] = js.native
    def all(parameters: KeyQuery): js.Array[Key] = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): Unit = js.native
    @JSName("generateSync")
    def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct, bitlength: Double): Unit = js.native
    @JSName("generateSync")
    def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): Unit = js.native
    @JSName("generate")
    def generate_EC(kty: EC): Unit = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve): Unit = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generate")
    def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP): Unit = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve): Unit = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): Unit = js.native
    @JSName("generate")
    def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA): Unit = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double): Unit = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): Unit = js.native
    @JSName("generate")
    def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
    @JSName("generate")
    def generate_oct(kty: oct): Unit = js.native
    @JSName("generate")
    def generate_oct(kty: oct, bitlength: Double): Unit = js.native
    @JSName("generate")
    def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): Unit = js.native
    def get(): Key = js.native
    def get(parameters: KeyQuery): Key = js.native
    def remove(key: Key): Unit = js.native
    def toJWKS(): JSONWebKeySet = js.native
    def toJWKS(`private`: Boolean): JSONWebKeySet = js.native
  }
  
  def asKeyStore(jwks: JSONWebKeySet): KeyStore = js.native
  def asKeyStore(jwks: JSONWebKeySet, options: JWKSImportOptions): KeyStore = js.native
  /* static members */
  @js.native
  object KeyStore extends js.Object {
    /*
      * @deprecated in favor of JWKS.asKeyStore
      */
    def fromJWKS(jwks: JSONWebKeySet): KeyStore = js.native
  }
  
}

