package typings.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHandler[T] = js.Function1[/* e */ T, scala.Unit]
  
  type SessionCreateAnswerFailedEvent = typings.std.DOMError
  
  type SessionCreateOfferFailedEvent = typings.std.DOMError
  
  type SessionSetLocalDescriptionFailedEvent = typings.std.DOMError
  
  type SessionSetRemoteDescriptionFailedEvent = typings.std.DOMError
  
  type SessionUserMediaFailedEvent = typings.std.DOMError
}
