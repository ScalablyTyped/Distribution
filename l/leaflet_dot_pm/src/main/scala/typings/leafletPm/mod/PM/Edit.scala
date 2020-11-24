package typings.leafletPm.mod.PM

import typings.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "PM.Edit")
@js.native
object Edit extends js.Object {
  
  @js.native
  trait LayerGroup extends js.Object {
    
    def disable(): Unit = js.native
    
    def dragging(): Boolean = js.native
    
    def enable(): Unit = js.native
    def enable(options: EditOptions): Unit = js.native
    
    def enabled(): Boolean = js.native
    
    def findLayers(): js.Array[Layer] = js.native
    
    def getOptions(): EditOptions = js.native
    
    def toggleEdit(): Unit = js.native
    def toggleEdit(options: EditOptions): Unit = js.native
  }
  
  @js.native
  trait Line extends js.Object {
    
    def disable(): Unit = js.native
    def disable(poly: Layer): Unit = js.native
    
    def enable(): Unit = js.native
    def enable(options: EditOptions): Unit = js.native
    
    def enabled(): Boolean = js.native
    
    def toggleEdit(): Unit = js.native
    def toggleEdit(options: EditOptions): Unit = js.native
  }
  
  @js.native
  trait Marker extends js.Object {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    def enable(options: EditOptions): Unit = js.native
    
    def enabled(): Boolean = js.native
    
    def toggleEdit(): Unit = js.native
    def toggleEdit(options: EditOptions): Unit = js.native
  }
}
