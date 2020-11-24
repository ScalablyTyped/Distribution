package typings.highcharts.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDragStartEventObject extends MouseEvent {
  
  /**
    * Data property being dragged.
    */
  var updateProp: js.UndefOr[String] = js.native
}
