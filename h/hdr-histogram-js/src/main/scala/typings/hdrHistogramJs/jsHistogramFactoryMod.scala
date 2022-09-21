package typings.hdrHistogramJs

import org.scalablytyped.runtime.Instantiable3
import typings.hdrHistogramJs.histogramMod.BitBucketSize
import typings.hdrHistogramJs.jsHistogramMod.JsHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHistogramFactoryMod {
  
  @JSImport("hdr-histogram-js/dist/JsHistogramFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constructorFromBucketSize(bitBucketSize: BitBucketSize): JsHistogramConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("constructorFromBucketSize")(bitBucketSize.asInstanceOf[js.Any]).asInstanceOf[JsHistogramConstructor]
  
  @js.native
  trait JsHistogramConstructor
    extends StObject
       with Instantiable3[
          /* lowestDiscernibleValue */ Double, 
          /* highestTrackableValue */ Double, 
          /* numberOfSignificantValueDigits */ Double, 
          JsHistogram
        ]
}
