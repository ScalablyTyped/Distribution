package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.bevel
import typings.mapboxGl.mapboxGlStrings.butt
import typings.mapboxGl.mapboxGlStrings.miter
import typings.mapboxGl.mapboxGlStrings.round
import typings.mapboxGl.mapboxGlStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineLayout
  extends Layout
     with _AnyLayout {
  
  var `line-cap`: js.UndefOr[butt | round | square] = js.native
  
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.native
  
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.native
  
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.native
  
  var `line-sort-key`: js.UndefOr[Double | Expression] = js.native
}
object LineLayout {
  
  @scala.inline
  def apply(): LineLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLayout]
  }
  
  @scala.inline
  implicit class LineLayoutMutableBuilder[Self <: LineLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setLine-cap`(value: butt | round | square): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    @scala.inline
    def `setLine-join`(value: bevel | round | miter | Expression): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-joinUndefined`: Self = StObject.set(x, "line-join", js.undefined)
    
    @scala.inline
    def `setLine-miter-limit`(value: Double | Expression): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-miter-limitUndefined`: Self = StObject.set(x, "line-miter-limit", js.undefined)
    
    @scala.inline
    def `setLine-round-limit`(value: Double | Expression): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-round-limitUndefined`: Self = StObject.set(x, "line-round-limit", js.undefined)
    
    @scala.inline
    def `setLine-sort-key`(value: Double | Expression): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-sort-keyUndefined`: Self = StObject.set(x, "line-sort-key", js.undefined)
  }
}
