package typings.grommet

import typings.grommet.baseMod.ThemeType
import typings.grommet.grommetStrings.dark
import typings.grommet.grommetStrings.light
import typings.grommet.grommetStrings.rtl
import typings.grommet.utilsMod.BackgroundType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grommetMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Grommet", "Grommet")
  @js.native
  class Grommet protected ()
    extends Component[
          GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Grommet", "Grommet")
  @js.native
  val Grommet: ComponentClass[
    GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  trait GrommetProps extends StObject {
    
    var background: js.UndefOr[BackgroundType] = js.undefined
    
    var containerTarget: js.UndefOr[HTMLElement] = js.undefined
    
    var cssVars: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[rtl] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[ThemeType] = js.undefined
    
    var themeMode: js.UndefOr[dark | light] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object GrommetProps {
    
    @scala.inline
    def apply(): GrommetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrommetProps]
    }
    
    @scala.inline
    implicit class GrommetPropsMutableBuilder[Self <: GrommetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setContainerTarget(value: HTMLElement): Self = StObject.set(x, "containerTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerTargetUndefined: Self = StObject.set(x, "containerTarget", js.undefined)
      
      @scala.inline
      def setCssVars(value: Boolean): Self = StObject.set(x, "cssVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarsUndefined: Self = StObject.set(x, "cssVars", js.undefined)
      
      @scala.inline
      def setDir(value: rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeMode(value: dark | light): Self = StObject.set(x, "themeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeModeUndefined: Self = StObject.set(x, "themeMode", js.undefined)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
