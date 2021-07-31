package typings.levenshteinEditDistance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: String, other: String): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply(value: String, other: String, insensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], insensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("levenshtein-edit-distance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
