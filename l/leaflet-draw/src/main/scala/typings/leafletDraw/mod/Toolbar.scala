package typings.leafletDraw.mod

import typings.leaflet.mod.Class
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Toolbar")
@js.native
class Toolbar () extends Class {
  def this(options: ToolbarOptions) = this()
  
  def addToolbar(map: DrawMap): HTMLElement | Unit = js.native
  
  def removeToolbar(): Unit = js.native
}
