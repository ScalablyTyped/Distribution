package typings.libp2pCrypto

import typings.libp2pCrypto.distSrcKeysMod.KeyTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pCryptoStrings {
  
  @js.native
  sealed trait `AES-128` extends StObject
  inline def `AES-128`: `AES-128` = "AES-128".asInstanceOf[`AES-128`]
  
  @js.native
  sealed trait `AES-256` extends StObject
  inline def `AES-256`: `AES-256` = "AES-256".asInstanceOf[`AES-256`]
  
  @js.native
  sealed trait Blowfish extends StObject
  inline def Blowfish: Blowfish = "Blowfish".asInstanceOf[Blowfish]
  
  @js.native
  sealed trait Ed25519
    extends StObject
       with KeyTypes
  inline def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @js.native
  sealed trait RSA
    extends StObject
       with KeyTypes
  inline def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @js.native
  sealed trait SHA1 extends StObject
  inline def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @js.native
  sealed trait SHA256 extends StObject
  inline def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @js.native
  sealed trait SHA512 extends StObject
  inline def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @js.native
  sealed trait m extends StObject
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait secp256k1
    extends StObject
       with KeyTypes
  inline def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
}
