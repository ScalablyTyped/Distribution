package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.onRequest
  - typings.atHapiHapi.atHapiHapiStrings.onPreAuth
  - typings.atHapiHapi.atHapiHapiStrings.onCredentials
  - typings.atHapiHapi.atHapiHapiStrings.onPostAuth
  - typings.atHapiHapi.atHapiHapiStrings.onPreHandler
  - typings.atHapiHapi.atHapiHapiStrings.onPostHandler
  - typings.atHapiHapi.atHapiHapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typings.atHapiHapi.atHapiHapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typings.atHapiHapi.atHapiHapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typings.atHapiHapi.atHapiHapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typings.atHapiHapi.atHapiHapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typings.atHapiHapi.atHapiHapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typings.atHapiHapi.atHapiHapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typings.atHapiHapi.atHapiHapiStrings.onRequest = this.cast("onRequest")
}

