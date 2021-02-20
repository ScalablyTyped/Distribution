package typings.koaJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Param extends StObject {
    
    /**
      * optional query-string param for pretty responses [none]
      */
    var param: js.UndefOr[String] = js.native
    
    /**
      * default to pretty response [true]
      */
    var pretty: js.UndefOr[Boolean] = js.native
    
    /**
      * JSON spaces [2]
      */
    var spaces: js.UndefOr[Double] = js.native
  }
  object Param {
    
    @scala.inline
    def apply(): Param = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Param]
    }
    
    @scala.inline
    implicit class ParamMutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setSpaces(value: Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}
