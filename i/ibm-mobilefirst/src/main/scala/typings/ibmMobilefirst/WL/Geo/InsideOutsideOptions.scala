package typings.ibmMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsideOutsideOptions extends js.Object {
  /**
    * confidenceLevel can be 'low', 'medium', 'high'
    */
  var confidenceLevel: String = js.native
}

object InsideOutsideOptions {
  @scala.inline
  def apply(confidenceLevel: String): InsideOutsideOptions = {
    val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsideOutsideOptions]
  }
  @scala.inline
  implicit class InsideOutsideOptionsOps[Self <: InsideOutsideOptions] (val x: Self) extends AnyVal {
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
    def setConfidenceLevel(value: String): Self = this.set("confidenceLevel", value.asInstanceOf[js.Any])
  }
  
}

