package typings.iconGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ico extends StObject {
    
    var ico: js.Array[Double]
    
    var name: String
    
    var sizes: js.Array[Double]
  }
  object Ico {
    
    inline def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): Ico = {
      val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ico]
    }
    
    extension [Self <: Ico](x: Self) {
      
      inline def setIco(value: js.Array[Double]): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      inline def setIcoVarargs(value: Double*): Self = StObject.set(x, "ico", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var sizes: js.Array[Double]
  }
  object Name {
    
    inline def apply(name: String, sizes: js.Array[Double]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
}
