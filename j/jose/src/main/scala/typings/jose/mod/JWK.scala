package typings.jose.mod

import typings.jose.joseBooleans.`false`
import typings.jose.joseBooleans.`true`
import typings.jose.joseStrings.EC
import typings.jose.joseStrings.OKP
import typings.jose.joseStrings.RSA
import typings.jose.joseStrings.embedded
import typings.jose.joseStrings.none
import typings.jose.joseStrings.oct
import typings.jose.joseStrings.unsecured
import typings.node.cryptoMod.KeyObject
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWK {
  
  @js.native
  trait EmbeddedJWK extends StObject {
    
    def algorithms(): Set[String] = js.native
    def algorithms(operation: keyOperation): Set[String] = js.native
    
    val `type`: embedded = js.native
  }
  @JSImport("jose", "JWK.EmbeddedJWK")
  @js.native
  val EmbeddedJWK: typings.jose.mod.JWK.EmbeddedJWK = js.native
  
  @js.native
  trait EmbeddedX5C extends StObject {
    
    def algorithms(): Set[String] = js.native
    def algorithms(operation: keyOperation): Set[String] = js.native
    
    val `type`: embedded = js.native
  }
  @JSImport("jose", "JWK.EmbeddedX5C")
  @js.native
  val EmbeddedX5C: typings.jose.mod.JWK.EmbeddedX5C = js.native
  
  @JSImport("jose", "JWK.None")
  @js.native
  val None: typings.jose.mod.JWK.NoneKey = js.native
  
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(jwk: JWKECKey): ECKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(jwk: JWKOKPKey): OKPKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(jwk: JWKOctKey): OctKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(jwk: JWKRSAKey): RSAKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(jwk: JWKRSAKey, options: ImportOptions): RSAKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSImport("jose", "JWK.asKey")
  @js.native
  def asKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: BasicParameters,
    `private`: Boolean
  ): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Double): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Curves): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): js.Promise[Key] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
  
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: BasicParameters,
    `private`: Boolean
  ): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Double): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Curves): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): Key = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: ECCurve): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): ECKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(
    kty: OKP,
    crv: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: OKPCurve): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(
    kty: RSA,
    bitlength: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: Double): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_oct(kty: oct): OctKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_oct(kty: oct, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): OctKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_oct(kty: oct, bitlength: Double): OctKey = js.native
  @JSImport("jose", "JWK.generateSync")
  @js.native
  def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): OctKey = js.native
  
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: ECCurve): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(
    kty: OKP,
    crv: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: OKPCurve): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(
    kty: RSA,
    bitlength: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: Double): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_oct(kty: oct): js.Promise[OctKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_oct(kty: oct, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[OctKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_oct(kty: oct, bitlength: Double): js.Promise[OctKey] = js.native
  @JSImport("jose", "JWK.generate")
  @js.native
  def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = js.native
  
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(jwk: JWKECKey): ECKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(jwk: JWKOKPKey): OKPKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(jwk: JWKOctKey): OctKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(jwk: JWKRSAKey): RSAKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  @JSImport("jose", "JWK.importKey")
  @js.native
  def importKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  
  @JSImport("jose", "JWK.isKey")
  @js.native
  def isKey(`object`: js.Any): Boolean = js.native
  
  @js.native
  trait ECKey extends Key {
    
    @JSName("crv")
    val crv_ECKey: ECCurve = js.native
    
    @JSName("dp")
    val dp_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("dq")
    val dq_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("e")
    val e_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("k")
    val k_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("kty")
    val kty_ECKey: EC = js.native
    
    @JSName("n")
    val n_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("p")
    val p_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("q")
    val q_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("qi")
    val qi_ECKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("secret")
    val secret_ECKey: `false` = js.native
    
    def toJWK(): JWKECKey = js.native
    def toJWK(`private`: Boolean): JWKECKey = js.native
    
    @JSName("type")
    val type_ECKey: asymmetricKeyObjectTypes = js.native
    
    @JSName("x")
    val x_ECKey: String = js.native
    
    @JSName("y")
    val y_ECKey: String = js.native
  }
  
  @js.native
  trait Key extends _ProduceKeyInput {
    
    val alg: js.UndefOr[String] = js.native
    
    def algorithms(): Set[String] = js.native
    def algorithms(operation: keyOperation): Set[String] = js.native
    
    val crv: js.UndefOr[ECCurve | OKPCurve] = js.native
    
    val d: js.UndefOr[String] = js.native
    
    val dp: js.UndefOr[String] = js.native
    
    val dq: js.UndefOr[String] = js.native
    
    val e: js.UndefOr[String] = js.native
    
    val k: js.UndefOr[String] = js.native
    
    val keyObject: KeyObject = js.native
    
    val key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
    
    val kid: String = js.native
    
    val kty: keyType = js.native
    
    val n: js.UndefOr[String] = js.native
    
    val p: js.UndefOr[String] = js.native
    
    val `private`: Boolean = js.native
    
    val public: Boolean = js.native
    
    val q: js.UndefOr[String] = js.native
    
    val qi: js.UndefOr[String] = js.native
    
    val secret: Boolean = js.native
    
    val thumbprint: String = js.native
    
    def toPEM(): String = js.native
    def toPEM(`private`: js.UndefOr[scala.Nothing], encoding: pemEncodingOptions): String = js.native
    def toPEM(`private`: Boolean): String = js.native
    def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
    
    val `type`: keyObjectTypes = js.native
    
    val use: js.UndefOr[typings.jose.mod.use] = js.native
    
    val x: js.UndefOr[String] = js.native
    
    val x5c: js.UndefOr[js.Array[String]] = js.native
    
    val x5t: js.UndefOr[String] = js.native
    
    @JSName("x5t#S256")
    val x5tNumbersignS256: js.UndefOr[String] = js.native
    
    val y: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait NoneKey extends StObject {
    
    val alg: none = js.native
    
    def algorithms(): Set[String] = js.native
    def algorithms(operation: keyOperation): Set[String] = js.native
    
    val `type`: unsecured = js.native
  }
  
  @js.native
  trait OKPKey extends Key {
    
    @JSName("crv")
    val crv_OKPKey: OKPCurve = js.native
    
    @JSName("dp")
    val dp_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("dq")
    val dq_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("e")
    val e_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("k")
    val k_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("kty")
    val kty_OKPKey: OKP = js.native
    
    @JSName("n")
    val n_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("p")
    val p_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("q")
    val q_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("qi")
    val qi_OKPKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("secret")
    val secret_OKPKey: `false` = js.native
    
    def toJWK(): JWKOKPKey = js.native
    def toJWK(`private`: Boolean): JWKOKPKey = js.native
    
    @JSName("type")
    val type_OKPKey: asymmetricKeyObjectTypes = js.native
    
    @JSName("x")
    val x_OKPKey: String = js.native
    
    @JSName("y")
    val y_OKPKey: js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait OctKey extends Key {
    
    @JSName("crv")
    val crv_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("d")
    val d_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("dp")
    val dp_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("dq")
    val dq_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("e")
    val e_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("kty")
    val kty_OctKey: oct = js.native
    
    @JSName("n")
    val n_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("p")
    val p_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("private")
    val private_OctKey: `false` = js.native
    
    @JSName("public")
    val public_OctKey: `false` = js.native
    
    @JSName("q")
    val q_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("qi")
    val qi_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("secret")
    val secret_OctKey: `true` = js.native
    
    def toJWK(): JWKOctKey = js.native
    def toJWK(`private`: Boolean): JWKOctKey = js.native
    
    @JSName("type")
    val type_OctKey: typings.jose.joseStrings.secret = js.native
    
    @JSName("x")
    val x_OctKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("y")
    val y_OctKey: js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait RSAKey extends Key {
    
    @JSName("crv")
    val crv_RSAKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("e")
    val e_RSAKey: String = js.native
    
    @JSName("k")
    val k_RSAKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("kty")
    val kty_RSAKey: RSA = js.native
    
    @JSName("n")
    val n_RSAKey: String = js.native
    
    @JSName("secret")
    val secret_RSAKey: `false` = js.native
    
    def toJWK(): JWKRSAKey = js.native
    def toJWK(`private`: Boolean): JWKRSAKey = js.native
    
    @JSName("type")
    val type_RSAKey: asymmetricKeyObjectTypes = js.native
    
    @JSName("x")
    val x_RSAKey: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("y")
    val y_RSAKey: js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait pemEncodingOptions extends StObject {
    
    var cipher: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object pemEncodingOptions {
    
    @scala.inline
    def apply(): pemEncodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pemEncodingOptions]
    }
    
    @scala.inline
    implicit class pemEncodingOptionsMutableBuilder[Self <: pemEncodingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
