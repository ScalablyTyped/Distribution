package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Entry")
@js.native
class Entry () extends js.Object {
  var autoType: kdbxwebLib.Anon_DefaultSequence = js.native
  var bgColor: StringProtected = js.native
  var customIcon: KdbxUuid = js.native
  var fgColor: StringProtected = js.native
  var fields: org.scalablytyped.runtime.StringDictionary[StringProtected] = js.native
  var history: js.Array[Entry] = js.native
  var icon: scala.Double = js.native
  var overrideUrl: StringProtected = js.native
  var parentGroup: Group = js.native
  var tags: js.Array[java.lang.String] = js.native
  var times: Times = js.native
  var uuid: KdbxUuid = js.native
  def copyFrom(entry: Entry): scala.Unit = js.native
  def merge(objectMap: ObjectMap): scala.Unit = js.native
  def pushHistory(): scala.Unit = js.native
  def removeHistory(index: scala.Double, count: scala.Double): scala.Unit = js.native
  def write(parentNode: stdLib.Node, ctx: Context): scala.Unit = js.native
}

@JSImport("kdbxweb", "Entry")
@js.native
object Entry extends js.Object {
  def create(meta: kdbxwebLib.kdbxwebMod.Meta, parentGroup: kdbxwebLib.kdbxwebMod.Group): kdbxwebLib.kdbxwebMod.Entry = js.native
  def read(xmlNode: stdLib.Node, ctx: kdbxwebLib.kdbxwebMod.Context, parentGroup: kdbxwebLib.kdbxwebMod.Group): kdbxwebLib.kdbxwebMod.Entry = js.native
}

