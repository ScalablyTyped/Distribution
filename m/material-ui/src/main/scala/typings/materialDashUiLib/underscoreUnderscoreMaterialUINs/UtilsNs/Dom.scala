package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def forceRedraw(el: reactLib.HTMLElement): scala.Unit
  def getStyleAttributeAsNumber(el: reactLib.HTMLElement, attr: java.lang.String): scala.Double
  def hasClass(el: reactLib.Element, className: java.lang.String): scala.Boolean
  def isDescendant(parent: stdLib.Node, child: stdLib.Node): scala.Boolean
  def offset(el: reactLib.Element): materialDashUiLib.Anon_Left
  def removeClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def toggleClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def withoutTransition(el: reactLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit
}

object Dom {
  @scala.inline
  def apply(
    addClass: js.Function2[reactLib.Element, java.lang.String, scala.Unit],
    forceRedraw: js.Function1[reactLib.HTMLElement, scala.Unit],
    getStyleAttributeAsNumber: js.Function2[reactLib.HTMLElement, java.lang.String, scala.Double],
    hasClass: js.Function2[reactLib.Element, java.lang.String, scala.Boolean],
    isDescendant: js.Function2[stdLib.Node, stdLib.Node, scala.Boolean],
    offset: js.Function1[reactLib.Element, materialDashUiLib.Anon_Left],
    removeClass: js.Function2[reactLib.Element, java.lang.String, scala.Unit],
    toggleClass: js.Function2[reactLib.Element, java.lang.String, scala.Unit],
    withoutTransition: js.Function2[reactLib.HTMLElement, js.Function0[scala.Unit], scala.Unit]
  ): Dom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("forceRedraw")(forceRedraw)
    __obj.updateDynamic("getStyleAttributeAsNumber")(getStyleAttributeAsNumber)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("isDescendant")(isDescendant)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("toggleClass")(toggleClass)
    __obj.updateDynamic("withoutTransition")(withoutTransition)
    __obj.asInstanceOf[Dom]
  }
}

