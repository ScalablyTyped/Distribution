package typings.ipldBlock.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an immutable block of data that is uniquely referenced with a cid.
  *
  * @example
  * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
  */
@JSImport("ipld-block/dist/src", JSImport.Namespace)
@js.native
class ^ protected () extends Block {
  /**
    * @param {Uint8Array} data - The data to be stored in the block as a Uint8Array.
    * @param {CID} cid - The cid of the data
    */
  def this(data: Uint8Array, cid: typings.cids.mod.^) = this()
}
@JSImport("ipld-block/dist/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Check if the given value is a Block.
    *
    * @param {any} other
    * @returns {other is Block}
    */
  def isBlock(other: js.Any): /* is ipld-block.ipld-block/dist/src.Block */ Boolean = js.native
}
