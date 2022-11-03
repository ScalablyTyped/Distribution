package typings.hexArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hex-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toString_(array: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(array: js.typedarray.Uint8Array, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * This number of hex bytes are grouped together with spaces between groups.
      * 0 means no grouping is applied. 0 if unspecified.
      */
    var grouping: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of groups which make up a row. When 0, no splitting into rows
      * occurs. 0 if unspecified.
      */
    var rowlength: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, the output will be in uppercase. true by default.
      */
    var uppercase: Boolean
  }
  object Options {
    
    inline def apply(uppercase: Boolean): Options = {
      val __obj = js.Dynamic.literal(uppercase = uppercase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGrouping(value: Double): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
      
      inline def setRowlength(value: Double): Self = StObject.set(x, "rowlength", value.asInstanceOf[js.Any])
      
      inline def setRowlengthUndefined: Self = StObject.set(x, "rowlength", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    }
  }
}
