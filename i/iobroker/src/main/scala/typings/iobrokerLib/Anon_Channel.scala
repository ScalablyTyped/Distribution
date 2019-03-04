package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: java.lang.String
  var device: java.lang.String
  var state: java.lang.String
}

object Anon_Channel {
  @scala.inline
  def apply(channel: java.lang.String, device: java.lang.String, state: java.lang.String): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, device = device, state = state)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

