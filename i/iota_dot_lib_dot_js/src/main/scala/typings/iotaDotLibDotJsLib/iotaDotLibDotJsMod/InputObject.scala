package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObject extends js.Object {
  var address: java.lang.String
  var balance: scala.Double
  var keyIndex: scala.Double
  var security: Security
}

object InputObject {
  @scala.inline
  def apply(address: java.lang.String, balance: scala.Double, keyIndex: scala.Double, security: Security): InputObject = {
    val __obj = js.Dynamic.literal(address = address, balance = balance, keyIndex = keyIndex, security = security)
  
    __obj.asInstanceOf[InputObject]
  }
}

