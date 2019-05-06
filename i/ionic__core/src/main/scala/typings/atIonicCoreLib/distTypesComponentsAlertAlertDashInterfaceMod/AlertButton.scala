package typings
package atIonicCoreLib.distTypesComponentsAlertAlertDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertButton extends js.Object {
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var handler: js.UndefOr[
    js.Function1[
      /* value */ js.Any, 
      scala.Boolean | scala.Unit | org.scalablytyped.runtime.StringDictionary[_]
    ]
  ] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object AlertButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    handler: /* value */ js.Any => scala.Boolean | scala.Unit | org.scalablytyped.runtime.StringDictionary[_] = null,
    role: java.lang.String = null
  ): AlertButton = {
    val __obj = js.Dynamic.literal(text = text)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[AlertButton]
  }
}

