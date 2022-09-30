package typings.handsontable

import typings.handsontable.handsontableInts.`-1`
import typings.handsontable.handsontableInts.`0`
import typings.handsontable.handsontableInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureMod {
  
  @JSImport("handsontable/helpers/feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelAnimationFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getComparisonFunction(): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")().asInstanceOf[Comparator]
  inline def getComparisonFunction(language: String): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any]).asInstanceOf[Comparator]
  inline def getComparisonFunction(language: String, options: js.Object): Comparator = (^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Comparator]
  inline def getComparisonFunction(language: Unit, options: js.Object): Comparator = (^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Comparator]
  
  inline def hasCaptionProblem(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCaptionProblem")().asInstanceOf[Boolean]
  
  inline def isClassListSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassListSupported")().asInstanceOf[Boolean]
  
  inline def isGetComputedStyleSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGetComputedStyleSupported")().asInstanceOf[Boolean]
  
  inline def isPassiveEventSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPassiveEventSupported")().asInstanceOf[Boolean]
  
  inline def isTextContentSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentSupported")().asInstanceOf[Boolean]
  
  inline def isTouchSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchSupported")().asInstanceOf[Boolean]
  
  inline def requestAnimationFrame(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Comparator = js.Function2[/* a */ Any, /* b */ Any, `-1` | `0` | `1`]
}
