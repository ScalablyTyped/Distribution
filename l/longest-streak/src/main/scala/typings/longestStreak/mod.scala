package typings.longestStreak

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("longest-streak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def longestStreak(value: String, character: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("longestStreak")(value.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Double]
}
