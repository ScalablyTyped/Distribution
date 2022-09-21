package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchersUtil extends StObject {
  
  /**
    * @deprecated Private method that may be changed or removed in the future
    */
  def buildFailureMessage(matcherName: String, isNot: Boolean, actual: scala.Any, expected: scala.Any*): String = js.native
  
  def contains[T](haystack: String, needle: scala.Any): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: scala.Any): Boolean = js.native
  
  def equals(a: scala.Any, b: scala.Any): Boolean = js.native
  
  /**
    * Formats a value for use in matcher failure messages and similar
    * contexts, taking into account the current set of custom value
    * formatters.
    * @since 3.6.0
    * @param value The value to pretty-print
    * @return The pretty-printed value
    */
  def pp(value: scala.Any): String = js.native
}
