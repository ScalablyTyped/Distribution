package typings.libraCore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("futoin-hkdf", JSImport.Default)
  @js.native
  def default(ikm: BuffString, outputLen: Double, options: js.Object): Buffer = js.native
  
  @JSImport("futoin-hkdf", "expand")
  @js.native
  def expand(hashAlgo: String, hashLen: Double, prk: BuffString, outputLen: Double, info: BuffString): Buffer = js.native
  
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString): Buffer = js.native
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString, salt: BuffString): Buffer = js.native
  
  @JSImport("futoin-hkdf", "hash_length")
  @js.native
  def hashLength(hash: String): Double = js.native
}
