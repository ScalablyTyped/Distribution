package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def getActionType(action: java.lang.String): kosDashCoreLib.Anon_Namespace
}

object Util {
  @scala.inline
  def apply(getActionType: js.Function1[java.lang.String, kosDashCoreLib.Anon_Namespace]): Util = {
    val __obj = js.Dynamic.literal(getActionType = getActionType)
  
    __obj.asInstanceOf[Util]
  }
}

