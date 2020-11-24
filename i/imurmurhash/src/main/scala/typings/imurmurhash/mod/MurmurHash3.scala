package typings.imurmurhash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MurmurHash3 extends js.Object {
  
  /**
    * Incrementally add string to the hash.
    * This can be called as many times as you want for the hash state object, including after a call to result()
    */
  def hash(value: String): this.type = js.native
  
  /**
    * Reset the state object for reuse, optionally using the given seed (defaults to 0 like the constructor). Returns this so calls can be chained.
    * @default 0
    */
  def reset(): this.type = js.native
  def reset(seed: Double): this.type = js.native
  
  /**
    * Get the result of the hash as a 32-bit positive integer.
    * This performs the tail and finalizer portions of the algorithm, but does not store the result in the state object.
    * This means that it is perfectly safe to get results and then continue adding strings via hash.
    */
  def result(): Double = js.native
}
