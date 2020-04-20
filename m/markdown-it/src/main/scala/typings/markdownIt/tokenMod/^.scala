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
@JSImport("markdown-it/lib/token", JSImport.Namespace)
@js.native
class ^ protected () extends Token {
  def this(`type`: String, tag: String, nesting: Nesting) = this()
  /**
    * HTML attributes. Format: `[[name1, value1], [name2, value2]]`
    */
  /* CompleteClass */
  override var attrs: (js.Array[js.Tuple2[String, String]]) | Null = js.native
  /**
    * True for block-level tokens, false for inline tokens.
    * Used in renderer to calculate line breaks
    */
  /* CompleteClass */
  override var block: Boolean = js.native
  /**
    * An array of child nodes (inline and img tokens)
    */
  /* CompleteClass */
  override var children: js.Array[Token] | Null = js.native
  /**
    * In a case of self-closing tag (code, html, fence, etc.),
    * it has contents of this tag.
    */
  /* CompleteClass */
  override var content: String = js.native
  /**
    * If it's true, ignore this element when rendering. Used for tight lists
    * to hide paragraphs.
    */
  /* CompleteClass */
  override var hidden: Boolean = js.native
  /**
    * Fence info string
    */
  /* CompleteClass */
  override var info: String = js.native
  /**
    * nesting level, the same as `state.level`
    */
  /* CompleteClass */
  override var level: Double = js.native
  /**
    * Source map info. Format: `[line_begin, line_end]`
    */
  /* CompleteClass */
  override var map: (js.Tuple2[Double, Double]) | Null = js.native
  /**
    * '*' or '_' for emphasis, fence string for fence, etc.
    */
  /* CompleteClass */
  override var markup: String = js.native
  /**
    * A place for plugins to store an arbitrary data
    */
  /* CompleteClass */
  override var meta: js.Any = js.native
  /**
    * Level change (number in {-1, 0, 1} set), where:
    *
    * - `1` means the tag is opening
    * - `0` means the tag is self-closing
    * - `-1` means the tag is closing
    */
  /* CompleteClass */
  override var nesting: `1` | `0` | `-1` = js.native
  /**
    * HTML tag name, e.g. "p"
    */
  /* CompleteClass */
  override var tag: String = js.native
  /**
    * Type of the token, e.g. "paragraph_open"
    */
  /* CompleteClass */
  override var `type`: String = js.native
  /**
    * Get the value of attribute `name`, or null if it does not exist.
    */
  /* CompleteClass */
  override def attrGet(name: String): String | Null = js.native
  /**
    * Search attribute index by name.
    */
  /* CompleteClass */
  override def attrIndex(name: String): Double = js.native
  /**
    *
    * Join value to existing attribute via space. Or create new attribute if not
    * exists. Useful to operate with token classes.
    */
  /* CompleteClass */
  override def attrJoin(name: String, value: String): Unit = js.native
  /**
    * Add `[name, value]` attribute to list. Init attrs if necessary
    */
  /* CompleteClass */
  override def attrPush(attrData: js.Tuple2[String, String]): Unit = js.native
  /**
    * Set `name` attribute to `value`. Override old value if exists.
    */
  /* CompleteClass */
  override def attrSet(name: String, value: String): Unit = js.native
}

