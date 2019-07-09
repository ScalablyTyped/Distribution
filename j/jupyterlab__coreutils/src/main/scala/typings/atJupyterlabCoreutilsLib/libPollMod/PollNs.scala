package typings
package atJupyterlabCoreutilsLib.libPollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/poll", "Poll")
@js.native
object PollNs extends js.Object {
  /**
    * Instantiation options for polls.
    *
    * @typeparam T - The resolved type of the factory's promises.
    *
    * @typeparam U - The rejected type of the factory's promises.
    *
    * @typeparam V - The type to extend the phases supported by a poll.
    */
  @js.native
  trait IOptions[T, U, V /* <: java.lang.String */] extends js.Object {
    /**
      * Whether to begin polling automatically; defaults to `true`.
      */
    var auto: js.UndefOr[scala.Boolean] = js.native
    /**
      * A factory function that is passed a poll tick and returns a poll promise.
      */
    @JSName("factory")
    var factory_Original: Factory[T, U, V] = js.native
    /**
      * The polling frequency parameters.
      */
    var frequency: js.UndefOr[stdLib.Partial[atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.Frequency]] = js.native
    /**
      * The name of the poll.
      * Defaults to `'unknown'`.
      */
    var name: js.UndefOr[java.lang.String] = js.native
    /**
      * Indicates when the poll switches to standby or a function that returns
      * a boolean or a `Poll.Standby` value to indicate whether to stand by.
      * Defaults to `'when-hidden'`.
      *
      * #### Notes
      * If a function is passed in, for any given context, it should be
      * idempotent and safe to call multiple times. It will be called before each
      * tick execution, but may be called by clients as well.
      */
    var standby: js.UndefOr[Standby | (js.Function0[scala.Boolean | Standby])] = js.native
    /**
      * A factory function that is passed a poll tick and returns a poll promise.
      */
    def factory(state: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]): js.Promise[T] = js.native
  }
  
  /**
    * Indicates when the poll switches to standby.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.never
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.`when-hidden`
  */
  trait Standby extends js.Object
  
  /**
    * An interval value that indicates the poll should tick immediately.
    */
  val IMMEDIATE: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibNumbers.`0` = js.native
  /**
    * Delays are 32-bit integers in many browsers so intervals need to be capped.
    *
    * #### Notes
    * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
    */
  val MAX_INTERVAL: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibNumbers.`2147483647` = js.native
  /**
    * An interval value that indicates the poll should never tick.
    */
  val NEVER: scala.Double = js.native
  /**
    * A promise factory that returns an individual poll request.
    *
    * @typeparam T - The resolved type of the factory's promises.
    *
    * @typeparam U - The rejected type of the factory's promises.
    *
    * @typeparam V - The type to extend the phases supported by a poll.
    */
  type Factory[T, U, V /* <: java.lang.String */] = js.Function1[
    /* state */ atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V], 
    js.Promise[T]
  ]
}

