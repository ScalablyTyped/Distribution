package typings.hostile

import typings.hostile.hostileStrings.CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts
import typings.hostile.hostileStrings.SlashetcSlashhosts
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hostile", "HOSTS")
  @js.native
  val HOSTS: CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts | SlashetcSlashhosts = js.native
  
  @JSImport("hostile", "get")
  @js.native
  def get(preserveFormatting: Boolean): Unit | Lines = js.native
  @JSImport("hostile", "get")
  @js.native
  def get(preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  
  @JSImport("hostile", "getFile")
  @js.native
  def getFile(filePath: String, preserveFormatting: Boolean): Unit | Lines = js.native
  @JSImport("hostile", "getFile")
  @js.native
  def getFile(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  @JSImport("hostile", "getFile")
  @js.native
  def getFile_Lines(filePath: String, preserveFormatting: Boolean): Lines = js.native
  @JSImport("hostile", "getFile")
  @js.native
  def getFile_Unit(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  
  @JSImport("hostile", "get")
  @js.native
  def get_Lines(preserveFormatting: Boolean): Lines = js.native
  @JSImport("hostile", "get")
  @js.native
  def get_Unit(preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  
  @JSImport("hostile", "remove")
  @js.native
  def remove(ip: String, host: String): Unit = js.native
  @JSImport("hostile", "remove")
  @js.native
  def remove(ip: String, host: String, cb: Callback): Unit = js.native
  
  @JSImport("hostile", "set")
  @js.native
  def set(ip: String, host: String): Unit = js.native
  @JSImport("hostile", "set")
  @js.native
  def set(ip: String, host: String, cb: Callback): Unit = js.native
  
  @JSImport("hostile", "writeFile")
  @js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean): Unit = js.native
  @JSImport("hostile", "writeFile")
  @js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean, cb: Callback): Unit = js.native
  
  type Callback = js.Function1[/* error */ Error | Null, Unit]
  
  type GetCallback = js.Function2[/* error */ Error | Null, /* lines */ Lines, Unit]
  
  type Line = String | (js.Tuple2[String, String])
  
  type Lines = js.Array[Line]
}
