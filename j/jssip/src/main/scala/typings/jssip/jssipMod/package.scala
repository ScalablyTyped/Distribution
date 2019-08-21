package typings.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jssipMod {
  import typings.std.DOMError

  type EventHandler[T] = js.Function1[/* e */ EventValue[T], Unit]
  type SessionCreateAnswerFailedEvent = DOMError
  type SessionCreateOfferFailedEvent = DOMError
  type SessionSetLocalDescriptionFailedEvent = DOMError
  type SessionSetRemoteDescriptionFailedEvent = DOMError
  type SessionUserMediaFailedEvent = DOMError
}
