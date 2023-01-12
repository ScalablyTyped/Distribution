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
  
  var directions: js.UndefOr[js.Array[String]] = js.undefined
  
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
  
  var productName: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  /** routes ids */
  var routes: js.UndefOr[js.Array[String]] = js.undefined
  
  var symbol: js.UndefOr[String] = js.undefined
  
  var `type`: line
}
object Line {
  
  inline def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    inline def setAdditionalName(value: String): Self = StObject.set(x, "additionalName", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNameUndefined: Self = StObject.set(x, "additionalName", js.undefined)
    
    inline def setAdminCode(value: String): Self = StObject.set(x, "adminCode", value.asInstanceOf[js.Any])
    
    inline def setAdminCodeUndefined: Self = StObject.set(x, "adminCode", js.undefined)
    
    inline def setDirections(value: js.Array[String]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setDirectionsVarargs(value: String*): Self = StObject.set(x, "directions", js.Array(value*))
    
    inline def setExpress(value: Boolean): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
    
    inline def setExpressUndefined: Self = StObject.set(x, "express", js.undefined)
    
    inline def setFahrtNr(value: String): Self = StObject.set(x, "fahrtNr", value.asInstanceOf[js.Any])
    
    inline def setFahrtNrUndefined: Self = StObject.set(x, "fahrtNr", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetro(value: Boolean): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
    
    inline def setMetroUndefined: Self = StObject.set(x, "metro", js.undefined)
    
    inline def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNight(value: Boolean): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
    
    inline def setNightUndefined: Self = StObject.set(x, "night", js.undefined)
    
    inline def setNr(value: Double): Self = StObject.set(x, "nr", value.asInstanceOf[js.Any])
    
    inline def setNrUndefined: Self = StObject.set(x, "nr", js.undefined)
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRoutes(value: js.Array[String]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setRoutesVarargs(value: String*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
