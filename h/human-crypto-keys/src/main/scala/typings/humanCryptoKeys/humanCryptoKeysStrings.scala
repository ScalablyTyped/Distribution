package typings.humanCryptoKeys

import typings.humanCryptoKeys.mod.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object humanCryptoKeysStrings {
  
  @js.native
  sealed trait ed25519
    extends StObject
       with Algorithm
  inline def ed25519: ed25519 = "ed25519".asInstanceOf[ed25519]
  
  @js.native
  sealed trait id
    extends StObject
       with Algorithm
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait method
    extends StObject
       with Algorithm
  inline def method: method = "method".asInstanceOf[method]
  
  @js.native
  sealed trait modulusLength
    extends StObject
       with Algorithm
  inline def modulusLength: modulusLength = "modulusLength".asInstanceOf[modulusLength]
  
  @js.native
  sealed trait publicExponent
    extends StObject
       with Algorithm
  inline def publicExponent: publicExponent = "publicExponent".asInstanceOf[publicExponent]
  
  @js.native
  sealed trait rsa
    extends StObject
       with Algorithm
  inline def rsa: rsa = "rsa".asInstanceOf[rsa]
}
