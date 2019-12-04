package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings.error
import typings.atIonicCore.atIonicCoreStrings.success
import typings.atIonicCore.atIonicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var `type`: error | success | warning
}

object Anon_Error {
  @scala.inline
  def apply(`type`: error | success | warning): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

