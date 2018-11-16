package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Transport extends js.Object {
  def abort(): scala.Unit
  def send(headers: PlainObject[_], completeCallback: jqueryLib.JQueryNs.TransportNs.SuccessCallback): scala.Unit
}

