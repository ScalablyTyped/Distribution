package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynatreeNamespace extends js.Object {
  var version: scala.Double
  def getNode(element: stdLib.HTMLElement): DynaTreeNode
  def getPersistData(cookieId: java.lang.String, cookieOpts: DynaTreeCookieOptions): js.Any
}

object DynatreeNamespace {
  @scala.inline
  def apply(
    getNode: js.Function1[stdLib.HTMLElement, DynaTreeNode],
    getPersistData: js.Function2[java.lang.String, DynaTreeCookieOptions, js.Any],
    version: scala.Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNode")(getNode)
    __obj.updateDynamic("getPersistData")(getPersistData)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DynatreeNamespace]
  }
}

