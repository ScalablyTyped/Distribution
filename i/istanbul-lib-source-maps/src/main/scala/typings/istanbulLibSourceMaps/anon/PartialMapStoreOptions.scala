package typings.istanbulLibSourceMaps.anon

import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-source-maps.istanbul-lib-source-maps.MapStoreOptions> */
@js.native
trait PartialMapStoreOptions extends js.Object {
  
  var baseDir: js.UndefOr[String] = js.native
  
  var sourceStore: js.UndefOr[memory | file] = js.native
  
  var tmpdir: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialMapStoreOptions {
  
  @scala.inline
  def apply(): PartialMapStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapStoreOptions]
  }
  
  @scala.inline
  implicit class PartialMapStoreOptionsOps[Self <: PartialMapStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    
    @scala.inline
    def setSourceStore(value: memory | file): Self = this.set("sourceStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceStore: Self = this.set("sourceStore", js.undefined)
    
    @scala.inline
    def setTmpdir(value: String): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpdir: Self = this.set("tmpdir", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
