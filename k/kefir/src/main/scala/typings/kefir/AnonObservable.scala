package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObservable extends js.Object {
  var Observable: AnonAp
}

object AnonObservable {
  @scala.inline
  def apply(Observable: AnonAp): AnonObservable = {
    val __obj = js.Dynamic.literal(Observable = Observable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObservable]
  }
}

