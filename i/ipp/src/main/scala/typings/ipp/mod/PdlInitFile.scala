package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PdlInitFile extends js.Object {
  var `pdl-init-file-entry`: js.UndefOr[String] = js.undefined
  var `pdl-init-file-location`: js.UndefOr[String] = js.undefined
  var `pdl-init-file-name`: js.UndefOr[String] = js.undefined
}

object PdlInitFile {
  @scala.inline
  def apply(
    `pdl-init-file-entry`: String = null,
    `pdl-init-file-location`: String = null,
    `pdl-init-file-name`: String = null
  ): PdlInitFile = {
    val __obj = js.Dynamic.literal()
    if (`pdl-init-file-entry` != null) __obj.updateDynamic("pdl-init-file-entry")(`pdl-init-file-entry`.asInstanceOf[js.Any])
    if (`pdl-init-file-location` != null) __obj.updateDynamic("pdl-init-file-location")(`pdl-init-file-location`.asInstanceOf[js.Any])
    if (`pdl-init-file-name` != null) __obj.updateDynamic("pdl-init-file-name")(`pdl-init-file-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdlInitFile]
  }
}

