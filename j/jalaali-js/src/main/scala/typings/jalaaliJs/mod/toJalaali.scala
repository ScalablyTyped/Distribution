package typings.jalaaliJs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jalaali-js", "toJalaali")
@js.native
object toJalaali extends js.Object {
  
  def apply(date: Date): JalaaliDateObject = js.native
  def apply(gy: Double, gm: Double, gd: Double): JalaaliDateObject = js.native
}
