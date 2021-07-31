package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regex {
  
  @JSGlobal("KSR.regex")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pcreMatch(string: String, regex: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pcre_match")(string.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def pcreMatchGroup(string: String, num_pcre: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pcre_match_group")(string.asInstanceOf[js.Any], num_pcre.asInstanceOf[js.Any])).asInstanceOf[Double]
}
