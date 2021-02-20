package typings.materialUi

import typings.materialUi.MaterialUI.Tabs.TabProps
import typings.materialUi.MaterialUI.Tabs.TabsProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("material-ui/Tabs", JSImport.Default)
  @js.native
  class default () extends Tabs
  
  @JSImport("material-ui/Tabs", "Tab")
  @js.native
  class Tab ()
    extends Component[TabProps, js.Object, js.Any]
  
  @JSImport("material-ui/Tabs", "Tabs")
  @js.native
  class Tabs ()
    extends Component[TabsProps, js.Object, js.Any]
}
