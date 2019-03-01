package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Group")
@js.native
class Group () extends KdbxObject {
  var customIcon: KdbxUuid = js.native
  var defaultAutoTypeSeq: StringProtected = js.native
  var enableAutoType: scala.Boolean = js.native
  var enableSearching: scala.Boolean = js.native
  var entries: js.Array[Entry] = js.native
  var expanded: scala.Boolean = js.native
  var groups: js.Array[Group] = js.native
  var icon: scala.Double = js.native
  var lastTopVisibleEntry: KdbxUuid = js.native
  var name: StringProtected = js.native
  var notes: StringProtected = js.native
  var parentGroup: Group = js.native
  var times: Times = js.native
  var uuid: KdbxUuid = js.native
  def copyFrom(group: Group): scala.Unit = js.native
  def forEach(
    callback: js.Function2[
      /* thisArg */ js.Function1[/* value */ js.Any, scala.Unit], 
      /* entry */ js.UndefOr[Entry], 
      scala.Unit
    ],
    thisArg: js.Function1[/* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def merge(objectMap: ObjectMap): scala.Unit = js.native
  def write(parentNode: stdLib.Node, ctx: Context): scala.Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Group")
@js.native
object Group extends js.Object {
  def create(name: kdbxwebLib.kdbxwebMod.StringProtected, parentGroup: kdbxwebLib.kdbxwebMod.Group): kdbxwebLib.kdbxwebMod.Group = js.native
  def read(xmlNode: stdLib.Node, ctx: kdbxwebLib.kdbxwebMod.Context, parentGroup: kdbxwebLib.kdbxwebMod.Group): kdbxwebLib.kdbxwebMod.Group = js.native
}

