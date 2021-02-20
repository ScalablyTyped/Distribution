package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionObject extends SVGElement {
  
  /**
    * Modify options for the caption.
    *
    * @param captionOptions
    *        Options to modify.
    *
    * @param redraw
    *        Whether to redraw the chart after the caption is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after.
    */
  def update(captionOptions: CaptionOptions): Unit = js.native
  def update(captionOptions: CaptionOptions, redraw: Boolean): Unit = js.native
}
