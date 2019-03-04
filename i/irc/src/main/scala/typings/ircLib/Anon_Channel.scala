package typings
package ircLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: Anon_Idlength
  var kicklength: scala.Double
  var maxlist: js.Array[scala.Double]
  var maxtargets: js.Array[java.lang.String]
  var modes: scala.Double
  var nicklength: scala.Double
  var topiclength: scala.Double
  var usermodes: java.lang.String
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: Anon_Idlength,
    kicklength: scala.Double,
    maxlist: js.Array[scala.Double],
    maxtargets: js.Array[java.lang.String],
    modes: scala.Double,
    nicklength: scala.Double,
    topiclength: scala.Double,
    usermodes: java.lang.String
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, kicklength = kicklength, maxlist = maxlist, maxtargets = maxtargets, modes = modes, nicklength = nicklength, topiclength = topiclength, usermodes = usermodes)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

