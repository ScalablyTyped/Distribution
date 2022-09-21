package typings.hostile

import typings.hostile.hostileStrings.CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts
import typings.hostile.hostileStrings.SlashetcSlashhosts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hostile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hostile", "HOSTS")
  @js.native
  val HOSTS: CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts | SlashetcSlashhosts = js.native
  
  inline def get(preserveFormatting: Boolean): Unit | Lines = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(preserveFormatting.asInstanceOf[js.Any]).asInstanceOf[Unit | Lines]
  inline def get(preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(preserveFormatting.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | Lines]
  
  inline def getFile(filePath: String, preserveFormatting: Boolean): Unit | Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(filePath.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any])).asInstanceOf[Unit | Lines]
  inline def getFile(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(filePath.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | Lines]
  
  inline def getFile_Lines(filePath: String, preserveFormatting: Boolean): Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(filePath.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any])).asInstanceOf[Lines]
  
  inline def getFile_Unit(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(filePath.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get_Lines(preserveFormatting: Boolean): Lines = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(preserveFormatting.asInstanceOf[js.Any]).asInstanceOf[Lines]
  
  inline def get_Unit(preserveFormatting: Boolean, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(preserveFormatting.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(ip: String, host: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ip.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remove(ip: String, host: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ip.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set(ip: String, host: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ip.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(ip: String, host: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ip.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFile(lines: js.Array[Line], preserveFormatting: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(lines.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(lines: js.Array[Line], preserveFormatting: Boolean, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(lines.asInstanceOf[js.Any], preserveFormatting.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function1[/* error */ js.Error | Null, Unit]
  
  type GetCallback = js.Function2[/* error */ js.Error | Null, /* lines */ Lines, Unit]
  
  type Line = String | (js.Tuple2[String, String])
  
  type Lines = js.Array[Line]
}
