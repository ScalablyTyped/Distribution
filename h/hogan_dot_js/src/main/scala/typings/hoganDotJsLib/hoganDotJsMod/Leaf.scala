package typings
package hoganDotJsLib.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leaf extends Token {
  var end: scala.Double
  var nodes: js.Array[Token]
}

object Leaf {
  @scala.inline
  def apply(
    end: scala.Double,
    nodes: js.Array[Token],
    tag: java.lang.String,
    ctag: java.lang.String = null,
    i: scala.Int | scala.Double = null,
    n: java.lang.String = null,
    otag: java.lang.String = null,
    text: java.lang.String = null
  ): Leaf = {
    val __obj = js.Dynamic.literal(end = end, nodes = nodes, tag = tag)
    if (ctag != null) __obj.updateDynamic("ctag")(ctag)
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n)
    if (otag != null) __obj.updateDynamic("otag")(otag)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Leaf]
  }
}

