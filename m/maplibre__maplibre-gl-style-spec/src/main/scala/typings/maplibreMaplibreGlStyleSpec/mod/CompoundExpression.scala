package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "CompoundExpression")
@js.native
open class CompoundExpression protected ()
  extends StObject
     with Expression_ {
  def this(name: String, `type`: Type, evaluate: Evaluate, args: js.Array[Expression_]) = this()
  
  def _evaluate(b: EvaluationContext, a: js.Array[Expression_]): Value = js.native
  @JSName("_evaluate")
  var _evaluate_Original: Evaluate = js.native
  
  var args: js.Array[Expression_] = js.native
  
  /* CompleteClass */
  override def eachChild(fn: js.Function1[/* a */ this.type, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def evaluate(ctx: EvaluationContext): Any = js.native
  
  var name: String = js.native
  
  /**
  	 * Statically analyze the expression, attempting to enumerate possible outputs. Returns
  	 * false if the complete set of outputs is statically undecidable, otherwise true.
  	 */
  /* CompleteClass */
  override def outputDefined(): Boolean = js.native
  
  /* CompleteClass */
  override val `type`: Type = js.native
}
/* static members */
object CompoundExpression {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "CompoundExpression")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "CompoundExpression.definitions")
  @js.native
  def definitions: StringDictionary[Definition] = js.native
  inline def definitions_=(x: StringDictionary[Definition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
  
  inline def parse(args: js.Array[Any], context: ParsingContext): Expression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Expression_]
  
  inline def register(registry: ExpressionRegistry, definitions: StringDictionary[Definition]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registry.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
