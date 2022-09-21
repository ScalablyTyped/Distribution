package typings.materialAnimation

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationframeMod {
  
  @JSImport("@material/animation/animationframe", "AnimationFrame")
  @js.native
  open class AnimationFrame () extends StObject {
    
    /**
      * Cancels a queued callback with the given key.
      * @param {string} key The key for this callback.
      */
    def cancel(key: String): Unit = js.native
    
    /**
      * Cancels all queued callback.
      */
    def cancelAll(): Unit = js.native
    
    /**
      * Returns the queue of unexecuted callback keys.
      */
    def getQueue(): js.Array[String] = js.native
    
    /* private */ val rafIDs: Any = js.native
    
    /**
      * Requests an animation frame. Cancels any existing frame with the same key.
      * @param {string} key The key for this callback.
      * @param {FrameRequestCallback} callback The callback to be executed.
      */
    def request(key: String, callback: FrameRequestCallback): Unit = js.native
  }
}
