package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingChannel extends js.Object {
  def bind(method: java.lang.String): MessagingChannel = js.native
  def bind(
    method: java.lang.String,
    callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, scala.Unit]
  ): MessagingChannel = js.native
  def bind(
    method: java.lang.String,
    callback: js.Function2[/* transaction */ MessageTransaction, /* params */ js.Any, scala.Unit],
    doNotPublish: scala.Boolean
  ): MessagingChannel = js.native
  def call(message: Message): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def notify(message: Message): scala.Unit = js.native
  def unbind(method: java.lang.String): scala.Boolean = js.native
  def unbind(method: java.lang.String, doNotPublish: scala.Boolean): scala.Boolean = js.native
}

