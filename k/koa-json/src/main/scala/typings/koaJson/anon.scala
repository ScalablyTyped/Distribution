package typings.koaJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Param extends StObject {
    
    /**
      * optional query-string param for pretty responses [none]
      */
    var param: js.UndefOr[String] = js.undefined
    
    /**
      * default to pretty response [true]
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * JSON spaces [2]
      */
    var spaces: js.UndefOr[Double] = js.undefined
  }
  object Param {
    
    inline def apply(): Param = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Param]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSpaces(value: Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}
