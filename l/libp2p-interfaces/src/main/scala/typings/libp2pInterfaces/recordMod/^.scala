package typings.libp2pInterfaces.recordMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record is the base implementation of a record that can be used as the payload of a libp2p envelope.
  */
@JSImport("libp2p-interfaces/src/record", JSImport.Namespace)
@js.native
class ^ protected () extends Record {
  /**
    * @constructor
    * @param {String} domain signature domain
    * @param {Uint8Array} codec identifier of the type of record
    */
  def this(domain: String, codec: Uint8Array) = this()
}
