package typings.keya

import typings.keya.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("keya/out/core/Store", JSImport.Default)
  @js.native
  abstract class default[T] protected ()
    extends StObject
       with Store[T] {
    def this(name: String) = this()
  }
  
  type HydrateFunction[T] = js.Function1[/* stored */ String, js.Promise[T] | T]
  
  @js.native
  trait Store[T] extends StObject {
    
    def all(): js.Promise[js.Array[Key[T]]] = js.native
    
    /**
      * Deletes all elements from a store
      */
    def clear(): js.Promise[js.Array[Boolean]] = js.native
    
    def delete(key: String): js.Promise[Boolean] = js.native
    
    /**
      * Iterates through each element
      * @param callback Handles each function
      */
    def forEach(callback: js.Function3[/* value */ T, /* key */ String, /* store */ Store[T], Unit]): js.Promise[Unit] = js.native
    
    def get(key: String): js.Promise[T | Null] = js.native
    
    def has(key: String): js.Promise[Boolean] = js.native
    
    def hydrate(stored: String): js.Promise[T] | T = js.native
    @JSName("hydrate")
    var hydrate_Original: HydrateFunction[T] = js.native
    
    var name: String = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    def set(key: String, value: T): js.Promise[Boolean] = js.native
    
    def stringify(prepared: T): js.Promise[String] | String = js.native
    @JSName("stringify")
    var stringify_Original: StringifyFunction[T] = js.native
    
    var version: Double = js.native
  }
  
  type StringifyFunction[T] = js.Function1[/* prepared */ T, js.Promise[String] | String]
}
