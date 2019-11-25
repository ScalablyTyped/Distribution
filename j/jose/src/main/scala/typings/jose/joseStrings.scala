package typings.jose

import typings.jose.joseMod.ECCurve
import typings.jose.joseMod.OKPCurve
import typings.jose.joseMod.asymmetricKeyObjectTypes
import typings.jose.joseMod.keyObjectTypes
import typings.jose.joseMod.keyOperation
import typings.jose.joseMod.keyType
import typings.jose.joseMod.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object joseStrings {
  @js.native
  sealed trait EC extends keyType
  
  @js.native
  sealed trait Ed25519 extends OKPCurve
  
  @js.native
  sealed trait Ed448 extends OKPCurve
  
  @js.native
  sealed trait OKP extends keyType
  
  @js.native
  sealed trait `P-256` extends ECCurve
  
  @js.native
  sealed trait `P-384` extends ECCurve
  
  @js.native
  sealed trait `P-521` extends ECCurve
  
  @js.native
  sealed trait RSA extends keyType
  
  @js.native
  sealed trait X25519 extends OKPCurve
  
  @js.native
  sealed trait X448 extends OKPCurve
  
  @js.native
  sealed trait compact extends js.Object
  
  @js.native
  sealed trait decrypt extends keyOperation
  
  @js.native
  sealed trait deriveKey extends keyOperation
  
  @js.native
  sealed trait enc extends use
  
  @js.native
  sealed trait encrypt extends keyOperation
  
  @js.native
  sealed trait flattened extends js.Object
  
  @js.native
  sealed trait general extends js.Object
  
  @js.native
  sealed trait id_token extends js.Object
  
  @js.native
  sealed trait oct extends keyType
  
  @js.native
  sealed trait `private`
    extends asymmetricKeyObjectTypes
       with keyObjectTypes
  
  @js.native
  sealed trait public
    extends asymmetricKeyObjectTypes
       with keyObjectTypes
  
  @js.native
  sealed trait secp256k1 extends ECCurve
  
  @js.native
  sealed trait secret extends keyObjectTypes
  
  @js.native
  sealed trait sig extends use
  
  @js.native
  sealed trait sign extends keyOperation
  
  @js.native
  sealed trait unwrapKey extends keyOperation
  
  @js.native
  sealed trait verify extends keyOperation
  
  @js.native
  sealed trait wrapKey extends keyOperation
  
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
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
  def compact: compact = "compact".asInstanceOf[compact]
  @scala.inline
  def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  @scala.inline
  def deriveKey: deriveKey = "deriveKey".asInstanceOf[deriveKey]
  @scala.inline
  def enc: enc = "enc".asInstanceOf[enc]
  @scala.inline
  def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  @scala.inline
  def flattened: flattened = "flattened".asInstanceOf[flattened]
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  @scala.inline
  def id_token: id_token = "id_token".asInstanceOf[id_token]
  @scala.inline
  def oct: oct = "oct".asInstanceOf[oct]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
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
  def unwrapKey: unwrapKey = "unwrapKey".asInstanceOf[unwrapKey]
  @scala.inline
  def verify: verify = "verify".asInstanceOf[verify]
  @scala.inline
  def wrapKey: wrapKey = "wrapKey".asInstanceOf[wrapKey]
}

