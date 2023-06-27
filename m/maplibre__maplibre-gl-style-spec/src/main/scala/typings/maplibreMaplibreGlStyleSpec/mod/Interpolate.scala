package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`interpolate-hcl`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`interpolate-lab`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.interpolate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "Interpolate")
@js.native
open class Interpolate protected ()
  extends StObject
     with Expression_ {
  def this(
    `type`: InterpolatedValueType,
    operator: interpolate | `interpolate-hcl` | `interpolate-lab`,
    interpolation: InterpolationType,
    input: Expression_,
    stops: Stops
  ) = this()
  
  /* CompleteClass */
  override def eachChild(fn: js.Function1[/* a */ this.type, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def evaluate(ctx: EvaluationContext): Any = js.native
  
  var input: Expression_ = js.native
  
  var interpolation: InterpolationType = js.native
  
  var labels: js.Array[Double] = js.native
  
  var operator: interpolate | `interpolate-hcl` | `interpolate-lab` = js.native
  
  /**
  	 * Statically analyze the expression, attempting to enumerate possible outputs. Returns
  	 * false if the complete set of outputs is statically undecidable, otherwise true.
  	 */
  /* CompleteClass */
  override def outputDefined(): Boolean = js.native
  
  var outputs: js.Array[Expression_] = js.native
  
  /* CompleteClass */
  override val `type`: Type = js.native
  @JSName("type")
  var type_Interpolate: InterpolatedValueType = js.native
}
/* static members */
object Interpolate {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Interpolate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolationFactor(interpolation: InterpolationType, input: Double, lower: Double, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolationFactor")(interpolation.asInstanceOf[js.Any], input.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parse(args: js.Array[Any], context: ParsingContext): Expression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Expression_]
}
