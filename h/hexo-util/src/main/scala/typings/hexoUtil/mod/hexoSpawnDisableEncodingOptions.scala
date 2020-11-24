package typings.hexoUtil.mod

import typings.hexoUtil.hexoUtilBooleans.`false`
import typings.hexoUtil.hexoUtilStrings._empty
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hexoSpawnDisableEncodingOptions extends SpawnOptions {
  
  var encoding: _empty | `false` | Null = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object hexoSpawnDisableEncodingOptions {
  
  @scala.inline
  def apply(): hexoSpawnDisableEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hexoSpawnDisableEncodingOptions]
  }
  
  @scala.inline
  implicit class hexoSpawnDisableEncodingOptionsOps[Self <: hexoSpawnDisableEncodingOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: _empty | `false`): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
