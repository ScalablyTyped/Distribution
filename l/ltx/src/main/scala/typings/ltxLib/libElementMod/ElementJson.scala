package typings
package ltxLib.libElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementJson extends js.Object {
  var attrs: org.scalablytyped.runtime.StringDictionary[js.Any]
  var children: js.Array[ElementJson | TextNode]
  var name: java.lang.String
}

object ElementJson {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    children: js.Array[ElementJson | TextNode],
    name: java.lang.String
  ): ElementJson = {
    val __obj = js.Dynamic.literal(attrs = attrs, children = children, name = name)
  
    __obj.asInstanceOf[ElementJson]
  }
}

