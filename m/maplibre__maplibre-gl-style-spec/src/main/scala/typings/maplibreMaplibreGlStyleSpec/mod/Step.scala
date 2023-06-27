package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "Step")
@js.native
open class Step protected ()
  extends StObject
     with Expression_ {
  def this(`type`: Type, input: Expression_, stops: Stops) = this()
  
  /* CompleteClass */
  override def eachChild(fn: js.Function1[/* a */ this.type, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def evaluate(ctx: EvaluationContext): Any = js.native
  
  var input: Expression_ = js.native
  
  var labels: js.Array[Double] = js.native
  
  /**
  	 * Statically analyze the expression, attempting to enumerate possible outputs. Returns
  	 * false if the complete set of outputs is statically undecidable, otherwise true.
  	 */
  /* CompleteClass */
  override def outputDefined(): Boolean = js.native
  
  var outputs: js.Array[Expression_] = js.native
  
  /* CompleteClass */
  override val `type`: Type = js.native
}
/* static members */
object Step {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Step")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(args: js.Array[Any], context: ParsingContext): Expression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Expression_]
}
