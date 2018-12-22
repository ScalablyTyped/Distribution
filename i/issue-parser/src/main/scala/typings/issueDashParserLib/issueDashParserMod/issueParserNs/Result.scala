package typings
package issueDashParserLib.issueDashParserMod.issueParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Result extends js.Object {
  var actions: Actions
  var allRefs: js.Array[Reference | Action]
  var mentions: js.Array[Mention]
  var refs: js.Array[Reference]
}

