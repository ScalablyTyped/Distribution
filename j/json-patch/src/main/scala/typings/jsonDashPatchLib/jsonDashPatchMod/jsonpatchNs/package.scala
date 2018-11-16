package typings
package jsonDashPatchLib.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpatchNs {
  type InvalidPatchError = JSONPatchError
  type InvalidPointerError = stdLib.Error
  type JSONPatchError = stdLib.Error
  type OpPatch = AddPatch | RemovePatch | ReplacePatch | MovePatch | CopyPatch | TestPatch
  type PatchConflictError = JSONPatchError
  type PatchTestFailed = stdLib.Error
}
