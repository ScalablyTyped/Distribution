package typings.jose

import typings.jose.mod.Curves
import typings.jose.mod.ECCurve
import typings.jose.mod.OKPCurve
import typings.jose.mod.asymmetricKeyObjectTypes
import typings.jose.mod.keyObjectTypes
import typings.jose.mod.keyOperation
import typings.jose.mod.keyType
import typings.jose.mod.use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joseStrings {
  
  @js.native
  sealed trait EC
    extends StObject
       with keyType
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
  
  @js.native
  sealed trait ERR_JOSE_ALG_NOT_WHITELISTED extends StObject
  @scala.inline
  def ERR_JOSE_ALG_NOT_WHITELISTED: ERR_JOSE_ALG_NOT_WHITELISTED = "ERR_JOSE_ALG_NOT_WHITELISTED".asInstanceOf[ERR_JOSE_ALG_NOT_WHITELISTED]
  
  @js.native
  sealed trait ERR_JOSE_CRIT_NOT_UNDERSTOOD extends StObject
  @scala.inline
  def ERR_JOSE_CRIT_NOT_UNDERSTOOD: ERR_JOSE_CRIT_NOT_UNDERSTOOD = "ERR_JOSE_CRIT_NOT_UNDERSTOOD".asInstanceOf[ERR_JOSE_CRIT_NOT_UNDERSTOOD]
  
  @js.native
  sealed trait ERR_JOSE_INVALID_ENCODING extends StObject
  @scala.inline
  def ERR_JOSE_INVALID_ENCODING: ERR_JOSE_INVALID_ENCODING = "ERR_JOSE_INVALID_ENCODING".asInstanceOf[ERR_JOSE_INVALID_ENCODING]
  
  @js.native
  sealed trait ERR_JOSE_MULTIPLE_ERRORS extends StObject
  @scala.inline
  def ERR_JOSE_MULTIPLE_ERRORS: ERR_JOSE_MULTIPLE_ERRORS = "ERR_JOSE_MULTIPLE_ERRORS".asInstanceOf[ERR_JOSE_MULTIPLE_ERRORS]
  
  @js.native
  sealed trait ERR_JOSE_NOT_SUPPORTED extends StObject
  @scala.inline
  def ERR_JOSE_NOT_SUPPORTED: ERR_JOSE_NOT_SUPPORTED = "ERR_JOSE_NOT_SUPPORTED".asInstanceOf[ERR_JOSE_NOT_SUPPORTED]
  
  @js.native
  sealed trait ERR_JWE_DECRYPTION_FAILED extends StObject
  @scala.inline
  def ERR_JWE_DECRYPTION_FAILED: ERR_JWE_DECRYPTION_FAILED = "ERR_JWE_DECRYPTION_FAILED".asInstanceOf[ERR_JWE_DECRYPTION_FAILED]
  
  @js.native
  sealed trait ERR_JWE_INVALID extends StObject
  @scala.inline
  def ERR_JWE_INVALID: ERR_JWE_INVALID = "ERR_JWE_INVALID".asInstanceOf[ERR_JWE_INVALID]
  
  @js.native
  sealed trait ERR_JWKS_NO_MATCHING_KEY extends StObject
  @scala.inline
  def ERR_JWKS_NO_MATCHING_KEY: ERR_JWKS_NO_MATCHING_KEY = "ERR_JWKS_NO_MATCHING_KEY".asInstanceOf[ERR_JWKS_NO_MATCHING_KEY]
  
  @js.native
  sealed trait ERR_JWK_IMPORT_FAILED extends StObject
  @scala.inline
  def ERR_JWK_IMPORT_FAILED: ERR_JWK_IMPORT_FAILED = "ERR_JWK_IMPORT_FAILED".asInstanceOf[ERR_JWK_IMPORT_FAILED]
  
  @js.native
  sealed trait ERR_JWK_INVALID extends StObject
  @scala.inline
  def ERR_JWK_INVALID: ERR_JWK_INVALID = "ERR_JWK_INVALID".asInstanceOf[ERR_JWK_INVALID]
  
  @js.native
  sealed trait ERR_JWK_KEY_SUPPORT extends StObject
  @scala.inline
  def ERR_JWK_KEY_SUPPORT: ERR_JWK_KEY_SUPPORT = "ERR_JWK_KEY_SUPPORT".asInstanceOf[ERR_JWK_KEY_SUPPORT]
  
  @js.native
  sealed trait ERR_JWS_INVALID extends StObject
  @scala.inline
  def ERR_JWS_INVALID: ERR_JWS_INVALID = "ERR_JWS_INVALID".asInstanceOf[ERR_JWS_INVALID]
  
  @js.native
  sealed trait ERR_JWS_VERIFICATION_FAILED extends StObject
  @scala.inline
  def ERR_JWS_VERIFICATION_FAILED: ERR_JWS_VERIFICATION_FAILED = "ERR_JWS_VERIFICATION_FAILED".asInstanceOf[ERR_JWS_VERIFICATION_FAILED]
  
  @js.native
  sealed trait ERR_JWT_EXPIRED extends StObject
  @scala.inline
  def ERR_JWT_EXPIRED: ERR_JWT_EXPIRED = "ERR_JWT_EXPIRED".asInstanceOf[ERR_JWT_EXPIRED]
  
  @js.native
  sealed trait ERR_JWT_MALFORMED extends StObject
  @scala.inline
  def ERR_JWT_MALFORMED: ERR_JWT_MALFORMED = "ERR_JWT_MALFORMED".asInstanceOf[ERR_JWT_MALFORMED]
  
  @js.native
  sealed trait Ed25519
    extends StObject
       with Curves
       with OKPCurve
  @scala.inline
  def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @js.native
  sealed trait Ed448
    extends StObject
       with Curves
       with OKPCurve
  @scala.inline
  def Ed448: Ed448 = "Ed448".asInstanceOf[Ed448]
  
  @js.native
  sealed trait OKP
    extends StObject
       with keyType
  @scala.inline
  def OKP: OKP = "OKP".asInstanceOf[OKP]
  
  @js.native
  sealed trait `P-256`
    extends StObject
       with Curves
       with ECCurve
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  
  @js.native
  sealed trait `P-384`
    extends StObject
       with Curves
       with ECCurve
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  
  @js.native
  sealed trait `P-521`
    extends StObject
       with Curves
       with ECCurve
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  
  @js.native
  sealed trait RSA
    extends StObject
       with keyType
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @js.native
  sealed trait X25519
    extends StObject
       with Curves
       with OKPCurve
  @scala.inline
  def X25519: X25519 = "X25519".asInstanceOf[X25519]
  
  @js.native
  sealed trait X448
    extends StObject
       with Curves
       with OKPCurve
  @scala.inline
  def X448: X448 = "X448".asInstanceOf[X448]
  
  @js.native
  sealed trait check_failed extends StObject
  @scala.inline
  def check_failed: check_failed = "check_failed".asInstanceOf[check_failed]
  
  @js.native
  sealed trait compact extends StObject
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait decrypt
    extends StObject
       with keyOperation
  @scala.inline
  def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  
  @js.native
  sealed trait deriveKey
    extends StObject
       with keyOperation
  @scala.inline
  def deriveKey: deriveKey = "deriveKey".asInstanceOf[deriveKey]
  
  @js.native
  sealed trait embedded extends StObject
  @scala.inline
  def embedded: embedded = "embedded".asInstanceOf[embedded]
  
  @js.native
  sealed trait enc
    extends StObject
       with use
  @scala.inline
  def enc: enc = "enc".asInstanceOf[enc]
  
  @js.native
  sealed trait encrypt
    extends StObject
       with keyOperation
  @scala.inline
  def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  
  @js.native
  sealed trait flattened extends StObject
  @scala.inline
  def flattened: flattened = "flattened".asInstanceOf[flattened]
  
  @js.native
  sealed trait general extends StObject
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  
  @js.native
  sealed trait invalid extends StObject
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait missing extends StObject
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait oct
    extends StObject
       with keyType
  @scala.inline
  def oct: oct = "oct".asInstanceOf[oct]
  
  @js.native
  sealed trait `private`
    extends StObject
       with asymmetricKeyObjectTypes
       with keyObjectTypes
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait prohibited extends StObject
  @scala.inline
  def prohibited: prohibited = "prohibited".asInstanceOf[prohibited]
  
  @js.native
  sealed trait public
    extends StObject
       with asymmetricKeyObjectTypes
       with keyObjectTypes
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait secp256k1
    extends StObject
       with Curves
       with ECCurve
  @scala.inline
  def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
  
  @js.native
  sealed trait secret
    extends StObject
       with keyObjectTypes
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  
  @js.native
  sealed trait sig
    extends StObject
       with use
  @scala.inline
  def sig: sig = "sig".asInstanceOf[sig]
  
  @js.native
  sealed trait sign
    extends StObject
       with keyOperation
  @scala.inline
  def sign: sign = "sign".asInstanceOf[sign]
  
  @js.native
  sealed trait unsecured extends StObject
  @scala.inline
  def unsecured: unsecured = "unsecured".asInstanceOf[unsecured]
  
  @js.native
  sealed trait unspecified extends StObject
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait unwrapKey
    extends StObject
       with keyOperation
  @scala.inline
  def unwrapKey: unwrapKey = "unwrapKey".asInstanceOf[unwrapKey]
  
  @js.native
  sealed trait verify
    extends StObject
       with keyOperation
  @scala.inline
  def verify: verify = "verify".asInstanceOf[verify]
  
  @js.native
  sealed trait wrapKey
    extends StObject
       with keyOperation
  @scala.inline
  def wrapKey: wrapKey = "wrapKey".asInstanceOf[wrapKey]
}
