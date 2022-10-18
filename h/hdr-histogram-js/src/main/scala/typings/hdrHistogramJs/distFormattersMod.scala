package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormattersMod {
  
  @JSImport("hdr-histogram-js/dist/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def floatFormatter(size: Double, fractionDigits: Double): js.Function1[/* float */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("floatFormatter")(size.asInstanceOf[js.Any], fractionDigits.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* float */ Double, String]]
  
  inline def integerFormatter(size: Double): js.Function1[/* integer */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("integerFormatter")(size.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* integer */ Double, String]]
  
  inline def keepSignificantDigits(digits: Double): js.Function1[/* value */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keepSignificantDigits")(digits.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, Double]]
}
