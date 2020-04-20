package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserInlineMod {
  type RuleInline = js.Function2[
    /* state */ typings.markdownIt.stateInlineMod.^, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  type RuleInline2 = js.Function1[/* state */ typings.markdownIt.stateInlineMod.^, scala.Boolean]
}
