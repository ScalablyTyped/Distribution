package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Boundary
import typings.maximMazurokGapiClientBooks.anon.Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolayerdata extends js.Object {
  
  var common: js.UndefOr[Lang] = js.native
  
  var geo: js.UndefOr[Boundary] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object Geolayerdata {
  
  @scala.inline
  def apply(): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geolayerdata]
  }
  
  @scala.inline
  implicit class GeolayerdataOps[Self <: Geolayerdata] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: Lang): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setGeo(value: Boundary): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
