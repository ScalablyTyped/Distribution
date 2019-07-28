package typings.irc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: Anon_Idlength
  var kicklength: Double
  var maxlist: js.Array[Double]
  var maxtargets: js.Array[String]
  var modes: Double
  var nicklength: Double
  var topiclength: Double
  var usermodes: String
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: Anon_Idlength,
    kicklength: Double,
    maxlist: js.Array[Double],
    maxtargets: js.Array[String],
    modes: Double,
    nicklength: Double,
    topiclength: Double,
    usermodes: String
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, kicklength = kicklength, maxlist = maxlist, maxtargets = maxtargets, modes = modes, nicklength = nicklength, topiclength = topiclength, usermodes = usermodes)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

