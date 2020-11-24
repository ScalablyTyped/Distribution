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
@js.native
trait Block extends js.Object {
  
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
