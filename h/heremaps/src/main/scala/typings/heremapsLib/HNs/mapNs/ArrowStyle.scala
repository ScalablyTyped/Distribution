package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents style attributes for arrows to be rendered along a polyline. A ArrowStyle instance is always treated as immutable to avoid inconstiencies and must not modified.
  */
@JSGlobal("H.map.ArrowStyle")
@js.native
/**
  * Constructor
  * @param opt_options {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=}
  */
class ArrowStyle () extends js.Object {
  def this(opt_options: ArrowStyle) = this()
  def this(opt_options: heremapsLib.HNs.mapNs.ArrowStyleNs.Options) = this()
  /**
    * This method checks value-equality with another arrow style.
    * @param other {(H.map.ArrowStyle | H.map.ArrowStyle.Options)} - the arrow style to compare with
    * @returns {boolean} - true if the arrow styles are value-equal, otherwise false
    */
  def equals(other: ArrowStyle): scala.Boolean = js.native
  def equals(other: heremapsLib.HNs.mapNs.ArrowStyleNs.Options): scala.Boolean = js.native
}

