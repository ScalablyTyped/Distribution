package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerBase extends js.Object {
  
  var filter: js.UndefOr[js.Array[_]] = js.native
  
  var id: String = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String | AnySourceData] = js.native
  
  var `source-layer`: js.UndefOr[String] = js.native
}
object LayerBase {
  
  @scala.inline
  def apply(id: String): LayerBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerBase]
  }
  
  @scala.inline
  implicit class LayerBaseOps[Self <: LayerBase] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinzoom: Self = this.set("minzoom", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setSource(value: String | AnySourceData): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def `setSource-layer`(value: String): Self = this.set("source-layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-layer`: Self = this.set("source-layer", js.undefined)
  }
}
