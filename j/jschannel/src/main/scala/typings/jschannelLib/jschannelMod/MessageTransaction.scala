package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransaction extends js.Object {
  def complete(result: js.Any): scala.Unit
  def completed(): scala.Boolean
  def delayReturn(delay: scala.Boolean): scala.Boolean
  def error(error: js.Any, message: java.lang.String): scala.Unit
  def invoke(callbackName: java.lang.String, params: js.Any): scala.Unit
}

