package typings.jose

import typings.jose.mod.Curves
import typings.jose.mod.ECCurve
import typings.jose.mod.OKPCurve
import typings.jose.mod.asymmetricKeyObjectTypes
import typings.jose.mod.keyObjectTypes
import typings.jose.mod.keyOperation
import typings.jose.mod.keyType
import typings.jose.mod.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joseStrings {
  
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
  
  @scala.inline
  def ERR_JOSE_ALG_NOT_WHITELISTED: ERR_JOSE_ALG_NOT_WHITELISTED = "ERR_JOSE_ALG_NOT_WHITELISTED".asInstanceOf[ERR_JOSE_ALG_NOT_WHITELISTED]
  
  @scala.inline
  def ERR_JOSE_CRIT_NOT_UNDERSTOOD: ERR_JOSE_CRIT_NOT_UNDERSTOOD = "ERR_JOSE_CRIT_NOT_UNDERSTOOD".asInstanceOf[ERR_JOSE_CRIT_NOT_UNDERSTOOD]
  
  @scala.inline
  def ERR_JOSE_INVALID_ENCODING: ERR_JOSE_INVALID_ENCODING = "ERR_JOSE_INVALID_ENCODING".asInstanceOf[ERR_JOSE_INVALID_ENCODING]
  
  @scala.inline
  def ERR_JOSE_MULTIPLE_ERRORS: ERR_JOSE_MULTIPLE_ERRORS = "ERR_JOSE_MULTIPLE_ERRORS".asInstanceOf[ERR_JOSE_MULTIPLE_ERRORS]
  
  @scala.inline
  def ERR_JOSE_NOT_SUPPORTED: ERR_JOSE_NOT_SUPPORTED = "ERR_JOSE_NOT_SUPPORTED".asInstanceOf[ERR_JOSE_NOT_SUPPORTED]
  
  @scala.inline
  def ERR_JWE_DECRYPTION_FAILED: ERR_JWE_DECRYPTION_FAILED = "ERR_JWE_DECRYPTION_FAILED".asInstanceOf[ERR_JWE_DECRYPTION_FAILED]
  
  @scala.inline
  def ERR_JWE_INVALID: ERR_JWE_INVALID = "ERR_JWE_INVALID".asInstanceOf[ERR_JWE_INVALID]
  
  @scala.inline
  def ERR_JWKS_NO_MATCHING_KEY: ERR_JWKS_NO_MATCHING_KEY = "ERR_JWKS_NO_MATCHING_KEY".asInstanceOf[ERR_JWKS_NO_MATCHING_KEY]
  
  @scala.inline
  def ERR_JWK_IMPORT_FAILED: ERR_JWK_IMPORT_FAILED = "ERR_JWK_IMPORT_FAILED".asInstanceOf[ERR_JWK_IMPORT_FAILED]
  
  @scala.inline
  def ERR_JWK_INVALID: ERR_JWK_INVALID = "ERR_JWK_INVALID".asInstanceOf[ERR_JWK_INVALID]
  
  @scala.inline
  def ERR_JWK_KEY_SUPPORT: ERR_JWK_KEY_SUPPORT = "ERR_JWK_KEY_SUPPORT".asInstanceOf[ERR_JWK_KEY_SUPPORT]
  
  @scala.inline
  def ERR_JWS_INVALID: ERR_JWS_INVALID = "ERR_JWS_INVALID".asInstanceOf[ERR_JWS_INVALID]
  
  @scala.inline
  def ERR_JWS_VERIFICATION_FAILED: ERR_JWS_VERIFICATION_FAILED = "ERR_JWS_VERIFICATION_FAILED".asInstanceOf[ERR_JWS_VERIFICATION_FAILED]
  
  @scala.inline
  def ERR_JWT_EXPIRED: ERR_JWT_EXPIRED = "ERR_JWT_EXPIRED".asInstanceOf[ERR_JWT_EXPIRED]
  
  @scala.inline
  def ERR_JWT_MALFORMED: ERR_JWT_MALFORMED = "ERR_JWT_MALFORMED".asInstanceOf[ERR_JWT_MALFORMED]
  
  @scala.inline
  def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @scala.inline
  def Ed448: Ed448 = "Ed448".asInstanceOf[Ed448]
  
  @scala.inline
  def OKP: OKP = "OKP".asInstanceOf[OKP]
  
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @scala.inline
  def X25519: X25519 = "X25519".asInstanceOf[X25519]
  
  @scala.inline
  def X448: X448 = "X448".asInstanceOf[X448]
  
  @scala.inline
  def check_failed: check_failed = "check_failed".asInstanceOf[check_failed]
  
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @scala.inline
  def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  
  @scala.inline
  def deriveKey: deriveKey = "deriveKey".asInstanceOf[deriveKey]
  
  @scala.inline
  def embedded: embedded = "embedded".asInstanceOf[embedded]
  
  @scala.inline
  def enc: enc = "enc".asInstanceOf[enc]
  
  @scala.inline
  def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  
  @scala.inline
  def flattened: flattened = "flattened".asInstanceOf[flattened]
  
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def oct: oct = "oct".asInstanceOf[oct]
  
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @scala.inline
  def prohibited: prohibited = "prohibited".asInstanceOf[prohibited]
  
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @scala.inline
  def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
  
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  
  @scala.inline
  def sig: sig = "sig".asInstanceOf[sig]
  
  @scala.inline
  def sign: sign = "sign".asInstanceOf[sign]
  
  @scala.inline
  def unsecured: unsecured = "unsecured".asInstanceOf[unsecured]
  
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @scala.inline
  def unwrapKey: unwrapKey = "unwrapKey".asInstanceOf[unwrapKey]
  
  @scala.inline
  def verify: verify = "verify".asInstanceOf[verify]
  
  @scala.inline
  def wrapKey: wrapKey = "wrapKey".asInstanceOf[wrapKey]
  
  @js.native
  sealed trait EC extends keyType
  
  @js.native
  sealed trait ERR_JOSE_ALG_NOT_WHITELISTED extends js.Object
  
  @js.native
  sealed trait ERR_JOSE_CRIT_NOT_UNDERSTOOD extends js.Object
  
  @js.native
  sealed trait ERR_JOSE_INVALID_ENCODING extends js.Object
  
  @js.native
  sealed trait ERR_JOSE_MULTIPLE_ERRORS extends js.Object
  
  @js.native
  sealed trait ERR_JOSE_NOT_SUPPORTED extends js.Object
  
  @js.native
  sealed trait ERR_JWE_DECRYPTION_FAILED extends js.Object
  
  @js.native
  sealed trait ERR_JWE_INVALID extends js.Object
  
  @js.native
  sealed trait ERR_JWKS_NO_MATCHING_KEY extends js.Object
  
  @js.native
  sealed trait ERR_JWK_IMPORT_FAILED extends js.Object
  
  @js.native
  sealed trait ERR_JWK_INVALID extends js.Object
  
  @js.native
  sealed trait ERR_JWK_KEY_SUPPORT extends js.Object
  
  @js.native
  sealed trait ERR_JWS_INVALID extends js.Object
  
  @js.native
  sealed trait ERR_JWS_VERIFICATION_FAILED extends js.Object
  
  @js.native
  sealed trait ERR_JWT_EXPIRED extends js.Object
  
  @js.native
  sealed trait ERR_JWT_MALFORMED extends js.Object
  
  @js.native
  sealed trait Ed25519
    extends Curves
       with OKPCurve
  
  @js.native
  sealed trait Ed448
    extends Curves
       with OKPCurve
  
  @js.native
  sealed trait OKP extends keyType
  
  @js.native
  sealed trait `P-256`
    extends Curves
       with ECCurve
  
  @js.native
  sealed trait `P-384`
    extends Curves
       with ECCurve
  
  @js.native
  sealed trait `P-521`
    extends Curves
       with ECCurve
  
  @js.native
  sealed trait RSA extends keyType
  
  @js.native
  sealed trait X25519
    extends Curves
       with OKPCurve
  
  @js.native
  sealed trait X448
    extends Curves
       with OKPCurve
  
  @js.native
  sealed trait check_failed extends js.Object
  
  @js.native
  sealed trait compact extends js.Object
  
  @js.native
  sealed trait decrypt extends keyOperation
  
  @js.native
  sealed trait deriveKey extends keyOperation
  
  @js.native
  sealed trait embedded extends js.Object
  
  @js.native
  sealed trait enc extends use
  
  @js.native
  sealed trait encrypt extends keyOperation
  
  @js.native
  sealed trait flattened extends js.Object
  
  @js.native
  sealed trait general extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait oct extends keyType
  
  @js.native
  sealed trait `private`
    extends asymmetricKeyObjectTypes
       with keyObjectTypes
  
  @js.native
  sealed trait prohibited extends js.Object
  
  @js.native
  sealed trait public
    extends asymmetricKeyObjectTypes
       with keyObjectTypes
  
  @js.native
  sealed trait secp256k1
    extends Curves
       with ECCurve
  
  @js.native
  sealed trait secret extends keyObjectTypes
  
  @js.native
  sealed trait sig extends use
  
  @js.native
  sealed trait sign extends keyOperation
  
  @js.native
  sealed trait unsecured extends js.Object
  
  @js.native
  sealed trait unspecified extends js.Object
  
  @js.native
  sealed trait unwrapKey extends keyOperation
  
  @js.native
  sealed trait verify extends keyOperation
  
  @js.native
  sealed trait wrapKey extends keyOperation
}
