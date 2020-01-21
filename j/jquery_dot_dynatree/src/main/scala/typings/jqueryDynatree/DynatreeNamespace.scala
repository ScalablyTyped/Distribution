package typings.jqueryDynatree

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynatreeNamespace extends js.Object {
  var version: Double
  def getNode(element: HTMLElement): DynaTreeNode
  def getPersistData(cookieId: String, cookieOpts: DynaTreeCookieOptions): js.Any
}

object DynatreeNamespace {
  @scala.inline
  def apply(
    getNode: HTMLElement => DynaTreeNode,
    getPersistData: (String, DynaTreeCookieOptions) => js.Any,
    version: Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), getPersistData = js.Any.fromFunction2(getPersistData), version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynatreeNamespace]
  }
}

