package typings.ionic.definitionsMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellRunOptions extends IShellOutputOptions {
  
  var killOnExit: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[WritableStream] = js.native
  
  var truncateErrorOutput: js.UndefOr[Double] = js.native
}
object IShellRunOptions {
  
  @scala.inline
  def apply(): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellRunOptions]
  }
  
  @scala.inline
  implicit class IShellRunOptionsOps[Self <: IShellRunOptions] (val x: Self) extends AnyVal {
    
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
    def setKillOnExit(value: Boolean): Self = this.set("killOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKillOnExit: Self = this.set("killOnExit", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTruncateErrorOutput(value: Double): Self = this.set("truncateErrorOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncateErrorOutput: Self = this.set("truncateErrorOutput", js.undefined)
  }
}
