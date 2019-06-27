package typings
package k6Lib.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Available without importing
@JSGlobalScope
@js.native
object Global extends js.Object {
  // Init context and VU body
  val __ENV: js.Object = js.native
  val __ITER: scala.Double = js.native
  val __VU: scala.Double = js.native
  // VU body only
  var console: k6Lib.globalMod.Console = js.native
  // Init context only
  def open(filePath: java.lang.String): java.lang.String = js.native
  @JSName("open")
  def open_b(filePath: java.lang.String, mode: k6Lib.k6LibStrings.b): k6Lib.k6Mod.bytes = js.native
}

