package typings.istanbulLibSourceMaps.mod

import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStoreOptions extends js.Object {
  
  var baseDir: String = js.native
  
  var sourceStore: memory | file = js.native
  
  var tmpdir: String = js.native
  
  var verbose: Boolean = js.native
}
object MapStoreOptions {
  
  @scala.inline
  def apply(baseDir: String, sourceStore: memory | file, tmpdir: String, verbose: Boolean): MapStoreOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStoreOptions]
  }
  
  @scala.inline
  implicit class MapStoreOptionsOps[Self <: MapStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setSourceStore(value: memory | file): Self = this.set("sourceStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpdir(value: String): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
