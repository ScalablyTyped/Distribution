package typings.hostile.hostileMod

import typings.hostile.hostileStrings.`/etc/hosts`
import typings.hostile.hostileStrings.`C:/Windows/System32/drivers/etc/hosts`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hostile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val HOSTS: `C:/Windows/System32/drivers/etc/hosts` | `/etc/hosts` = js.native
  def get(preserveFormatting: Boolean): Unit | Lines = js.native
  def get(preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  def getFile(filePath: String, preserveFormatting: Boolean): Unit | Lines = js.native
  def getFile(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  @JSName("getFile")
  def getFile_Lines(filePath: String, preserveFormatting: Boolean): Lines = js.native
  @JSName("getFile")
  def getFile_Unit(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  @JSName("get")
  def get_Lines(preserveFormatting: Boolean): Lines = js.native
  @JSName("get")
  def get_Unit(preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  def remove(ip: String, host: String): Unit = js.native
  def remove(ip: String, host: String, cb: Callback): Unit = js.native
  def set(ip: String, host: String): Unit = js.native
  def set(ip: String, host: String, cb: Callback): Unit = js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean): Unit = js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean, cb: Callback): Unit = js.native
}

