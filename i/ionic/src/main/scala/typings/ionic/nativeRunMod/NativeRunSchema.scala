package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeRunSchema extends js.Object {
  
  var forwardedPorts: js.UndefOr[js.Array[String | Double]] = js.native
  
  var packagePath: String = js.native
  
  var platform: String = js.native
}
object NativeRunSchema {
  
  @scala.inline
  def apply(packagePath: String, platform: String): NativeRunSchema = {
    val __obj = js.Dynamic.literal(packagePath = packagePath.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeRunSchema]
  }
  
  @scala.inline
  implicit class NativeRunSchemaOps[Self <: NativeRunSchema] (val x: Self) extends AnyVal {
    
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
    def setPackagePath(value: String): Self = this.set("packagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedPortsVarargs(value: (String | Double)*): Self = this.set("forwardedPorts", js.Array(value :_*))
    
    @scala.inline
    def setForwardedPorts(value: js.Array[String | Double]): Self = this.set("forwardedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedPorts: Self = this.set("forwardedPorts", js.undefined)
  }
}
