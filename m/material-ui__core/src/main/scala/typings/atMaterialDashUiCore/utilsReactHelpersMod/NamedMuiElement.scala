package typings.atMaterialDashUiCore.utilsReactHelpersMod

import typings.atMaterialDashUiCore.StandardPropsnevernever
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedMuiElement extends js.Object {
  var key: String | Double | Null
  var props: StandardPropsnevernever
  var `type`: NamedMuiComponent
}

object NamedMuiElement {
  @scala.inline
  def apply(props: StandardPropsnevernever, `type`: NamedMuiComponent, key: String | Double = null): NamedMuiElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedMuiElement]
  }
}

