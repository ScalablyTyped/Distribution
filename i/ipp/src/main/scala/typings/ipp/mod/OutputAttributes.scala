package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputAttributes extends StObject {
  
  var `noise-removal`: js.UndefOr[Double] = js.native
  
  var `output-compression-quality-factor`: js.UndefOr[Double] = js.native
}
object OutputAttributes {
  
  @scala.inline
  def apply(): OutputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputAttributes]
  }
  
  @scala.inline
  implicit class OutputAttributesMutableBuilder[Self <: OutputAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setNoise-removal`(value: Double): Self = StObject.set(x, "noise-removal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNoise-removalUndefined`: Self = StObject.set(x, "noise-removal", js.undefined)
    
    @scala.inline
    def `setOutput-compression-quality-factor`(value: Double): Self = StObject.set(x, "output-compression-quality-factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-compression-quality-factorUndefined`: Self = StObject.set(x, "output-compression-quality-factor", js.undefined)
  }
}
