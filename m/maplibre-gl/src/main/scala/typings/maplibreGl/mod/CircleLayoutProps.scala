package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayoutProps extends StObject {
  
  var `circle-sort-key`: DataDrivenProperty[Double]
}
object CircleLayoutProps {
  
  inline def apply(`circle-sort-key`: DataDrivenProperty[Double]): CircleLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("circle-sort-key")(`circle-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLayoutProps] (val x: Self) extends AnyVal {
    
    inline def `setCircle-sort-key`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
  }
}
