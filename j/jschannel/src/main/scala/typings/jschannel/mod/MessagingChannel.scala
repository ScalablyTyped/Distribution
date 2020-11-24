package typings.jschannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingChannel extends js.Object {
  
  def bind(method: String): MessagingChannel = js.native
  def bind(method: String, callback: js.UndefOr[scala.Nothing], doNotPublish: Boolean): MessagingChannel = js.native
  def bind(
    method: String,
    callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, Unit]
  ): MessagingChannel = js.native
  def bind(
    method: String,
    callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, Unit],
    doNotPublish: Boolean
  ): MessagingChannel = js.native
  
  def call(message: Message): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def notify(message: Message): Unit = js.native
  
  def unbind(method: String): Boolean = js.native
  def unbind(method: String, doNotPublish: Boolean): Boolean = js.native
}
