package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.tms
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  var maxzoom: js.UndefOr[Double] = js.native
  var minzoom: js.UndefOr[Double] = js.native
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  var scheme: js.UndefOr[xyz | tms] = js.native
  var tiles: js.UndefOr[js.Array[String]] = js.native
  @JSName("type")
  var type_VectorSource: vector = js.native
  var url: js.UndefOr[String] = js.native
}

object VectorSource {
  @scala.inline
  def apply(`type`: vector): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSource]
  }
  @scala.inline
  implicit class VectorSourceOps[Self <: VectorSource] (val x: Self) extends AnyVal {
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
    def setType(value: vector): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinzoom: Self = this.set("minzoom", js.undefined)
    @scala.inline
    def setPromoteId(value: PromoteIdSpecification): Self = this.set("promoteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteId: Self = this.set("promoteId", js.undefined)
    @scala.inline
    def setScheme(value: xyz | tms): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setTilesVarargs(value: String*): Self = this.set("tiles", js.Array(value :_*))
    @scala.inline
    def setTiles(value: js.Array[String]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

