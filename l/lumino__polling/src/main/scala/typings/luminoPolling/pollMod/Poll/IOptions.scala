package typings.luminoPolling.pollMod.Poll

import typings.luminoPolling.anon.PartialFrequency
import typings.luminoPolling.mod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait IOptions[T, U, V /* <: String */] extends js.Object {
  
  /**
    * Whether to begin polling automatically; defaults to `true`.
    */
  var auto: js.UndefOr[Boolean] = js.native
  
  /**
    * A factory function that is passed a poll tick and returns a poll promise.
    */
  def factory(state: State[T, U, V]): js.Promise[T] = js.native
  /**
    * A factory function that is passed a poll tick and returns a poll promise.
    */
  @JSName("factory")
  var factory_Original: Factory[T, U, V] = js.native
  
  /**
    * The polling frequency parameters.
    */
  var frequency: js.UndefOr[PartialFrequency] = js.native
  
  /**
    * The name of the poll.
    * Defaults to `'unknown'`.
    */
  var name: js.UndefOr[String] = js.native
  
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
  var standby: js.UndefOr[Standby | (js.Function0[Boolean | Standby])] = js.native
}
