package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightAutoOptions
  extends StObject
     with HighlightOptions {
  
  var subset: js.UndefOr[js.Array[String]] = js.undefined
}
object HighlightAutoOptions {
  
  inline def apply(): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightAutoOptions]
  }
  
  extension [Self <: HighlightAutoOptions](x: Self) {
    
    inline def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
    
    inline def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value :_*))
  }
}
