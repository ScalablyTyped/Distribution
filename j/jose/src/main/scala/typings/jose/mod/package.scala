package typings.jose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.jose.mod.ProduceKeyInput
    - typings.jose.mod.JWKS.KeyStore
  */
  type ConsumeKeyInput = typings.jose.mod._ConsumeKeyInput | typings.node.cryptoMod.KeyObject | typings.jose.mod.KeyInput
  
  type ConsumeKeyInputWithNone = typings.jose.mod.ConsumeKeyInput | typings.jose.mod.NoneKey
  
  type EmbeddedJWK = typings.jose.mod.JWK.EmbeddedJWK
  
  type EmbeddedVerifyKeys = typings.jose.mod.EmbeddedJWK | typings.jose.mod.EmbeddedX5C
  
  type EmbeddedX5C = typings.jose.mod.JWK.EmbeddedX5C
  
  type KeyInput = typings.node.cryptoMod.PrivateKeyInput | typings.node.cryptoMod.PublicKeyInput | java.lang.String | typings.node.Buffer
  
  type NoneKey = typings.jose.mod.JWK.NoneKey
  
  /* Rewritten from type alias, can be one of: 
    - typings.jose.mod.JWK.Key
    - typings.node.cryptoMod.KeyObject
    - typings.jose.mod.KeyInput
    - typings.jose.mod.JWKOctKey
    - typings.jose.mod.JWKRSAKey
    - typings.jose.mod.JWKECKey
    - typings.jose.mod.JWKOKPKey
  */
  type ProduceKeyInput = typings.jose.mod._ProduceKeyInput | typings.node.cryptoMod.KeyObject | typings.jose.mod.KeyInput
  
  type ProduceKeyInputWithNone = typings.jose.mod.ProduceKeyInput | typings.jose.mod.NoneKey
}
