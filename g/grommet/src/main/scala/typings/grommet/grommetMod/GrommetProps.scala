package typings.grommet.grommetMod

import typings.grommet.baseMod.ThemeType
import typings.grommet.grommetStrings.dark
import typings.grommet.grommetStrings.light
import typings.grommet.grommetStrings.rtl
import typings.grommet.utilsMod.BackgroundType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrommetProps extends js.Object {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var containerTarget: js.UndefOr[HTMLElement] = js.native
  
  var cssVars: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[rtl] = js.native
  
  var full: js.UndefOr[Boolean] = js.native
  
  var plain: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[ThemeType] = js.native
  
  var themeMode: js.UndefOr[dark | light] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object GrommetProps {
  
  @scala.inline
  def apply(): GrommetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrommetProps]
  }
  
  @scala.inline
  implicit class GrommetPropsOps[Self <: GrommetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setContainerTarget(value: HTMLElement): Self = this.set("containerTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerTarget: Self = this.set("containerTarget", js.undefined)
    
    @scala.inline
    def setCssVars(value: Boolean): Self = this.set("cssVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssVars: Self = this.set("cssVars", js.undefined)
    
    @scala.inline
    def setDir(value: rtl): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeType): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThemeMode(value: dark | light): Self = this.set("themeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeMode: Self = this.set("themeMode", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
