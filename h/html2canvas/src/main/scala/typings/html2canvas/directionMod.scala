package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.ipropertydescriptorMod.IPropertyIdentValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/direction", "direction")
  @js.native
  val direction: IPropertyIdentValueDescriptor[DIRECTION_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
  */
  trait DIRECTION_ extends StObject
  object DIRECTION_ {
    
    inline def LTR: `0` = 0.asInstanceOf[`0`]
    
    inline def RTL: `1` = 1.asInstanceOf[`1`]
  }
}
