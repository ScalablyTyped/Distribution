package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageFunctionInternal[T] extends StObject {
  
  def apply(ctx: MessageContext[T]): MessageType[T] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
}
