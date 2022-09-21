package typings.mapboxGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  var diff: js.UndefOr[Boolean] = js.undefined
  
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
}
object Diff {
  
  inline def apply(): Diff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff]
  }
  
  extension [Self <: Diff](x: Self) {
    
    inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
  }
}
