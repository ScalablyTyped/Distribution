package typings.linguiReact

import typings.linguiReact.renderMod.RenderProps
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
    
    @scala.inline
    def apply[V, FormatOptions](value: V): FormatPropsWithoutI18n[V, FormatOptions] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
    }
    
    @scala.inline
    implicit class FormatPropsWithoutI18nMutableBuilder[Self <: FormatPropsWithoutI18n[?, ?], V, FormatOptions] (val x: Self & (FormatPropsWithoutI18n[V, FormatOptions])) extends AnyVal {
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
