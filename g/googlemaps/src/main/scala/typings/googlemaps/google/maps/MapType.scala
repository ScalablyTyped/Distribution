package typings.googlemaps.google.maps

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapType extends js.Object {
  
  var alt: js.UndefOr[String] = js.native
  
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var projection: js.UndefOr[Projection] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  def releaseTile(tile: Element): Unit = js.native
  
  var tileSize: js.UndefOr[Size] = js.native
}
object MapType {
  
  @scala.inline
  def apply(getTile: (Point, Double, Document) => Element, releaseTile: Element => Unit): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), releaseTile = js.Any.fromFunction1(releaseTile))
    __obj.asInstanceOf[MapType]
  }
  
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
    
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
    def setGetTile(value: (Point, Double, Document) => Element): Self = this.set("getTile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReleaseTile(value: Element => Unit): Self = this.set("releaseTile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setTileSize(value: Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
  }
}
