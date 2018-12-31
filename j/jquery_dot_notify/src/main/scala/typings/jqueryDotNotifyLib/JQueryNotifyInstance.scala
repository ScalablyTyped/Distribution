package typings
package jqueryDotNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyInstance extends js.Object {
  var element: JQuery
  var isOpen: scala.Boolean
  var options: JQueryNotifyOptions
  def close(): scala.Unit
  def open(): scala.Unit
}

