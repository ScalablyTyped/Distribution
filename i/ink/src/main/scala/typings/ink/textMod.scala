package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.end
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  /**
    * This component can display text, and change its style to make it colorful, bold, underline, italic or strikethrough.
    */
  @JSImport("ink/build/components/Text", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Same as `color`, but for background.
      */
    val backgroundColor: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundColor */ js.Any, 
          String
        ]
      ] = js.undefined
    
    /**
      * Make the text bold.
      */
    val bold: js.UndefOr[Boolean] = js.undefined
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Change text color. Ink uses chalk under the hood, so all its functionality is supported.
      */
    val color: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any, 
          String
        ]
      ] = js.undefined
    
    /**
      * Dim the color (emit a small amount of light).
      */
    val dimColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverse background and foreground colors.
      */
    val inverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text italic.
      */
    val italic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text crossed with a line.
      */
    val strikethrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text underlined.
      */
    val underline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This property tells Ink to wrap or truncate text if its width is larger than container.
      * If `wrap` is passed (by default), Ink will wrap text and split it into multiple lines.
      * If `truncate-*` is passed, Ink will truncate text instead, which will result in one line of text with the rest cut off.
      */
    val wrap: js.UndefOr[
        typings.ink.inkStrings.wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
      ] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundColor */ js.Any, 
              String
            ]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any, 
              String
            ]
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDimColor(value: Boolean): Self = StObject.set(x, "dimColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimColorUndefined: Self = StObject.set(x, "dimColor", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      @scala.inline
      def setWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: FC[Props] = default
}
