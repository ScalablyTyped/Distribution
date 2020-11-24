package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapId extends js.Object {
  
  var mapId: String = js.native
  
  var tilesetName: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object MapId {
  
  @scala.inline
  def apply(mapId: String, url: String): MapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapId]
  }
  
  @scala.inline
  implicit class MapIdOps[Self <: MapId] (val x: Self) extends AnyVal {
    
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
    def setMapId(value: String): Self = this.set("mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesetName(value: String): Self = this.set("tilesetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilesetName: Self = this.set("tilesetName", js.undefined)
  }
}
