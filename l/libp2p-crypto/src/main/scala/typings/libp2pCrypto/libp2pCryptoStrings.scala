package typings.libp2pCrypto

import typings.libp2pCrypto.mod.CipherType
import typings.libp2pCrypto.mod.CurveType
import typings.libp2pCrypto.mod.HashType
import typings.libp2pCrypto.mod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pCryptoStrings {
  
  @js.native
  sealed trait `AES-128`
    extends StObject
       with CipherType
  @scala.inline
  def `AES-128`: `AES-128` = "AES-128".asInstanceOf[`AES-128`]
  
  @js.native
  sealed trait `AES-256`
    extends StObject
       with CipherType
  @scala.inline
  def `AES-256`: `AES-256` = "AES-256".asInstanceOf[`AES-256`]
  
  @js.native
  sealed trait Blowfish
    extends StObject
       with CipherType
  @scala.inline
  def Blowfish: Blowfish = "Blowfish".asInstanceOf[Blowfish]
  
  @js.native
  sealed trait Ed25519
    extends StObject
       with KeyType
  @scala.inline
  def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @js.native
  sealed trait `P-256`
    extends StObject
       with CurveType
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  
  @js.native
  sealed trait `P-384`
    extends StObject
       with CurveType
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  
  @js.native
  sealed trait `P-521`
    extends StObject
       with CurveType
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  
  @js.native
  sealed trait RSA
    extends StObject
       with KeyType
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @js.native
  sealed trait SHA1
    extends StObject
       with HashType
  @scala.inline
  def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @js.native
  sealed trait SHA256
    extends StObject
       with HashType
  @scala.inline
  def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @js.native
  sealed trait SHA512
    extends StObject
       with HashType
  @scala.inline
  def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @js.native
  sealed trait `pkcs-8` extends StObject
  @scala.inline
  def `pkcs-8`: `pkcs-8` = "pkcs-8".asInstanceOf[`pkcs-8`]
  
  @js.native
  sealed trait secp256k1
    extends StObject
       with KeyType
  @scala.inline
  def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
}
