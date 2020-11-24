package typings.gulpConcat.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVinylOptions extends js.Object {
  
  var base: js.UndefOr[String] = js.native
  
  var contents: js.UndefOr[ReadableStream | Buffer] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var stat: js.UndefOr[IFsStats] = js.native
}
object IVinylOptions {
  
  @scala.inline
  def apply(): IVinylOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVinylOptions]
  }
  
  @scala.inline
  implicit class IVinylOptionsOps[Self <: IVinylOptions] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setContents(value: ReadableStream | Buffer): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStat(value: IFsStats): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
  }
}
