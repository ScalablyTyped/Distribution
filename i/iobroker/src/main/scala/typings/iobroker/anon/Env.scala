package typings.iobroker.anon

import typings.node.processMod.global.NodeJS.ProcessVersions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends js.Object {
  
  var env: Record[String, String] = js.native
  
  var title: String = js.native
  
  var versions: ProcessVersions = js.native
}
object Env {
  
  @scala.inline
  def apply(env: Record[String, String], title: String, versions: ProcessVersions): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: Record[String, String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: ProcessVersions): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
