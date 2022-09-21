package typings.importMetaResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Conditions extends StObject {
    
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    var parentURL: js.UndefOr[String] = js.undefined
  }
  object Conditions {
    
    inline def apply(): Conditions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Conditions]
    }
    
    extension [Self <: Conditions](x: Self) {
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setParentURL(value: String): Self = StObject.set(x, "parentURL", value.asInstanceOf[js.Any])
      
      inline def setParentURLUndefined: Self = StObject.set(x, "parentURL", js.undefined)
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String | Null] = js.undefined
    
    var url: String
  }
  object Format {
    
    inline def apply(url: String): Format = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatNull: Self = StObject.set(x, "format", null)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParentURL extends StObject {
    
    var parentURL: String
  }
  object ParentURL {
    
    inline def apply(parentURL: String): ParentURL = {
      val __obj = js.Dynamic.literal(parentURL = parentURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentURL]
    }
    
    extension [Self <: ParentURL](x: Self) {
      
      inline def setParentURL(value: String): Self = StObject.set(x, "parentURL", value.asInstanceOf[js.Any])
    }
  }
}
