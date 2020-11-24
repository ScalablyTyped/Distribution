package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.line
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends js.Object {
  
  var additionalName: js.UndefOr[String] = js.native
  
  var adminCode: js.UndefOr[String] = js.native
  
  var express: js.UndefOr[Boolean] = js.native
  
  var fahrtNr: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var metro: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var night: js.UndefOr[Boolean] = js.native
  
  var nr: js.UndefOr[Double] = js.native
  
  var operator: js.UndefOr[Operator] = js.native
  
  var product: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  /** routes ids */
  var routes: js.UndefOr[js.Array[String]] = js.native
  
  var symbol: js.UndefOr[String] = js.native
  
  var `type`: line = js.native
}
object Line {
  
  @scala.inline
  def apply(`type`: line): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    
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
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalName(value: String): Self = this.set("additionalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalName: Self = this.set("additionalName", js.undefined)
    
    @scala.inline
    def setAdminCode(value: String): Self = this.set("adminCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminCode: Self = this.set("adminCode", js.undefined)
    
    @scala.inline
    def setExpress(value: Boolean): Self = this.set("express", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpress: Self = this.set("express", js.undefined)
    
    @scala.inline
    def setFahrtNr(value: String): Self = this.set("fahrtNr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFahrtNr: Self = this.set("fahrtNr", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMetro(value: Boolean): Self = this.set("metro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetro: Self = this.set("metro", js.undefined)
    
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNight(value: Boolean): Self = this.set("night", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNight: Self = this.set("night", js.undefined)
    
    @scala.inline
    def setNr(value: Double): Self = this.set("nr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNr: Self = this.set("nr", js.undefined)
    
    @scala.inline
    def setOperator(value: Operator): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: String*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[String]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
}
