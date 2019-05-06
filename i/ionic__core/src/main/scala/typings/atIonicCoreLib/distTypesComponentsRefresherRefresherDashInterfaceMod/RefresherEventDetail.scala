package typings
package atIonicCoreLib.distTypesComponentsRefresherRefresherDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefresherEventDetail extends js.Object {
  def complete(): scala.Unit
}

object RefresherEventDetail {
  @scala.inline
  def apply(complete: () => scala.Unit): RefresherEventDetail = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[RefresherEventDetail]
  }
}

