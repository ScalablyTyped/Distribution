package typings.jsonic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("jsonic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(`val`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`val`: js.Any, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxchars: js.UndefOr[Double] = js.undefined
    
    var maxitems: js.UndefOr[Double] = js.undefined
    
    var omit: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setMaxchars(value: Double): Self = StObject.set(x, "maxchars", value.asInstanceOf[js.Any])
      
      inline def setMaxcharsUndefined: Self = StObject.set(x, "maxchars", js.undefined)
      
      inline def setMaxitems(value: Double): Self = StObject.set(x, "maxitems", value.asInstanceOf[js.Any])
      
      inline def setMaxitemsUndefined: Self = StObject.set(x, "maxitems", js.undefined)
      
      inline def setOmit(value: js.Array[String]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
      
      inline def setOmitUndefined: Self = StObject.set(x, "omit", js.undefined)
      
      inline def setOmitVarargs(value: String*): Self = StObject.set(x, "omit", js.Array(value :_*))
    }
  }
}
