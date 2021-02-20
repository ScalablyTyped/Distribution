package typings.javascriptTimeAgo

import typings.javascriptTimeAgo.gradationMod.Gradation
import typings.javascriptTimeAgo.gradationMod.Unit
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("javascript-time-ago/gradation/helpers", "day")
  @js.native
  val day: Double = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "getDate")
  @js.native
  def getDate(value: Double): Date = js.native
  @JSImport("javascript-time-ago/gradation/helpers", "getDate")
  @js.native
  def getDate(value: Date): Date = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "getStep")
  @js.native
  def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "hour")
  @js.native
  val hour: Double = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "minute")
  @js.native
  val minute: Double = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "month")
  @js.native
  val month: Double = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "year")
  @js.native
  val year: Double = js.native
}
