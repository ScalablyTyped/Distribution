package typings.grammarkdown

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceMod {
  
  @JSImport("grammarkdown/dist/performance", "getDuration")
  @js.native
  def getDuration(measureName: String): Double = js.native
  
  @JSImport("grammarkdown/dist/performance", "getMark")
  @js.native
  def getMark(markName: String): Double = js.native
  
  @JSImport("grammarkdown/dist/performance", "getMarks")
  @js.native
  def getMarks(): ReadonlyMap[String, Double] = js.native
  
  @JSImport("grammarkdown/dist/performance", "getMeasures")
  @js.native
  def getMeasures(): ReadonlyMap[String, Double] = js.native
  
  @JSImport("grammarkdown/dist/performance", "mark")
  @js.native
  def mark(markName: String): Unit = js.native
  
  @JSImport("grammarkdown/dist/performance", "measure")
  @js.native
  def measure(measureName: String): Unit = js.native
  @JSImport("grammarkdown/dist/performance", "measure")
  @js.native
  def measure(measureName: String, startMark: js.UndefOr[scala.Nothing], endMark: String): Unit = js.native
  @JSImport("grammarkdown/dist/performance", "measure")
  @js.native
  def measure(measureName: String, startMark: String): Unit = js.native
  @JSImport("grammarkdown/dist/performance", "measure")
  @js.native
  def measure(measureName: String, startMark: String, endMark: String): Unit = js.native
  
  @JSImport("grammarkdown/dist/performance", "reset")
  @js.native
  def reset(): Unit = js.native
}
