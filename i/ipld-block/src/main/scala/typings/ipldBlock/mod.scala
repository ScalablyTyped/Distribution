package typings.ipldBlock

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Represents an immutable block of data that is uniquely referenced with a cid.
    *
    * @example
    * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
    */
  @JSImport("ipld-block/dist/src", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Block {
    /**
      * @param {Uint8Array} data - The data to be stored in the block as a Uint8Array.
      * @param {CID} cid - The cid of the data
      */
    def this(data: Uint8Array, cid: typings.cids.mod.^) = this()
  }
  @JSImport("ipld-block/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the given value is a Block.
    *
    * @param {any} other
    * @returns {other is Block}
    */
  /* static member */
  inline def isBlock(other: js.Any): /* is ipld-block.ipld-block/dist/src.Block */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(other.asInstanceOf[js.Any]).asInstanceOf[/* is ipld-block.ipld-block/dist/src.Block */ Boolean]
  
  /**
    * Represents an immutable block of data that is uniquely referenced with a cid.
    *
    * @example
    * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
    */
  @js.native
  trait Block extends StObject {
    
    /**
      * The cid of the data this block represents.
      *
      * @deprecated
      * @type {CID}
      */
    def _cid: typings.cids.mod.^ = js.native
    
    /**
      * The data of this block.
      *
      * @deprecated
      * @type {Uint8Array}
      */
    def _data: Uint8Array = js.native
    
    var cid: typings.cids.mod.^ = js.native
    
    var data: Uint8Array = js.native
    
    var get: js.Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
  }
}
