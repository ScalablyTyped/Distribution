package typings.invityApi

import typings.invityApi.invityApiStrings.GET
import typings.invityApi.invityApiStrings.IFRAME
import typings.invityApi.invityApiStrings.POST
import typings.invityApi.mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: String
    
    // tx data for approval or swap transaction
    var from: String
    
    var to: String
    
    var value: String
  }
  object Data {
    
    inline def apply(data: String, from: String, to: String, value: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    var fields: StringMap
    
    var formAction: String
    
    var formMethod: GET | POST | IFRAME
  }
  object Fields {
    
    inline def apply(fields: StringMap, formAction: String, formMethod: GET | POST | IFRAME): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], formAction = formAction.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: StringMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormMethod(value: GET | POST | IFRAME): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    }
  }
}
