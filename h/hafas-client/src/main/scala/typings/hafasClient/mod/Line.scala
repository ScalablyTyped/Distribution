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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var additionalName: js.UndefOr[String] = js.undefined
  
  var adminCode: js.UndefOr[String] = js.undefined
  
  var express: js.UndefOr[Boolean] = js.undefined
  
  var fahrtNr: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var metro: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var night: js.UndefOr[Boolean] = js.undefined
  
  var nr: js.UndefOr[Double] = js.undefined
  
  var operator: js.UndefOr[Operator] = js.undefined
  
  var product: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  /** routes ids */
  var routes: js.UndefOr[js.Array[String]] = js.undefined
  
  var symbol: js.UndefOr[String] = js.undefined
  
  var `type`: line
}
object Line {
  
  @scala.inline
  def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalName(value: String): Self = StObject.set(x, "additionalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalNameUndefined: Self = StObject.set(x, "additionalName", js.undefined)
    
    @scala.inline
    def setAdminCode(value: String): Self = StObject.set(x, "adminCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminCodeUndefined: Self = StObject.set(x, "adminCode", js.undefined)
    
    @scala.inline
    def setExpress(value: Boolean): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressUndefined: Self = StObject.set(x, "express", js.undefined)
    
    @scala.inline
    def setFahrtNr(value: String): Self = StObject.set(x, "fahrtNr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFahrtNrUndefined: Self = StObject.set(x, "fahrtNr", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetro(value: Boolean): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetroUndefined: Self = StObject.set(x, "metro", js.undefined)
    
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNight(value: Boolean): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightUndefined: Self = StObject.set(x, "night", js.undefined)
    
    @scala.inline
    def setNr(value: Double): Self = StObject.set(x, "nr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrUndefined: Self = StObject.set(x, "nr", js.undefined)
    
    @scala.inline
    def setOperator(value: Operator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setRoutes(value: js.Array[String]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: String*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
