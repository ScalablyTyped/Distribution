package typings.jose.joseMod

import typings.jose.joseMod.JWKNs.ECKey
import typings.jose.joseMod.JWKNs.Key
import typings.jose.joseMod.JWKNs.KeyInput
import typings.jose.joseMod.JWKNs.OKPKey
import typings.jose.joseMod.JWKNs.OctKey
import typings.jose.joseMod.JWKNs.RSAKey
import typings.jose.joseMod.JWKNs.pemEncodingOptions
import typings.jose.joseNumbers.`false`
import typings.jose.joseNumbers.`true`
import typings.jose.joseStrings.EC
import typings.jose.joseStrings.OKP
import typings.jose.joseStrings.RSA
import typings.jose.joseStrings.oct
import typings.jose.joseStrings.secret
import typings.node.Buffer
import typings.node.cryptoMod.KeyObject
import typings.node.cryptoMod.PrivateKeyInput
import typings.node.cryptoMod.PublicKeyInput
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK")
@js.native
object JWKNs extends js.Object {
  @js.native
  class ECKey () extends Key {
    var crv: ECCurve = js.native
    var d: js.UndefOr[String] = js.native
    @JSName("kty")
    var kty_ECKey: EC = js.native
    @JSName("secret")
    var secret_ECKey: `false` = js.native
    @JSName("type")
    var type_ECKey: asymmetricKeyObjectTypes = js.native
    var x: String = js.native
    var y: String = js.native
    def toJWK(): JWKECKey = js.native
    def toJWK(`private`: Boolean): JWKECKey = js.native
  }
  
  @js.native
  class Key () extends js.Object {
    var alg: js.UndefOr[String] = js.native
    var key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
    var kid: String = js.native
    var kty: keyType = js.native
    var `private`: Boolean = js.native
    var public: Boolean = js.native
    var secret: Boolean = js.native
    var thumbprint: String = js.native
    var `type`: keyObjectTypes = js.native
    var use: js.UndefOr[typings.jose.joseMod.use] = js.native
    var x5c: js.UndefOr[js.Array[String]] = js.native
    var x5t: js.UndefOr[String] = js.native
    var `x5t#S256`: js.UndefOr[String] = js.native
    def algorithms(): Set[String] = js.native
    def algorithms(operation: keyOperation): Set[String] = js.native
    def toPEM(): String = js.native
    def toPEM(`private`: Boolean): String = js.native
    def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
  }
  
  @js.native
  class OKPKey () extends Key {
    var crv: OKPCurve = js.native
    var d: js.UndefOr[String] = js.native
    @JSName("kty")
    var kty_OKPKey: OKP = js.native
    @JSName("secret")
    var secret_OKPKey: `false` = js.native
    @JSName("type")
    var type_OKPKey: asymmetricKeyObjectTypes = js.native
    var x: String = js.native
    def toJWK(): JWKOKPKey = js.native
    def toJWK(`private`: Boolean): JWKOKPKey = js.native
  }
  
  @js.native
  class OctKey () extends Key {
    var k: js.UndefOr[String] = js.native
    @JSName("kty")
    var kty_OctKey: oct = js.native
    @JSName("private")
    var private_OctKey: `false` = js.native
    @JSName("public")
    var public_OctKey: `false` = js.native
    @JSName("secret")
    var secret_OctKey: `true` = js.native
    @JSName("type")
    var type_OctKey: secret = js.native
    def toJWK(): JWKOctKey = js.native
    def toJWK(`private`: Boolean): JWKOctKey = js.native
  }
  
  @js.native
  class RSAKey () extends Key {
    var d: js.UndefOr[String] = js.native
    var dp: js.UndefOr[String] = js.native
    var dq: js.UndefOr[String] = js.native
    var e: String = js.native
    @JSName("kty")
    var kty_RSAKey: RSA = js.native
    var n: String = js.native
    var p: js.UndefOr[String] = js.native
    var q: js.UndefOr[String] = js.native
    var qi: js.UndefOr[String] = js.native
    @JSName("secret")
    var secret_RSAKey: `false` = js.native
    @JSName("type")
    var type_RSAKey: asymmetricKeyObjectTypes = js.native
    def toJWK(): JWKRSAKey = js.native
    def toJWK(`private`: Boolean): JWKRSAKey = js.native
  }
  
  trait pemEncodingOptions extends js.Object {
    var cipher: js.UndefOr[String] = js.undefined
    var passphrase: js.UndefOr[String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  def asKey(jwk: JWKECKey): ECKey = js.native
  def asKey(jwk: JWKOKPKey): OKPKey = js.native
  def asKey(jwk: JWKOctKey): OctKey = js.native
  def asKey(jwk: JWKRSAKey): RSAKey = js.native
  def asKey(jwk: JWKRSAKey, options: ImportOptions): RSAKey = js.native
  def asKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def asKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  def asKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def asKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC): ECKey = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve): ECKey = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): ECKey = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): ECKey = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP): OKPKey = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve): OKPKey = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): OKPKey = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA): RSAKey = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double): RSAKey = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct): OctKey = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct, bitlength: Double): OctKey = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): OctKey = js.native
  @JSName("generate")
  def generate_EC(kty: EC): js.Promise[ECKey] = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve): js.Promise[ECKey] = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP): js.Promise[OKPKey] = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve): js.Promise[OKPKey] = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): js.Promise[OKPKey] = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA): js.Promise[RSAKey] = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double): js.Promise[RSAKey] = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): js.Promise[RSAKey] = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = js.native
  @JSName("generate")
  def generate_oct(kty: oct): js.Promise[OctKey] = js.native
  @JSName("generate")
  def generate_oct(kty: oct, bitlength: Double): js.Promise[OctKey] = js.native
  @JSName("generate")
  def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = js.native
  def importKey(jwk: JWKECKey): ECKey = js.native
  def importKey(jwk: JWKOKPKey): OKPKey = js.native
  def importKey(jwk: JWKOctKey): OctKey = js.native
  def importKey(jwk: JWKRSAKey): RSAKey = js.native
  def importKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def importKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  def importKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def importKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  def isKey(`object`: js.Any): Boolean = js.native
  type KeyInput = PrivateKeyInput | PublicKeyInput | String | Buffer
}

