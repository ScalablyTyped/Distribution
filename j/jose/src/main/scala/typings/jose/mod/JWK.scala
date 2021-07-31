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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWK {
  
  @JSImport("jose", "JWK")
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def asKey(jwk: JWKECKey): ECKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[ECKey]
  @scala.inline
  def asKey(jwk: JWKOKPKey): OKPKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[OKPKey]
  @scala.inline
  def asKey(jwk: JWKOctKey): OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[OctKey]
  @scala.inline
  def asKey(jwk: JWKRSAKey): RSAKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[RSAKey]
  @scala.inline
  def asKey(jwk: JWKRSAKey, options: ImportOptions): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(jwk.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def asKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(key.asInstanceOf[js.Any]).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  @scala.inline
  def asKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  @scala.inline
  def asKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(key.asInstanceOf[js.Any]).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  @scala.inline
  def asKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  
  @scala.inline
  def generate(kty: keyType): js.Promise[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Double): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Double, parameters: Unit, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Unit, parameters: Unit, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Unit, parameters: BasicParameters): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Unit, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Curves): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Curves, parameters: Unit, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  @scala.inline
  def generate(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  
  @scala.inline
  def generateSync(kty: keyType): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any]).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Double, parameters: Unit, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Unit, parameters: Unit, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Unit, parameters: BasicParameters): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Unit, parameters: BasicParameters, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Curves): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: Unit, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Key]
  @scala.inline
  def generateSync(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crvOrSize.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  @scala.inline
  def generateSync_EC(kty: EC): ECKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any]).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: Unit, parameters: Unit, `private`: Boolean): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: Unit, parameters: BasicParameters): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: Unit, parameters: BasicParameters, `private`: Boolean): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: ECCurve): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: Unit, `private`: Boolean): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  @scala.inline
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): ECKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[ECKey]
  
  @scala.inline
  def generateSync_OKP(kty: OKP): OKPKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any]).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: Unit, parameters: Unit, `private`: Boolean): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: Unit, parameters: BasicParameters): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: Unit, parameters: BasicParameters, `private`: Boolean): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: OKPCurve): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: Unit, `private`: Boolean): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  @scala.inline
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): OKPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[OKPKey]
  
  @scala.inline
  def generateSync_RSA(kty: RSA): RSAKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any]).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Double): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: Unit, `private`: Boolean): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Unit, parameters: Unit, `private`: Boolean): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Unit, parameters: BasicParameters): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  @scala.inline
  def generateSync_RSA(kty: RSA, bitlength: Unit, parameters: BasicParameters, `private`: Boolean): RSAKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[RSAKey]
  
  @scala.inline
  def generateSync_oct(kty: oct): OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any]).asInstanceOf[OctKey]
  @scala.inline
  def generateSync_oct(kty: oct, bitlength: Double): OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any])).asInstanceOf[OctKey]
  @scala.inline
  def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[OctKey]
  @scala.inline
  def generateSync_oct(kty: oct, bitlength: Unit, parameters: BasicParameters): OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSync")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[OctKey]
  
  @scala.inline
  def generate_EC(kty: EC): js.Promise[ECKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: Unit, parameters: Unit, `private`: Boolean): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: Unit, parameters: BasicParameters): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: Unit, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: ECCurve): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: ECCurve, parameters: Unit, `private`: Boolean): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  @scala.inline
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ECKey]]
  
  @scala.inline
  def generate_OKP(kty: OKP): js.Promise[OKPKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: Unit, parameters: Unit, `private`: Boolean): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: Unit, parameters: BasicParameters): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: Unit, parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: OKPCurve): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: Unit, `private`: Boolean): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  @scala.inline
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[OKPKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], crv.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OKPKey]]
  
  @scala.inline
  def generate_RSA(kty: RSA): js.Promise[RSAKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Double): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Double, parameters: Unit, `private`: Boolean): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Unit, parameters: Unit, `private`: Boolean): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Unit, parameters: BasicParameters): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  @scala.inline
  def generate_RSA(kty: RSA, bitlength: Unit, parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], `private`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RSAKey]]
  
  @scala.inline
  def generate_oct(kty: oct): js.Promise[OctKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OctKey]]
  @scala.inline
  def generate_oct(kty: oct, bitlength: Double): js.Promise[OctKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OctKey]]
  @scala.inline
  def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OctKey]]
  @scala.inline
  def generate_oct(kty: oct, bitlength: Unit, parameters: BasicParameters): js.Promise[OctKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(kty.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OctKey]]
  
  @scala.inline
  def importKey(jwk: JWKECKey): ECKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[ECKey]
  @scala.inline
  def importKey(jwk: JWKOKPKey): OKPKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[OKPKey]
  @scala.inline
  def importKey(jwk: JWKOctKey): OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[OctKey]
  @scala.inline
  def importKey(jwk: JWKRSAKey): RSAKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[RSAKey]
  @scala.inline
  def importKey(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(key.asInstanceOf[js.Any]).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  @scala.inline
  def importKey(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  /*
    * @deprecated in favor of asKey
    */
  @scala.inline
  def importKey(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(key.asInstanceOf[js.Any]).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  @scala.inline
  def importKey(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[RSAKey | ECKey | OKPKey | OctKey]
  
  @scala.inline
  def isKey(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait ECKey
    extends StObject
       with Key {
    
    @JSName("crv")
    val crv_ECKey: ECCurve = js.native
    
    @JSName("dp")
    val dp_ECKey: Unit = js.native
    
    @JSName("dq")
    val dq_ECKey: Unit = js.native
    
    @JSName("e")
    val e_ECKey: Unit = js.native
    
    @JSName("k")
    val k_ECKey: Unit = js.native
    
    @JSName("kty")
    val kty_ECKey: EC = js.native
    
    @JSName("n")
    val n_ECKey: Unit = js.native
    
    @JSName("p")
    val p_ECKey: Unit = js.native
    
    @JSName("q")
    val q_ECKey: Unit = js.native
    
    @JSName("qi")
    val qi_ECKey: Unit = js.native
    
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
  trait Key
    extends StObject
       with _ProduceKeyInput {
    
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
    def toPEM(`private`: Boolean): String = js.native
    def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
    def toPEM(`private`: Unit, encoding: pemEncodingOptions): String = js.native
    
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
  trait OKPKey
    extends StObject
       with Key {
    
    @JSName("crv")
    val crv_OKPKey: OKPCurve = js.native
    
    @JSName("dp")
    val dp_OKPKey: Unit = js.native
    
    @JSName("dq")
    val dq_OKPKey: Unit = js.native
    
    @JSName("e")
    val e_OKPKey: Unit = js.native
    
    @JSName("k")
    val k_OKPKey: Unit = js.native
    
    @JSName("kty")
    val kty_OKPKey: OKP = js.native
    
    @JSName("n")
    val n_OKPKey: Unit = js.native
    
    @JSName("p")
    val p_OKPKey: Unit = js.native
    
    @JSName("q")
    val q_OKPKey: Unit = js.native
    
    @JSName("qi")
    val qi_OKPKey: Unit = js.native
    
    @JSName("secret")
    val secret_OKPKey: `false` = js.native
    
    def toJWK(): JWKOKPKey = js.native
    def toJWK(`private`: Boolean): JWKOKPKey = js.native
    
    @JSName("type")
    val type_OKPKey: asymmetricKeyObjectTypes = js.native
    
    @JSName("x")
    val x_OKPKey: String = js.native
    
    @JSName("y")
    val y_OKPKey: Unit = js.native
  }
  
  @js.native
  trait OctKey
    extends StObject
       with Key {
    
    @JSName("crv")
    val crv_OctKey: Unit = js.native
    
    @JSName("d")
    val d_OctKey: Unit = js.native
    
    @JSName("dp")
    val dp_OctKey: Unit = js.native
    
    @JSName("dq")
    val dq_OctKey: Unit = js.native
    
    @JSName("e")
    val e_OctKey: Unit = js.native
    
    @JSName("kty")
    val kty_OctKey: oct = js.native
    
    @JSName("n")
    val n_OctKey: Unit = js.native
    
    @JSName("p")
    val p_OctKey: Unit = js.native
    
    @JSName("private")
    val private_OctKey: `false` = js.native
    
    @JSName("public")
    val public_OctKey: `false` = js.native
    
    @JSName("q")
    val q_OctKey: Unit = js.native
    
    @JSName("qi")
    val qi_OctKey: Unit = js.native
    
    @JSName("secret")
    val secret_OctKey: `true` = js.native
    
    def toJWK(): JWKOctKey = js.native
    def toJWK(`private`: Boolean): JWKOctKey = js.native
    
    @JSName("type")
    val type_OctKey: typings.jose.joseStrings.secret = js.native
    
    @JSName("x")
    val x_OctKey: Unit = js.native
    
    @JSName("y")
    val y_OctKey: Unit = js.native
  }
  
  @js.native
  trait RSAKey
    extends StObject
       with Key {
    
    @JSName("crv")
    val crv_RSAKey: Unit = js.native
    
    @JSName("e")
    val e_RSAKey: String = js.native
    
    @JSName("k")
    val k_RSAKey: Unit = js.native
    
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
    val x_RSAKey: Unit = js.native
    
    @JSName("y")
    val y_RSAKey: Unit = js.native
  }
  
  trait pemEncodingOptions extends StObject {
    
    var cipher: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
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
