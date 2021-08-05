package typings.linguiMacro

import typings.linguiMacro.renderMod.RenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFormatMod {
  
  trait FormatPropsWithoutI18n[V, FormatOptions]
    extends StObject
       with RenderProps {
    
    var format: js.UndefOr[FormatOptions] = js.undefined
    
    var value: V
  }
  object FormatPropsWithoutI18n {
    
    inline def apply[V, FormatOptions](value: V): FormatPropsWithoutI18n[V, FormatOptions] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
    }
    
    extension [Self <: FormatPropsWithoutI18n[?, ?], V, FormatOptions](x: Self & (FormatPropsWithoutI18n[V, FormatOptions])) {
      
      inline def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
