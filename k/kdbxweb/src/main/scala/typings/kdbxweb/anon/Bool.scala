package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bool extends js.Object {
  var Bool: Double = js.native
  var Bytes: Double = js.native
  var Int32: Double = js.native
  var Int64: Double = js.native
  var String: Double = js.native
  var UInt32: Double = js.native
  var UInt64: Double = js.native
}

object Bool {
  @scala.inline
  def apply(
    Bool: Double,
    Bytes: Double,
    Int32: Double,
    Int64: Double,
    String: Double,
    UInt32: Double,
    UInt64: Double
  ): Bool = {
    val __obj = js.Dynamic.literal(Bool = Bool.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], Int32 = Int32.asInstanceOf[js.Any], Int64 = Int64.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], UInt32 = UInt32.asInstanceOf[js.Any], UInt64 = UInt64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bool]
  }
  @scala.inline
  implicit class BoolOps[Self <: Bool] (val x: Self) extends AnyVal {
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
    def setBool(value: Double): Self = this.set("Bool", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes(value: Double): Self = this.set("Bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt32(value: Double): Self = this.set("Int32", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt64(value: Double): Self = this.set("Int64", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: Double): Self = this.set("String", value.asInstanceOf[js.Any])
    @scala.inline
    def setUInt32(value: Double): Self = this.set("UInt32", value.asInstanceOf[js.Any])
    @scala.inline
    def setUInt64(value: Double): Self = this.set("UInt64", value.asInstanceOf[js.Any])
  }
  
}

