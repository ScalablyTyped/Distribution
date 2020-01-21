package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.onPreStart
  - typings.hapiHapi.hapiHapiStrings.onPostStart
  - typings.hapiHapi.hapiHapiStrings.onPreStop
  - typings.hapiHapi.hapiHapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typings.hapiHapi.hapiHapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typings.hapiHapi.hapiHapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typings.hapiHapi.hapiHapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typings.hapiHapi.hapiHapiStrings.onPreStop = this.cast("onPreStop")
}

