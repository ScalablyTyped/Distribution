package typings.grommet

import typings.grommet.anon.Format
import typings.grommet.anon.Layer
import typings.grommet.grommetStrings.dark
import typings.grommet.grommetStrings.light
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.rtl
import typings.grommet.themesBaseMod.ThemeType
import typings.grommet.utilsMod.BackgroundType
import typings.react.mod.FC
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsGrommetMod {
  
  @JSImport("grommet/components/Grommet", "Grommet")
  @js.native
  val Grommet: FC[GrommetExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'dir'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait GrommetExtendedProps
    extends StObject
       with GrommetProps
  object GrommetExtendedProps {
    
    inline def apply(): GrommetExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrommetExtendedProps]
    }
  }
  
  trait GrommetProps extends StObject {
    
    var background: js.UndefOr[BackgroundType] = js.undefined
    
    var containerTarget: js.UndefOr[HTMLElement] = js.undefined
    
    var cssVars: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[rtl] = js.undefined
    
    var full: js.UndefOr[Boolean | min] = js.undefined
    
    var messages: js.UndefOr[Format] = js.undefined
    
    var onAnalytics: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    var options: js.UndefOr[Layer] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[ThemeType] = js.undefined
    
    var themeMode: js.UndefOr[dark | light] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object GrommetProps {
    
    inline def apply(): GrommetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrommetProps]
    }
    
    extension [Self <: GrommetProps](x: Self) {
      
      inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setContainerTarget(value: HTMLElement): Self = StObject.set(x, "containerTarget", value.asInstanceOf[js.Any])
      
      inline def setContainerTargetUndefined: Self = StObject.set(x, "containerTarget", js.undefined)
      
      inline def setCssVars(value: Boolean): Self = StObject.set(x, "cssVars", value.asInstanceOf[js.Any])
      
      inline def setCssVarsUndefined: Self = StObject.set(x, "cssVars", js.undefined)
      
      inline def setDir(value: rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFull(value: Boolean | min): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setMessages(value: Format): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnAnalytics(value: /* data */ Any => Unit): Self = StObject.set(x, "onAnalytics", js.Any.fromFunction1(value))
      
      inline def setOnAnalyticsUndefined: Self = StObject.set(x, "onAnalytics", js.undefined)
      
      inline def setOptions(value: Layer): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeMode(value: dark | light): Self = StObject.set(x, "themeMode", value.asInstanceOf[js.Any])
      
      inline def setThemeModeUndefined: Self = StObject.set(x, "themeMode", js.undefined)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
