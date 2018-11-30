package typings
package jjuLib.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Token extends js.Object {
  /** Raw text of this token. If you join all raws, you will get the original document. */
  var raw: java.lang.String
  /** Path to the current token in the syntax tree. */
  var stack: js.Array[java.lang.String]
  /** Type of the token. */
  var `type`: jjuLib.jjuLibStrings.whitespace | jjuLib.jjuLibStrings.comment | jjuLib.jjuLibStrings.key | jjuLib.jjuLibStrings.literal | jjuLib.jjuLibStrings.separator | jjuLib.jjuLibStrings.newline
  /** Value of the token if token is a key or literal. */
  var value: js.UndefOr[js.Any] = js.undefined
}

