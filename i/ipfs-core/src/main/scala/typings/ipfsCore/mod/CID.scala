package typings.ipfsCore.mod

import org.scalablytyped.runtime.Instantiable3
import typings.cids.mod.CIDVersion
import typings.cids.mod.^
import typings.std.Record
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src", "CID")
@js.native
class CID protected () extends ^ {
  /**
    * Create a new CID.
    *
    * The algorithm for argument input is roughly:
    * ```
    * if (cid)
    *   -> create a copy
    * else if (str)
    *   if (1st char is on multibase table) -> CID String
    *   else -> bs58 encoded multihash
    * else if (Uint8Array)
    *   if (1st byte is 0 or 1) -> CID
    *   else -> multihash
    * else if (Number)
    *   -> construct CID by parts
    * ```
    *
    * @example
    * new CID(<version>, <codec>, <multihash>, <multibaseName>)
    * new CID(<cidStr>)
    * new CID(<cid.bytes>)
    * new CID(<multihash>)
    * new CID(<bs58 encoded multihash>)
    * new CID(<cid>)
    */
  def this(version: CIDVersion, codec: String, multhash: Uint8Array) = this()
}
@JSImport("ipfs-core/dist/src", "CID")
@js.native
object CID extends Instantiable3[/* version */ CIDVersion, /* codec */ String, /* multhash */ Uint8Array, ^] {
  
  var codecs: Record[String, Double] = js.native
  
  def isCID(mixed: js.Any): /* is cids.cids.CID */ Boolean = js.native
  
  /**
    * Test if the given input is a valid CID object.
    * Throws if it is not.
    *
    * @param other The other CID.
    */
  def validateCID(other: js.Any): Unit = js.native
}
