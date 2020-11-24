package typings.ipfsCore.tlruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time Aware Least Recent Used Cache
  *
  * @see https://arxiv.org/pdf/1801.00390
  * @todo move this to ipfs-utils or it's own package
  *
  * @template T
  * @class TLRU
  */
@JSImport("ipfs-core/dist/src/utils/tlru", JSImport.Namespace)
@js.native
class ^[T] protected () extends TLRU[T] {
  /**
    * Creates an instance of TLRU.
    *
    * @param {number} maxSize
    */
  def this(maxSize: Double) = this()
}
