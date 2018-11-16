package typings
package linqsharpLib.linqsharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Wrapper class for an array that provides Linq functionallity.
     *
     * @class Linq<T>
     */
@JSImport("linqsharp", JSImport.Default)
@js.native
class default[T] () extends Linq[T] {
  /**
           * Creates a new instance holding an array of <T>.
           * @constructor
           *
           * @param {Array} a Array.
           */
  def this(a: js.Array[T]) = this()
}

