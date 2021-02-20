package typings.jssip

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def debug(namespace: java.lang.String): js.Any = typings.jssip.mod.^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def name: java.lang.String = typings.jssip.mod.^.asInstanceOf[js.Dynamic].selectDynamic("name").asInstanceOf[java.lang.String]
  
  @scala.inline
  def version: java.lang.String = typings.jssip.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
