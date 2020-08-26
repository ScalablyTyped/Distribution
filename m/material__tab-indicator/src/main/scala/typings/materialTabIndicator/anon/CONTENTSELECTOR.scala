package typings.materialTabIndicator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONTENTSELECTOR extends js.Object {
  var CONTENT_SELECTOR: String = js.native
}

object CONTENTSELECTOR {
  @scala.inline
  def apply(CONTENT_SELECTOR: String): CONTENTSELECTOR = {
    val __obj = js.Dynamic.literal(CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONTENTSELECTOR]
  }
  @scala.inline
  implicit class CONTENTSELECTOROps[Self <: CONTENTSELECTOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCONTENT_SELECTOR(value: String): Self = this.set("CONTENT_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

