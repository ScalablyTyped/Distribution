package typings.materialUiCore.reactHelpersMod

import typings.materialUiCore.anon.StandardPropsnevernever
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedMuiElement extends js.Object {
  var key: String | Double | Null = js.native
  var props: StandardPropsnevernever = js.native
  var `type`: NamedMuiComponent = js.native
}

object NamedMuiElement {
  @scala.inline
  def apply(props: StandardPropsnevernever, `type`: NamedMuiComponent, key: String | Double = null): NamedMuiElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedMuiElement]
  }
}

