package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bool extends js.Object {
  var Bool: Double
  var Bytes: Double
  var Int32: Double
  var Int64: Double
  var String: Double
  var UInt32: Double
  var UInt64: Double
}

object Anon_Bool {
  @scala.inline
  def apply(
    Bool: Double,
    Bytes: Double,
    Int32: Double,
    Int64: Double,
    String: Double,
    UInt32: Double,
    UInt64: Double
  ): Anon_Bool = {
    val __obj = js.Dynamic.literal(Bool = Bool, Bytes = Bytes, Int32 = Int32, Int64 = Int64, String = String, UInt32 = UInt32, UInt64 = UInt64)
  
    __obj.asInstanceOf[Anon_Bool]
  }
}

