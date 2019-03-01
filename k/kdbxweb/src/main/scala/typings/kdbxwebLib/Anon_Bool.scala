package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bool extends js.Object {
  var Bool: scala.Double
  var Bytes: scala.Double
  var Int32: scala.Double
  var Int64: scala.Double
  var String: scala.Double
  var UInt32: scala.Double
  var UInt64: scala.Double
}

object Anon_Bool {
  @scala.inline
  def apply(
    Bool: scala.Double,
    Bytes: scala.Double,
    Int32: scala.Double,
    Int64: scala.Double,
    String: scala.Double,
    UInt32: scala.Double,
    UInt64: scala.Double
  ): Anon_Bool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bool")(Bool)
    __obj.updateDynamic("Bytes")(Bytes)
    __obj.updateDynamic("Int32")(Int32)
    __obj.updateDynamic("Int64")(Int64)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("UInt32")(UInt32)
    __obj.updateDynamic("UInt64")(UInt64)
    __obj.asInstanceOf[Anon_Bool]
  }
}

