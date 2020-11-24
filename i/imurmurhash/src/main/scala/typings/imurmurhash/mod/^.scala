package typings.imurmurhash.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (/**
  * Get a hash state object, optionally initialized with the given string and seed.
  * Seed must be a positive integer if provided.
  * Calling this function without the new keyword will return a cached state object that has been reset.
  * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
  * If this constraint cannot be met, you can use new to create a new state object
  */
Instantiable0[MurmurHash3]) with (Instantiable1[/* text */ String, MurmurHash3]) with (Instantiable2[/* text */ String, /* seed */ Double, MurmurHash3]) with (Instantiable2[/* text */ js.UndefOr[scala.Nothing], /* seed */ Double, MurmurHash3])
    ] {
  
  /**
    * Get a hash state object, optionally initialized with the given string and seed.
    * Seed must be a positive integer if provided.
    * Calling this function without the new keyword will return a cached state object that has been reset.
    * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
    * If this constraint cannot be met, you can use new to create a new state object
    */
  def apply(): MurmurHash3 = js.native
  def apply(text: js.UndefOr[scala.Nothing], seed: Double): MurmurHash3 = js.native
  def apply(text: String): MurmurHash3 = js.native
  def apply(text: String, seed: Double): MurmurHash3 = js.native
}
