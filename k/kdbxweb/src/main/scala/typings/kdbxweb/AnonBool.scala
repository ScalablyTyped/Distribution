package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBool extends js.Object {
  var Bool: Double
  var Bytes: Double
  var Int32: Double
  var Int64: Double
  var String: Double
  var UInt32: Double
  var UInt64: Double
}

object AnonBool {
  @scala.inline
  def apply(
    Bool: Double,
    Bytes: Double,
    Int32: Double,
    Int64: Double,
    String: Double,
    UInt32: Double,
    UInt64: Double
  ): AnonBool = {
    val __obj = js.Dynamic.literal(Bool = Bool.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], Int32 = Int32.asInstanceOf[js.Any], Int64 = Int64.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], UInt32 = UInt32.asInstanceOf[js.Any], UInt64 = UInt64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBool]
  }
}

