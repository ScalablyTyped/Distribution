package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSaveDisposition extends js.Object {
  var `save-disposition`: js.UndefOr[SaveDisposition] = js.undefined
  var `save-info`: js.UndefOr[js.Array[SaveInfo]] = js.undefined
}

object JobSaveDisposition {
  @scala.inline
  def apply(`save-disposition`: SaveDisposition = null, `save-info`: js.Array[SaveInfo] = null): JobSaveDisposition = {
    val __obj = js.Dynamic.literal()
    if (`save-disposition` != null) __obj.updateDynamic("save-disposition")(`save-disposition`.asInstanceOf[js.Any])
    if (`save-info` != null) __obj.updateDynamic("save-info")(`save-info`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSaveDisposition]
  }
}

