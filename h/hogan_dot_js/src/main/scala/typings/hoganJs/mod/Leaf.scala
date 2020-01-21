package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leaf extends Token {
  var end: Double
  var nodes: js.Array[Token]
}

object Leaf {
  @scala.inline
  def apply(
    end: Double,
    nodes: js.Array[Token],
    tag: String,
    ctag: String = null,
    i: Int | Double = null,
    n: String = null,
    otag: String = null,
    text: String = null
  ): Leaf = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (ctag != null) __obj.updateDynamic("ctag")(ctag.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (otag != null) __obj.updateDynamic("otag")(otag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leaf]
  }
}

