package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.bevel
import typings.maplibreGl.maplibreGlStrings.butt
import typings.maplibreGl.maplibreGlStrings.miter
import typings.maplibreGl.maplibreGlStrings.round
import typings.maplibreGl.maplibreGlStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayoutProps extends StObject {
  
  var `line-cap`: DataConstantProperty[butt | round | square]
  
  var `line-join`: DataDrivenProperty[bevel | round | miter]
  
  var `line-miter-limit`: DataConstantProperty[Double]
  
  var `line-round-limit`: DataConstantProperty[Double]
  
  var `line-sort-key`: DataDrivenProperty[Double]
}
object LineLayoutProps {
  
  inline def apply(
    `line-cap`: DataConstantProperty[butt | round | square],
    `line-join`: DataDrivenProperty[bevel | round | miter],
    `line-miter-limit`: DataConstantProperty[Double],
    `line-round-limit`: DataConstantProperty[Double],
    `line-sort-key`: DataDrivenProperty[Double]
  ): LineLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-join")(`line-join`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-miter-limit")(`line-miter-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-round-limit")(`line-round-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-sort-key")(`line-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLayoutProps]
  }
  
  extension [Self <: LineLayoutProps](x: Self) {
    
    inline def `setLine-cap`(value: DataConstantProperty[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-join`(value: DataDrivenProperty[bevel | round | miter]): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limit`(value: DataConstantProperty[Double]): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limit`(value: DataConstantProperty[Double]): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-key`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
  }
}
