package typings.maplibreGl.mod

import typings.maplibreGl.anon.ClickTolerance
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "MousePitchHandler")
@js.native
open class MousePitchHandler protected () extends MouseHandler {
  def this(options: ClickTolerance) = this()
  
  def contextmenu(e: MouseEvent): scala.Unit = js.native
}
