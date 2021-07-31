package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleObject extends SVGElement {
  
  /**
    * Modify options for the title.
    *
    * @param titleOptions
    *        Options to modify.
    *
    * @param redraw
    *        Whether to redraw the chart after the title is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after.
    */
  def update(titleOptions: TitleOptions): Unit = js.native
  def update(titleOptions: TitleOptions, redraw: Boolean): Unit = js.native
}
