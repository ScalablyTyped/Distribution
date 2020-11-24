package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.BE
import typings.iobroker.iobrokerStrings.LE
import typings.node.processMod.global.NodeJS.Platform
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arch extends js.Object {
  
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
  implicit class ArchOps[Self <: Arch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArch(value: ReturnType[js.Function0[String]]): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndianness(value: ReturnType[js.Function0[BE | LE]]): Self = this.set("endianness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: ReturnType[js.Function0[Platform]]): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReturnType[js.Function0[String]]): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpdir(value: ReturnType[js.Function0[String]]): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ReturnType[js.Function0[String]]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
