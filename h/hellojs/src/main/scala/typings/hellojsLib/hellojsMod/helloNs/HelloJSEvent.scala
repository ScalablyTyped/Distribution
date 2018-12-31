package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEvent extends js.Object {
  def emit(event: java.lang.String, data: js.Any): HelloJSStatic
  def emitAfter(): HelloJSStatic
  def findEvents(
    event: java.lang.String,
    callback: js.Function2[/* name */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ): scala.Unit
  def off(event: java.lang.String, callback: js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]): HelloJSStatic
  def on(event: java.lang.String, callback: js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]): HelloJSStatic
}

