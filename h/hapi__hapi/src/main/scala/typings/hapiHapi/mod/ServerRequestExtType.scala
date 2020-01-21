package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.onRequest
  - typings.hapiHapi.hapiHapiStrings.onPreAuth
  - typings.hapiHapi.hapiHapiStrings.onCredentials
  - typings.hapiHapi.hapiHapiStrings.onPostAuth
  - typings.hapiHapi.hapiHapiStrings.onPreHandler
  - typings.hapiHapi.hapiHapiStrings.onPostHandler
  - typings.hapiHapi.hapiHapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typings.hapiHapi.hapiHapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typings.hapiHapi.hapiHapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typings.hapiHapi.hapiHapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typings.hapiHapi.hapiHapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typings.hapiHapi.hapiHapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typings.hapiHapi.hapiHapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typings.hapiHapi.hapiHapiStrings.onRequest = this.cast("onRequest")
}

