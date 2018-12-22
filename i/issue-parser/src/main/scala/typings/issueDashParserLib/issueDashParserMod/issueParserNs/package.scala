package typings
package issueDashParserLib.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object issueParserNs {
  type Options = issueDashParserLib.issueDashParserLibStrings.github | issueDashParserLib.issueDashParserLibStrings.gitlab | issueDashParserLib.issueDashParserLibStrings.bitbucket | issueDashParserLib.issueDashParserLibStrings.waffle | Overrides
  type Parser = js.Function1[/* text */ java.lang.String, Result]
}
