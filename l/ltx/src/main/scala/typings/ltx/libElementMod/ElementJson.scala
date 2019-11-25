package typings.ltx.libElementMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementJson extends js.Object {
  var attrs: StringDictionary[js.Any]
  var children: js.Array[ElementJson | TextNode]
  var name: String
}

object ElementJson {
  @scala.inline
  def apply(attrs: StringDictionary[js.Any], children: js.Array[ElementJson | TextNode], name: String): ElementJson = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementJson]
  }
}

