package typings.imurmurhash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
/**
  * Get a hash state object, optionally initialized with the given string and seed.
  * Seed must be a positive integer if provided.
  * Calling this function without the new keyword will return a cached state object that has been reset.
  * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
  * If this constraint cannot be met, you can use new to create a new state object
  */
class Class () extends MurmurHash3 {
  def this(text: String) = this()
  def this(text: String, seed: Double) = this()
}

