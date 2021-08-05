package typings.grammarkdown

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceMod {
  
  @JSImport("grammarkdown/dist/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDuration(measureName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(measureName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMark(markName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMark")(markName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMarks(): ReadonlyMap[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarks")().asInstanceOf[ReadonlyMap[String, Double]]
  
  inline def getMeasures(): ReadonlyMap[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasures")().asInstanceOf[ReadonlyMap[String, Double]]
  
  inline def mark(markName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(markName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def measure(measureName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def measure(measureName: String, startMark: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def measure(measureName: String, startMark: String, endMark: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def measure(measureName: String, startMark: Unit, endMark: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
