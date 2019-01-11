package typings
package jpmLib.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemContext
  extends stdLib.Array[Context] {
  // a list of Context that also has add, remove methods
  def add(context: Context): scala.Unit = js.native
  def remove(context: Context): scala.Unit = js.native
}

