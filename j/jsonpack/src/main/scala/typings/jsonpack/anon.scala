package typings.jsonpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Floats extends StObject {
    
    var floats: js.Array[Double] = js.native
    
    var integers: js.Array[Double] = js.native
    
    var strings: js.Array[String] = js.native
  }
  object Floats {
    
    @scala.inline
    def apply(floats: js.Array[Double], integers: js.Array[Double], strings: js.Array[String]): Floats = {
      val __obj = js.Dynamic.literal(floats = floats.asInstanceOf[js.Any], integers = integers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Floats]
    }
    
    @scala.inline
    implicit class FloatsMutableBuilder[Self <: Floats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloats(value: js.Array[Double]): Self = StObject.set(x, "floats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatsVarargs(value: Double*): Self = StObject.set(x, "floats", js.Array(value :_*))
      
      @scala.inline
      def setIntegers(value: js.Array[Double]): Self = StObject.set(x, "integers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegersVarargs(value: Double*): Self = StObject.set(x, "integers", js.Array(value :_*))
      
      @scala.inline
      def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var `type`: String = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, `type`: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
