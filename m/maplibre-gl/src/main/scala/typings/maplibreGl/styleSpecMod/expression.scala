package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.maplibreGl.anon.FnCall
import typings.maplibreGl.anon.TypeofStylePropertyFuncti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expression {
  
  @JSImport("maplibre-gl/dist/style-spec", "expression")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.StyleExpression")
  @js.native
  def StyleExpression: Instantiable2[
    /* expression */ Expression_, 
    /* propertySpec */ js.UndefOr[StylePropertySpecification | Null], 
    typings.maplibreGl.styleSpecMod.StyleExpression
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl/dist/style-spec", "expression.StyleExpression")
  @js.native
  open class StyleExpressionCls protected ()
    extends StObject
       with StyleExpression {
    def this(expression: Expression_) = this()
    def this(expression: Expression_, propertySpec: StylePropertySpecification) = this()
  }
  
  inline def StyleExpression_=(
    x: Instantiable2[
      /* expression */ Expression_, 
      /* propertySpec */ js.UndefOr[StylePropertySpecification | Null], 
      StyleExpression
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.StylePropertyFunction")
  @js.native
  def StylePropertyFunction: TypeofStylePropertyFuncti & (Instantiable2[
    /* parameters */ PropertyValueSpecification[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    /* specification */ StylePropertySpecification, 
    typings.maplibreGl.styleSpecMod.StylePropertyFunction[js.Object]
  ]) = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl/dist/style-spec", "expression.StylePropertyFunction")
  @js.native
  open class StylePropertyFunctionCls[T] protected ()
    extends StObject
       with StylePropertyFunction[T] {
    def this(
      parameters: PropertyValueSpecification[/* import warning: RewrittenClass.unapply cls was tparam T */ Any],
      specification: StylePropertySpecification
    ) = this()
  }
  
  inline def StylePropertyFunction_=(
    x: TypeofStylePropertyFuncti & (Instantiable2[
      /* parameters */ PropertyValueSpecification[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      /* specification */ StylePropertySpecification, 
      StylePropertyFunction[js.Object]
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StylePropertyFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.ZoomConstantExpression")
  @js.native
  def ZoomConstantExpression: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam Kind */ /* kind */ Any, 
    /* expression */ StyleExpression, 
    typings.maplibreGl.styleSpecMod.ZoomConstantExpression[EvaluationKind]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl/dist/style-spec", "expression.ZoomConstantExpression")
  @js.native
  open class ZoomConstantExpressionCls[Kind /* <: EvaluationKind */] protected ()
    extends StObject
       with ZoomConstantExpression[Kind] {
    def this(
      kind: /* import warning: RewrittenClass.unapply cls was tparam Kind */ Any,
      expression: StyleExpression
    ) = this()
  }
  
  inline def ZoomConstantExpression_=(
    x: Instantiable2[
      /* import warning: RewrittenClass.unapply cls was tparam Kind */ /* kind */ Any, 
      /* expression */ StyleExpression, 
      ZoomConstantExpression[EvaluationKind]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZoomConstantExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.ZoomDependentExpression")
  @js.native
  def ZoomDependentExpression: Instantiable4[
    /* import warning: RewrittenClass.unapply cls was tparam Kind */ /* kind */ Any, 
    /* expression */ StyleExpression, 
    /* zoomStops */ js.Array[Double], 
    /* interpolationType */ js.UndefOr[InterpolationType], 
    typings.maplibreGl.styleSpecMod.ZoomDependentExpression[EvaluationKind]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl/dist/style-spec", "expression.ZoomDependentExpression")
  @js.native
  open class ZoomDependentExpressionCls[Kind /* <: EvaluationKind */] protected ()
    extends StObject
       with ZoomDependentExpression[Kind] {
    def this(
      kind: /* import warning: RewrittenClass.unapply cls was tparam Kind */ Any,
      expression: StyleExpression,
      zoomStops: js.Array[Double]
    ) = this()
    def this(
      kind: /* import warning: RewrittenClass.unapply cls was tparam Kind */ Any,
      expression: StyleExpression,
      zoomStops: js.Array[Double],
      interpolationType: InterpolationType
    ) = this()
  }
  
  inline def ZoomDependentExpression_=(
    x: Instantiable4[
      /* import warning: RewrittenClass.unapply cls was tparam Kind */ /* kind */ Any, 
      /* expression */ StyleExpression, 
      /* zoomStops */ js.Array[Double], 
      /* interpolationType */ js.UndefOr[InterpolationType], 
      ZoomDependentExpression[EvaluationKind]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZoomDependentExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.createExpression")
  @js.native
  def createExpression: js.Function2[
    /* expression */ Any, 
    /* propertySpec */ js.UndefOr[StylePropertySpecification | Null], 
    Result[StyleExpression, js.Array[ExpressionParsingError]]
  ] = js.native
  inline def createExpression(expression: Any): Result[StyleExpression, js.Array[ExpressionParsingError]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Result[StyleExpression, js.Array[ExpressionParsingError]]]
  inline def createExpression(expression: Any, propertySpec: StylePropertySpecification): Result[StyleExpression, js.Array[ExpressionParsingError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")(expression.asInstanceOf[js.Any], propertySpec.asInstanceOf[js.Any])).asInstanceOf[Result[StyleExpression, js.Array[ExpressionParsingError]]]
  inline def createExpression_=(
    x: js.Function2[
      /* expression */ Any, 
      /* propertySpec */ js.UndefOr[StylePropertySpecification | Null], 
      Result[StyleExpression, js.Array[ExpressionParsingError]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.createPropertyExpression")
  @js.native
  def createPropertyExpression: js.Function2[
    /* expressionInput */ Any, 
    /* propertySpec */ StylePropertySpecification, 
    Result[StylePropertyExpression, js.Array[ExpressionParsingError]]
  ] = js.native
  inline def createPropertyExpression(expressionInput: Any, propertySpec: StylePropertySpecification): Result[StylePropertyExpression, js.Array[ExpressionParsingError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropertyExpression")(expressionInput.asInstanceOf[js.Any], propertySpec.asInstanceOf[js.Any])).asInstanceOf[Result[StylePropertyExpression, js.Array[ExpressionParsingError]]]
  inline def createPropertyExpression_=(
    x: js.Function2[
      /* expressionInput */ Any, 
      /* propertySpec */ StylePropertySpecification, 
      Result[StylePropertyExpression, js.Array[ExpressionParsingError]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createPropertyExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.isExpression")
  @js.native
  def isExpression: js.Function1[/* expression */ Any, Boolean] = js.native
  inline def isExpression(expression: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.isExpressionFilter")
  @js.native
  def isExpressionFilter: js.Function1[
    /* filter */ Any, 
    /* is maplibre-gl.maplibre-gl/dist/style-spec.ExpressionFilterSpecification */ Boolean
  ] = js.native
  inline def isExpressionFilter(filter: Any): /* is maplibre-gl.maplibre-gl/dist/style-spec.ExpressionFilterSpecification */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[/* is maplibre-gl.maplibre-gl/dist/style-spec.ExpressionFilterSpecification */ Boolean]
  inline def isExpressionFilter_=(
    x: js.Function1[
      /* filter */ Any, 
      /* is maplibre-gl.maplibre-gl/dist/style-spec.ExpressionFilterSpecification */ Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExpressionFilter")(x.asInstanceOf[js.Any])
  
  inline def isExpression_=(x: js.Function1[/* expression */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExpression")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "expression.normalizePropertyExpression")
  @js.native
  def normalizePropertyExpression: FnCall = js.native
  inline def normalizePropertyExpression[T](value: PropertyValueSpecification[T], specification: StylePropertySpecification): StylePropertyExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizePropertyExpression")(value.asInstanceOf[js.Any], specification.asInstanceOf[js.Any])).asInstanceOf[StylePropertyExpression]
  inline def normalizePropertyExpression_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePropertyExpression")(x.asInstanceOf[js.Any])
}
