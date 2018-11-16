package typings
package markdownlintLib.markdownlintMod.markdownlintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MarkdownlintResult extends js.Object {
  var errorContext: java.lang.String
  var errorDetail: js.UndefOr[java.lang.String] = js.undefined
  var errorRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var lineNumber: scala.Double
  var ruleAlias: java.lang.String
  var ruleDescription: java.lang.String
  var ruleName: java.lang.String
}

