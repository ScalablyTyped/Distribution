package typings.hashChain

import typings.hashChain.hashChainNumbers.`32`
import typings.node.bufferMod.global.Buffer
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Hash Chain implementation using Blake2b.
    *
    * @example
    * import HashChain = require('hash-chain')
    * import * as fs from 'fs'
    *
    * // Persistence
    * var chain = // ...
    * const fd = fs.open('filename')
    * fs.write(fd, chain.offset, 0, 4)
    * fs.write(fd, chain.chain)
    * fs.close(fd)
    *
    * const data = fs.readFile('filename')
    * const chain = new HashChain(data.subarray(4), data.readUInt32LE(0))
    */
  @JSImport("hash-chain", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HashChain {
    def this(chain: Buffer) = this()
    def this(chain: Buffer, /** @default 0 */
    offset: Double) = this()
  }
  @JSImport("hash-chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("hash-chain", "BYTES")
  @js.native
  val BYTES: `32` = js.native
  
  /* static member */
  @JSImport("hash-chain", "SEEDBYTES")
  @js.native
  val SEEDBYTES: `32` = js.native
  
  /**
    * Generate and instantiate a new lazy `HashChain` from a list of anchor points.
    *
    * This will only keep a buffer of dist points in memory, lazily generating missing points as they're accessed.
    *
    * @param anchors The list of anchor points.
    * @param dist Number of elements between each anchor.
    * @param offset The offset for the chain.
    */
  /* static member */
  inline def fromAnchors(anchors: js.Array[Buffer], dist: Double): HashChain = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAnchors")(anchors.asInstanceOf[js.Any], dist.asInstanceOf[js.Any])).asInstanceOf[HashChain]
  inline def fromAnchors(anchors: js.Array[Buffer], dist: Double, /** @default 0 */
  offset: Double): HashChain = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAnchors")(anchors.asInstanceOf[js.Any], dist.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[HashChain]
  
  /**
    * Generate and instantiate a new `HashChain` from `seed`.
    * @param seed The seed buffer. Must be `HashChain.SEEDBYTES` long.
    * @param n Number of elements.
    * @param offset The offset for the chain.
    */
  /* static member */
  inline def generate(seed: Buffer, n: Double): HashChain = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(seed.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[HashChain]
  inline def generate(seed: Buffer, n: Double, /** @default 0 */
  offset: Double): HashChain = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(seed.asInstanceOf[js.Any], n.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[HashChain]
  
  /**
    * Generate a new seed.
    *
    * @param buffer Use an existing buffer instead of allocating a new one.
    */
  /* static member */
  inline def seedgen(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("seedgen")().asInstanceOf[Buffer]
  inline def seedgen(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("seedgen")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* static member */
  inline def verify(hash: Buffer, prev: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Hash Chain implementation using Blake2b.
    *
    * @example
    * import HashChain = require('hash-chain')
    * import * as fs from 'fs'
    *
    * // Persistence
    * var chain = // ...
    * const fd = fs.open('filename')
    * fs.write(fd, chain.offset, 0, 4)
    * fs.write(fd, chain.chain)
    * fs.close(fd)
    *
    * const data = fs.readFile('filename')
    * const chain = new HashChain(data.subarray(4), data.readUInt32LE(0))
    */
  @js.native
  trait HashChain
    extends StObject
       with Iterable[Buffer] {
    
    /**
      * Generate anchor points with `dist` elements between each anchor. This can be used to optimise
      * initialisation of an existing chain at the expense of more disk space.
      *
      * @param dist Number of elements between each anchor.
      */
    def anchors(dist: Double): js.Array[Buffer] = js.native
    
    /** The buffer used in chain. */
    val chain: Buffer = js.native
    
    /**
      * Get the element at `offset` from the `offset` given in the constructor. Normally `HashChain`s
      * only move forward, but giving a negative integer allows you to go back. This does not increment
      * the internal counter.
      *
      * @param offset The offset of the element.
      */
    def get(offset: Double): Buffer = js.native
    
    /** Total number of elements in the chain. */
    val length: Double = js.native
    
    /** The current integer offset. */
    val offset: Double = js.native
  }
}
