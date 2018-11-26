package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Kdbx")
@js.native
class Kdbx () extends js.Object {
  var binaries: Binaries = js.native
  var credentials: Credentials = js.native
  var deletedObjects: js.Array[KdbxObject] = js.native
  var groups: js.Array[Group] = js.native
  var header: Header = js.native
  var meta: Meta = js.native
  var xml: stdLib.Document = js.native
  def addDeletedObject(uuid: KdbxUuid, dt: stdLib.Date): scala.Unit = js.native
  def cleanup(settings: Settings): scala.Unit = js.native
  def createBinary(value: ProtectedValue): stdLib.Promise[ProtectedValue | stdLib.ArrayBuffer] = js.native
  def createBinary(value: stdLib.ArrayBuffer): stdLib.Promise[ProtectedValue | stdLib.ArrayBuffer] = js.native
  def createDefaultGroup(): scala.Unit = js.native
  def createEntry(group: Group): Entry = js.native
  def createGroup(group: Group, name: StringProtected): Group = js.native
  def createRecycleBin(): scala.Unit = js.native
  def getDefaultGroup(): Group = js.native
  def getGroup(uuid: java.lang.String): js.UndefOr[Group] = js.native
  def getGroup(uuid: java.lang.String, parentGroup: Group): js.UndefOr[Group] = js.native
  def getGroup(uuid: KdbxUuid): js.UndefOr[Group] = js.native
  def getGroup(uuid: KdbxUuid, parentGroup: Group): js.UndefOr[Group] = js.native
  def getLocalEditState(): editingStateDict = js.native
  def merge(remote: Kdbx): scala.Unit = js.native
  def move(`object`: KdbxObject, toGroup: Group): scala.Unit = js.native
  def move(`object`: KdbxObject, toGroup: Group, atIndex: scala.Double): scala.Unit = js.native
  def remove(`object`: KdbxObject): scala.Unit = js.native
  def removeLocalEditState(): scala.Unit = js.native
  def save(): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def saveXml(): stdLib.Promise[java.lang.String] = js.native
  def setLocalEditState(editingState: editingStateDict): scala.Unit = js.native
  def upgrade(): scala.Unit = js.native
}

@JSImport("kdbxweb", "Kdbx")
@js.native
object Kdbx extends js.Object {
  def create(credentials: kdbxwebLib.kdbxwebMod.Credentials, name: java.lang.String): kdbxwebLib.kdbxwebMod.Kdbx = js.native
  def load(data: stdLib.ArrayBuffer, credentials: kdbxwebLib.kdbxwebMod.Credentials): stdLib.Promise[kdbxwebLib.kdbxwebMod.Kdbx] = js.native
  def loadXml(data: java.lang.String, credentials: kdbxwebLib.kdbxwebMod.Credentials): stdLib.Promise[kdbxwebLib.kdbxwebMod.Kdbx] = js.native
}

