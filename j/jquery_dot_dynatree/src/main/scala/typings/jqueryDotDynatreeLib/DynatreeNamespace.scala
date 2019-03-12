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
    getNode: stdLib.HTMLElement => DynaTreeNode,
    getPersistData: (java.lang.String, DynaTreeCookieOptions) => js.Any,
    version: scala.Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), getPersistData = js.Any.fromFunction2(getPersistData), version = version)
  
    __obj.asInstanceOf[DynatreeNamespace]
  }
}

