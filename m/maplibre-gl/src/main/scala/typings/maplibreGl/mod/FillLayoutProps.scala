package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillLayoutProps extends StObject {
  
  var `fill-sort-key`: DataDrivenProperty[Double]
}
object FillLayoutProps {
  
  inline def apply(`fill-sort-key`: DataDrivenProperty[Double]): FillLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-sort-key")(`fill-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillLayoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillLayoutProps] (val x: Self) extends AnyVal {
    
    inline def `setFill-sort-key`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
  }
}
