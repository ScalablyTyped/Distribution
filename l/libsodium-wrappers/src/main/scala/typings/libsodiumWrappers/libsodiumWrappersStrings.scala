package typings.libsodiumWrappers

import typings.libsodiumWrappers.mod.KeyType
import typings.libsodiumWrappers.mod.StringOutputFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libsodiumWrappersStrings {
  
  @js.native
  sealed trait base64
    extends StObject
       with StringOutputFormat
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait curve25519
    extends StObject
       with KeyType
  inline def curve25519: curve25519 = "curve25519".asInstanceOf[curve25519]
  
  @js.native
  sealed trait ed25519
    extends StObject
       with KeyType
  inline def ed25519: ed25519 = "ed25519".asInstanceOf[ed25519]
  
  @js.native
  sealed trait hex
    extends StObject
       with StringOutputFormat
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait text
    extends StObject
       with StringOutputFormat
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait uint8array extends StObject
  inline def uint8array: uint8array = "uint8array".asInstanceOf[uint8array]
  
  @js.native
  sealed trait x25519
    extends StObject
       with KeyType
  inline def x25519: x25519 = "x25519".asInstanceOf[x25519]
}
