package typings.graphqlBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  var Boolean: String = js.native
  var DateTime: String = js.native
  var Float: String = js.native
  var ID: String = js.native
  var Int: String = js.native
  var String: java.lang.String = js.native
}

object Boolean {
  @scala.inline
  def apply(Boolean: String, DateTime: String, Float: String, ID: String, Int: String, String: String): Boolean = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
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
    def setBoolean(value: String): Self = this.set("Boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime(value: String): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat(value: String): Self = this.set("Float", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt(value: String): Self = this.set("Int", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("String", value.asInstanceOf[js.Any])
  }
  
}

