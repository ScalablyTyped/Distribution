package typings.iconGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IcoSizes extends StObject {
    
    /** Structure of an image sizes for ICO. */
    var icoSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Prefix of an output PNG files. Start with the alphabet, can use `-` and `_`. This option is for PNG. The name of the ICO file is always `favicon.ico`. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Size structure of PNG files to output. */
    var pngSizes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object IcoSizes {
    
    inline def apply(): IcoSizes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IcoSizes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IcoSizes] (val x: Self) extends AnyVal {
      
      inline def setIcoSizes(value: js.Array[Double]): Self = StObject.set(x, "icoSizes", value.asInstanceOf[js.Any])
      
      inline def setIcoSizesUndefined: Self = StObject.set(x, "icoSizes", js.undefined)
      
      inline def setIcoSizesVarargs(value: Double*): Self = StObject.set(x, "icoSizes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPngSizes(value: js.Array[Double]): Self = StObject.set(x, "pngSizes", value.asInstanceOf[js.Any])
      
      inline def setPngSizesUndefined: Self = StObject.set(x, "pngSizes", js.undefined)
      
      inline def setPngSizesVarargs(value: Double*): Self = StObject.set(x, "pngSizes", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    /** Name of an output file. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Structure of an image sizes. */
    var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
    }
  }
}
