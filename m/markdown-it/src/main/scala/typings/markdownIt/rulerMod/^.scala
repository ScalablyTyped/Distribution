package typings.markdownIt.rulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class Ruler
  *
  * Helper class, used by [[MarkdownIt#core]], [[MarkdownIt#block]] and
  * [[MarkdownIt#inline]] to manage sequences of functions (rules):
  *
  * - keep rules in defined order
  * - assign the name to each rule
  * - enable/disable rules
  * - add/replace rules
  * - allow assign rules to additional named chains (in the same)
  * - cacheing lists of active rules
  *
  * You will not need use this class directly until write plugins. For simple
  * rules control use [[MarkdownIt.disable]], [[MarkdownIt.enable]] and
  * [[MarkdownIt.use]].
  */
@JSImport("markdown-it/lib/ruler", JSImport.Namespace)
@js.native
class ^[T] () extends Ruler[T]

