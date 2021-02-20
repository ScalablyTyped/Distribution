package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchersUtil extends StObject {
  
  def buildFailureMessage(matcherName: String, isNot: Boolean, actual: js.Any, expected: js.Any*): String = js.native
  
  def contains[T](haystack: String, needle: js.Any): Boolean = js.native
  def contains[T](haystack: String, needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], diffBuilder: DiffBuilder): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester], diffBuilder: DiffBuilder): Boolean = js.native
  
  /**
    * Formats a value for use in matcher failure messages and similar
    * contexts, taking into account the current set of custom value
    * formatters.
    * @since 3.6.0
    * @param value The value to pretty-print
    * @return The pretty-printed value
    */
  def pp(value: js.Any): String = js.native
}
