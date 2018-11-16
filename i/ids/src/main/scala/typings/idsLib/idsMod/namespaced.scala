package typings
package idsLib.idsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ids", JSImport.Namespace)
@js.native
class namespaced () extends Ids {
  /**
     * Create a new id generator / cache instance.
     *
     * You may optionally provide a seed that is used internally.
     *
     * @param {Seed} [seed]
     */
  def this(seed: idsLib.Seed) = this()
}

