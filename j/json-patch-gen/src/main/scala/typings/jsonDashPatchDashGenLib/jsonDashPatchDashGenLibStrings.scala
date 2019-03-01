package typings
package jsonDashPatchDashGenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonDashPatchDashGenLibStrings {
  @js.native
  sealed trait add
    extends jsonDashPatchDashGenLib.jsonDashPatchDashGenMod.diffNs.PatchOperation
  
  @js.native
  sealed trait remove
    extends jsonDashPatchDashGenLib.jsonDashPatchDashGenMod.diffNs.PatchOperation
  
  @js.native
  sealed trait replace
    extends jsonDashPatchDashGenLib.jsonDashPatchDashGenMod.diffNs.PatchOperation
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

