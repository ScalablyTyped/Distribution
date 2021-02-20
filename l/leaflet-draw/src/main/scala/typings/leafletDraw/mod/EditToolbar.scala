package typings.leafletDraw.mod

import typings.leafletDraw.mod.Control.DrawConstructorOptions
import typings.leafletDraw.mod.Draw.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "EditToolbar")
@js.native
class EditToolbar () extends Toolbar {
  def this(options: ToolbarOptions) = this()
  
  def getActions(handler: Feature): js.Array[ToolbarAction] = js.native
  
  def getModeHandlers(map: DrawMap): js.Array[ToolbarModeHandler] = js.native
  
  def setOptions(options: DrawConstructorOptions): Unit = js.native
}
object EditToolbar {
  
  @JSImport("leaflet", "EditToolbar.Delete")
  @js.native
  class Delete protected () extends Toolbar {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: ToolbarOptions) = this()
    
    def removeAllLayers(): Unit = js.native
    
    def revertLayers(): Unit = js.native
    
    def save(): Unit = js.native
  }
  
  @JSImport("leaflet", "EditToolbar.Edit")
  @js.native
  class Edit protected () extends Toolbar {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: ToolbarOptions) = this()
    
    def revertLayers(): Unit = js.native
    
    def save(): Unit = js.native
  }
}
