package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `fill-sort-key`: js.UndefOr[Double | Expression] = js.undefined
}
object FillLayout {
  
  @scala.inline
  def apply(): FillLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillLayout]
  }
  
  @scala.inline
  implicit class FillLayoutMutableBuilder[Self <: FillLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFill-sort-key`(value: Double | Expression): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-sort-keyUndefined`: Self = StObject.set(x, "fill-sort-key", js.undefined)
  }
}
