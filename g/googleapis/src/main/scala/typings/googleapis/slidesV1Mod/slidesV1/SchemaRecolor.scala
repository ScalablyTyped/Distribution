package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A recolor effect applied on an image.
  */
trait SchemaRecolor extends StObject {
  
  /**
    * The name of the recolor effect.  The name is determined from the
    * `recolor_stops` by matching the gradient against the colors in the
    * page&#39;s current color scheme. This property is read-only.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The recolor effect is represented by a gradient, which is a list of color
    * stops.  The colors in the gradient will replace the corresponding colors
    * at the same position in the color palette and apply to the image. This
    * property is read-only.
    */
  var recolorStops: js.UndefOr[js.Array[SchemaColorStop]] = js.undefined
}
object SchemaRecolor {
  
  inline def apply(): SchemaRecolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecolor]
  }
  
  extension [Self <: SchemaRecolor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecolorStops(value: js.Array[SchemaColorStop]): Self = StObject.set(x, "recolorStops", value.asInstanceOf[js.Any])
    
    inline def setRecolorStopsUndefined: Self = StObject.set(x, "recolorStops", js.undefined)
    
    inline def setRecolorStopsVarargs(value: SchemaColorStop*): Self = StObject.set(x, "recolorStops", js.Array(value :_*))
  }
}
