package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserBlockMod {
  type RuleBlock = js.Function4[
    /* state */ typings.markdownIt.stateBlockMod.^, 
    /* startLine */ scala.Double, 
    /* endLine */ scala.Double, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
}
