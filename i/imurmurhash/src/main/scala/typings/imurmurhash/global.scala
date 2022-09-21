package typings.imurmurhash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MurmurHash3 {
    
    /**
      * Get a hash state object, optionally initialized with the given string and seed.
      * Seed must be a positive integer if provided.
      * Calling this function without the new keyword will return a cached state object that has been reset.
      * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
      * If this constraint cannot be met, you can use new to create a new state object
      */
    inline def apply(): typings.imurmurhash.mod.MurmurHash3 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.imurmurhash.mod.MurmurHash3]
    inline def apply(text: String): typings.imurmurhash.mod.MurmurHash3 = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[typings.imurmurhash.mod.MurmurHash3]
    inline def apply(text: String, seed: Double): typings.imurmurhash.mod.MurmurHash3 = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[typings.imurmurhash.mod.MurmurHash3]
    inline def apply(text: Unit, seed: Double): typings.imurmurhash.mod.MurmurHash3 = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[typings.imurmurhash.mod.MurmurHash3]
    
    @JSGlobal("MurmurHash3")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("MurmurHash3")
    @js.native
    /**
      * Get a hash state object, optionally initialized with the given string and seed.
      * Seed must be a positive integer if provided.
      * Calling this function without the new keyword will return a cached state object that has been reset.
      * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
      * If this constraint cannot be met, you can use new to create a new state object
      */
    open class Class ()
      extends StObject
         with typings.imurmurhash.mod.MurmurHash3 {
      def this(text: String) = this()
      def this(text: String, seed: Double) = this()
      def this(text: Unit, seed: Double) = this()
    }
  }
}
