package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl/dist/style-spec", "Padding")
@js.native
open class Padding protected ()
  extends StObject
     with _Value {
  def this(values: js.Tuple4[Double, Double, Double, Double]) = this()
  
  /** Padding values are in CSS order: top, right, bottom, left */
  var values: js.Tuple4[Double, Double, Double, Double] = js.native
}
/* static members */
object Padding {
  
  @JSImport("maplibre-gl/dist/style-spec", "Padding")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Numeric padding values
  	 * @returns A `Padding` instance, or `undefined` if the input is not a valid padding value.
  	 */
  inline def parse(): Padding | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Padding | Unit]
  inline def parse(input: js.Array[Double]): Padding | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Padding | Unit]
  inline def parse(input: Double): Padding | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Padding | Unit]
  inline def parse(input: Padding): Padding | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Padding | Unit]
}
