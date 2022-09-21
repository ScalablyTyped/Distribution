package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.JSSFontface
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  var `@global`: js.UndefOr[
    Fontface & (Record[String, js.UndefOr[JSSFontface | js.Array[JSSFontface] | CSSProperties]])
  ] = js.undefined
}
object Global {
  
  inline def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  
  extension [Self <: Global](x: Self) {
    
    inline def `set@global`(
      value: Fontface & (Record[String, js.UndefOr[JSSFontface | js.Array[JSSFontface] | CSSProperties]])
    ): Self = StObject.set(x, "@global", value.asInstanceOf[js.Any])
    
    inline def `set@globalUndefined`: Self = StObject.set(x, "@global", js.undefined)
  }
}
