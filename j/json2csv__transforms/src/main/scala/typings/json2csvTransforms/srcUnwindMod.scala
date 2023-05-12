package typings.json2csvTransforms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUnwindMod {
  
  @JSImport("@json2csv/transforms/src/unwind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
  inline def default(opts: Options): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
  
  trait Options extends StObject {
    
    var blankOut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Paths used to deconstruct the array
      */
    var paths: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBlankOut(value: Boolean): Self = StObject.set(x, "blankOut", value.asInstanceOf[js.Any])
      
      inline def setBlankOutUndefined: Self = StObject.set(x, "blankOut", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
}
