package typings.hyphen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hyphenation patterns and exceptions for a language.
  */
trait PatternsDefinition extends js.Object {
  /** List of words with hyphenation points that don't fit the patterns. */
  var exceptions: js.Array[String]
  /** List of hyphenation patterns. */
  var patterns: js.Array[String]
}

object PatternsDefinition {
  @scala.inline
  def apply(exceptions: js.Array[String], patterns: js.Array[String]): PatternsDefinition = {
    val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternsDefinition]
  }
}

