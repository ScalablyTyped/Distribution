package typings.mathjs.anon

import typings.mathjs.mathjsBooleans.`true`
import typings.mathjs.mathjsStrings.asc
import typings.mathjs.mathjsStrings.biased
import typings.mathjs.mathjsStrings.dense
import typings.mathjs.mathjsStrings.desc
import typings.mathjs.mathjsStrings.natural
import typings.mathjs.mathjsStrings.sparse
import typings.mathjs.mathjsStrings.unbiased
import typings.mathjs.mathjsStrings.uncorrected
import typings.mathjs.mod.BigNumber
import typings.mathjs.mod.Complex
import typings.mathjs.mod.ConfigOptions
import typings.mathjs.mod.CreateUnitOptions
import typings.mathjs.mod.EvalFunction
import typings.mathjs.mod.FactoryFunction
import typings.mathjs.mod.FactoryFunctionMap
import typings.mathjs.mod.FormatOptions
import typings.mathjs.mod.Fraction
import typings.mathjs.mod.Help
import typings.mathjs.mod.ImportObject
import typings.mathjs.mod.ImportOptions
import typings.mathjs.mod.Index
import typings.mathjs.mod.MathArray
import typings.mathjs.mod.MathExpression
import typings.mathjs.mod.MathJsChain
import typings.mathjs.mod.MathJsFunctionName
import typings.mathjs.mod.MathJsJson
import typings.mathjs.mod.MathJsStatic
import typings.mathjs.mod.MathNode
import typings.mathjs.mod.MathType
import typings.mathjs.mod.Matrix
import typings.mathjs.mod.NoLiteralType
import typings.mathjs.mod.Parser
import typings.mathjs.mod.PolarCoordinates
import typings.mathjs.mod.Unit
import typings.mathjs.mod.UnitDefinition
import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mathjs.mathjs.MathJsStatic> */
@js.native
trait PartialMathJsStatic extends js.Object {
  var AccessorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ArrayNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var AssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var BigNumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var BlockNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ChainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ComplexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ConditionalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ConstantNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var DenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FibonacciHeapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FunctionAssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FunctionNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var HelpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ImmutableDenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var IndexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var IndexNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var Infinity: js.UndefOr[Double] = js.native
  var InfinityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LN10: js.UndefOr[Double] = js.native
  var LN10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LN2: js.UndefOr[Double] = js.native
  var LN2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LOG10E: js.UndefOr[Double] = js.native
  var LOG10EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LOG2E: js.UndefOr[Double] = js.native
  var LOG2EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var MatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var NaN: js.UndefOr[Double] = js.native
  var NaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var NodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ObjectNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var OperatorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var PIDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ParenthesisNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ParserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RangeNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RelationalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ResultSetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SQRT1_2: js.UndefOr[Double] = js.native
  var SQRT1_2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SQRT2: js.UndefOr[Double] = js.native
  var SQRT2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SpaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SparseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SymbolNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var UnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var abs: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var absDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acos: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acosh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acoshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acoth: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acsc: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acsch: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var add: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var addDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var addScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var all: js.UndefOr[FactoryFunctionMap] = js.native
  var and: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var andDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var applyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var applyTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var arg: js.UndefOr[js.Function1[/* x */ Double | Complex, Double]] = js.native
  var argDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asec: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asecDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asech: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asin: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asinh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atan: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var atan2: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Double]] = js.native
  var atan2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atanh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var atanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atomicMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var avogadroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bellNumbers: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
  var bellNumbersDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bignumber: js.UndefOr[
    js.Function1[
      /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null], 
      BigNumber
    ]
  ] = js.native
  var bignumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitAnd: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var bitAndDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitNot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var bitNotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitOr: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Double]] = js.native
  var bitOrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitXor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var bitXorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bohrMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bohrRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var boltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var boolean: js.UndefOr[
    js.Function1[
      /* x */ String | Double | Boolean | MathArray | Matrix | Null, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var booleanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var catalan: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
  var catalanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cbrt: js.UndefOr[js.Function2[/* x */ Double, /* allRoots */ js.UndefOr[Boolean], Double]] = js.native
  var cbrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ceil: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var ceilDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var chain: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], MathJsChain]] = js.native
  var chainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var classicalElectronRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cloneDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  @JSName("clone")
  var clone_FPartialMathJsStatic: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.native
  var columnDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var columnTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var combinations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var combinationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compare: js.UndefOr[
    js.Function2[
      /* x */ MathType | String, 
      /* y */ MathType | String, 
      Double | BigNumber | Fraction | MathArray | Matrix
    ]
  ] = js.native
  var compareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compareNatural: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.native
  var compareNaturalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compareText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var compareTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compile: js.UndefOr[js.Function1[/* expr */ MathExpression, EvalFunction]] = js.native
  var compileDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var complex: js.UndefOr[js.Function1[/* arg */ js.UndefOr[Complex | String | PolarCoordinates], Complex]] = js.native
  var complexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var composition: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var compositionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var concat: js.UndefOr[js.Function1[/* repeated */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var concatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var concatTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var conductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var config: js.UndefOr[js.Function1[/* options */ ConfigOptions, ConfigOptions]] = js.native
  var conj: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var conjDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cos: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cosh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var coshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cot: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var coth: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var coulombDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var create: js.UndefOr[
    js.Function2[
      /* factories */ FactoryFunctionMap, 
      /* config */ ConfigOptions, 
      Partial[MathJsStatic]
    ]
  ] = js.native
  var createUnit: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* definition */ js.UndefOr[String | UnitDefinition], 
      /* options */ js.UndefOr[CreateUnitOptions], 
      Unit
    ]
  ] = js.native
  var createUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cross: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Matrix | MathArray]
  ] = js.native
  var crossDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var csc: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var csch: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ctransposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cube: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var cubeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var deepEqual: js.UndefOr[
    js.Function2[
      /* x */ MathType, 
      /* y */ MathType, 
      Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
    ]
  ] = js.native
  var deepEqualDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var derivative: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* variable */ MathNode | String, 
      /* options */ js.UndefOr[Simplify], 
      MathNode
    ]
  ] = js.native
  var derivativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var det: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
  var detDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var deuteronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var diag: js.UndefOr[
    js.Function2[/* X */ MathArray | Matrix, /* format */ js.UndefOr[String], Matrix]
  ] = js.native
  var diagDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var distance: js.UndefOr[
    js.Function2[
      /* x */ MathArray | Matrix | js.Object, 
      /* y */ MathArray | Matrix | js.Object, 
      Double | BigNumber
    ]
  ] = js.native
  var distanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var divide: js.UndefOr[js.Function2[/* x */ Unit, /* y */ Unit, Unit]] = js.native
  var divideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var divideScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dot: js.UndefOr[js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Double]] = js.native
  var dotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotDivide: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotDivideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotMultiply: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotMultiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotPow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotPowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var e: js.UndefOr[Double] = js.native
  var eDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var efimovFactorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var electricConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var electronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var elementaryChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var equalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equalScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equalText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var equalTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var erf: js.UndefOr[
    js.Function1[/* x */ Double | MathArray | Matrix, NoLiteralType[Double | MathArray | Matrix]]
  ] = js.native
  var erfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var evalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var evaluate: js.UndefOr[
    js.Function2[
      /* expr */ MathExpression | js.Array[MathExpression] | Matrix, 
      /* scope */ js.UndefOr[js.Object], 
      _
    ]
  ] = js.native
  var evaluateDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var exp: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var expDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expm: js.UndefOr[js.Function1[/* x */ Matrix, Matrix]] = js.native
  var expm1: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var expm1Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expression: js.UndefOr[MathNode] = js.native
  var eyeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var factorial: js.UndefOr[
    js.Function1[
      /* n */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var factorialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var factory: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* dependencies */ js.Array[MathJsFunctionName], 
      /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], 
      /* meta */ js.UndefOr[js.Any], 
      FactoryFunction[_]
    ]
  ] = js.native
  var falseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var faradayDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fermiCouplingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var filter: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray | js.Array[String], 
      /* test */ (js.Function3[
        /* value */ js.Any, 
        /* index */ js.Any, 
        /* matrix */ Matrix | MathArray | js.Array[String], 
        Boolean
      ]) | RegExp, 
      Matrix | MathArray
    ]
  ] = js.native
  var filterDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var filterTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fineStructureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var firstRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fix: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var fixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var flatten: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var flattenDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var floor: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var floorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var forEach: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var forEachDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var forEachTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var format: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], 
      /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]], 
      String
    ]
  ] = js.native
  var formatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fraction: js.UndefOr[
    js.Function1[/* args */ Fraction | MathArray | Matrix, Fraction | MathArray | Matrix]
  ] = js.native
  var fractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gamma: js.UndefOr[js.Function1[/* n */ Double | MathArray | Matrix, Double | MathArray | Matrix]] = js.native
  var gammaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gasConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gcd: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
  var gcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var getMatrixDataTypeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gravitationConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gravityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hartreeEnergyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hasNumericValueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var help: js.UndefOr[js.Function1[/* search */ js.Function0[_], Help]] = js.native
  var helpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hypot: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
  var hypotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var i: js.UndefOr[Double] = js.native
  var iDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var identity: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double] | Matrix | MathArray, 
      /* format */ js.UndefOr[String], 
      Matrix | MathArray | Double
    ]
  ] = js.native
  var identityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var im: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.native
  var imDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var `import`: js.UndefOr[
    js.Function2[
      /* object */ ImportObject | js.Array[ImportObject], 
      /* options */ ImportOptions, 
      scala.Unit
    ]
  ] = js.native
  var index: js.UndefOr[js.Function1[/* repeated */ js.Any, Index]] = js.native
  var indexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var indexTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var intersect: js.UndefOr[
    js.Function4[
      /* w */ MathArray | Matrix, 
      /* x */ MathArray | Matrix, 
      /* y */ MathArray | Matrix, 
      /* z */ MathArray | Matrix, 
      MathArray
    ]
  ] = js.native
  var intersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var inv: js.UndefOr[
    js.Function1[
      /* x */ Double | Complex | MathArray | Matrix, 
      NoLiteralType[Double | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var invDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var inverseConductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isInteger: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix, Boolean]
  ] = js.native
  var isIntegerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNaN: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isNaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNegative: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isNegativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNumeric: js.UndefOr[js.Function1[/* x */ js.Any, Boolean]] = js.native
  var isNumericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isPositive: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isPositiveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isPrime: js.UndefOr[js.Function1[/* x */ Double | BigNumber | MathArray | Matrix, Boolean]] = js.native
  var isPrimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isZero: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex, 
      Boolean
    ]
  ] = js.native
  var isZeroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var json: js.UndefOr[MathJsJson] = js.native
  var kldivergence: js.UndefOr[js.Function2[/* q */ MathArray | Matrix, /* p */ MathArray | Matrix, Double]] = js.native
  var kldivergenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var klitzingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var kron: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ Matrix | MathArray, Matrix]] = js.native
  var kronDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var larger: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var largerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var largerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var largerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lcm: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Double]] = js.native
  var lcmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var leftShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var leftShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* base */ js.UndefOr[Double | BigNumber | Complex], 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var log10: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var log10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log1p: js.UndefOr[
    js.Function2[/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex], Double]
  ] = js.native
  var log1pDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log2: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var log2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var logDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var loschmidtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lsolve: js.UndefOr[
    js.Function2[/* L */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.native
  var lsolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lup: js.UndefOr[js.Function1[/* A */ js.UndefOr[Matrix | MathArray], L]] = js.native
  var lupDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lusolve: js.UndefOr[
    js.Function4[
      /* A */ Matrix | MathArray | Double, 
      /* b */ Matrix | MathArray, 
      /* order */ js.UndefOr[Double], 
      /* threshold */ js.UndefOr[Double], 
      Matrix | MathArray
    ]
  ] = js.native
  var lusolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mad: js.UndefOr[js.Function1[/* array */ MathArray | Matrix, _]] = js.native
  var madDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var magneticConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var magneticFluxQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var map: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* callback */ js.Function3[
        /* value */ js.Any, 
        /* index */ js.Any, 
        /* matrix */ Matrix | MathArray, 
        MathType | String
      ], 
      Matrix | MathArray
    ]
  ] = js.native
  var mapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mapTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var matrix: js.UndefOr[js.Function1[/* format */ js.UndefOr[sparse | dense], Matrix]] = js.native
  var matrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var max: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var maxDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var maxTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mean: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var meanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var meanTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var median: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var medianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var min: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var minDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var minTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mod: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix, 
      /* y */ Double | BigNumber | Fraction | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
    ]
  ] = js.native
  var modDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mode: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var modeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarMassC12Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarVolumeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multinomial: js.UndefOr[
    js.Function1[/* a */ js.Array[Double | BigNumber], NoLiteralType[Double | BigNumber]]
  ] = js.native
  var multinomialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multiply: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ MathType, Matrix | MathArray]] = js.native
  var multiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multiplyScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var neutronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var norm: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* p */ js.UndefOr[Double | BigNumber | String], 
      Double | BigNumber
    ]
  ] = js.native
  var normDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var not: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var notDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nthRoot: js.UndefOr[
    js.Function2[
      /* a */ Double | BigNumber | MathArray | Matrix | Complex, 
      /* root */ js.UndefOr[Double | BigNumber], 
      Double | Complex | MathArray | Matrix
    ]
  ] = js.native
  var nthRootDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nthRootsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nuclearMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var `null`: js.UndefOr[Double] = js.native
  var nullDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var number: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
      ], 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var numberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var numericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ones: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.native
  var onesDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var or: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var orDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var parse: js.UndefOr[
    js.Function2[/* expr */ MathExpression, /* options */ js.UndefOr[js.Any], MathNode]
  ] = js.native
  var parseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var parser: js.UndefOr[js.Function0[Parser]] = js.native
  var parserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var partitionSelect: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* k */ Double, 
      /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])], 
      _
    ]
  ] = js.native
  var partitionSelectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var permutations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ js.UndefOr[Double | BigNumber], 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var permutationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var phi: js.UndefOr[Double] = js.native
  var phiDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pi: js.UndefOr[Double] = js.native
  var piDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pickRandom: js.UndefOr[
    js.Function3[
      /* array */ js.Array[Double], 
      /* number */ js.UndefOr[Double], 
      /* weights */ js.UndefOr[js.Array[Double]], 
      Double | js.Array[Double]
    ]
  ] = js.native
  var pickRandomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckLengthDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckTemperatureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckTimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ Double | BigNumber | Complex, MathType]] = js.native
  var powDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var print: js.UndefOr[
    js.Function4[
      /* template */ String, 
      /* values */ js.Any, 
      /* precision */ js.UndefOr[Double], 
      /* options */ js.UndefOr[Double | js.Object], 
      scala.Unit
    ]
  ] = js.native
  var printDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var prod: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var prodDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var protonMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var qr: js.UndefOr[js.Function1[/* A */ Matrix | MathArray, Q]] = js.native
  var qrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var quantileSeq: js.UndefOr[
    js.Function3[
      /* A */ MathArray | Matrix, 
      /* prob */ Double | BigNumber | MathArray, 
      /* sorted */ js.UndefOr[Boolean], 
      Double | BigNumber | Unit | MathArray
    ]
  ] = js.native
  var quantileSeqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var quantumOfCirculationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var random: js.UndefOr[js.Function2[/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], Double]] = js.native
  var randomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var randomInt: js.UndefOr[js.Function2[/* min */ Double, /* max */ js.UndefOr[Double], Double]] = js.native
  var randomIntDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var range: js.UndefOr[js.Function2[/* str */ String, /* includeEnd */ js.UndefOr[Boolean], Matrix]] = js.native
  var rangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rangeTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rationalize: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* optional */ js.UndefOr[js.Object | Boolean], 
      /* detailed */ js.UndefOr[`true`], 
      Coefficients
    ]
  ] = js.native
  var rationalizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var re: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.native
  var reDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reducedPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reshape: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* sizes */ js.Array[Double], MathArray | Matrix]
  ] = js.native
  var reshapeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var resize: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* size */ MathArray | Matrix, 
      /* defaultValue */ js.UndefOr[Double | String], 
      MathArray | Matrix
    ]
  ] = js.native
  var resizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reviverDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rightArithShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var rightArithShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rightLogShift: js.UndefOr[
    js.Function2[
      /* x */ Double | MathArray | Matrix, 
      /* y */ Double, 
      NoLiteralType[Double | MathArray | Matrix]
    ]
  ] = js.native
  var rightLogShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var round: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, 
      /* n */ js.UndefOr[Double | BigNumber | MathArray], 
      NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var roundDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rowTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rydbergDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sackurTetrodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sec: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var secDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sech: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var secondRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setCartesian: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setCartesianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setDistinct: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var setDistinctDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setIntersect: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setIntersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setIsSubset: js.UndefOr[js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, Boolean]] = js.native
  var setIsSubsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setMultiplicity: js.UndefOr[
    js.Function2[/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix, Double]
  ] = js.native
  var setMultiplicityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setPowerset: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var setPowersetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setSize: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, Double]] = js.native
  var setSizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setSymDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setSymDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setUnion: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setUnionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sign: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var signDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var simplify: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], 
      /* scope */ js.UndefOr[js.Object], 
      MathNode
    ]
  ] = js.native
  var simplifyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sin: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sinh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var size: js.UndefOr[
    js.Function1[
      /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix, 
      MathArray | Matrix
    ]
  ] = js.native
  var sizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var slu: js.UndefOr[
    js.Function3[/* A */ Matrix, /* order */ Double, /* threshold */ Double, js.Object]
  ] = js.native
  var sluDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var smaller: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var smallerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var smallerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var smallerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sort: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural, 
      Matrix | MathArray
    ]
  ] = js.native
  var sortDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sparse: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String], Matrix]
  ] = js.native
  var sparseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var speedOfLightDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var splitUnit: js.UndefOr[js.Function2[/* unit */ Unit, /* parts */ js.Array[Unit], js.Array[Unit]]] = js.native
  var splitUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sqrt: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var sqrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sqrtm: js.UndefOr[js.Function1[/* A */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var sqrtmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var square: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var squareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var squeeze: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var squeezeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var std: js.UndefOr[
    js.Function2[
      /* array */ MathArray | Matrix, 
      /* normalization */ js.UndefOr[unbiased | uncorrected | biased], 
      Double
    ]
  ] = js.native
  var stdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stdTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stefanBoltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stirlingS2: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var stirlingS2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var string: js.UndefOr[js.Function1[/* value */ MathType | Null, String | MathArray | Matrix]] = js.native
  var stringDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subset: js.UndefOr[
    js.Function4[
      /* value */ MathArray | Matrix | String, 
      /* index */ Index, 
      /* replacement */ js.UndefOr[js.Any], 
      /* defaultValue */ js.UndefOr[js.Any], 
      MathArray | Matrix | String
    ]
  ] = js.native
  var subsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subsetTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subtract: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var subtractDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sum: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
  var sumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sumTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tan: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var tanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tanh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var tanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tau: js.UndefOr[Double] = js.native
  var tauDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var thomsonCrossSectionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var to: js.UndefOr[
    js.Function2[
      /* x */ Unit | MathArray | Matrix, 
      /* unit */ Unit | String, 
      Unit | MathArray | Matrix
    ]
  ] = js.native
  var toDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var trace: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
  var traceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var transpose: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var transposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var trueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typeOf: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.native
  var typeOfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typed: js.UndefOr[
    js.Function2[
      /* name */ String, 
      /* signatures */ Record[String, js.Function1[/* repeated */ _, _]], 
      js.Function1[/* repeated */ _, _]
    ]
  ] = js.native
  var typedDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typeofDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unaryMinus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var unaryMinusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unaryPlus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var unaryPlusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unequal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var unequalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var uninitialized: js.UndefOr[js.Any] = js.native
  var unit: js.UndefOr[js.Function1[/* unit */ String, Unit]] = js.native
  var unitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var usolve: js.UndefOr[
    js.Function2[/* U */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.native
  var usolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var vacuumImpedanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var varDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var variance: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
  var varianceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var varianceTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var version: js.UndefOr[String] = js.native
  var versionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var weakMixingAngleDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var wienDisplacementDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var xgcd: js.UndefOr[js.Function2[/* a */ Double | BigNumber, /* b */ Double | BigNumber, MathArray]] = js.native
  var xgcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var xor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var xorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var zeros: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.native
  var zerosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
}

object PartialMathJsStatic {
  @scala.inline
  def apply(): PartialMathJsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMathJsStatic]
  }
  @scala.inline
  implicit class PartialMathJsStaticOps[Self <: PartialMathJsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessorNodeDependencies(value: FactoryFunctionMap): Self = this.set("AccessorNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessorNodeDependencies: Self = this.set("AccessorNodeDependencies", js.undefined)
    @scala.inline
    def setArrayNodeDependencies(value: FactoryFunctionMap): Self = this.set("ArrayNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayNodeDependencies: Self = this.set("ArrayNodeDependencies", js.undefined)
    @scala.inline
    def setAssignmentNodeDependencies(value: FactoryFunctionMap): Self = this.set("AssignmentNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentNodeDependencies: Self = this.set("AssignmentNodeDependencies", js.undefined)
    @scala.inline
    def setBigNumberDependencies(value: FactoryFunctionMap): Self = this.set("BigNumberDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigNumberDependencies: Self = this.set("BigNumberDependencies", js.undefined)
    @scala.inline
    def setBlockNodeDependencies(value: FactoryFunctionMap): Self = this.set("BlockNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockNodeDependencies: Self = this.set("BlockNodeDependencies", js.undefined)
    @scala.inline
    def setChainDependencies(value: FactoryFunctionMap): Self = this.set("ChainDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChainDependencies: Self = this.set("ChainDependencies", js.undefined)
    @scala.inline
    def setComplexDependencies(value: FactoryFunctionMap): Self = this.set("ComplexDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplexDependencies: Self = this.set("ComplexDependencies", js.undefined)
    @scala.inline
    def setConditionalNodeDependencies(value: FactoryFunctionMap): Self = this.set("ConditionalNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalNodeDependencies: Self = this.set("ConditionalNodeDependencies", js.undefined)
    @scala.inline
    def setConstantNodeDependencies(value: FactoryFunctionMap): Self = this.set("ConstantNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantNodeDependencies: Self = this.set("ConstantNodeDependencies", js.undefined)
    @scala.inline
    def setDenseMatrixDependencies(value: FactoryFunctionMap): Self = this.set("DenseMatrixDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDenseMatrixDependencies: Self = this.set("DenseMatrixDependencies", js.undefined)
    @scala.inline
    def setEDependencies(value: FactoryFunctionMap): Self = this.set("EDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEDependencies: Self = this.set("EDependencies", js.undefined)
    @scala.inline
    def setFibonacciHeapDependencies(value: FactoryFunctionMap): Self = this.set("FibonacciHeapDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFibonacciHeapDependencies: Self = this.set("FibonacciHeapDependencies", js.undefined)
    @scala.inline
    def setFractionDependencies(value: FactoryFunctionMap): Self = this.set("FractionDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionDependencies: Self = this.set("FractionDependencies", js.undefined)
    @scala.inline
    def setFunctionAssignmentNodeDependencies(value: FactoryFunctionMap): Self = this.set("FunctionAssignmentNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionAssignmentNodeDependencies: Self = this.set("FunctionAssignmentNodeDependencies", js.undefined)
    @scala.inline
    def setFunctionNodeDependencies(value: FactoryFunctionMap): Self = this.set("FunctionNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionNodeDependencies: Self = this.set("FunctionNodeDependencies", js.undefined)
    @scala.inline
    def setHelpDependencies(value: FactoryFunctionMap): Self = this.set("HelpDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpDependencies: Self = this.set("HelpDependencies", js.undefined)
    @scala.inline
    def setImmutableDenseMatrixDependencies(value: FactoryFunctionMap): Self = this.set("ImmutableDenseMatrixDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutableDenseMatrixDependencies: Self = this.set("ImmutableDenseMatrixDependencies", js.undefined)
    @scala.inline
    def setIndexDependencies(value: FactoryFunctionMap): Self = this.set("IndexDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexDependencies: Self = this.set("IndexDependencies", js.undefined)
    @scala.inline
    def setIndexNodeDependencies(value: FactoryFunctionMap): Self = this.set("IndexNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexNodeDependencies: Self = this.set("IndexNodeDependencies", js.undefined)
    @scala.inline
    def setInfinity(value: Double): Self = this.set("Infinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinity: Self = this.set("Infinity", js.undefined)
    @scala.inline
    def setInfinityDependencies(value: FactoryFunctionMap): Self = this.set("InfinityDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinityDependencies: Self = this.set("InfinityDependencies", js.undefined)
    @scala.inline
    def setLN10(value: Double): Self = this.set("LN10", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLN10: Self = this.set("LN10", js.undefined)
    @scala.inline
    def setLN10Dependencies(value: FactoryFunctionMap): Self = this.set("LN10Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLN10Dependencies: Self = this.set("LN10Dependencies", js.undefined)
    @scala.inline
    def setLN2(value: Double): Self = this.set("LN2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLN2: Self = this.set("LN2", js.undefined)
    @scala.inline
    def setLN2Dependencies(value: FactoryFunctionMap): Self = this.set("LN2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLN2Dependencies: Self = this.set("LN2Dependencies", js.undefined)
    @scala.inline
    def setLOG10E(value: Double): Self = this.set("LOG10E", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOG10E: Self = this.set("LOG10E", js.undefined)
    @scala.inline
    def setLOG10EDependencies(value: FactoryFunctionMap): Self = this.set("LOG10EDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOG10EDependencies: Self = this.set("LOG10EDependencies", js.undefined)
    @scala.inline
    def setLOG2E(value: Double): Self = this.set("LOG2E", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOG2E: Self = this.set("LOG2E", js.undefined)
    @scala.inline
    def setLOG2EDependencies(value: FactoryFunctionMap): Self = this.set("LOG2EDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOG2EDependencies: Self = this.set("LOG2EDependencies", js.undefined)
    @scala.inline
    def setMatrixDependencies(value: FactoryFunctionMap): Self = this.set("MatrixDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrixDependencies: Self = this.set("MatrixDependencies", js.undefined)
    @scala.inline
    def setNaN(value: Double): Self = this.set("NaN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaN: Self = this.set("NaN", js.undefined)
    @scala.inline
    def setNaNDependencies(value: FactoryFunctionMap): Self = this.set("NaNDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaNDependencies: Self = this.set("NaNDependencies", js.undefined)
    @scala.inline
    def setNodeDependencies(value: FactoryFunctionMap): Self = this.set("NodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeDependencies: Self = this.set("NodeDependencies", js.undefined)
    @scala.inline
    def setObjectNodeDependencies(value: FactoryFunctionMap): Self = this.set("ObjectNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectNodeDependencies: Self = this.set("ObjectNodeDependencies", js.undefined)
    @scala.inline
    def setOperatorNodeDependencies(value: FactoryFunctionMap): Self = this.set("OperatorNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorNodeDependencies: Self = this.set("OperatorNodeDependencies", js.undefined)
    @scala.inline
    def setPIDependencies(value: FactoryFunctionMap): Self = this.set("PIDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePIDependencies: Self = this.set("PIDependencies", js.undefined)
    @scala.inline
    def setParenthesisNodeDependencies(value: FactoryFunctionMap): Self = this.set("ParenthesisNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParenthesisNodeDependencies: Self = this.set("ParenthesisNodeDependencies", js.undefined)
    @scala.inline
    def setParserDependencies(value: FactoryFunctionMap): Self = this.set("ParserDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserDependencies: Self = this.set("ParserDependencies", js.undefined)
    @scala.inline
    def setRangeDependencies(value: FactoryFunctionMap): Self = this.set("RangeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeDependencies: Self = this.set("RangeDependencies", js.undefined)
    @scala.inline
    def setRangeNodeDependencies(value: FactoryFunctionMap): Self = this.set("RangeNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeNodeDependencies: Self = this.set("RangeNodeDependencies", js.undefined)
    @scala.inline
    def setRelationalNodeDependencies(value: FactoryFunctionMap): Self = this.set("RelationalNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalNodeDependencies: Self = this.set("RelationalNodeDependencies", js.undefined)
    @scala.inline
    def setResultSetDependencies(value: FactoryFunctionMap): Self = this.set("ResultSetDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSetDependencies: Self = this.set("ResultSetDependencies", js.undefined)
    @scala.inline
    def setSQRT1_2(value: Double): Self = this.set("SQRT1_2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSQRT1_2: Self = this.set("SQRT1_2", js.undefined)
    @scala.inline
    def setSQRT1_2Dependencies(value: FactoryFunctionMap): Self = this.set("SQRT1_2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSQRT1_2Dependencies: Self = this.set("SQRT1_2Dependencies", js.undefined)
    @scala.inline
    def setSQRT2(value: Double): Self = this.set("SQRT2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSQRT2: Self = this.set("SQRT2", js.undefined)
    @scala.inline
    def setSQRT2Dependencies(value: FactoryFunctionMap): Self = this.set("SQRT2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSQRT2Dependencies: Self = this.set("SQRT2Dependencies", js.undefined)
    @scala.inline
    def setSpaDependencies(value: FactoryFunctionMap): Self = this.set("SpaDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaDependencies: Self = this.set("SpaDependencies", js.undefined)
    @scala.inline
    def setSparseMatrixDependencies(value: FactoryFunctionMap): Self = this.set("SparseMatrixDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparseMatrixDependencies: Self = this.set("SparseMatrixDependencies", js.undefined)
    @scala.inline
    def setSymbolNodeDependencies(value: FactoryFunctionMap): Self = this.set("SymbolNodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolNodeDependencies: Self = this.set("SymbolNodeDependencies", js.undefined)
    @scala.inline
    def setUnitDependencies(value: FactoryFunctionMap): Self = this.set("UnitDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitDependencies: Self = this.set("UnitDependencies", js.undefined)
    @scala.inline
    def setAbs(value: /* x */ Double => Double): Self = this.set("abs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAbs: Self = this.set("abs", js.undefined)
    @scala.inline
    def setAbsDependencies(value: FactoryFunctionMap): Self = this.set("absDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsDependencies: Self = this.set("absDependencies", js.undefined)
    @scala.inline
    def setAcos(value: /* x */ Double => Double): Self = this.set("acos", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcos: Self = this.set("acos", js.undefined)
    @scala.inline
    def setAcosDependencies(value: FactoryFunctionMap): Self = this.set("acosDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcosDependencies: Self = this.set("acosDependencies", js.undefined)
    @scala.inline
    def setAcosh(value: /* x */ Double => Double): Self = this.set("acosh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcosh: Self = this.set("acosh", js.undefined)
    @scala.inline
    def setAcoshDependencies(value: FactoryFunctionMap): Self = this.set("acoshDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcoshDependencies: Self = this.set("acoshDependencies", js.undefined)
    @scala.inline
    def setAcot(value: /* x */ Double => Double): Self = this.set("acot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcot: Self = this.set("acot", js.undefined)
    @scala.inline
    def setAcotDependencies(value: FactoryFunctionMap): Self = this.set("acotDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcotDependencies: Self = this.set("acotDependencies", js.undefined)
    @scala.inline
    def setAcoth(value: /* x */ Double => Double): Self = this.set("acoth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcoth: Self = this.set("acoth", js.undefined)
    @scala.inline
    def setAcothDependencies(value: FactoryFunctionMap): Self = this.set("acothDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcothDependencies: Self = this.set("acothDependencies", js.undefined)
    @scala.inline
    def setAcsc(value: /* x */ Double => Double): Self = this.set("acsc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcsc: Self = this.set("acsc", js.undefined)
    @scala.inline
    def setAcscDependencies(value: FactoryFunctionMap): Self = this.set("acscDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcscDependencies: Self = this.set("acscDependencies", js.undefined)
    @scala.inline
    def setAcsch(value: /* x */ Double => Double): Self = this.set("acsch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAcsch: Self = this.set("acsch", js.undefined)
    @scala.inline
    def setAcschDependencies(value: FactoryFunctionMap): Self = this.set("acschDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcschDependencies: Self = this.set("acschDependencies", js.undefined)
    @scala.inline
    def setAdd(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddDependencies(value: FactoryFunctionMap): Self = this.set("addDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddDependencies: Self = this.set("addDependencies", js.undefined)
    @scala.inline
    def setAddScalarDependencies(value: FactoryFunctionMap): Self = this.set("addScalarDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddScalarDependencies: Self = this.set("addScalarDependencies", js.undefined)
    @scala.inline
    def setAll(value: FactoryFunctionMap): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAnd(
      value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
    ): Self = this.set("and", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    @scala.inline
    def setAndDependencies(value: FactoryFunctionMap): Self = this.set("andDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndDependencies: Self = this.set("andDependencies", js.undefined)
    @scala.inline
    def setApplyDependencies(value: FactoryFunctionMap): Self = this.set("applyDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyDependencies: Self = this.set("applyDependencies", js.undefined)
    @scala.inline
    def setApplyTransformDependencies(value: FactoryFunctionMap): Self = this.set("applyTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyTransformDependencies: Self = this.set("applyTransformDependencies", js.undefined)
    @scala.inline
    def setArg(value: /* x */ Double | Complex => Double): Self = this.set("arg", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    @scala.inline
    def setArgDependencies(value: FactoryFunctionMap): Self = this.set("argDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgDependencies: Self = this.set("argDependencies", js.undefined)
    @scala.inline
    def setAsec(value: /* x */ Double => Double): Self = this.set("asec", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAsec: Self = this.set("asec", js.undefined)
    @scala.inline
    def setAsecDependencies(value: FactoryFunctionMap): Self = this.set("asecDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsecDependencies: Self = this.set("asecDependencies", js.undefined)
    @scala.inline
    def setAsech(value: /* x */ Double => Double): Self = this.set("asech", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAsech: Self = this.set("asech", js.undefined)
    @scala.inline
    def setAsechDependencies(value: FactoryFunctionMap): Self = this.set("asechDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsechDependencies: Self = this.set("asechDependencies", js.undefined)
    @scala.inline
    def setAsin(value: /* x */ Double => Double): Self = this.set("asin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAsin: Self = this.set("asin", js.undefined)
    @scala.inline
    def setAsinDependencies(value: FactoryFunctionMap): Self = this.set("asinDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsinDependencies: Self = this.set("asinDependencies", js.undefined)
    @scala.inline
    def setAsinh(value: /* x */ Double => Double): Self = this.set("asinh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAsinh: Self = this.set("asinh", js.undefined)
    @scala.inline
    def setAsinhDependencies(value: FactoryFunctionMap): Self = this.set("asinhDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsinhDependencies: Self = this.set("asinhDependencies", js.undefined)
    @scala.inline
    def setAtan(value: /* x */ Double => Double): Self = this.set("atan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAtan: Self = this.set("atan", js.undefined)
    @scala.inline
    def setAtan2(value: (/* y */ Double, /* x */ Double) => Double): Self = this.set("atan2", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAtan2: Self = this.set("atan2", js.undefined)
    @scala.inline
    def setAtan2Dependencies(value: FactoryFunctionMap): Self = this.set("atan2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtan2Dependencies: Self = this.set("atan2Dependencies", js.undefined)
    @scala.inline
    def setAtanDependencies(value: FactoryFunctionMap): Self = this.set("atanDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtanDependencies: Self = this.set("atanDependencies", js.undefined)
    @scala.inline
    def setAtanh(value: /* x */ Double => Double): Self = this.set("atanh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAtanh: Self = this.set("atanh", js.undefined)
    @scala.inline
    def setAtanhDependencies(value: FactoryFunctionMap): Self = this.set("atanhDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtanhDependencies: Self = this.set("atanhDependencies", js.undefined)
    @scala.inline
    def setAtomicMassDependencies(value: FactoryFunctionMap): Self = this.set("atomicMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtomicMassDependencies: Self = this.set("atomicMassDependencies", js.undefined)
    @scala.inline
    def setAvogadroDependencies(value: FactoryFunctionMap): Self = this.set("avogadroDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvogadroDependencies: Self = this.set("avogadroDependencies", js.undefined)
    @scala.inline
    def setBellNumbers(value: /* n */ Double => Double): Self = this.set("bellNumbers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBellNumbers: Self = this.set("bellNumbers", js.undefined)
    @scala.inline
    def setBellNumbersDependencies(value: FactoryFunctionMap): Self = this.set("bellNumbersDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBellNumbersDependencies: Self = this.set("bellNumbersDependencies", js.undefined)
    @scala.inline
    def setBignumber(
      value: /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null] => BigNumber
    ): Self = this.set("bignumber", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBignumber: Self = this.set("bignumber", js.undefined)
    @scala.inline
    def setBitAnd(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = this.set("bitAnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBitAnd: Self = this.set("bitAnd", js.undefined)
    @scala.inline
    def setBitAndDependencies(value: FactoryFunctionMap): Self = this.set("bitAndDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitAndDependencies: Self = this.set("bitAndDependencies", js.undefined)
    @scala.inline
    def setBitNot(value: /* x */ Double => Double): Self = this.set("bitNot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBitNot: Self = this.set("bitNot", js.undefined)
    @scala.inline
    def setBitNotDependencies(value: FactoryFunctionMap): Self = this.set("bitNotDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitNotDependencies: Self = this.set("bitNotDependencies", js.undefined)
    @scala.inline
    def setBitOr(value: (/* x */ Double, /* y */ Double) => Double): Self = this.set("bitOr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBitOr: Self = this.set("bitOr", js.undefined)
    @scala.inline
    def setBitOrDependencies(value: FactoryFunctionMap): Self = this.set("bitOrDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitOrDependencies: Self = this.set("bitOrDependencies", js.undefined)
    @scala.inline
    def setBitXor(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = this.set("bitXor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBitXor: Self = this.set("bitXor", js.undefined)
    @scala.inline
    def setBitXorDependencies(value: FactoryFunctionMap): Self = this.set("bitXorDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitXorDependencies: Self = this.set("bitXorDependencies", js.undefined)
    @scala.inline
    def setBohrMagnetonDependencies(value: FactoryFunctionMap): Self = this.set("bohrMagnetonDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBohrMagnetonDependencies: Self = this.set("bohrMagnetonDependencies", js.undefined)
    @scala.inline
    def setBohrRadiusDependencies(value: FactoryFunctionMap): Self = this.set("bohrRadiusDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBohrRadiusDependencies: Self = this.set("bohrRadiusDependencies", js.undefined)
    @scala.inline
    def setBoltzmannDependencies(value: FactoryFunctionMap): Self = this.set("boltzmannDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoltzmannDependencies: Self = this.set("boltzmannDependencies", js.undefined)
    @scala.inline
    def setBoolean(
      value: /* x */ String | Double | Boolean | MathArray | Matrix | Null => Boolean | MathArray | Matrix
    ): Self = this.set("boolean", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setBooleanDependencies(value: FactoryFunctionMap): Self = this.set("booleanDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanDependencies: Self = this.set("booleanDependencies", js.undefined)
    @scala.inline
    def setCatalan(value: /* n */ Double => Double): Self = this.set("catalan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCatalan: Self = this.set("catalan", js.undefined)
    @scala.inline
    def setCatalanDependencies(value: FactoryFunctionMap): Self = this.set("catalanDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalanDependencies: Self = this.set("catalanDependencies", js.undefined)
    @scala.inline
    def setCbrt(value: (/* x */ Double, /* allRoots */ js.UndefOr[Boolean]) => Double): Self = this.set("cbrt", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCbrt: Self = this.set("cbrt", js.undefined)
    @scala.inline
    def setCbrtDependencies(value: FactoryFunctionMap): Self = this.set("cbrtDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCbrtDependencies: Self = this.set("cbrtDependencies", js.undefined)
    @scala.inline
    def setCeil(value: /* x */ Double => Double): Self = this.set("ceil", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCeil: Self = this.set("ceil", js.undefined)
    @scala.inline
    def setCeilDependencies(value: FactoryFunctionMap): Self = this.set("ceilDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCeilDependencies: Self = this.set("ceilDependencies", js.undefined)
    @scala.inline
    def setChain(value: /* value */ js.UndefOr[js.Any] => MathJsChain): Self = this.set("chain", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    @scala.inline
    def setClassicalElectronRadiusDependencies(value: FactoryFunctionMap): Self = this.set("classicalElectronRadiusDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassicalElectronRadiusDependencies: Self = this.set("classicalElectronRadiusDependencies", js.undefined)
    @scala.inline
    def setClone(value: /* x */ js.Any => _): Self = this.set("clone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setCloneDependencies(value: FactoryFunctionMap): Self = this.set("cloneDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloneDependencies: Self = this.set("cloneDependencies", js.undefined)
    @scala.inline
    def setColumnDependencies(value: FactoryFunctionMap): Self = this.set("columnDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDependencies: Self = this.set("columnDependencies", js.undefined)
    @scala.inline
    def setColumnTransformDependencies(value: FactoryFunctionMap): Self = this.set("columnTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnTransformDependencies: Self = this.set("columnTransformDependencies", js.undefined)
    @scala.inline
    def setCombinations(
      value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
    ): Self = this.set("combinations", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCombinations: Self = this.set("combinations", js.undefined)
    @scala.inline
    def setCombinationsDependencies(value: FactoryFunctionMap): Self = this.set("combinationsDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinationsDependencies: Self = this.set("combinationsDependencies", js.undefined)
    @scala.inline
    def setCompare(
      value: (/* x */ MathType | String, /* y */ MathType | String) => Double | BigNumber | Fraction | MathArray | Matrix
    ): Self = this.set("compare", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    @scala.inline
    def setCompareDependencies(value: FactoryFunctionMap): Self = this.set("compareDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareDependencies: Self = this.set("compareDependencies", js.undefined)
    @scala.inline
    def setCompareNatural(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = this.set("compareNatural", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompareNatural: Self = this.set("compareNatural", js.undefined)
    @scala.inline
    def setCompareNaturalDependencies(value: FactoryFunctionMap): Self = this.set("compareNaturalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareNaturalDependencies: Self = this.set("compareNaturalDependencies", js.undefined)
    @scala.inline
    def setCompareText(
      value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
    ): Self = this.set("compareText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompareText: Self = this.set("compareText", js.undefined)
    @scala.inline
    def setCompareTextDependencies(value: FactoryFunctionMap): Self = this.set("compareTextDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareTextDependencies: Self = this.set("compareTextDependencies", js.undefined)
    @scala.inline
    def setCompile(value: /* expr */ MathExpression => EvalFunction): Self = this.set("compile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    @scala.inline
    def setCompileDependencies(value: FactoryFunctionMap): Self = this.set("compileDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompileDependencies: Self = this.set("compileDependencies", js.undefined)
    @scala.inline
    def setComplex(value: /* arg */ js.UndefOr[Complex | String | PolarCoordinates] => Complex): Self = this.set("complex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplex: Self = this.set("complex", js.undefined)
    @scala.inline
    def setComposition(
      value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
    ): Self = this.set("composition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComposition: Self = this.set("composition", js.undefined)
    @scala.inline
    def setCompositionDependencies(value: FactoryFunctionMap): Self = this.set("compositionDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositionDependencies: Self = this.set("compositionDependencies", js.undefined)
    @scala.inline
    def setConcat(value: /* repeated */ MathArray | Matrix => MathArray | Matrix): Self = this.set("concat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConcat: Self = this.set("concat", js.undefined)
    @scala.inline
    def setConcatDependencies(value: FactoryFunctionMap): Self = this.set("concatDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcatDependencies: Self = this.set("concatDependencies", js.undefined)
    @scala.inline
    def setConcatTransformDependencies(value: FactoryFunctionMap): Self = this.set("concatTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcatTransformDependencies: Self = this.set("concatTransformDependencies", js.undefined)
    @scala.inline
    def setConductanceQuantumDependencies(value: FactoryFunctionMap): Self = this.set("conductanceQuantumDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConductanceQuantumDependencies: Self = this.set("conductanceQuantumDependencies", js.undefined)
    @scala.inline
    def setConfig(value: /* options */ ConfigOptions => ConfigOptions): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setConj(
      value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ): Self = this.set("conj", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConj: Self = this.set("conj", js.undefined)
    @scala.inline
    def setConjDependencies(value: FactoryFunctionMap): Self = this.set("conjDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConjDependencies: Self = this.set("conjDependencies", js.undefined)
    @scala.inline
    def setCos(value: /* x */ Double | Unit => Double): Self = this.set("cos", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCos: Self = this.set("cos", js.undefined)
    @scala.inline
    def setCosDependencies(value: FactoryFunctionMap): Self = this.set("cosDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCosDependencies: Self = this.set("cosDependencies", js.undefined)
    @scala.inline
    def setCosh(value: /* x */ Double | Unit => Double): Self = this.set("cosh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCosh: Self = this.set("cosh", js.undefined)
    @scala.inline
    def setCoshDependencies(value: FactoryFunctionMap): Self = this.set("coshDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoshDependencies: Self = this.set("coshDependencies", js.undefined)
    @scala.inline
    def setCot(value: /* x */ Double | Unit => Double): Self = this.set("cot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCot: Self = this.set("cot", js.undefined)
    @scala.inline
    def setCotDependencies(value: FactoryFunctionMap): Self = this.set("cotDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCotDependencies: Self = this.set("cotDependencies", js.undefined)
    @scala.inline
    def setCoth(value: /* x */ Double | Unit => Double): Self = this.set("coth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCoth: Self = this.set("coth", js.undefined)
    @scala.inline
    def setCothDependencies(value: FactoryFunctionMap): Self = this.set("cothDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCothDependencies: Self = this.set("cothDependencies", js.undefined)
    @scala.inline
    def setCoulombDependencies(value: FactoryFunctionMap): Self = this.set("coulombDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoulombDependencies: Self = this.set("coulombDependencies", js.undefined)
    @scala.inline
    def setCreate(value: (/* factories */ FactoryFunctionMap, /* config */ ConfigOptions) => Partial[MathJsStatic]): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCreateUnit(
      value: (/* name */ String, /* definition */ js.UndefOr[String | UnitDefinition], /* options */ js.UndefOr[CreateUnitOptions]) => Unit
    ): Self = this.set("createUnit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreateUnit: Self = this.set("createUnit", js.undefined)
    @scala.inline
    def setCreateUnitDependencies(value: FactoryFunctionMap): Self = this.set("createUnitDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateUnitDependencies: Self = this.set("createUnitDependencies", js.undefined)
    @scala.inline
    def setCross(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Matrix | MathArray): Self = this.set("cross", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCross: Self = this.set("cross", js.undefined)
    @scala.inline
    def setCrossDependencies(value: FactoryFunctionMap): Self = this.set("crossDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDependencies: Self = this.set("crossDependencies", js.undefined)
    @scala.inline
    def setCsc(value: /* x */ Double | Unit => Double): Self = this.set("csc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCsc: Self = this.set("csc", js.undefined)
    @scala.inline
    def setCscDependencies(value: FactoryFunctionMap): Self = this.set("cscDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscDependencies: Self = this.set("cscDependencies", js.undefined)
    @scala.inline
    def setCsch(value: /* x */ Double | Unit => Double): Self = this.set("csch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCsch: Self = this.set("csch", js.undefined)
    @scala.inline
    def setCschDependencies(value: FactoryFunctionMap): Self = this.set("cschDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCschDependencies: Self = this.set("cschDependencies", js.undefined)
    @scala.inline
    def setCtransposeDependencies(value: FactoryFunctionMap): Self = this.set("ctransposeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtransposeDependencies: Self = this.set("ctransposeDependencies", js.undefined)
    @scala.inline
    def setCube(value: /* x */ Double => Double): Self = this.set("cube", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    @scala.inline
    def setCubeDependencies(value: FactoryFunctionMap): Self = this.set("cubeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubeDependencies: Self = this.set("cubeDependencies", js.undefined)
    @scala.inline
    def setDeepEqual(
      value: (/* x */ MathType, /* y */ MathType) => Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
    ): Self = this.set("deepEqual", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeepEqual: Self = this.set("deepEqual", js.undefined)
    @scala.inline
    def setDeepEqualDependencies(value: FactoryFunctionMap): Self = this.set("deepEqualDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepEqualDependencies: Self = this.set("deepEqualDependencies", js.undefined)
    @scala.inline
    def setDerivative(
      value: (/* expr */ MathNode | String, /* variable */ MathNode | String, /* options */ js.UndefOr[Simplify]) => MathNode
    ): Self = this.set("derivative", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDerivative: Self = this.set("derivative", js.undefined)
    @scala.inline
    def setDerivativeDependencies(value: FactoryFunctionMap): Self = this.set("derivativeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivativeDependencies: Self = this.set("derivativeDependencies", js.undefined)
    @scala.inline
    def setDet(value: /* x */ MathArray | Matrix => Double): Self = this.set("det", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDet: Self = this.set("det", js.undefined)
    @scala.inline
    def setDetDependencies(value: FactoryFunctionMap): Self = this.set("detDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetDependencies: Self = this.set("detDependencies", js.undefined)
    @scala.inline
    def setDeuteronMassDependencies(value: FactoryFunctionMap): Self = this.set("deuteronMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeuteronMassDependencies: Self = this.set("deuteronMassDependencies", js.undefined)
    @scala.inline
    def setDiag(value: (/* X */ MathArray | Matrix, /* format */ js.UndefOr[String]) => Matrix): Self = this.set("diag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDiag: Self = this.set("diag", js.undefined)
    @scala.inline
    def setDiagDependencies(value: FactoryFunctionMap): Self = this.set("diagDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagDependencies: Self = this.set("diagDependencies", js.undefined)
    @scala.inline
    def setDistance(
      value: (/* x */ MathArray | Matrix | js.Object, /* y */ MathArray | Matrix | js.Object) => Double | BigNumber
    ): Self = this.set("distance", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setDistanceDependencies(value: FactoryFunctionMap): Self = this.set("distanceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceDependencies: Self = this.set("distanceDependencies", js.undefined)
    @scala.inline
    def setDivide(value: (/* x */ Unit, /* y */ Unit) => Unit): Self = this.set("divide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDivide: Self = this.set("divide", js.undefined)
    @scala.inline
    def setDivideDependencies(value: FactoryFunctionMap): Self = this.set("divideDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivideDependencies: Self = this.set("divideDependencies", js.undefined)
    @scala.inline
    def setDivideScalarDependencies(value: FactoryFunctionMap): Self = this.set("divideScalarDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivideScalarDependencies: Self = this.set("divideScalarDependencies", js.undefined)
    @scala.inline
    def setDot(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Double): Self = this.set("dot", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setDotDependencies(value: FactoryFunctionMap): Self = this.set("dotDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotDependencies: Self = this.set("dotDependencies", js.undefined)
    @scala.inline
    def setDotDivide(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = this.set("dotDivide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDotDivide: Self = this.set("dotDivide", js.undefined)
    @scala.inline
    def setDotDivideDependencies(value: FactoryFunctionMap): Self = this.set("dotDivideDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotDivideDependencies: Self = this.set("dotDivideDependencies", js.undefined)
    @scala.inline
    def setDotMultiply(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = this.set("dotMultiply", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDotMultiply: Self = this.set("dotMultiply", js.undefined)
    @scala.inline
    def setDotMultiplyDependencies(value: FactoryFunctionMap): Self = this.set("dotMultiplyDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotMultiplyDependencies: Self = this.set("dotMultiplyDependencies", js.undefined)
    @scala.inline
    def setDotPow(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = this.set("dotPow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDotPow: Self = this.set("dotPow", js.undefined)
    @scala.inline
    def setDotPowDependencies(value: FactoryFunctionMap): Self = this.set("dotPowDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotPowDependencies: Self = this.set("dotPowDependencies", js.undefined)
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setEfimovFactorDependencies(value: FactoryFunctionMap): Self = this.set("efimovFactorDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEfimovFactorDependencies: Self = this.set("efimovFactorDependencies", js.undefined)
    @scala.inline
    def setElectricConstantDependencies(value: FactoryFunctionMap): Self = this.set("electricConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectricConstantDependencies: Self = this.set("electricConstantDependencies", js.undefined)
    @scala.inline
    def setElectronMassDependencies(value: FactoryFunctionMap): Self = this.set("electronMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronMassDependencies: Self = this.set("electronMassDependencies", js.undefined)
    @scala.inline
    def setElementaryChargeDependencies(value: FactoryFunctionMap): Self = this.set("elementaryChargeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementaryChargeDependencies: Self = this.set("elementaryChargeDependencies", js.undefined)
    @scala.inline
    def setEqual(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("equal", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEqual: Self = this.set("equal", js.undefined)
    @scala.inline
    def setEqualDependencies(value: FactoryFunctionMap): Self = this.set("equalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualDependencies: Self = this.set("equalDependencies", js.undefined)
    @scala.inline
    def setEqualScalarDependencies(value: FactoryFunctionMap): Self = this.set("equalScalarDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualScalarDependencies: Self = this.set("equalScalarDependencies", js.undefined)
    @scala.inline
    def setEqualText(
      value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
    ): Self = this.set("equalText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEqualText: Self = this.set("equalText", js.undefined)
    @scala.inline
    def setEqualTextDependencies(value: FactoryFunctionMap): Self = this.set("equalTextDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualTextDependencies: Self = this.set("equalTextDependencies", js.undefined)
    @scala.inline
    def setErf(value: /* x */ Double | MathArray | Matrix => NoLiteralType[Double | MathArray | Matrix]): Self = this.set("erf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErf: Self = this.set("erf", js.undefined)
    @scala.inline
    def setErfDependencies(value: FactoryFunctionMap): Self = this.set("erfDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErfDependencies: Self = this.set("erfDependencies", js.undefined)
    @scala.inline
    def setEvalDependencies(value: FactoryFunctionMap): Self = this.set("evalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalDependencies: Self = this.set("evalDependencies", js.undefined)
    @scala.inline
    def setEvaluate(
      value: (/* expr */ MathExpression | js.Array[MathExpression] | Matrix, /* scope */ js.UndefOr[js.Object]) => _
    ): Self = this.set("evaluate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    @scala.inline
    def setEvaluateDependencies(value: FactoryFunctionMap): Self = this.set("evaluateDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluateDependencies: Self = this.set("evaluateDependencies", js.undefined)
    @scala.inline
    def setExp(value: /* x */ Double => Double): Self = this.set("exp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    @scala.inline
    def setExpDependencies(value: FactoryFunctionMap): Self = this.set("expDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpDependencies: Self = this.set("expDependencies", js.undefined)
    @scala.inline
    def setExpm(value: /* x */ Matrix => Matrix): Self = this.set("expm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpm: Self = this.set("expm", js.undefined)
    @scala.inline
    def setExpm1(value: /* x */ Double => Double): Self = this.set("expm1", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpm1: Self = this.set("expm1", js.undefined)
    @scala.inline
    def setExpm1Dependencies(value: FactoryFunctionMap): Self = this.set("expm1Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpm1Dependencies: Self = this.set("expm1Dependencies", js.undefined)
    @scala.inline
    def setExpmDependencies(value: FactoryFunctionMap): Self = this.set("expmDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpmDependencies: Self = this.set("expmDependencies", js.undefined)
    @scala.inline
    def setExpression(value: MathNode): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setEyeDependencies(value: FactoryFunctionMap): Self = this.set("eyeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEyeDependencies: Self = this.set("eyeDependencies", js.undefined)
    @scala.inline
    def setFactorial(
      value: /* n */ Double | BigNumber | MathArray | Matrix => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = this.set("factorial", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFactorial: Self = this.set("factorial", js.undefined)
    @scala.inline
    def setFactorialDependencies(value: FactoryFunctionMap): Self = this.set("factorialDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactorialDependencies: Self = this.set("factorialDependencies", js.undefined)
    @scala.inline
    def setFactory(
      value: (/* name */ String, /* dependencies */ js.Array[MathJsFunctionName], /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], /* meta */ js.UndefOr[js.Any]) => FactoryFunction[_]
    ): Self = this.set("factory", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
    @scala.inline
    def setFalseDependencies(value: FactoryFunctionMap): Self = this.set("falseDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseDependencies: Self = this.set("falseDependencies", js.undefined)
    @scala.inline
    def setFaradayDependencies(value: FactoryFunctionMap): Self = this.set("faradayDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaradayDependencies: Self = this.set("faradayDependencies", js.undefined)
    @scala.inline
    def setFermiCouplingDependencies(value: FactoryFunctionMap): Self = this.set("fermiCouplingDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFermiCouplingDependencies: Self = this.set("fermiCouplingDependencies", js.undefined)
    @scala.inline
    def setFilter(
      value: (/* x */ Matrix | MathArray | js.Array[String], /* test */ (js.Function3[
          /* value */ js.Any, 
          /* index */ js.Any, 
          /* matrix */ Matrix | MathArray | js.Array[String], 
          Boolean
        ]) | RegExp) => Matrix | MathArray
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterDependencies(value: FactoryFunctionMap): Self = this.set("filterDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDependencies: Self = this.set("filterDependencies", js.undefined)
    @scala.inline
    def setFilterTransformDependencies(value: FactoryFunctionMap): Self = this.set("filterTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTransformDependencies: Self = this.set("filterTransformDependencies", js.undefined)
    @scala.inline
    def setFineStructureDependencies(value: FactoryFunctionMap): Self = this.set("fineStructureDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFineStructureDependencies: Self = this.set("fineStructureDependencies", js.undefined)
    @scala.inline
    def setFirstRadiationDependencies(value: FactoryFunctionMap): Self = this.set("firstRadiationDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstRadiationDependencies: Self = this.set("firstRadiationDependencies", js.undefined)
    @scala.inline
    def setFix(value: /* x */ Double => Double): Self = this.set("fix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setFixDependencies(value: FactoryFunctionMap): Self = this.set("fixDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixDependencies: Self = this.set("fixDependencies", js.undefined)
    @scala.inline
    def setFlatten(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = this.set("flatten", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setFlattenDependencies(value: FactoryFunctionMap): Self = this.set("flattenDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenDependencies: Self = this.set("flattenDependencies", js.undefined)
    @scala.inline
    def setFloor(value: /* x */ Double => Double): Self = this.set("floor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    @scala.inline
    def setFloorDependencies(value: FactoryFunctionMap): Self = this.set("floorDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorDependencies: Self = this.set("floorDependencies", js.undefined)
    @scala.inline
    def setForEach(
      value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit]) => scala.Unit
    ): Self = this.set("forEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteForEach: Self = this.set("forEach", js.undefined)
    @scala.inline
    def setForEachDependencies(value: FactoryFunctionMap): Self = this.set("forEachDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForEachDependencies: Self = this.set("forEachDependencies", js.undefined)
    @scala.inline
    def setForEachTransformDependencies(value: FactoryFunctionMap): Self = this.set("forEachTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForEachTransformDependencies: Self = this.set("forEachTransformDependencies", js.undefined)
    @scala.inline
    def setFormat(
      value: (/* value */ js.Any, /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]]) => String
    ): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatDependencies(value: FactoryFunctionMap): Self = this.set("formatDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatDependencies: Self = this.set("formatDependencies", js.undefined)
    @scala.inline
    def setFraction(value: /* args */ Fraction | MathArray | Matrix => Fraction | MathArray | Matrix): Self = this.set("fraction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFraction: Self = this.set("fraction", js.undefined)
    @scala.inline
    def setGamma(value: /* n */ Double | MathArray | Matrix => Double | MathArray | Matrix): Self = this.set("gamma", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
    @scala.inline
    def setGammaDependencies(value: FactoryFunctionMap): Self = this.set("gammaDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGammaDependencies: Self = this.set("gammaDependencies", js.undefined)
    @scala.inline
    def setGasConstantDependencies(value: FactoryFunctionMap): Self = this.set("gasConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGasConstantDependencies: Self = this.set("gasConstantDependencies", js.undefined)
    @scala.inline
    def setGcd(value: /* repeated */ Double => Double): Self = this.set("gcd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGcd: Self = this.set("gcd", js.undefined)
    @scala.inline
    def setGcdDependencies(value: FactoryFunctionMap): Self = this.set("gcdDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcdDependencies: Self = this.set("gcdDependencies", js.undefined)
    @scala.inline
    def setGetMatrixDataTypeDependencies(value: FactoryFunctionMap): Self = this.set("getMatrixDataTypeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetMatrixDataTypeDependencies: Self = this.set("getMatrixDataTypeDependencies", js.undefined)
    @scala.inline
    def setGravitationConstantDependencies(value: FactoryFunctionMap): Self = this.set("gravitationConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravitationConstantDependencies: Self = this.set("gravitationConstantDependencies", js.undefined)
    @scala.inline
    def setGravityDependencies(value: FactoryFunctionMap): Self = this.set("gravityDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravityDependencies: Self = this.set("gravityDependencies", js.undefined)
    @scala.inline
    def setHartreeEnergyDependencies(value: FactoryFunctionMap): Self = this.set("hartreeEnergyDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHartreeEnergyDependencies: Self = this.set("hartreeEnergyDependencies", js.undefined)
    @scala.inline
    def setHasNumericValueDependencies(value: FactoryFunctionMap): Self = this.set("hasNumericValueDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasNumericValueDependencies: Self = this.set("hasNumericValueDependencies", js.undefined)
    @scala.inline
    def setHelp(value: /* search */ js.Function0[_] => Help): Self = this.set("help", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHypot(value: /* repeated */ Double => Double): Self = this.set("hypot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHypot: Self = this.set("hypot", js.undefined)
    @scala.inline
    def setHypotDependencies(value: FactoryFunctionMap): Self = this.set("hypotDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHypotDependencies: Self = this.set("hypotDependencies", js.undefined)
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    @scala.inline
    def setIDependencies(value: FactoryFunctionMap): Self = this.set("iDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIDependencies: Self = this.set("iDependencies", js.undefined)
    @scala.inline
    def setIdentity(
      value: (/* size */ Double | js.Array[Double] | Matrix | MathArray, /* format */ js.UndefOr[String]) => Matrix | MathArray | Double
    ): Self = this.set("identity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    @scala.inline
    def setIdentityDependencies(value: FactoryFunctionMap): Self = this.set("identityDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityDependencies: Self = this.set("identityDependencies", js.undefined)
    @scala.inline
    def setIm(
      value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
    ): Self = this.set("im", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIm: Self = this.set("im", js.undefined)
    @scala.inline
    def setImDependencies(value: FactoryFunctionMap): Self = this.set("imDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImDependencies: Self = this.set("imDependencies", js.undefined)
    @scala.inline
    def setImport(
      value: (/* object */ ImportObject | js.Array[ImportObject], /* options */ ImportOptions) => scala.Unit
    ): Self = this.set("import", js.Any.fromFunction2(value))
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
    @scala.inline
    def setIndex(value: /* repeated */ js.Any => Index): Self = this.set("index", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIndexTransformDependencies(value: FactoryFunctionMap): Self = this.set("indexTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexTransformDependencies: Self = this.set("indexTransformDependencies", js.undefined)
    @scala.inline
    def setIntersect(
      value: (/* w */ MathArray | Matrix, /* x */ MathArray | Matrix, /* y */ MathArray | Matrix, /* z */ MathArray | Matrix) => MathArray
    ): Self = this.set("intersect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteIntersect: Self = this.set("intersect", js.undefined)
    @scala.inline
    def setIntersectDependencies(value: FactoryFunctionMap): Self = this.set("intersectDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectDependencies: Self = this.set("intersectDependencies", js.undefined)
    @scala.inline
    def setInv(
      value: /* x */ Double | Complex | MathArray | Matrix => NoLiteralType[Double | Complex | MathArray | Matrix]
    ): Self = this.set("inv", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInv: Self = this.set("inv", js.undefined)
    @scala.inline
    def setInvDependencies(value: FactoryFunctionMap): Self = this.set("invDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvDependencies: Self = this.set("invDependencies", js.undefined)
    @scala.inline
    def setInverseConductanceQuantumDependencies(value: FactoryFunctionMap): Self = this.set("inverseConductanceQuantumDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverseConductanceQuantumDependencies: Self = this.set("inverseConductanceQuantumDependencies", js.undefined)
    @scala.inline
    def setIsInteger(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix => Boolean): Self = this.set("isInteger", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsInteger: Self = this.set("isInteger", js.undefined)
    @scala.inline
    def setIsIntegerDependencies(value: FactoryFunctionMap): Self = this.set("isIntegerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIntegerDependencies: Self = this.set("isIntegerDependencies", js.undefined)
    @scala.inline
    def setIsNaN(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = this.set("isNaN", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsNaN: Self = this.set("isNaN", js.undefined)
    @scala.inline
    def setIsNaNDependencies(value: FactoryFunctionMap): Self = this.set("isNaNDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNaNDependencies: Self = this.set("isNaNDependencies", js.undefined)
    @scala.inline
    def setIsNegative(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = this.set("isNegative", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsNegative: Self = this.set("isNegative", js.undefined)
    @scala.inline
    def setIsNegativeDependencies(value: FactoryFunctionMap): Self = this.set("isNegativeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNegativeDependencies: Self = this.set("isNegativeDependencies", js.undefined)
    @scala.inline
    def setIsNumeric(value: /* x */ js.Any => Boolean): Self = this.set("isNumeric", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsNumeric: Self = this.set("isNumeric", js.undefined)
    @scala.inline
    def setIsNumericDependencies(value: FactoryFunctionMap): Self = this.set("isNumericDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNumericDependencies: Self = this.set("isNumericDependencies", js.undefined)
    @scala.inline
    def setIsPositive(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = this.set("isPositive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsPositive: Self = this.set("isPositive", js.undefined)
    @scala.inline
    def setIsPositiveDependencies(value: FactoryFunctionMap): Self = this.set("isPositiveDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPositiveDependencies: Self = this.set("isPositiveDependencies", js.undefined)
    @scala.inline
    def setIsPrime(value: /* x */ Double | BigNumber | MathArray | Matrix => Boolean): Self = this.set("isPrime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsPrime: Self = this.set("isPrime", js.undefined)
    @scala.inline
    def setIsPrimeDependencies(value: FactoryFunctionMap): Self = this.set("isPrimeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimeDependencies: Self = this.set("isPrimeDependencies", js.undefined)
    @scala.inline
    def setIsZero(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex => Boolean): Self = this.set("isZero", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsZero: Self = this.set("isZero", js.undefined)
    @scala.inline
    def setIsZeroDependencies(value: FactoryFunctionMap): Self = this.set("isZeroDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsZeroDependencies: Self = this.set("isZeroDependencies", js.undefined)
    @scala.inline
    def setJson(value: MathJsJson): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setKldivergence(value: (/* q */ MathArray | Matrix, /* p */ MathArray | Matrix) => Double): Self = this.set("kldivergence", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKldivergence: Self = this.set("kldivergence", js.undefined)
    @scala.inline
    def setKldivergenceDependencies(value: FactoryFunctionMap): Self = this.set("kldivergenceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKldivergenceDependencies: Self = this.set("kldivergenceDependencies", js.undefined)
    @scala.inline
    def setKlitzingDependencies(value: FactoryFunctionMap): Self = this.set("klitzingDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKlitzingDependencies: Self = this.set("klitzingDependencies", js.undefined)
    @scala.inline
    def setKron(value: (/* x */ Matrix | MathArray, /* y */ Matrix | MathArray) => Matrix): Self = this.set("kron", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKron: Self = this.set("kron", js.undefined)
    @scala.inline
    def setKronDependencies(value: FactoryFunctionMap): Self = this.set("kronDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKronDependencies: Self = this.set("kronDependencies", js.undefined)
    @scala.inline
    def setLarger(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("larger", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLarger: Self = this.set("larger", js.undefined)
    @scala.inline
    def setLargerDependencies(value: FactoryFunctionMap): Self = this.set("largerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargerDependencies: Self = this.set("largerDependencies", js.undefined)
    @scala.inline
    def setLargerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("largerEq", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLargerEq: Self = this.set("largerEq", js.undefined)
    @scala.inline
    def setLargerEqDependencies(value: FactoryFunctionMap): Self = this.set("largerEqDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargerEqDependencies: Self = this.set("largerEqDependencies", js.undefined)
    @scala.inline
    def setLcm(value: (/* a */ Double, /* b */ Double) => Double): Self = this.set("lcm", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLcm: Self = this.set("lcm", js.undefined)
    @scala.inline
    def setLcmDependencies(value: FactoryFunctionMap): Self = this.set("lcmDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLcmDependencies: Self = this.set("lcmDependencies", js.undefined)
    @scala.inline
    def setLeftShift(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = this.set("leftShift", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeftShift: Self = this.set("leftShift", js.undefined)
    @scala.inline
    def setLeftShiftDependencies(value: FactoryFunctionMap): Self = this.set("leftShiftDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftShiftDependencies: Self = this.set("leftShiftDependencies", js.undefined)
    @scala.inline
    def setLog(
      value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* base */ js.UndefOr[Double | BigNumber | Complex]) => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setLog10(value: /* x */ Double => Double): Self = this.set("log10", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog10: Self = this.set("log10", js.undefined)
    @scala.inline
    def setLog10Dependencies(value: FactoryFunctionMap): Self = this.set("log10Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog10Dependencies: Self = this.set("log10Dependencies", js.undefined)
    @scala.inline
    def setLog1p(value: (/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex]) => Double): Self = this.set("log1p", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLog1p: Self = this.set("log1p", js.undefined)
    @scala.inline
    def setLog1pDependencies(value: FactoryFunctionMap): Self = this.set("log1pDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog1pDependencies: Self = this.set("log1pDependencies", js.undefined)
    @scala.inline
    def setLog2(value: /* x */ Double => Double): Self = this.set("log2", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog2: Self = this.set("log2", js.undefined)
    @scala.inline
    def setLog2Dependencies(value: FactoryFunctionMap): Self = this.set("log2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog2Dependencies: Self = this.set("log2Dependencies", js.undefined)
    @scala.inline
    def setLogDependencies(value: FactoryFunctionMap): Self = this.set("logDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDependencies: Self = this.set("logDependencies", js.undefined)
    @scala.inline
    def setLoschmidtDependencies(value: FactoryFunctionMap): Self = this.set("loschmidtDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoschmidtDependencies: Self = this.set("loschmidtDependencies", js.undefined)
    @scala.inline
    def setLsolve(value: (/* L */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = this.set("lsolve", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLsolve: Self = this.set("lsolve", js.undefined)
    @scala.inline
    def setLsolveDependencies(value: FactoryFunctionMap): Self = this.set("lsolveDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLsolveDependencies: Self = this.set("lsolveDependencies", js.undefined)
    @scala.inline
    def setLup(value: /* A */ js.UndefOr[Matrix | MathArray] => L): Self = this.set("lup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLup: Self = this.set("lup", js.undefined)
    @scala.inline
    def setLupDependencies(value: FactoryFunctionMap): Self = this.set("lupDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLupDependencies: Self = this.set("lupDependencies", js.undefined)
    @scala.inline
    def setLusolve(
      value: (/* A */ Matrix | MathArray | Double, /* b */ Matrix | MathArray, /* order */ js.UndefOr[Double], /* threshold */ js.UndefOr[Double]) => Matrix | MathArray
    ): Self = this.set("lusolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteLusolve: Self = this.set("lusolve", js.undefined)
    @scala.inline
    def setLusolveDependencies(value: FactoryFunctionMap): Self = this.set("lusolveDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLusolveDependencies: Self = this.set("lusolveDependencies", js.undefined)
    @scala.inline
    def setMad(value: /* array */ MathArray | Matrix => _): Self = this.set("mad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMad: Self = this.set("mad", js.undefined)
    @scala.inline
    def setMadDependencies(value: FactoryFunctionMap): Self = this.set("madDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMadDependencies: Self = this.set("madDependencies", js.undefined)
    @scala.inline
    def setMagneticConstantDependencies(value: FactoryFunctionMap): Self = this.set("magneticConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagneticConstantDependencies: Self = this.set("magneticConstantDependencies", js.undefined)
    @scala.inline
    def setMagneticFluxQuantumDependencies(value: FactoryFunctionMap): Self = this.set("magneticFluxQuantumDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagneticFluxQuantumDependencies: Self = this.set("magneticFluxQuantumDependencies", js.undefined)
    @scala.inline
    def setMap(
      value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[
          /* value */ js.Any, 
          /* index */ js.Any, 
          /* matrix */ Matrix | MathArray, 
          MathType | String
        ]) => Matrix | MathArray
    ): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapDependencies(value: FactoryFunctionMap): Self = this.set("mapDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapDependencies: Self = this.set("mapDependencies", js.undefined)
    @scala.inline
    def setMapTransformDependencies(value: FactoryFunctionMap): Self = this.set("mapTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTransformDependencies: Self = this.set("mapTransformDependencies", js.undefined)
    @scala.inline
    def setMatrix(value: /* format */ js.UndefOr[sparse | dense] => Matrix): Self = this.set("matrix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    @scala.inline
    def setMax(value: /* repeated */ MathType => _): Self = this.set("max", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxDependencies(value: FactoryFunctionMap): Self = this.set("maxDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDependencies: Self = this.set("maxDependencies", js.undefined)
    @scala.inline
    def setMaxTransformDependencies(value: FactoryFunctionMap): Self = this.set("maxTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTransformDependencies: Self = this.set("maxTransformDependencies", js.undefined)
    @scala.inline
    def setMean(value: /* repeated */ MathType => _): Self = this.set("mean", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    @scala.inline
    def setMeanDependencies(value: FactoryFunctionMap): Self = this.set("meanDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanDependencies: Self = this.set("meanDependencies", js.undefined)
    @scala.inline
    def setMeanTransformDependencies(value: FactoryFunctionMap): Self = this.set("meanTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanTransformDependencies: Self = this.set("meanTransformDependencies", js.undefined)
    @scala.inline
    def setMedian(value: /* repeated */ MathType => _): Self = this.set("median", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMedian: Self = this.set("median", js.undefined)
    @scala.inline
    def setMedianDependencies(value: FactoryFunctionMap): Self = this.set("medianDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianDependencies: Self = this.set("medianDependencies", js.undefined)
    @scala.inline
    def setMin(value: /* repeated */ MathType => _): Self = this.set("min", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinDependencies(value: FactoryFunctionMap): Self = this.set("minDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDependencies: Self = this.set("minDependencies", js.undefined)
    @scala.inline
    def setMinTransformDependencies(value: FactoryFunctionMap): Self = this.set("minTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTransformDependencies: Self = this.set("minTransformDependencies", js.undefined)
    @scala.inline
    def setMod(
      value: (/* x */ Double | BigNumber | Fraction | MathArray | Matrix, /* y */ Double | BigNumber | Fraction | MathArray | Matrix) => NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
    ): Self = this.set("mod", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMod: Self = this.set("mod", js.undefined)
    @scala.inline
    def setModDependencies(value: FactoryFunctionMap): Self = this.set("modDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModDependencies: Self = this.set("modDependencies", js.undefined)
    @scala.inline
    def setMode(value: /* repeated */ MathType => _): Self = this.set("mode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setModeDependencies(value: FactoryFunctionMap): Self = this.set("modeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModeDependencies: Self = this.set("modeDependencies", js.undefined)
    @scala.inline
    def setMolarMassC12Dependencies(value: FactoryFunctionMap): Self = this.set("molarMassC12Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMolarMassC12Dependencies: Self = this.set("molarMassC12Dependencies", js.undefined)
    @scala.inline
    def setMolarMassDependencies(value: FactoryFunctionMap): Self = this.set("molarMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMolarMassDependencies: Self = this.set("molarMassDependencies", js.undefined)
    @scala.inline
    def setMolarPlanckConstantDependencies(value: FactoryFunctionMap): Self = this.set("molarPlanckConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMolarPlanckConstantDependencies: Self = this.set("molarPlanckConstantDependencies", js.undefined)
    @scala.inline
    def setMolarVolumeDependencies(value: FactoryFunctionMap): Self = this.set("molarVolumeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMolarVolumeDependencies: Self = this.set("molarVolumeDependencies", js.undefined)
    @scala.inline
    def setMultinomial(value: /* a */ js.Array[Double | BigNumber] => NoLiteralType[Double | BigNumber]): Self = this.set("multinomial", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMultinomial: Self = this.set("multinomial", js.undefined)
    @scala.inline
    def setMultinomialDependencies(value: FactoryFunctionMap): Self = this.set("multinomialDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultinomialDependencies: Self = this.set("multinomialDependencies", js.undefined)
    @scala.inline
    def setMultiply(value: (/* x */ Matrix | MathArray, /* y */ MathType) => Matrix | MathArray): Self = this.set("multiply", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMultiply: Self = this.set("multiply", js.undefined)
    @scala.inline
    def setMultiplyDependencies(value: FactoryFunctionMap): Self = this.set("multiplyDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplyDependencies: Self = this.set("multiplyDependencies", js.undefined)
    @scala.inline
    def setMultiplyScalarDependencies(value: FactoryFunctionMap): Self = this.set("multiplyScalarDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplyScalarDependencies: Self = this.set("multiplyScalarDependencies", js.undefined)
    @scala.inline
    def setNeutronMassDependencies(value: FactoryFunctionMap): Self = this.set("neutronMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutronMassDependencies: Self = this.set("neutronMassDependencies", js.undefined)
    @scala.inline
    def setNorm(
      value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* p */ js.UndefOr[Double | BigNumber | String]) => Double | BigNumber
    ): Self = this.set("norm", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNorm: Self = this.set("norm", js.undefined)
    @scala.inline
    def setNormDependencies(value: FactoryFunctionMap): Self = this.set("normDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormDependencies: Self = this.set("normDependencies", js.undefined)
    @scala.inline
    def setNot(
      value: /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix => Boolean | MathArray | Matrix
    ): Self = this.set("not", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setNotDependencies(value: FactoryFunctionMap): Self = this.set("notDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotDependencies: Self = this.set("notDependencies", js.undefined)
    @scala.inline
    def setNthRoot(
      value: (/* a */ Double | BigNumber | MathArray | Matrix | Complex, /* root */ js.UndefOr[Double | BigNumber]) => Double | Complex | MathArray | Matrix
    ): Self = this.set("nthRoot", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNthRoot: Self = this.set("nthRoot", js.undefined)
    @scala.inline
    def setNthRootDependencies(value: FactoryFunctionMap): Self = this.set("nthRootDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNthRootDependencies: Self = this.set("nthRootDependencies", js.undefined)
    @scala.inline
    def setNthRootsDependencies(value: FactoryFunctionMap): Self = this.set("nthRootsDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNthRootsDependencies: Self = this.set("nthRootsDependencies", js.undefined)
    @scala.inline
    def setNuclearMagnetonDependencies(value: FactoryFunctionMap): Self = this.set("nuclearMagnetonDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNuclearMagnetonDependencies: Self = this.set("nuclearMagnetonDependencies", js.undefined)
    @scala.inline
    def setNull(value: Double): Self = this.set("null", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNull: Self = this.set("null", js.undefined)
    @scala.inline
    def setNullDependencies(value: FactoryFunctionMap): Self = this.set("nullDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullDependencies: Self = this.set("nullDependencies", js.undefined)
    @scala.inline
    def setNumber(
      value: /* value */ js.UndefOr[
          String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
        ] => Double | MathArray | Matrix
    ): Self = this.set("number", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setNumberDependencies(value: FactoryFunctionMap): Self = this.set("numberDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberDependencies: Self = this.set("numberDependencies", js.undefined)
    @scala.inline
    def setNumericDependencies(value: FactoryFunctionMap): Self = this.set("numericDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericDependencies: Self = this.set("numericDependencies", js.undefined)
    @scala.inline
    def setOnes(
      value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
    ): Self = this.set("ones", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnes: Self = this.set("ones", js.undefined)
    @scala.inline
    def setOnesDependencies(value: FactoryFunctionMap): Self = this.set("onesDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnesDependencies: Self = this.set("onesDependencies", js.undefined)
    @scala.inline
    def setOr(
      value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
    ): Self = this.set("or", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    @scala.inline
    def setOrDependencies(value: FactoryFunctionMap): Self = this.set("orDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrDependencies: Self = this.set("orDependencies", js.undefined)
    @scala.inline
    def setParse(value: (/* expr */ MathExpression, /* options */ js.UndefOr[js.Any]) => MathNode): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setParseDependencies(value: FactoryFunctionMap): Self = this.set("parseDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseDependencies: Self = this.set("parseDependencies", js.undefined)
    @scala.inline
    def setParser(value: () => Parser): Self = this.set("parser", js.Any.fromFunction0(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPartitionSelect(
      value: (/* x */ MathArray | Matrix, /* k */ Double, /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])]) => _
    ): Self = this.set("partitionSelect", js.Any.fromFunction3(value))
    @scala.inline
    def deletePartitionSelect: Self = this.set("partitionSelect", js.undefined)
    @scala.inline
    def setPartitionSelectDependencies(value: FactoryFunctionMap): Self = this.set("partitionSelectDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionSelectDependencies: Self = this.set("partitionSelectDependencies", js.undefined)
    @scala.inline
    def setPermutations(
      value: (/* n */ Double | BigNumber, /* k */ js.UndefOr[Double | BigNumber]) => NoLiteralType[Double | BigNumber]
    ): Self = this.set("permutations", js.Any.fromFunction2(value))
    @scala.inline
    def deletePermutations: Self = this.set("permutations", js.undefined)
    @scala.inline
    def setPermutationsDependencies(value: FactoryFunctionMap): Self = this.set("permutationsDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermutationsDependencies: Self = this.set("permutationsDependencies", js.undefined)
    @scala.inline
    def setPhi(value: Double): Self = this.set("phi", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhi: Self = this.set("phi", js.undefined)
    @scala.inline
    def setPhiDependencies(value: FactoryFunctionMap): Self = this.set("phiDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhiDependencies: Self = this.set("phiDependencies", js.undefined)
    @scala.inline
    def setPi(value: Double): Self = this.set("pi", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePi: Self = this.set("pi", js.undefined)
    @scala.inline
    def setPickRandom(
      value: (/* array */ js.Array[Double], /* number */ js.UndefOr[Double], /* weights */ js.UndefOr[js.Array[Double]]) => Double | js.Array[Double]
    ): Self = this.set("pickRandom", js.Any.fromFunction3(value))
    @scala.inline
    def deletePickRandom: Self = this.set("pickRandom", js.undefined)
    @scala.inline
    def setPickRandomDependencies(value: FactoryFunctionMap): Self = this.set("pickRandomDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickRandomDependencies: Self = this.set("pickRandomDependencies", js.undefined)
    @scala.inline
    def setPlanckChargeDependencies(value: FactoryFunctionMap): Self = this.set("planckChargeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckChargeDependencies: Self = this.set("planckChargeDependencies", js.undefined)
    @scala.inline
    def setPlanckConstantDependencies(value: FactoryFunctionMap): Self = this.set("planckConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckConstantDependencies: Self = this.set("planckConstantDependencies", js.undefined)
    @scala.inline
    def setPlanckLengthDependencies(value: FactoryFunctionMap): Self = this.set("planckLengthDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckLengthDependencies: Self = this.set("planckLengthDependencies", js.undefined)
    @scala.inline
    def setPlanckMassDependencies(value: FactoryFunctionMap): Self = this.set("planckMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckMassDependencies: Self = this.set("planckMassDependencies", js.undefined)
    @scala.inline
    def setPlanckTemperatureDependencies(value: FactoryFunctionMap): Self = this.set("planckTemperatureDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckTemperatureDependencies: Self = this.set("planckTemperatureDependencies", js.undefined)
    @scala.inline
    def setPlanckTimeDependencies(value: FactoryFunctionMap): Self = this.set("planckTimeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanckTimeDependencies: Self = this.set("planckTimeDependencies", js.undefined)
    @scala.inline
    def setPow(value: (/* x */ MathType, /* y */ Double | BigNumber | Complex) => MathType): Self = this.set("pow", js.Any.fromFunction2(value))
    @scala.inline
    def deletePow: Self = this.set("pow", js.undefined)
    @scala.inline
    def setPowDependencies(value: FactoryFunctionMap): Self = this.set("powDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowDependencies: Self = this.set("powDependencies", js.undefined)
    @scala.inline
    def setPrint(
      value: (/* template */ String, /* values */ js.Any, /* precision */ js.UndefOr[Double], /* options */ js.UndefOr[Double | js.Object]) => scala.Unit
    ): Self = this.set("print", js.Any.fromFunction4(value))
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setPrintDependencies(value: FactoryFunctionMap): Self = this.set("printDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintDependencies: Self = this.set("printDependencies", js.undefined)
    @scala.inline
    def setProd(value: /* repeated */ MathType => _): Self = this.set("prod", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProd: Self = this.set("prod", js.undefined)
    @scala.inline
    def setProdDependencies(value: FactoryFunctionMap): Self = this.set("prodDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProdDependencies: Self = this.set("prodDependencies", js.undefined)
    @scala.inline
    def setProtonMassDependencies(value: FactoryFunctionMap): Self = this.set("protonMassDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtonMassDependencies: Self = this.set("protonMassDependencies", js.undefined)
    @scala.inline
    def setQr(value: /* A */ Matrix | MathArray => Q): Self = this.set("qr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQr: Self = this.set("qr", js.undefined)
    @scala.inline
    def setQrDependencies(value: FactoryFunctionMap): Self = this.set("qrDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQrDependencies: Self = this.set("qrDependencies", js.undefined)
    @scala.inline
    def setQuantileSeq(
      value: (/* A */ MathArray | Matrix, /* prob */ Double | BigNumber | MathArray, /* sorted */ js.UndefOr[Boolean]) => Double | BigNumber | Unit | MathArray
    ): Self = this.set("quantileSeq", js.Any.fromFunction3(value))
    @scala.inline
    def deleteQuantileSeq: Self = this.set("quantileSeq", js.undefined)
    @scala.inline
    def setQuantileSeqDependencies(value: FactoryFunctionMap): Self = this.set("quantileSeqDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantileSeqDependencies: Self = this.set("quantileSeqDependencies", js.undefined)
    @scala.inline
    def setQuantumOfCirculationDependencies(value: FactoryFunctionMap): Self = this.set("quantumOfCirculationDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantumOfCirculationDependencies: Self = this.set("quantumOfCirculationDependencies", js.undefined)
    @scala.inline
    def setRandom(value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double): Self = this.set("random", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setRandomDependencies(value: FactoryFunctionMap): Self = this.set("randomDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomDependencies: Self = this.set("randomDependencies", js.undefined)
    @scala.inline
    def setRandomInt(value: (/* min */ Double, /* max */ js.UndefOr[Double]) => Double): Self = this.set("randomInt", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRandomInt: Self = this.set("randomInt", js.undefined)
    @scala.inline
    def setRandomIntDependencies(value: FactoryFunctionMap): Self = this.set("randomIntDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomIntDependencies: Self = this.set("randomIntDependencies", js.undefined)
    @scala.inline
    def setRange(value: (/* str */ String, /* includeEnd */ js.UndefOr[Boolean]) => Matrix): Self = this.set("range", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangeTransformDependencies(value: FactoryFunctionMap): Self = this.set("rangeTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeTransformDependencies: Self = this.set("rangeTransformDependencies", js.undefined)
    @scala.inline
    def setRationalize(
      value: (/* expr */ MathNode | String, /* optional */ js.UndefOr[js.Object | Boolean], /* detailed */ js.UndefOr[`true`]) => Coefficients
    ): Self = this.set("rationalize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRationalize: Self = this.set("rationalize", js.undefined)
    @scala.inline
    def setRationalizeDependencies(value: FactoryFunctionMap): Self = this.set("rationalizeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRationalizeDependencies: Self = this.set("rationalizeDependencies", js.undefined)
    @scala.inline
    def setRe(
      value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
    ): Self = this.set("re", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRe: Self = this.set("re", js.undefined)
    @scala.inline
    def setReDependencies(value: FactoryFunctionMap): Self = this.set("reDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReDependencies: Self = this.set("reDependencies", js.undefined)
    @scala.inline
    def setReducedPlanckConstantDependencies(value: FactoryFunctionMap): Self = this.set("reducedPlanckConstantDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReducedPlanckConstantDependencies: Self = this.set("reducedPlanckConstantDependencies", js.undefined)
    @scala.inline
    def setReshape(value: (/* x */ MathArray | Matrix, /* sizes */ js.Array[Double]) => MathArray | Matrix): Self = this.set("reshape", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReshape: Self = this.set("reshape", js.undefined)
    @scala.inline
    def setReshapeDependencies(value: FactoryFunctionMap): Self = this.set("reshapeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReshapeDependencies: Self = this.set("reshapeDependencies", js.undefined)
    @scala.inline
    def setResize(
      value: (/* x */ MathArray | Matrix, /* size */ MathArray | Matrix, /* defaultValue */ js.UndefOr[Double | String]) => MathArray | Matrix
    ): Self = this.set("resize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeDependencies(value: FactoryFunctionMap): Self = this.set("resizeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeDependencies: Self = this.set("resizeDependencies", js.undefined)
    @scala.inline
    def setReviverDependencies(value: FactoryFunctionMap): Self = this.set("reviverDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviverDependencies: Self = this.set("reviverDependencies", js.undefined)
    @scala.inline
    def setRightArithShift(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = this.set("rightArithShift", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRightArithShift: Self = this.set("rightArithShift", js.undefined)
    @scala.inline
    def setRightArithShiftDependencies(value: FactoryFunctionMap): Self = this.set("rightArithShiftDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightArithShiftDependencies: Self = this.set("rightArithShiftDependencies", js.undefined)
    @scala.inline
    def setRightLogShift(
      value: (/* x */ Double | MathArray | Matrix, /* y */ Double) => NoLiteralType[Double | MathArray | Matrix]
    ): Self = this.set("rightLogShift", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRightLogShift: Self = this.set("rightLogShift", js.undefined)
    @scala.inline
    def setRightLogShiftDependencies(value: FactoryFunctionMap): Self = this.set("rightLogShiftDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightLogShiftDependencies: Self = this.set("rightLogShiftDependencies", js.undefined)
    @scala.inline
    def setRound(
      value: (/* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, /* n */ js.UndefOr[Double | BigNumber | MathArray]) => NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
    ): Self = this.set("round", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setRoundDependencies(value: FactoryFunctionMap): Self = this.set("roundDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundDependencies: Self = this.set("roundDependencies", js.undefined)
    @scala.inline
    def setRowDependencies(value: FactoryFunctionMap): Self = this.set("rowDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDependencies: Self = this.set("rowDependencies", js.undefined)
    @scala.inline
    def setRowTransformDependencies(value: FactoryFunctionMap): Self = this.set("rowTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTransformDependencies: Self = this.set("rowTransformDependencies", js.undefined)
    @scala.inline
    def setRydbergDependencies(value: FactoryFunctionMap): Self = this.set("rydbergDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRydbergDependencies: Self = this.set("rydbergDependencies", js.undefined)
    @scala.inline
    def setSackurTetrodeDependencies(value: FactoryFunctionMap): Self = this.set("sackurTetrodeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSackurTetrodeDependencies: Self = this.set("sackurTetrodeDependencies", js.undefined)
    @scala.inline
    def setSec(value: /* x */ Double | Unit => Double): Self = this.set("sec", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSec: Self = this.set("sec", js.undefined)
    @scala.inline
    def setSecDependencies(value: FactoryFunctionMap): Self = this.set("secDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecDependencies: Self = this.set("secDependencies", js.undefined)
    @scala.inline
    def setSech(value: /* x */ Double | Unit => Double): Self = this.set("sech", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSech: Self = this.set("sech", js.undefined)
    @scala.inline
    def setSechDependencies(value: FactoryFunctionMap): Self = this.set("sechDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSechDependencies: Self = this.set("sechDependencies", js.undefined)
    @scala.inline
    def setSecondRadiationDependencies(value: FactoryFunctionMap): Self = this.set("secondRadiationDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondRadiationDependencies: Self = this.set("secondRadiationDependencies", js.undefined)
    @scala.inline
    def setSetCartesian(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = this.set("setCartesian", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetCartesian: Self = this.set("setCartesian", js.undefined)
    @scala.inline
    def setSetCartesianDependencies(value: FactoryFunctionMap): Self = this.set("setCartesianDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetCartesianDependencies: Self = this.set("setCartesianDependencies", js.undefined)
    @scala.inline
    def setSetDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = this.set("setDifference", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetDifference: Self = this.set("setDifference", js.undefined)
    @scala.inline
    def setSetDifferenceDependencies(value: FactoryFunctionMap): Self = this.set("setDifferenceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDifferenceDependencies: Self = this.set("setDifferenceDependencies", js.undefined)
    @scala.inline
    def setSetDistinct(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = this.set("setDistinct", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDistinct: Self = this.set("setDistinct", js.undefined)
    @scala.inline
    def setSetDistinctDependencies(value: FactoryFunctionMap): Self = this.set("setDistinctDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDistinctDependencies: Self = this.set("setDistinctDependencies", js.undefined)
    @scala.inline
    def setSetIntersect(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = this.set("setIntersect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetIntersect: Self = this.set("setIntersect", js.undefined)
    @scala.inline
    def setSetIntersectDependencies(value: FactoryFunctionMap): Self = this.set("setIntersectDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetIntersectDependencies: Self = this.set("setIntersectDependencies", js.undefined)
    @scala.inline
    def setSetIsSubset(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => Boolean): Self = this.set("setIsSubset", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetIsSubset: Self = this.set("setIsSubset", js.undefined)
    @scala.inline
    def setSetIsSubsetDependencies(value: FactoryFunctionMap): Self = this.set("setIsSubsetDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetIsSubsetDependencies: Self = this.set("setIsSubsetDependencies", js.undefined)
    @scala.inline
    def setSetMultiplicity(value: (/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix) => Double): Self = this.set("setMultiplicity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetMultiplicity: Self = this.set("setMultiplicity", js.undefined)
    @scala.inline
    def setSetMultiplicityDependencies(value: FactoryFunctionMap): Self = this.set("setMultiplicityDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetMultiplicityDependencies: Self = this.set("setMultiplicityDependencies", js.undefined)
    @scala.inline
    def setSetPowerset(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = this.set("setPowerset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPowerset: Self = this.set("setPowerset", js.undefined)
    @scala.inline
    def setSetPowersetDependencies(value: FactoryFunctionMap): Self = this.set("setPowersetDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetPowersetDependencies: Self = this.set("setPowersetDependencies", js.undefined)
    @scala.inline
    def setSetSize(value: /* a */ MathArray | Matrix => Double): Self = this.set("setSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSetSizeDependencies(value: FactoryFunctionMap): Self = this.set("setSizeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSizeDependencies: Self = this.set("setSizeDependencies", js.undefined)
    @scala.inline
    def setSetSymDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = this.set("setSymDifference", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSymDifference: Self = this.set("setSymDifference", js.undefined)
    @scala.inline
    def setSetSymDifferenceDependencies(value: FactoryFunctionMap): Self = this.set("setSymDifferenceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSymDifferenceDependencies: Self = this.set("setSymDifferenceDependencies", js.undefined)
    @scala.inline
    def setSetUnion(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = this.set("setUnion", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetUnion: Self = this.set("setUnion", js.undefined)
    @scala.inline
    def setSetUnionDependencies(value: FactoryFunctionMap): Self = this.set("setUnionDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetUnionDependencies: Self = this.set("setUnionDependencies", js.undefined)
    @scala.inline
    def setSign(value: /* x */ Double => Double): Self = this.set("sign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    @scala.inline
    def setSignDependencies(value: FactoryFunctionMap): Self = this.set("signDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignDependencies: Self = this.set("signDependencies", js.undefined)
    @scala.inline
    def setSimplify(
      value: (/* expr */ MathNode | String, /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], /* scope */ js.UndefOr[js.Object]) => MathNode
    ): Self = this.set("simplify", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSimplify: Self = this.set("simplify", js.undefined)
    @scala.inline
    def setSimplifyDependencies(value: FactoryFunctionMap): Self = this.set("simplifyDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplifyDependencies: Self = this.set("simplifyDependencies", js.undefined)
    @scala.inline
    def setSin(value: /* x */ Double | Unit => Double): Self = this.set("sin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSin: Self = this.set("sin", js.undefined)
    @scala.inline
    def setSinDependencies(value: FactoryFunctionMap): Self = this.set("sinDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinDependencies: Self = this.set("sinDependencies", js.undefined)
    @scala.inline
    def setSinh(value: /* x */ Double | Unit => Double): Self = this.set("sinh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSinh: Self = this.set("sinh", js.undefined)
    @scala.inline
    def setSinhDependencies(value: FactoryFunctionMap): Self = this.set("sinhDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinhDependencies: Self = this.set("sinhDependencies", js.undefined)
    @scala.inline
    def setSize(
      value: /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix => MathArray | Matrix
    ): Self = this.set("size", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeDependencies(value: FactoryFunctionMap): Self = this.set("sizeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeDependencies: Self = this.set("sizeDependencies", js.undefined)
    @scala.inline
    def setSlu(value: (/* A */ Matrix, /* order */ Double, /* threshold */ Double) => js.Object): Self = this.set("slu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSlu: Self = this.set("slu", js.undefined)
    @scala.inline
    def setSluDependencies(value: FactoryFunctionMap): Self = this.set("sluDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSluDependencies: Self = this.set("sluDependencies", js.undefined)
    @scala.inline
    def setSmaller(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("smaller", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSmaller: Self = this.set("smaller", js.undefined)
    @scala.inline
    def setSmallerDependencies(value: FactoryFunctionMap): Self = this.set("smallerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallerDependencies: Self = this.set("smallerDependencies", js.undefined)
    @scala.inline
    def setSmallerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("smallerEq", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSmallerEq: Self = this.set("smallerEq", js.undefined)
    @scala.inline
    def setSmallerEqDependencies(value: FactoryFunctionMap): Self = this.set("smallerEqDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallerEqDependencies: Self = this.set("smallerEqDependencies", js.undefined)
    @scala.inline
    def setSort(
      value: (/* x */ Matrix | MathArray, /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural) => Matrix | MathArray
    ): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortDependencies(value: FactoryFunctionMap): Self = this.set("sortDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDependencies: Self = this.set("sortDependencies", js.undefined)
    @scala.inline
    def setSparse(value: (/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String]) => Matrix): Self = this.set("sparse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    @scala.inline
    def setSparseDependencies(value: FactoryFunctionMap): Self = this.set("sparseDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparseDependencies: Self = this.set("sparseDependencies", js.undefined)
    @scala.inline
    def setSpeedOfLightDependencies(value: FactoryFunctionMap): Self = this.set("speedOfLightDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeedOfLightDependencies: Self = this.set("speedOfLightDependencies", js.undefined)
    @scala.inline
    def setSplitUnit(value: (/* unit */ Unit, /* parts */ js.Array[Unit]) => js.Array[Unit]): Self = this.set("splitUnit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSplitUnit: Self = this.set("splitUnit", js.undefined)
    @scala.inline
    def setSplitUnitDependencies(value: FactoryFunctionMap): Self = this.set("splitUnitDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitUnitDependencies: Self = this.set("splitUnitDependencies", js.undefined)
    @scala.inline
    def setSqrt(value: /* x */ Double => Double): Self = this.set("sqrt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSqrt: Self = this.set("sqrt", js.undefined)
    @scala.inline
    def setSqrtDependencies(value: FactoryFunctionMap): Self = this.set("sqrtDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqrtDependencies: Self = this.set("sqrtDependencies", js.undefined)
    @scala.inline
    def setSqrtm(value: /* A */ MathArray | Matrix => MathArray | Matrix): Self = this.set("sqrtm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSqrtm: Self = this.set("sqrtm", js.undefined)
    @scala.inline
    def setSqrtmDependencies(value: FactoryFunctionMap): Self = this.set("sqrtmDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqrtmDependencies: Self = this.set("sqrtmDependencies", js.undefined)
    @scala.inline
    def setSquare(value: /* x */ Double => Double): Self = this.set("square", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
    @scala.inline
    def setSquareDependencies(value: FactoryFunctionMap): Self = this.set("squareDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquareDependencies: Self = this.set("squareDependencies", js.undefined)
    @scala.inline
    def setSqueeze(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = this.set("squeeze", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSqueeze: Self = this.set("squeeze", js.undefined)
    @scala.inline
    def setSqueezeDependencies(value: FactoryFunctionMap): Self = this.set("squeezeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqueezeDependencies: Self = this.set("squeezeDependencies", js.undefined)
    @scala.inline
    def setStd(
      value: (/* array */ MathArray | Matrix, /* normalization */ js.UndefOr[unbiased | uncorrected | biased]) => Double
    ): Self = this.set("std", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStd: Self = this.set("std", js.undefined)
    @scala.inline
    def setStdDependencies(value: FactoryFunctionMap): Self = this.set("stdDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdDependencies: Self = this.set("stdDependencies", js.undefined)
    @scala.inline
    def setStdTransformDependencies(value: FactoryFunctionMap): Self = this.set("stdTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdTransformDependencies: Self = this.set("stdTransformDependencies", js.undefined)
    @scala.inline
    def setStefanBoltzmannDependencies(value: FactoryFunctionMap): Self = this.set("stefanBoltzmannDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStefanBoltzmannDependencies: Self = this.set("stefanBoltzmannDependencies", js.undefined)
    @scala.inline
    def setStirlingS2(
      value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
    ): Self = this.set("stirlingS2", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStirlingS2: Self = this.set("stirlingS2", js.undefined)
    @scala.inline
    def setStirlingS2Dependencies(value: FactoryFunctionMap): Self = this.set("stirlingS2Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStirlingS2Dependencies: Self = this.set("stirlingS2Dependencies", js.undefined)
    @scala.inline
    def setString(value: /* value */ MathType | Null => String | MathArray | Matrix): Self = this.set("string", js.Any.fromFunction1(value))
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setStringDependencies(value: FactoryFunctionMap): Self = this.set("stringDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringDependencies: Self = this.set("stringDependencies", js.undefined)
    @scala.inline
    def setSubset(
      value: (/* value */ MathArray | Matrix | String, /* index */ Index, /* replacement */ js.UndefOr[js.Any], /* defaultValue */ js.UndefOr[js.Any]) => MathArray | Matrix | String
    ): Self = this.set("subset", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSubset: Self = this.set("subset", js.undefined)
    @scala.inline
    def setSubsetDependencies(value: FactoryFunctionMap): Self = this.set("subsetDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubsetDependencies: Self = this.set("subsetDependencies", js.undefined)
    @scala.inline
    def setSubsetTransformDependencies(value: FactoryFunctionMap): Self = this.set("subsetTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubsetTransformDependencies: Self = this.set("subsetTransformDependencies", js.undefined)
    @scala.inline
    def setSubtract(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = this.set("subtract", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSubtract: Self = this.set("subtract", js.undefined)
    @scala.inline
    def setSubtractDependencies(value: FactoryFunctionMap): Self = this.set("subtractDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtractDependencies: Self = this.set("subtractDependencies", js.undefined)
    @scala.inline
    def setSum(value: /* repeated */ Double | BigNumber | Fraction => _): Self = this.set("sum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    @scala.inline
    def setSumDependencies(value: FactoryFunctionMap): Self = this.set("sumDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumDependencies: Self = this.set("sumDependencies", js.undefined)
    @scala.inline
    def setSumTransformDependencies(value: FactoryFunctionMap): Self = this.set("sumTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumTransformDependencies: Self = this.set("sumTransformDependencies", js.undefined)
    @scala.inline
    def setTan(value: /* x */ Double | Unit => Double): Self = this.set("tan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTan: Self = this.set("tan", js.undefined)
    @scala.inline
    def setTanDependencies(value: FactoryFunctionMap): Self = this.set("tanDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTanDependencies: Self = this.set("tanDependencies", js.undefined)
    @scala.inline
    def setTanh(value: /* x */ Double | Unit => Double): Self = this.set("tanh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTanh: Self = this.set("tanh", js.undefined)
    @scala.inline
    def setTanhDependencies(value: FactoryFunctionMap): Self = this.set("tanhDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTanhDependencies: Self = this.set("tanhDependencies", js.undefined)
    @scala.inline
    def setTau(value: Double): Self = this.set("tau", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTau: Self = this.set("tau", js.undefined)
    @scala.inline
    def setTauDependencies(value: FactoryFunctionMap): Self = this.set("tauDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTauDependencies: Self = this.set("tauDependencies", js.undefined)
    @scala.inline
    def setThomsonCrossSectionDependencies(value: FactoryFunctionMap): Self = this.set("thomsonCrossSectionDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThomsonCrossSectionDependencies: Self = this.set("thomsonCrossSectionDependencies", js.undefined)
    @scala.inline
    def setTo(value: (/* x */ Unit | MathArray | Matrix, /* unit */ Unit | String) => Unit | MathArray | Matrix): Self = this.set("to", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setToDependencies(value: FactoryFunctionMap): Self = this.set("toDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDependencies: Self = this.set("toDependencies", js.undefined)
    @scala.inline
    def setTrace(value: /* x */ MathArray | Matrix => Double): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setTraceDependencies(value: FactoryFunctionMap): Self = this.set("traceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceDependencies: Self = this.set("traceDependencies", js.undefined)
    @scala.inline
    def setTranspose(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = this.set("transpose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTranspose: Self = this.set("transpose", js.undefined)
    @scala.inline
    def setTransposeDependencies(value: FactoryFunctionMap): Self = this.set("transposeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransposeDependencies: Self = this.set("transposeDependencies", js.undefined)
    @scala.inline
    def setTrueDependencies(value: FactoryFunctionMap): Self = this.set("trueDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueDependencies: Self = this.set("trueDependencies", js.undefined)
    @scala.inline
    def setTypeOf(value: /* x */ js.Any => String): Self = this.set("typeOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTypeOf: Self = this.set("typeOf", js.undefined)
    @scala.inline
    def setTypeOfDependencies(value: FactoryFunctionMap): Self = this.set("typeOfDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeOfDependencies: Self = this.set("typeOfDependencies", js.undefined)
    @scala.inline
    def setTyped(
      value: (/* name */ String, /* signatures */ Record[String, js.Function1[/* repeated */ _, _]]) => js.Function1[/* repeated */ _, _]
    ): Self = this.set("typed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTyped: Self = this.set("typed", js.undefined)
    @scala.inline
    def setTypedDependencies(value: FactoryFunctionMap): Self = this.set("typedDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypedDependencies: Self = this.set("typedDependencies", js.undefined)
    @scala.inline
    def setUnaryMinus(value: /* x */ Double => Double): Self = this.set("unaryMinus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnaryMinus: Self = this.set("unaryMinus", js.undefined)
    @scala.inline
    def setUnaryMinusDependencies(value: FactoryFunctionMap): Self = this.set("unaryMinusDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryMinusDependencies: Self = this.set("unaryMinusDependencies", js.undefined)
    @scala.inline
    def setUnaryPlus(value: /* x */ Double => Double): Self = this.set("unaryPlus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnaryPlus: Self = this.set("unaryPlus", js.undefined)
    @scala.inline
    def setUnaryPlusDependencies(value: FactoryFunctionMap): Self = this.set("unaryPlusDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryPlusDependencies: Self = this.set("unaryPlusDependencies", js.undefined)
    @scala.inline
    def setUnequal(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = this.set("unequal", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnequal: Self = this.set("unequal", js.undefined)
    @scala.inline
    def setUnequalDependencies(value: FactoryFunctionMap): Self = this.set("unequalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnequalDependencies: Self = this.set("unequalDependencies", js.undefined)
    @scala.inline
    def setUninitialized(value: js.Any): Self = this.set("uninitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUninitialized: Self = this.set("uninitialized", js.undefined)
    @scala.inline
    def setUnit(value: /* unit */ String => Unit): Self = this.set("unit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUsolve(value: (/* U */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = this.set("usolve", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUsolve: Self = this.set("usolve", js.undefined)
    @scala.inline
    def setUsolveDependencies(value: FactoryFunctionMap): Self = this.set("usolveDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsolveDependencies: Self = this.set("usolveDependencies", js.undefined)
    @scala.inline
    def setVacuumImpedanceDependencies(value: FactoryFunctionMap): Self = this.set("vacuumImpedanceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVacuumImpedanceDependencies: Self = this.set("vacuumImpedanceDependencies", js.undefined)
    @scala.inline
    def setVarDependencies(value: FactoryFunctionMap): Self = this.set("varDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarDependencies: Self = this.set("varDependencies", js.undefined)
    @scala.inline
    def setVariance(value: /* repeated */ Double | BigNumber | Fraction => _): Self = this.set("variance", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
    @scala.inline
    def setVarianceDependencies(value: FactoryFunctionMap): Self = this.set("varianceDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarianceDependencies: Self = this.set("varianceDependencies", js.undefined)
    @scala.inline
    def setVarianceTransformDependencies(value: FactoryFunctionMap): Self = this.set("varianceTransformDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarianceTransformDependencies: Self = this.set("varianceTransformDependencies", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionDependencies(value: FactoryFunctionMap): Self = this.set("versionDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionDependencies: Self = this.set("versionDependencies", js.undefined)
    @scala.inline
    def setWeakMixingAngleDependencies(value: FactoryFunctionMap): Self = this.set("weakMixingAngleDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeakMixingAngleDependencies: Self = this.set("weakMixingAngleDependencies", js.undefined)
    @scala.inline
    def setWienDisplacementDependencies(value: FactoryFunctionMap): Self = this.set("wienDisplacementDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWienDisplacementDependencies: Self = this.set("wienDisplacementDependencies", js.undefined)
    @scala.inline
    def setXgcd(value: (/* a */ Double | BigNumber, /* b */ Double | BigNumber) => MathArray): Self = this.set("xgcd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteXgcd: Self = this.set("xgcd", js.undefined)
    @scala.inline
    def setXgcdDependencies(value: FactoryFunctionMap): Self = this.set("xgcdDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXgcdDependencies: Self = this.set("xgcdDependencies", js.undefined)
    @scala.inline
    def setXor(
      value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
    ): Self = this.set("xor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteXor: Self = this.set("xor", js.undefined)
    @scala.inline
    def setXorDependencies(value: FactoryFunctionMap): Self = this.set("xorDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXorDependencies: Self = this.set("xorDependencies", js.undefined)
    @scala.inline
    def setZeros(
      value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
    ): Self = this.set("zeros", js.Any.fromFunction2(value))
    @scala.inline
    def deleteZeros: Self = this.set("zeros", js.undefined)
    @scala.inline
    def setZerosDependencies(value: FactoryFunctionMap): Self = this.set("zerosDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZerosDependencies: Self = this.set("zerosDependencies", js.undefined)
  }
  
}

