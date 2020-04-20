package typings.html.mod

import typings.html.htmlStrings.`end-expand`
import typings.html.htmlStrings.collapse
import typings.html.htmlStrings.expand
import typings.html.htmlStrings.keep
import typings.html.htmlStrings.normal
import typings.html.htmlStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintOptions extends js.Object {
  /**
    * Put braces on the same line as control statements (`collapse`),
    * or put braces on own line (Allman / ANSI style, `expand`),
    * or just put end braces on own line (`end-expand`). Default: `collapse`.
    */
  var brace_style: js.UndefOr[collapse | expand | `end-expand`] = js.undefined
  /** character to indent with. Default: " " (space). */
  var indent_char: js.UndefOr[String] = js.undefined
  /** Default: `normal`. */
  var indent_scripts: js.UndefOr[keep | separate | normal] = js.undefined
  /** indentation size. Default: 4. */
  var indent_size: js.UndefOr[Double] = js.undefined
  /** Maximum amount of characters per line. Default: 70. */
  var max_char: js.UndefOr[Double] = js.undefined
  /** list of tags, that shouldn't be reformatted. Defaults to inline tags. */
  var unformatted: js.UndefOr[js.Array[String]] = js.undefined
}

object PrintOptions {
  @scala.inline
  def apply(
    brace_style: collapse | expand | `end-expand` = null,
    indent_char: String = null,
    indent_scripts: keep | separate | normal = null,
    indent_size: Int | Double = null,
    max_char: Int | Double = null,
    unformatted: js.Array[String] = null
  ): PrintOptions = {
    val __obj = js.Dynamic.literal()
    if (brace_style != null) __obj.updateDynamic("brace_style")(brace_style.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (indent_scripts != null) __obj.updateDynamic("indent_scripts")(indent_scripts.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (max_char != null) __obj.updateDynamic("max_char")(max_char.asInstanceOf[js.Any])
    if (unformatted != null) __obj.updateDynamic("unformatted")(unformatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
}

