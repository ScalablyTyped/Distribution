package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.onPreStart
  - typings.atHapiHapi.atHapiHapiStrings.onPostStart
  - typings.atHapiHapi.atHapiHapiStrings.onPreStop
  - typings.atHapiHapi.atHapiHapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typings.atHapiHapi.atHapiHapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typings.atHapiHapi.atHapiHapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typings.atHapiHapi.atHapiHapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typings.atHapiHapi.atHapiHapiStrings.onPreStop = this.cast("onPreStop")
}

