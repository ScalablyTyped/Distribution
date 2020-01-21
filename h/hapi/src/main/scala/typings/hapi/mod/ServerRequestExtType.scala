package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.onRequest
  - typings.hapi.hapiStrings.onPreAuth
  - typings.hapi.hapiStrings.onCredentials
  - typings.hapi.hapiStrings.onPostAuth
  - typings.hapi.hapiStrings.onPreHandler
  - typings.hapi.hapiStrings.onPostHandler
  - typings.hapi.hapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typings.hapi.hapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typings.hapi.hapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typings.hapi.hapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typings.hapi.hapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typings.hapi.hapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typings.hapi.hapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typings.hapi.hapiStrings.onRequest = this.cast("onRequest")
}

