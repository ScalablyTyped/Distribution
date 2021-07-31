package typings.inkDivider

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-divider", JSImport.Namespace)
  @js.native
  val ^ : FC[DividerProps] = js.native
  
  trait DividerProps extends StObject {
    
    var dividerChar: js.UndefOr[String] = js.undefined
    
    var dividerColor: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleColor: js.UndefOr[String] = js.undefined
    
    var titlePadding: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object DividerProps {
    
    @scala.inline
    def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    @scala.inline
    implicit class DividerPropsMutableBuilder[Self <: DividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDividerChar(value: String): Self = StObject.set(x, "dividerChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerCharUndefined: Self = StObject.set(x, "dividerChar", js.undefined)
      
      @scala.inline
      def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitlePadding(value: Double): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FC[DividerProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[DividerProps] = ^
}
