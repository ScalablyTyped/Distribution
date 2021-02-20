package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.BE
import typings.iobroker.iobrokerStrings.LE
import typings.node.processMod.global.NodeJS.Platform
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arch extends StObject {
  
  var arch: ReturnType[js.Function0[String]] = js.native
  
  var endianness: ReturnType[js.Function0[BE | LE]] = js.native
  
  var hostname: String = js.native
  
  var platform: ReturnType[js.Function0[Platform]] = js.native
  
  var release: ReturnType[js.Function0[String]] = js.native
  
  var tmpdir: ReturnType[js.Function0[String]] = js.native
  
  var `type`: ReturnType[js.Function0[String]] = js.native
}
object Arch {
  
  @scala.inline
  def apply(
    arch: ReturnType[js.Function0[String]],
    endianness: ReturnType[js.Function0[BE | LE]],
    hostname: String,
    platform: ReturnType[js.Function0[Platform]],
    release: ReturnType[js.Function0[String]],
    tmpdir: ReturnType[js.Function0[String]],
    `type`: ReturnType[js.Function0[String]]
  ): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], endianness = endianness.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
  
  @scala.inline
  implicit class ArchMutableBuilder[Self <: Arch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArch(value: ReturnType[js.Function0[String]]): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndianness(value: ReturnType[js.Function0[BE | LE]]): Self = StObject.set(x, "endianness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: ReturnType[js.Function0[Platform]]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReturnType[js.Function0[String]]): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpdir(value: ReturnType[js.Function0[String]]): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ReturnType[js.Function0[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
