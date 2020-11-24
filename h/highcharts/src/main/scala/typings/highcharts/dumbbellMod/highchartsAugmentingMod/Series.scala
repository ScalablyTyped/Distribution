package typings.highcharts.dumbbellMod.highchartsAugmentingMod

import typings.highcharts.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Series extends js.Object {
  
  /**
    * Get non-presentational attributes for a point. Used internally for
    * both styled mode and classic. Set correct position in link with
    * connector line.
    *
    * @param this
    *        The series of points.
    *
    * @return A hash containing those attributes that are not settable from
    *         CSS.
    */
  def markerAttribs(): SVGAttributes = js.native
}
object Series {
  
  @scala.inline
  def apply(markerAttribs: () => SVGAttributes): Series = {
    val __obj = js.Dynamic.literal(markerAttribs = js.Any.fromFunction0(markerAttribs))
    __obj.asInstanceOf[Series]
  }
  
  @scala.inline
  implicit class SeriesOps[Self <: Series] (val x: Self) extends AnyVal {
    
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
    def setMarkerAttribs(value: () => SVGAttributes): Self = this.set("markerAttribs", js.Any.fromFunction0(value))
  }
}
