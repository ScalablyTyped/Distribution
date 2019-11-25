package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsmediatags.jsmediatagsStrings.`utf-16`
  - typings.jsmediatags.jsmediatagsStrings.`utf-16le`
  - typings.jsmediatags.jsmediatagsStrings.`utf-16be`
  - typings.jsmediatags.jsmediatagsStrings.`utf-8`
  - typings.jsmediatags.jsmediatagsStrings.`iso-8859-1`
*/
trait CharsetType extends js.Object

object CharsetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `iso-8859-1`: typings.jsmediatags.jsmediatagsStrings.`iso-8859-1` = this.cast("iso-8859-1")
  @scala.inline
  def `utf-16`: typings.jsmediatags.jsmediatagsStrings.`utf-16` = this.cast("utf-16")
  @scala.inline
  def `utf-16be`: typings.jsmediatags.jsmediatagsStrings.`utf-16be` = this.cast("utf-16be")
  @scala.inline
  def `utf-16le`: typings.jsmediatags.jsmediatagsStrings.`utf-16le` = this.cast("utf-16le")
  @scala.inline
  def `utf-8`: typings.jsmediatags.jsmediatagsStrings.`utf-8` = this.cast("utf-8")
}

