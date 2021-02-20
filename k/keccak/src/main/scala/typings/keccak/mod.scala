package typings.keccak

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: KeccakAlgorithm): Keccak = js.native
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: KeccakAlgorithm, options: TransformOptions): Keccak = js.native
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: Sha3Algorithm): Keccak = js.native
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: Sha3Algorithm, options: TransformOptions): Keccak = js.native
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: ShakeAlgorithm): Shake = js.native
  @JSImport("keccak", JSImport.Default)
  @js.native
  def default(algorithm: ShakeAlgorithm, options: TransformOptions): Shake = js.native
  
  @JSImport("keccak", "Keccak")
  @js.native
  class Keccak protected () extends Transform {
    def this(
      rate: Double,
      capacity: Double,
      delimitedSuffix: Double,
      hashBitLength: Double,
      options: TransformOptions
    ) = this()
    def this(
      rate: Double,
      capacity: Double,
      delimitedSuffix: Null,
      hashBitLength: Double,
      options: TransformOptions
    ) = this()
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    
    def update(data: String): Keccak = js.native
    def update(data: String, encoding: BufferEncoding): Keccak = js.native
    def update(data: Buffer): Keccak = js.native
    def update(data: Buffer, encoding: BufferEncoding): Keccak = js.native
  }
  
  @JSImport("keccak", "Shake")
  @js.native
  class Shake protected () extends Transform {
    def this(rate: Double, capacity: Double, delimitedSuffix: Double, options: TransformOptions) = this()
    def this(rate: Double, capacity: Double, delimitedSuffix: Null, options: TransformOptions) = this()
    
    def squeeze(dataByteLength: Double): Buffer = js.native
    def squeeze(dataByteLength: Double, encoding: BufferEncoding): String = js.native
    
    def update(data: String): Shake = js.native
    def update(data: String, encoding: BufferEncoding): Shake = js.native
    def update(data: Buffer): Shake = js.native
    def update(data: Buffer, encoding: BufferEncoding): Shake = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keccak.keccakStrings.keccak224
    - typings.keccak.keccakStrings.keccak256
    - typings.keccak.keccakStrings.keccak384
    - typings.keccak.keccakStrings.keccak512
  */
  trait KeccakAlgorithm extends StObject
  object KeccakAlgorithm {
    
    @scala.inline
    def keccak224: typings.keccak.keccakStrings.keccak224 = "keccak224".asInstanceOf[typings.keccak.keccakStrings.keccak224]
    
    @scala.inline
    def keccak256: typings.keccak.keccakStrings.keccak256 = "keccak256".asInstanceOf[typings.keccak.keccakStrings.keccak256]
    
    @scala.inline
    def keccak384: typings.keccak.keccakStrings.keccak384 = "keccak384".asInstanceOf[typings.keccak.keccakStrings.keccak384]
    
    @scala.inline
    def keccak512: typings.keccak.keccakStrings.keccak512 = "keccak512".asInstanceOf[typings.keccak.keccakStrings.keccak512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keccak.keccakStrings.`sha3-224`
    - typings.keccak.keccakStrings.`sha3-256`
    - typings.keccak.keccakStrings.`sha3-384`
    - typings.keccak.keccakStrings.`sha3-512`
  */
  trait Sha3Algorithm extends StObject
  object Sha3Algorithm {
    
    @scala.inline
    def `sha3-224`: typings.keccak.keccakStrings.`sha3-224` = "sha3-224".asInstanceOf[typings.keccak.keccakStrings.`sha3-224`]
    
    @scala.inline
    def `sha3-256`: typings.keccak.keccakStrings.`sha3-256` = "sha3-256".asInstanceOf[typings.keccak.keccakStrings.`sha3-256`]
    
    @scala.inline
    def `sha3-384`: typings.keccak.keccakStrings.`sha3-384` = "sha3-384".asInstanceOf[typings.keccak.keccakStrings.`sha3-384`]
    
    @scala.inline
    def `sha3-512`: typings.keccak.keccakStrings.`sha3-512` = "sha3-512".asInstanceOf[typings.keccak.keccakStrings.`sha3-512`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keccak.keccakStrings.shake128
    - typings.keccak.keccakStrings.shake256
  */
  trait ShakeAlgorithm extends StObject
  object ShakeAlgorithm {
    
    @scala.inline
    def shake128: typings.keccak.keccakStrings.shake128 = "shake128".asInstanceOf[typings.keccak.keccakStrings.shake128]
    
    @scala.inline
    def shake256: typings.keccak.keccakStrings.shake256 = "shake256".asInstanceOf[typings.keccak.keccakStrings.shake256]
  }
}
