package typings.irc.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idlength extends js.Object {
  var idlength: js.Array[String] = js.native
  var length: Double = js.native
  var limit: js.Array[String] = js.native
  var modes: StringDictionary[String] = js.native
  var types: String = js.native
}

object Idlength {
  @scala.inline
  def apply(
    idlength: js.Array[String],
    length: Double,
    limit: js.Array[String],
    modes: StringDictionary[String],
    types: String
  ): Idlength = {
    val __obj = js.Dynamic.literal(idlength = idlength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idlength]
  }
  @scala.inline
  implicit class IdlengthOps[Self <: Idlength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdlengthVarargs(value: String*): Self = this.set("idlength", js.Array(value :_*))
    @scala.inline
    def setIdlength(value: js.Array[String]): Self = this.set("idlength", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimitVarargs(value: String*): Self = this.set("limit", js.Array(value :_*))
    @scala.inline
    def setLimit(value: js.Array[String]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setModes(value: StringDictionary[String]): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

