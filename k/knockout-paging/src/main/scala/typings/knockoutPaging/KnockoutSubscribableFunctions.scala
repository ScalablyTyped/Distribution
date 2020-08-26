package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  def notifySubscribers(): Unit = js.native
  def notifySubscribers(valueToWrite: T): Unit = js.native
  def notifySubscribers(valueToWrite: T, event: String): Unit = js.native
  def notifySubscribers(valueToWrite: js.UndefOr[scala.Nothing], event: String): Unit = js.native
}

