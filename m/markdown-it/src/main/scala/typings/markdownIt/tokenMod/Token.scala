package typings.markdownIt.tokenMod

import typings.markdownIt.markdownItNumbers.`-1`
import typings.markdownIt.markdownItNumbers.`0`
import typings.markdownIt.markdownItNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create new token and fill passed properties.
  */
trait Token extends js.Object {
  /**
    * HTML attributes. Format: `[[name1, value1], [name2, value2]]`
    */
  var attrs: (js.Array[js.Tuple2[String, String]]) | Null
  /**
    * True for block-level tokens, false for inline tokens.
    * Used in renderer to calculate line breaks
    */
  var block: Boolean
  /**
    * An array of child nodes (inline and img tokens)
    */
  var children: js.Array[Token] | Null
  /**
    * In a case of self-closing tag (code, html, fence, etc.),
    * it has contents of this tag.
    */
  var content: String
  /**
    * If it's true, ignore this element when rendering. Used for tight lists
    * to hide paragraphs.
    */
  var hidden: Boolean
  /**
    * Fence info string
    */
  var info: String
  /**
    * nesting level, the same as `state.level`
    */
  var level: Double
  /**
    * Source map info. Format: `[line_begin, line_end]`
    */
  var map: (js.Tuple2[Double, Double]) | Null
  /**
    * '*' or '_' for emphasis, fence string for fence, etc.
    */
  var markup: String
  /**
    * A place for plugins to store an arbitrary data
    */
  var meta: js.Any
  /**
    * Level change (number in {-1, 0, 1} set), where:
    *
    * - `1` means the tag is opening
    * - `0` means the tag is self-closing
    * - `-1` means the tag is closing
    */
  var nesting: `1` | `0` | `-1`
  /**
    * HTML tag name, e.g. "p"
    */
  var tag: String
  /**
    * Type of the token, e.g. "paragraph_open"
    */
  var `type`: String
  /**
    * Get the value of attribute `name`, or null if it does not exist.
    */
  def attrGet(name: String): String | Null
  /**
    * Search attribute index by name.
    */
  def attrIndex(name: String): Double
  /**
    *
    * Join value to existing attribute via space. Or create new attribute if not
    * exists. Useful to operate with token classes.
    */
  def attrJoin(name: String, value: String): Unit
  /**
    * Add `[name, value]` attribute to list. Init attrs if necessary
    */
  def attrPush(attrData: js.Tuple2[String, String]): Unit
  /**
    * Set `name` attribute to `value`. Override old value if exists.
    */
  def attrSet(name: String, value: String): Unit
}

object Token {
  @scala.inline
  def apply(
    attrGet: String => String | Null,
    attrIndex: String => Double,
    attrJoin: (String, String) => Unit,
    attrPush: js.Tuple2[String, String] => Unit,
    attrSet: (String, String) => Unit,
    block: Boolean,
    content: String,
    hidden: Boolean,
    info: String,
    level: Double,
    markup: String,
    meta: js.Any,
    nesting: `1` | `0` | `-1`,
    tag: String,
    `type`: String,
    attrs: js.Array[js.Tuple2[String, String]] = null,
    children: js.Array[Token] = null,
    map: js.Tuple2[Double, Double] = null
  ): Token = {
    val __obj = js.Dynamic.literal(attrGet = js.Any.fromFunction1(attrGet), attrIndex = js.Any.fromFunction1(attrIndex), attrJoin = js.Any.fromFunction2(attrJoin), attrPush = js.Any.fromFunction1(attrPush), attrSet = js.Any.fromFunction2(attrSet), block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

