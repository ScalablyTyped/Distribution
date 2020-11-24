package typings.libp2pCrypto

import typings.libp2pCrypto.mod.CipherType
import typings.libp2pCrypto.mod.CurveType
import typings.libp2pCrypto.mod.HashType
import typings.libp2pCrypto.mod.KeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pCryptoStrings {
  
  @scala.inline
  def `AES-128`: `AES-128` = "AES-128".asInstanceOf[`AES-128`]
  
  @scala.inline
  def `AES-256`: `AES-256` = "AES-256".asInstanceOf[`AES-256`]
  
  @scala.inline
  def Blowfish: Blowfish = "Blowfish".asInstanceOf[Blowfish]
  
  @scala.inline
  def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @scala.inline
  def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @scala.inline
  def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @scala.inline
  def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @scala.inline
  def `pkcs-8`: `pkcs-8` = "pkcs-8".asInstanceOf[`pkcs-8`]
  
  @scala.inline
  def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
  
  @js.native
  sealed trait `AES-128` extends CipherType
  
  @js.native
  sealed trait `AES-256` extends CipherType
  
  @js.native
  sealed trait Blowfish extends CipherType
  
  @js.native
  sealed trait Ed25519 extends KeyType
  
  @js.native
  sealed trait `P-256` extends CurveType
  
  @js.native
  sealed trait `P-384` extends CurveType
  
  @js.native
  sealed trait `P-521` extends CurveType
  
  @js.native
  sealed trait RSA extends KeyType
  
  @js.native
  sealed trait SHA1 extends HashType
  
  @js.native
  sealed trait SHA256 extends HashType
  
  @js.native
  sealed trait SHA512 extends HashType
  
  @js.native
  sealed trait `pkcs-8` extends js.Object
  
  @js.native
  sealed trait secp256k1 extends KeyType
}
