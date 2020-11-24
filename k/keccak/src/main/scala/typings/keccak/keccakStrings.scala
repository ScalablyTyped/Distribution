package typings.keccak

import typings.keccak.mod.KeccakAlgorithm
import typings.keccak.mod.Sha3Algorithm
import typings.keccak.mod.ShakeAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keccakStrings {
  
  @scala.inline
  def keccak224: keccak224 = "keccak224".asInstanceOf[keccak224]
  
  @scala.inline
  def keccak256: keccak256 = "keccak256".asInstanceOf[keccak256]
  
  @scala.inline
  def keccak384: keccak384 = "keccak384".asInstanceOf[keccak384]
  
  @scala.inline
  def keccak512: keccak512 = "keccak512".asInstanceOf[keccak512]
  
  @scala.inline
  def `sha3-224`: `sha3-224` = "sha3-224".asInstanceOf[`sha3-224`]
  
  @scala.inline
  def `sha3-256`: `sha3-256` = "sha3-256".asInstanceOf[`sha3-256`]
  
  @scala.inline
  def `sha3-384`: `sha3-384` = "sha3-384".asInstanceOf[`sha3-384`]
  
  @scala.inline
  def `sha3-512`: `sha3-512` = "sha3-512".asInstanceOf[`sha3-512`]
  
  @scala.inline
  def shake128: shake128 = "shake128".asInstanceOf[shake128]
  
  @scala.inline
  def shake256: shake256 = "shake256".asInstanceOf[shake256]
  
  @js.native
  sealed trait keccak224 extends KeccakAlgorithm
  
  @js.native
  sealed trait keccak256 extends KeccakAlgorithm
  
  @js.native
  sealed trait keccak384 extends KeccakAlgorithm
  
  @js.native
  sealed trait keccak512 extends KeccakAlgorithm
  
  @js.native
  sealed trait `sha3-224` extends Sha3Algorithm
  
  @js.native
  sealed trait `sha3-256` extends Sha3Algorithm
  
  @js.native
  sealed trait `sha3-384` extends Sha3Algorithm
  
  @js.native
  sealed trait `sha3-512` extends Sha3Algorithm
  
  @js.native
  sealed trait shake128 extends ShakeAlgorithm
  
  @js.native
  sealed trait shake256 extends ShakeAlgorithm
}
