package typings.javascriptTimeAgo

import typings.javascriptTimeAgo.gradationMod.Gradation
import typings.javascriptTimeAgo.gradationMod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradationHelpersMod {
  
  @JSImport("javascript-time-ago/gradation/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("javascript-time-ago/gradation/helpers", "day")
  @js.native
  val day: Double = js.native
  
  inline def getDate(value: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getDate(value: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStep")(gradation.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Gradation]]
  
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
