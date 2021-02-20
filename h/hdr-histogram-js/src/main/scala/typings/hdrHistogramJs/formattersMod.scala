package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("hdr-histogram-js/formatters", "floatFormatter")
  @js.native
  def floatFormatter(size: Double, fractionDigits: Double): js.Function1[/* float */ Double, String] = js.native
  
  @JSImport("hdr-histogram-js/formatters", "integerFormatter")
  @js.native
  def integerFormatter(size: Double): js.Function1[/* integer */ Double, String] = js.native
}
