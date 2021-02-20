package typings.grommetIcons

import typings.grommetIcons.anon.Colors
import typings.grommetIcons.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesMod {
  
  object base {
    
    @JSImport("grommet-icons/themes", "base")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grommet-icons/themes", "base.global")
    @js.native
    def global: Colors = js.native
    @scala.inline
    def global_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("grommet-icons/themes", "base.icon")
    @js.native
    def icon: Size = js.native
    @scala.inline
    def icon_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
  }
}
