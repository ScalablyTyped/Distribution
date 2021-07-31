package typings.imurmurhash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get a hash state object, optionally initialized with the given string and seed.
    * Seed must be a positive integer if provided.
    * Calling this function without the new keyword will return a cached state object that has been reset.
    * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
    * If this constraint cannot be met, you can use new to create a new state object
    */
  @scala.inline
  def apply(): MurmurHash3 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MurmurHash3]
  @scala.inline
  def apply(text: String): MurmurHash3 = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[MurmurHash3]
  @scala.inline
  def apply(text: String, seed: Double): MurmurHash3 = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MurmurHash3]
  @scala.inline
  def apply(text: Unit, seed: Double): MurmurHash3 = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MurmurHash3]
  
  @JSImport("imurmurhash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("imurmurhash", JSImport.Namespace)
  @js.native
  /**
    * Get a hash state object, optionally initialized with the given string and seed.
    * Seed must be a positive integer if provided.
    * Calling this function without the new keyword will return a cached state object that has been reset.
    * This is safe to use as long as the object is only used from a single thread and no other hashes are created while operating on this one.
    * If this constraint cannot be met, you can use new to create a new state object
    */
  class Class ()
    extends StObject
       with MurmurHash3 {
    def this(text: String) = this()
    def this(text: String, seed: Double) = this()
    def this(text: Unit, seed: Double) = this()
  }
  
  @js.native
  trait MurmurHash3 extends StObject {
    
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
}
