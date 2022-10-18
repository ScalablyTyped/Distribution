package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersNumberMod {
  
  @JSImport("handsontable/helpers/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Any, additionalDelimiters: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any], additionalDelimiters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumericLike(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rangeEach(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeEach")(rangeFrom.asInstanceOf[js.Any], rangeTo.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rangeEachReverse(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeEachReverse")(rangeFrom.asInstanceOf[js.Any], rangeTo.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def valueAccordingPercent(value: Double, percent: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("valueAccordingPercent")(value.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def valueAccordingPercent(value: Double, percent: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("valueAccordingPercent")(value.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Double]
}
