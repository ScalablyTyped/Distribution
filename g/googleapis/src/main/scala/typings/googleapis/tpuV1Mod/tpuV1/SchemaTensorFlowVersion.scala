package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tensorflow version that a Node can be configured with.
  */
@js.native
trait SchemaTensorFlowVersion extends js.Object {
  
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaTensorFlowVersion {
  
  @scala.inline
  def apply(): SchemaTensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTensorFlowVersion]
  }
  
  @scala.inline
  implicit class SchemaTensorFlowVersionOps[Self <: SchemaTensorFlowVersion] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
