package typings.linguiReact

import typings.linguiReact.renderMod.RenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFormatMod {
  
  @js.native
  trait FormatPropsWithoutI18n[V, FormatOptions] extends RenderProps {
    
    var format: js.UndefOr[FormatOptions] = js.native
    
    var value: V = js.native
  }
  object FormatPropsWithoutI18n {
    
    @scala.inline
    def apply[V, FormatOptions](value: V): FormatPropsWithoutI18n[V, FormatOptions] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
    }
    
    @scala.inline
    implicit class FormatPropsWithoutI18nMutableBuilder[Self <: FormatPropsWithoutI18n[_, _], V, FormatOptions] (val x: Self with (FormatPropsWithoutI18n[V, FormatOptions])) extends AnyVal {
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
