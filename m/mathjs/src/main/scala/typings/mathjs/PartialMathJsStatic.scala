package typings.mathjs

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
trait PartialMathJsStatic extends js.Object {
  var AccessorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ArrayNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var AssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var BigNumberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var BlockNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ChainDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ComplexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ConditionalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ConstantNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var DenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var FibonacciHeapDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var FractionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var FunctionAssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var FunctionNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var HelpDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ImmutableDenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var IndexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var IndexNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var Infinity: js.UndefOr[Double] = js.undefined
  var InfinityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var LN10: js.UndefOr[Double] = js.undefined
  var LN10Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var LN2: js.UndefOr[Double] = js.undefined
  var LN2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var LOG10E: js.UndefOr[Double] = js.undefined
  var LOG10EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var LOG2E: js.UndefOr[Double] = js.undefined
  var LOG2EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var MatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var NaN: js.UndefOr[Double] = js.undefined
  var NaNDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var NodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ObjectNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var OperatorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var PIDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ParenthesisNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ParserDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var RangeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var RangeNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var RelationalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ResultSetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var SQRT1_2: js.UndefOr[Double] = js.undefined
  var SQRT1_2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var SQRT2: js.UndefOr[Double] = js.undefined
  var SQRT2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var SpaDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var SparseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var SymbolNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var UnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var abs: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var absDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acos: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acosh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acoshDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acoth: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acothDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acsc: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acscDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var acsch: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var acschDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var add: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
  var addDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var addScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var all: js.UndefOr[FactoryFunctionMap] = js.undefined
  var and: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.undefined
  var andDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var applyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var applyTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var arg: js.UndefOr[js.Function1[/* x */ Double | Complex, Double]] = js.undefined
  var argDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var asec: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var asecDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var asech: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var asechDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var asin: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var asinDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var asinh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var asinhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var atan: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var atan2: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Double]] = js.undefined
  var atan2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var atanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var atanh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var atanhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var atomicMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var avogadroDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bellNumbers: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.undefined
  var bellNumbersDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bignumber: js.UndefOr[
    js.Function1[
      /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null], 
      BigNumber
    ]
  ] = js.undefined
  var bignumberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bitAnd: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.undefined
  var bitAndDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bitNot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var bitNotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bitOr: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Double]] = js.undefined
  var bitOrDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bitXor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.undefined
  var bitXorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bohrMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var bohrRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var boltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var boolean: js.UndefOr[
    js.Function1[
      /* x */ String | Double | Boolean | MathArray | Matrix | Null, 
      Boolean | MathArray | Matrix
    ]
  ] = js.undefined
  var booleanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var catalan: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.undefined
  var catalanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cbrt: js.UndefOr[js.Function2[/* x */ Double, /* allRoots */ js.UndefOr[Boolean], Double]] = js.undefined
  var cbrtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ceil: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var ceilDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var chain: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], MathJsChain]] = js.undefined
  var chainDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var classicalElectronRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cloneDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  @JSName("clone")
  var clone_FPartialMathJsStatic: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.undefined
  var columnDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var columnTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var combinations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.undefined
  var combinationsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var compare: js.UndefOr[
    js.Function2[
      /* x */ MathType | String, 
      /* y */ MathType | String, 
      Double | BigNumber | Fraction | MathArray | Matrix
    ]
  ] = js.undefined
  var compareDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var compareNatural: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.undefined
  var compareNaturalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var compareText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.undefined
  var compareTextDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var compile: js.UndefOr[js.Function1[/* expr */ MathExpression, EvalFunction]] = js.undefined
  var compileDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var complex: js.UndefOr[js.Function1[/* arg */ js.UndefOr[Complex | String | PolarCoordinates], Complex]] = js.undefined
  var complexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var composition: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.undefined
  var compositionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var concat: js.UndefOr[js.Function1[/* repeated */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var concatDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var concatTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var conductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var config: js.UndefOr[js.Function1[/* options */ ConfigOptions, ConfigOptions]] = js.undefined
  var conj: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.undefined
  var conjDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cos: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var cosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cosh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var coshDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cot: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var cotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var coth: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var cothDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var coulombDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var create: js.UndefOr[
    js.Function2[
      /* factories */ FactoryFunctionMap, 
      /* config */ ConfigOptions, 
      Partial[MathJsStatic]
    ]
  ] = js.undefined
  var createUnit: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* definition */ js.UndefOr[String | UnitDefinition], 
      /* options */ js.UndefOr[CreateUnitOptions], 
      Unit
    ]
  ] = js.undefined
  var createUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cross: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Matrix | MathArray]
  ] = js.undefined
  var crossDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var csc: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var cscDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var csch: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var cschDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ctransposeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var cube: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var cubeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var deepEqual: js.UndefOr[
    js.Function2[
      /* x */ MathType, 
      /* y */ MathType, 
      Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
    ]
  ] = js.undefined
  var deepEqualDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var derivative: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* variable */ MathNode | String, 
      /* options */ js.UndefOr[AnonSimplify], 
      MathNode
    ]
  ] = js.undefined
  var derivativeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var det: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.undefined
  var detDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var deuteronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var diag: js.UndefOr[
    js.Function2[/* X */ MathArray | Matrix, /* format */ js.UndefOr[String], Matrix]
  ] = js.undefined
  var diagDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var distance: js.UndefOr[
    js.Function2[
      /* x */ MathArray | Matrix | js.Object, 
      /* y */ MathArray | Matrix | js.Object, 
      Double | BigNumber
    ]
  ] = js.undefined
  var distanceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var divide: js.UndefOr[js.Function2[/* x */ Unit, /* y */ Unit, Unit]] = js.undefined
  var divideDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var divideScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var dot: js.UndefOr[js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Double]] = js.undefined
  var dotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var dotDivide: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
  var dotDivideDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var dotMultiply: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
  var dotMultiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var dotPow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
  var dotPowDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var e: js.UndefOr[Double] = js.undefined
  var eDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var efimovFactorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var electricConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var electronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var elementaryChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var equal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var equalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var equalScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var equalText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.undefined
  var equalTextDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var erf: js.UndefOr[
    js.Function1[/* x */ Double | MathArray | Matrix, NoLiteralType[Double | MathArray | Matrix]]
  ] = js.undefined
  var erfDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var evalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var evaluate: js.UndefOr[
    js.Function2[
      /* expr */ MathExpression | js.Array[MathExpression] | Matrix, 
      /* scope */ js.UndefOr[js.Object], 
      _
    ]
  ] = js.undefined
  var evaluateDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var exp: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var expDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var expm: js.UndefOr[js.Function1[/* x */ Matrix, Matrix]] = js.undefined
  var expm1: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var expm1Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var expmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var expression: js.UndefOr[MathNode] = js.undefined
  var eyeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var factorial: js.UndefOr[
    js.Function1[
      /* n */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.undefined
  var factorialDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var factory: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* dependencies */ js.Array[MathJsFunctionName], 
      /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], 
      /* meta */ js.UndefOr[js.Any], 
      FactoryFunction[_]
    ]
  ] = js.undefined
  var falseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var faradayDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var fermiCouplingDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
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
  ] = js.undefined
  var filterDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var filterTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var fineStructureDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var firstRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var fix: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var fixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var flatten: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var flattenDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var floor: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var floorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var forEach: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var forEachDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var forEachTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var format: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], 
      /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]], 
      String
    ]
  ] = js.undefined
  var formatDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var fraction: js.UndefOr[
    js.Function1[/* args */ Fraction | MathArray | Matrix, Fraction | MathArray | Matrix]
  ] = js.undefined
  var fractionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var gamma: js.UndefOr[js.Function1[/* n */ Double | MathArray | Matrix, Double | MathArray | Matrix]] = js.undefined
  var gammaDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var gasConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var gcd: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.undefined
  var gcdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var getMatrixDataTypeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var gravitationConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var gravityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var hartreeEnergyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var hasNumericValueDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var help: js.UndefOr[js.Function1[/* search */ js.Function0[_], Help]] = js.undefined
  var helpDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var hypot: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.undefined
  var hypotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var i: js.UndefOr[Double] = js.undefined
  var iDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var identity: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double] | Matrix | MathArray, 
      /* format */ js.UndefOr[String], 
      Matrix | MathArray | Double
    ]
  ] = js.undefined
  var identityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var im: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.undefined
  var imDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var `import`: js.UndefOr[
    js.Function2[
      /* object */ ImportObject | js.Array[ImportObject], 
      /* options */ ImportOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var index: js.UndefOr[js.Function1[/* repeated */ js.Any, Index]] = js.undefined
  var indexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var indexTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var intersect: js.UndefOr[
    js.Function4[
      /* w */ MathArray | Matrix, 
      /* x */ MathArray | Matrix, 
      /* y */ MathArray | Matrix, 
      /* z */ MathArray | Matrix, 
      MathArray
    ]
  ] = js.undefined
  var intersectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var inv: js.UndefOr[
    js.Function1[
      /* x */ Double | Complex | MathArray | Matrix, 
      NoLiteralType[Double | Complex | MathArray | Matrix]
    ]
  ] = js.undefined
  var invDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var inverseConductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isInteger: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix, Boolean]
  ] = js.undefined
  var isIntegerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isNaN: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.undefined
  var isNaNDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isNegative: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.undefined
  var isNegativeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isNumeric: js.UndefOr[js.Function1[/* x */ js.Any, Boolean]] = js.undefined
  var isNumericDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isPositive: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.undefined
  var isPositiveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isPrime: js.UndefOr[js.Function1[/* x */ Double | BigNumber | MathArray | Matrix, Boolean]] = js.undefined
  var isPrimeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var isZero: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex, 
      Boolean
    ]
  ] = js.undefined
  var isZeroDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var json: js.UndefOr[MathJsJson] = js.undefined
  var kldivergence: js.UndefOr[js.Function2[/* q */ MathArray | Matrix, /* p */ MathArray | Matrix, Double]] = js.undefined
  var kldivergenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var klitzingDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var kron: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ Matrix | MathArray, Matrix]] = js.undefined
  var kronDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var larger: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var largerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var largerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var largerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var lcm: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Double]] = js.undefined
  var lcmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var leftShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.undefined
  var leftShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var log: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* base */ js.UndefOr[Double | BigNumber | Complex], 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.undefined
  var log10: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var log10Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var log1p: js.UndefOr[
    js.Function2[/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex], Double]
  ] = js.undefined
  var log1pDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var log2: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var log2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var logDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var loschmidtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var lsolve: js.UndefOr[
    js.Function2[/* L */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.undefined
  var lsolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var lup: js.UndefOr[js.Function1[/* A */ js.UndefOr[Matrix | MathArray], AnonL]] = js.undefined
  var lupDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var lusolve: js.UndefOr[
    js.Function4[
      /* A */ Matrix | MathArray | Double, 
      /* b */ Matrix | MathArray, 
      /* order */ js.UndefOr[Double], 
      /* threshold */ js.UndefOr[Double], 
      Matrix | MathArray
    ]
  ] = js.undefined
  var lusolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var mad: js.UndefOr[js.Function1[/* array */ MathArray | Matrix, _]] = js.undefined
  var madDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var magneticConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var magneticFluxQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
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
  ] = js.undefined
  var mapDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var mapTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var matrix: js.UndefOr[js.Function1[/* format */ js.UndefOr[sparse | dense], Matrix]] = js.undefined
  var matrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var max: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var maxDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var maxTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var mean: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var meanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var meanTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var median: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var medianDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var min: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var minDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var minTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var mod: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix, 
      /* y */ Double | BigNumber | Fraction | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
    ]
  ] = js.undefined
  var modDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var mode: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var modeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var molarMassC12Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var molarMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var molarPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var molarVolumeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var multinomial: js.UndefOr[
    js.Function1[/* a */ js.Array[Double | BigNumber], NoLiteralType[Double | BigNumber]]
  ] = js.undefined
  var multinomialDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var multiply: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ MathType, Matrix | MathArray]] = js.undefined
  var multiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var multiplyScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var neutronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var norm: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* p */ js.UndefOr[Double | BigNumber | String], 
      Double | BigNumber
    ]
  ] = js.undefined
  var normDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var not: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.undefined
  var notDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var nthRoot: js.UndefOr[
    js.Function2[
      /* a */ Double | BigNumber | MathArray | Matrix | Complex, 
      /* root */ js.UndefOr[Double | BigNumber], 
      Double | Complex | MathArray | Matrix
    ]
  ] = js.undefined
  var nthRootDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var nthRootsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var nuclearMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var `null`: js.UndefOr[Double] = js.undefined
  var nullDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var number: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
      ], 
      Double | MathArray | Matrix
    ]
  ] = js.undefined
  var numberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var numericDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var ones: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.undefined
  var onesDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var or: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.undefined
  var orDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var parse: js.UndefOr[
    js.Function2[/* expr */ MathExpression, /* options */ js.UndefOr[js.Any], MathNode]
  ] = js.undefined
  var parseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var parser: js.UndefOr[js.Function0[Parser]] = js.undefined
  var parserDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var partitionSelect: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* k */ Double, 
      /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])], 
      _
    ]
  ] = js.undefined
  var partitionSelectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var permutations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ js.UndefOr[Double | BigNumber], 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.undefined
  var permutationsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var phi: js.UndefOr[Double] = js.undefined
  var phiDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var pi: js.UndefOr[Double] = js.undefined
  var piDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var pickRandom: js.UndefOr[
    js.Function3[
      /* array */ js.Array[Double], 
      /* number */ js.UndefOr[Double], 
      /* weights */ js.UndefOr[js.Array[Double]], 
      Double | js.Array[Double]
    ]
  ] = js.undefined
  var pickRandomDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckLengthDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckTemperatureDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var planckTimeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var pow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ Double | BigNumber | Complex, MathType]] = js.undefined
  var powDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var print: js.UndefOr[
    js.Function4[
      /* template */ String, 
      /* values */ js.Any, 
      /* precision */ js.UndefOr[Double], 
      /* options */ js.UndefOr[Double | js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var printDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var prod: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.undefined
  var prodDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var protonMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var qr: js.UndefOr[js.Function1[/* A */ Matrix | MathArray, AnonQ]] = js.undefined
  var qrDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var quantileSeq: js.UndefOr[
    js.Function3[
      /* A */ MathArray | Matrix, 
      /* prob */ Double | BigNumber | MathArray, 
      /* sorted */ js.UndefOr[Boolean], 
      Double | BigNumber | Unit | MathArray
    ]
  ] = js.undefined
  var quantileSeqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var quantumOfCirculationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var random: js.UndefOr[js.Function2[/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], Double]] = js.undefined
  var randomDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var randomInt: js.UndefOr[js.Function2[/* min */ Double, /* max */ js.UndefOr[Double], Double]] = js.undefined
  var randomIntDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var range: js.UndefOr[js.Function2[/* str */ String, /* includeEnd */ js.UndefOr[Boolean], Matrix]] = js.undefined
  var rangeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rangeTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rationalize: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* optional */ js.UndefOr[js.Object | Boolean], 
      /* detailed */ js.UndefOr[`true`], 
      AnonCoefficients
    ]
  ] = js.undefined
  var rationalizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var re: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.undefined
  var reDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var reducedPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var reshape: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* sizes */ js.Array[Double], MathArray | Matrix]
  ] = js.undefined
  var reshapeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var resize: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* size */ MathArray | Matrix, 
      /* defaultValue */ js.UndefOr[Double | String], 
      MathArray | Matrix
    ]
  ] = js.undefined
  var resizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var reviverDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rightArithShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.undefined
  var rightArithShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rightLogShift: js.UndefOr[
    js.Function2[
      /* x */ Double | MathArray | Matrix, 
      /* y */ Double, 
      NoLiteralType[Double | MathArray | Matrix]
    ]
  ] = js.undefined
  var rightLogShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var round: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, 
      /* n */ js.UndefOr[Double | BigNumber | MathArray], 
      NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
    ]
  ] = js.undefined
  var roundDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rowDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rowTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var rydbergDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sackurTetrodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sec: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var secDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sech: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var sechDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var secondRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setCartesian: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.undefined
  var setCartesianDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.undefined
  var setDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setDistinct: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var setDistinctDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setIntersect: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.undefined
  var setIntersectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setIsSubset: js.UndefOr[js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, Boolean]] = js.undefined
  var setIsSubsetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setMultiplicity: js.UndefOr[
    js.Function2[/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix, Double]
  ] = js.undefined
  var setMultiplicityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setPowerset: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var setPowersetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setSize: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, Double]] = js.undefined
  var setSizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setSymDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.undefined
  var setSymDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var setUnion: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.undefined
  var setUnionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sign: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var signDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var simplify: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* rules */ js.UndefOr[js.Array[AnonR | String | (js.Function1[/* node */ MathNode, MathNode])]], 
      /* scope */ js.UndefOr[js.Object], 
      MathNode
    ]
  ] = js.undefined
  var simplifyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sin: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var sinDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sinh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var sinhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var size: js.UndefOr[
    js.Function1[
      /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix, 
      MathArray | Matrix
    ]
  ] = js.undefined
  var sizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var slu: js.UndefOr[
    js.Function3[/* A */ Matrix, /* order */ Double, /* threshold */ Double, js.Object]
  ] = js.undefined
  var sluDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var smaller: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var smallerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var smallerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var smallerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sort: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural, 
      Matrix | MathArray
    ]
  ] = js.undefined
  var sortDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sparse: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String], Matrix]
  ] = js.undefined
  var sparseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var speedOfLightDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var splitUnit: js.UndefOr[js.Function2[/* unit */ Unit, /* parts */ js.Array[Unit], js.Array[Unit]]] = js.undefined
  var splitUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sqrt: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var sqrtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sqrtm: js.UndefOr[js.Function1[/* A */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var sqrtmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var square: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var squareDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var squeeze: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var squeezeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var std: js.UndefOr[
    js.Function2[
      /* array */ MathArray | Matrix, 
      /* normalization */ js.UndefOr[unbiased | uncorrected | biased], 
      Double
    ]
  ] = js.undefined
  var stdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var stdTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var stefanBoltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var stirlingS2: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.undefined
  var stirlingS2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var string: js.UndefOr[js.Function1[/* value */ MathType | Null, String | MathArray | Matrix]] = js.undefined
  var stringDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var subset: js.UndefOr[
    js.Function4[
      /* value */ MathArray | Matrix | String, 
      /* index */ Index, 
      /* replacement */ js.UndefOr[js.Any], 
      /* defaultValue */ js.UndefOr[js.Any], 
      MathArray | Matrix | String
    ]
  ] = js.undefined
  var subsetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var subsetTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var subtract: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
  var subtractDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sum: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.undefined
  var sumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var sumTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var tan: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var tanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var tanh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
  var tanhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var tau: js.UndefOr[Double] = js.undefined
  var tauDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var thomsonCrossSectionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var to: js.UndefOr[
    js.Function2[
      /* x */ Unit | MathArray | Matrix, 
      /* unit */ Unit | String, 
      Unit | MathArray | Matrix
    ]
  ] = js.undefined
  var toDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var trace: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.undefined
  var traceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var transpose: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
  var transposeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var trueDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var typeOf: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.undefined
  var typeOfDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var typed: js.UndefOr[
    js.Function2[
      /* name */ String, 
      /* signatures */ Record[String, js.Function1[/* repeated */ _, _]], 
      js.Function1[/* repeated */ _, _]
    ]
  ] = js.undefined
  var typedDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var typeofDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var unaryMinus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var unaryMinusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var unaryPlus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
  var unaryPlusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var unequal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.undefined
  var unequalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var uninitialized: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[js.Function1[/* unit */ String, Unit]] = js.undefined
  var unitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var usolve: js.UndefOr[
    js.Function2[/* U */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.undefined
  var usolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var vacuumImpedanceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var varDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var variance: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.undefined
  var varianceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var varianceTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var weakMixingAngleDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var wienDisplacementDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var xgcd: js.UndefOr[js.Function2[/* a */ Double | BigNumber, /* b */ Double | BigNumber, MathArray]] = js.undefined
  var xgcdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var xor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.undefined
  var xorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  var zeros: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.undefined
  var zerosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
}

object PartialMathJsStatic {
  @scala.inline
  def apply(
    AccessorNodeDependencies: FactoryFunctionMap = null,
    ArrayNodeDependencies: FactoryFunctionMap = null,
    AssignmentNodeDependencies: FactoryFunctionMap = null,
    BigNumberDependencies: FactoryFunctionMap = null,
    BlockNodeDependencies: FactoryFunctionMap = null,
    ChainDependencies: FactoryFunctionMap = null,
    ComplexDependencies: FactoryFunctionMap = null,
    ConditionalNodeDependencies: FactoryFunctionMap = null,
    ConstantNodeDependencies: FactoryFunctionMap = null,
    DenseMatrixDependencies: FactoryFunctionMap = null,
    EDependencies: FactoryFunctionMap = null,
    FibonacciHeapDependencies: FactoryFunctionMap = null,
    FractionDependencies: FactoryFunctionMap = null,
    FunctionAssignmentNodeDependencies: FactoryFunctionMap = null,
    FunctionNodeDependencies: FactoryFunctionMap = null,
    HelpDependencies: FactoryFunctionMap = null,
    ImmutableDenseMatrixDependencies: FactoryFunctionMap = null,
    IndexDependencies: FactoryFunctionMap = null,
    IndexNodeDependencies: FactoryFunctionMap = null,
    Infinity: Int | Double = null,
    InfinityDependencies: FactoryFunctionMap = null,
    LN10: Int | Double = null,
    LN10Dependencies: FactoryFunctionMap = null,
    LN2: Int | Double = null,
    LN2Dependencies: FactoryFunctionMap = null,
    LOG10E: Int | Double = null,
    LOG10EDependencies: FactoryFunctionMap = null,
    LOG2E: Int | Double = null,
    LOG2EDependencies: FactoryFunctionMap = null,
    MatrixDependencies: FactoryFunctionMap = null,
    NaN: Int | Double = null,
    NaNDependencies: FactoryFunctionMap = null,
    NodeDependencies: FactoryFunctionMap = null,
    ObjectNodeDependencies: FactoryFunctionMap = null,
    OperatorNodeDependencies: FactoryFunctionMap = null,
    PIDependencies: FactoryFunctionMap = null,
    ParenthesisNodeDependencies: FactoryFunctionMap = null,
    ParserDependencies: FactoryFunctionMap = null,
    RangeDependencies: FactoryFunctionMap = null,
    RangeNodeDependencies: FactoryFunctionMap = null,
    RelationalNodeDependencies: FactoryFunctionMap = null,
    ResultSetDependencies: FactoryFunctionMap = null,
    SQRT1_2: Int | Double = null,
    SQRT1_2Dependencies: FactoryFunctionMap = null,
    SQRT2: Int | Double = null,
    SQRT2Dependencies: FactoryFunctionMap = null,
    SpaDependencies: FactoryFunctionMap = null,
    SparseMatrixDependencies: FactoryFunctionMap = null,
    SymbolNodeDependencies: FactoryFunctionMap = null,
    UnitDependencies: FactoryFunctionMap = null,
    abs: /* x */ Double => Double = null,
    absDependencies: FactoryFunctionMap = null,
    acos: /* x */ Double => Double = null,
    acosDependencies: FactoryFunctionMap = null,
    acosh: /* x */ Double => Double = null,
    acoshDependencies: FactoryFunctionMap = null,
    acot: /* x */ Double => Double = null,
    acotDependencies: FactoryFunctionMap = null,
    acoth: /* x */ Double => Double = null,
    acothDependencies: FactoryFunctionMap = null,
    acsc: /* x */ Double => Double = null,
    acscDependencies: FactoryFunctionMap = null,
    acsch: /* x */ Double => Double = null,
    acschDependencies: FactoryFunctionMap = null,
    add: (/* x */ MathType, /* y */ MathType) => MathType = null,
    addDependencies: FactoryFunctionMap = null,
    addScalarDependencies: FactoryFunctionMap = null,
    all: FactoryFunctionMap = null,
    and: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix = null,
    andDependencies: FactoryFunctionMap = null,
    applyDependencies: FactoryFunctionMap = null,
    applyTransformDependencies: FactoryFunctionMap = null,
    arg: /* x */ Double | Complex => Double = null,
    argDependencies: FactoryFunctionMap = null,
    asec: /* x */ Double => Double = null,
    asecDependencies: FactoryFunctionMap = null,
    asech: /* x */ Double => Double = null,
    asechDependencies: FactoryFunctionMap = null,
    asin: /* x */ Double => Double = null,
    asinDependencies: FactoryFunctionMap = null,
    asinh: /* x */ Double => Double = null,
    asinhDependencies: FactoryFunctionMap = null,
    atan: /* x */ Double => Double = null,
    atan2: (/* y */ Double, /* x */ Double) => Double = null,
    atan2Dependencies: FactoryFunctionMap = null,
    atanDependencies: FactoryFunctionMap = null,
    atanh: /* x */ Double => Double = null,
    atanhDependencies: FactoryFunctionMap = null,
    atomicMassDependencies: FactoryFunctionMap = null,
    avogadroDependencies: FactoryFunctionMap = null,
    bellNumbers: /* n */ Double => Double = null,
    bellNumbersDependencies: FactoryFunctionMap = null,
    bignumber: /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null] => BigNumber = null,
    bignumberDependencies: FactoryFunctionMap = null,
    bitAnd: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix] = null,
    bitAndDependencies: FactoryFunctionMap = null,
    bitNot: /* x */ Double => Double = null,
    bitNotDependencies: FactoryFunctionMap = null,
    bitOr: (/* x */ Double, /* y */ Double) => Double = null,
    bitOrDependencies: FactoryFunctionMap = null,
    bitXor: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix] = null,
    bitXorDependencies: FactoryFunctionMap = null,
    bohrMagnetonDependencies: FactoryFunctionMap = null,
    bohrRadiusDependencies: FactoryFunctionMap = null,
    boltzmannDependencies: FactoryFunctionMap = null,
    boolean: /* x */ String | Double | Boolean | MathArray | Matrix | Null => Boolean | MathArray | Matrix = null,
    booleanDependencies: FactoryFunctionMap = null,
    catalan: /* n */ Double => Double = null,
    catalanDependencies: FactoryFunctionMap = null,
    cbrt: (/* x */ Double, /* allRoots */ js.UndefOr[Boolean]) => Double = null,
    cbrtDependencies: FactoryFunctionMap = null,
    ceil: /* x */ Double => Double = null,
    ceilDependencies: FactoryFunctionMap = null,
    chain: /* value */ js.UndefOr[js.Any] => MathJsChain = null,
    chainDependencies: FactoryFunctionMap = null,
    classicalElectronRadiusDependencies: FactoryFunctionMap = null,
    clone: /* x */ js.Any => _ = null,
    cloneDependencies: FactoryFunctionMap = null,
    columnDependencies: FactoryFunctionMap = null,
    columnTransformDependencies: FactoryFunctionMap = null,
    combinations: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber] = null,
    combinationsDependencies: FactoryFunctionMap = null,
    compare: (/* x */ MathType | String, /* y */ MathType | String) => Double | BigNumber | Fraction | MathArray | Matrix = null,
    compareDependencies: FactoryFunctionMap = null,
    compareNatural: (/* x */ js.Any, /* y */ js.Any) => Double = null,
    compareNaturalDependencies: FactoryFunctionMap = null,
    compareText: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix = null,
    compareTextDependencies: FactoryFunctionMap = null,
    compile: /* expr */ MathExpression => EvalFunction = null,
    compileDependencies: FactoryFunctionMap = null,
    complex: /* arg */ js.UndefOr[Complex | String | PolarCoordinates] => Complex = null,
    complexDependencies: FactoryFunctionMap = null,
    composition: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber] = null,
    compositionDependencies: FactoryFunctionMap = null,
    concat: /* repeated */ MathArray | Matrix => MathArray | Matrix = null,
    concatDependencies: FactoryFunctionMap = null,
    concatTransformDependencies: FactoryFunctionMap = null,
    conductanceQuantumDependencies: FactoryFunctionMap = null,
    config: /* options */ ConfigOptions => ConfigOptions = null,
    conj: /* x */ Double | BigNumber | Complex | MathArray | Matrix => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix] = null,
    conjDependencies: FactoryFunctionMap = null,
    cos: /* x */ Double | Unit => Double = null,
    cosDependencies: FactoryFunctionMap = null,
    cosh: /* x */ Double | Unit => Double = null,
    coshDependencies: FactoryFunctionMap = null,
    cot: /* x */ Double | Unit => Double = null,
    cotDependencies: FactoryFunctionMap = null,
    coth: /* x */ Double | Unit => Double = null,
    cothDependencies: FactoryFunctionMap = null,
    coulombDependencies: FactoryFunctionMap = null,
    create: (/* factories */ FactoryFunctionMap, /* config */ ConfigOptions) => Partial[MathJsStatic] = null,
    createUnit: (/* name */ String, /* definition */ js.UndefOr[String | UnitDefinition], /* options */ js.UndefOr[CreateUnitOptions]) => Unit = null,
    createUnitDependencies: FactoryFunctionMap = null,
    cross: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Matrix | MathArray = null,
    crossDependencies: FactoryFunctionMap = null,
    csc: /* x */ Double | Unit => Double = null,
    cscDependencies: FactoryFunctionMap = null,
    csch: /* x */ Double | Unit => Double = null,
    cschDependencies: FactoryFunctionMap = null,
    ctransposeDependencies: FactoryFunctionMap = null,
    cube: /* x */ Double => Double = null,
    cubeDependencies: FactoryFunctionMap = null,
    deepEqual: (/* x */ MathType, /* y */ MathType) => Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix = null,
    deepEqualDependencies: FactoryFunctionMap = null,
    derivative: (/* expr */ MathNode | String, /* variable */ MathNode | String, /* options */ js.UndefOr[AnonSimplify]) => MathNode = null,
    derivativeDependencies: FactoryFunctionMap = null,
    det: /* x */ MathArray | Matrix => Double = null,
    detDependencies: FactoryFunctionMap = null,
    deuteronMassDependencies: FactoryFunctionMap = null,
    diag: (/* X */ MathArray | Matrix, /* format */ js.UndefOr[String]) => Matrix = null,
    diagDependencies: FactoryFunctionMap = null,
    distance: (/* x */ MathArray | Matrix | js.Object, /* y */ MathArray | Matrix | js.Object) => Double | BigNumber = null,
    distanceDependencies: FactoryFunctionMap = null,
    divide: (/* x */ Unit, /* y */ Unit) => Unit = null,
    divideDependencies: FactoryFunctionMap = null,
    divideScalarDependencies: FactoryFunctionMap = null,
    dot: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Double = null,
    dotDependencies: FactoryFunctionMap = null,
    dotDivide: (/* x */ MathType, /* y */ MathType) => MathType = null,
    dotDivideDependencies: FactoryFunctionMap = null,
    dotMultiply: (/* x */ MathType, /* y */ MathType) => MathType = null,
    dotMultiplyDependencies: FactoryFunctionMap = null,
    dotPow: (/* x */ MathType, /* y */ MathType) => MathType = null,
    dotPowDependencies: FactoryFunctionMap = null,
    e: Int | Double = null,
    eDependencies: FactoryFunctionMap = null,
    efimovFactorDependencies: FactoryFunctionMap = null,
    electricConstantDependencies: FactoryFunctionMap = null,
    electronMassDependencies: FactoryFunctionMap = null,
    elementaryChargeDependencies: FactoryFunctionMap = null,
    equal: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix = null,
    equalDependencies: FactoryFunctionMap = null,
    equalScalarDependencies: FactoryFunctionMap = null,
    equalText: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix = null,
    equalTextDependencies: FactoryFunctionMap = null,
    erf: /* x */ Double | MathArray | Matrix => NoLiteralType[Double | MathArray | Matrix] = null,
    erfDependencies: FactoryFunctionMap = null,
    evalDependencies: FactoryFunctionMap = null,
    evaluate: (/* expr */ MathExpression | js.Array[MathExpression] | Matrix, /* scope */ js.UndefOr[js.Object]) => _ = null,
    evaluateDependencies: FactoryFunctionMap = null,
    exp: /* x */ Double => Double = null,
    expDependencies: FactoryFunctionMap = null,
    expm: /* x */ Matrix => Matrix = null,
    expm1: /* x */ Double => Double = null,
    expm1Dependencies: FactoryFunctionMap = null,
    expmDependencies: FactoryFunctionMap = null,
    expression: MathNode = null,
    eyeDependencies: FactoryFunctionMap = null,
    factorial: /* n */ Double | BigNumber | MathArray | Matrix => NoLiteralType[Double | BigNumber | MathArray | Matrix] = null,
    factorialDependencies: FactoryFunctionMap = null,
    factory: (/* name */ String, /* dependencies */ js.Array[MathJsFunctionName], /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], /* meta */ js.UndefOr[js.Any]) => FactoryFunction[_] = null,
    falseDependencies: FactoryFunctionMap = null,
    faradayDependencies: FactoryFunctionMap = null,
    fermiCouplingDependencies: FactoryFunctionMap = null,
    filter: (/* x */ Matrix | MathArray | js.Array[String], /* test */ (js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* matrix */ Matrix | MathArray | js.Array[String], 
      Boolean
    ]) | RegExp) => Matrix | MathArray = null,
    filterDependencies: FactoryFunctionMap = null,
    filterTransformDependencies: FactoryFunctionMap = null,
    fineStructureDependencies: FactoryFunctionMap = null,
    firstRadiationDependencies: FactoryFunctionMap = null,
    fix: /* x */ Double => Double = null,
    fixDependencies: FactoryFunctionMap = null,
    flatten: /* x */ MathArray | Matrix => MathArray | Matrix = null,
    flattenDependencies: FactoryFunctionMap = null,
    floor: /* x */ Double => Double = null,
    floorDependencies: FactoryFunctionMap = null,
    forEach: (/* x */ Matrix | MathArray, /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit]) => scala.Unit = null,
    forEachDependencies: FactoryFunctionMap = null,
    forEachTransformDependencies: FactoryFunctionMap = null,
    format: (/* value */ js.Any, /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]]) => String = null,
    formatDependencies: FactoryFunctionMap = null,
    fraction: /* args */ Fraction | MathArray | Matrix => Fraction | MathArray | Matrix = null,
    fractionDependencies: FactoryFunctionMap = null,
    gamma: /* n */ Double | MathArray | Matrix => Double | MathArray | Matrix = null,
    gammaDependencies: FactoryFunctionMap = null,
    gasConstantDependencies: FactoryFunctionMap = null,
    gcd: /* repeated */ Double => Double = null,
    gcdDependencies: FactoryFunctionMap = null,
    getMatrixDataTypeDependencies: FactoryFunctionMap = null,
    gravitationConstantDependencies: FactoryFunctionMap = null,
    gravityDependencies: FactoryFunctionMap = null,
    hartreeEnergyDependencies: FactoryFunctionMap = null,
    hasNumericValueDependencies: FactoryFunctionMap = null,
    help: /* search */ js.Function0[_] => Help = null,
    helpDependencies: FactoryFunctionMap = null,
    hypot: /* repeated */ Double => Double = null,
    hypotDependencies: FactoryFunctionMap = null,
    i: Int | Double = null,
    iDependencies: FactoryFunctionMap = null,
    identity: (/* size */ Double | js.Array[Double] | Matrix | MathArray, /* format */ js.UndefOr[String]) => Matrix | MathArray | Double = null,
    identityDependencies: FactoryFunctionMap = null,
    im: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix = null,
    imDependencies: FactoryFunctionMap = null,
    `import`: (/* object */ ImportObject | js.Array[ImportObject], /* options */ ImportOptions) => scala.Unit = null,
    index: /* repeated */ js.Any => Index = null
  ): PartialMathJsStatic = {
    val __obj = js.Dynamic.literal()
    if (AccessorNodeDependencies != null) __obj.updateDynamic("AccessorNodeDependencies")(AccessorNodeDependencies.asInstanceOf[js.Any])
    if (ArrayNodeDependencies != null) __obj.updateDynamic("ArrayNodeDependencies")(ArrayNodeDependencies.asInstanceOf[js.Any])
    if (AssignmentNodeDependencies != null) __obj.updateDynamic("AssignmentNodeDependencies")(AssignmentNodeDependencies.asInstanceOf[js.Any])
    if (BigNumberDependencies != null) __obj.updateDynamic("BigNumberDependencies")(BigNumberDependencies.asInstanceOf[js.Any])
    if (BlockNodeDependencies != null) __obj.updateDynamic("BlockNodeDependencies")(BlockNodeDependencies.asInstanceOf[js.Any])
    if (ChainDependencies != null) __obj.updateDynamic("ChainDependencies")(ChainDependencies.asInstanceOf[js.Any])
    if (ComplexDependencies != null) __obj.updateDynamic("ComplexDependencies")(ComplexDependencies.asInstanceOf[js.Any])
    if (ConditionalNodeDependencies != null) __obj.updateDynamic("ConditionalNodeDependencies")(ConditionalNodeDependencies.asInstanceOf[js.Any])
    if (ConstantNodeDependencies != null) __obj.updateDynamic("ConstantNodeDependencies")(ConstantNodeDependencies.asInstanceOf[js.Any])
    if (DenseMatrixDependencies != null) __obj.updateDynamic("DenseMatrixDependencies")(DenseMatrixDependencies.asInstanceOf[js.Any])
    if (EDependencies != null) __obj.updateDynamic("EDependencies")(EDependencies.asInstanceOf[js.Any])
    if (FibonacciHeapDependencies != null) __obj.updateDynamic("FibonacciHeapDependencies")(FibonacciHeapDependencies.asInstanceOf[js.Any])
    if (FractionDependencies != null) __obj.updateDynamic("FractionDependencies")(FractionDependencies.asInstanceOf[js.Any])
    if (FunctionAssignmentNodeDependencies != null) __obj.updateDynamic("FunctionAssignmentNodeDependencies")(FunctionAssignmentNodeDependencies.asInstanceOf[js.Any])
    if (FunctionNodeDependencies != null) __obj.updateDynamic("FunctionNodeDependencies")(FunctionNodeDependencies.asInstanceOf[js.Any])
    if (HelpDependencies != null) __obj.updateDynamic("HelpDependencies")(HelpDependencies.asInstanceOf[js.Any])
    if (ImmutableDenseMatrixDependencies != null) __obj.updateDynamic("ImmutableDenseMatrixDependencies")(ImmutableDenseMatrixDependencies.asInstanceOf[js.Any])
    if (IndexDependencies != null) __obj.updateDynamic("IndexDependencies")(IndexDependencies.asInstanceOf[js.Any])
    if (IndexNodeDependencies != null) __obj.updateDynamic("IndexNodeDependencies")(IndexNodeDependencies.asInstanceOf[js.Any])
    if (Infinity != null) __obj.updateDynamic("Infinity")(Infinity.asInstanceOf[js.Any])
    if (InfinityDependencies != null) __obj.updateDynamic("InfinityDependencies")(InfinityDependencies.asInstanceOf[js.Any])
    if (LN10 != null) __obj.updateDynamic("LN10")(LN10.asInstanceOf[js.Any])
    if (LN10Dependencies != null) __obj.updateDynamic("LN10Dependencies")(LN10Dependencies.asInstanceOf[js.Any])
    if (LN2 != null) __obj.updateDynamic("LN2")(LN2.asInstanceOf[js.Any])
    if (LN2Dependencies != null) __obj.updateDynamic("LN2Dependencies")(LN2Dependencies.asInstanceOf[js.Any])
    if (LOG10E != null) __obj.updateDynamic("LOG10E")(LOG10E.asInstanceOf[js.Any])
    if (LOG10EDependencies != null) __obj.updateDynamic("LOG10EDependencies")(LOG10EDependencies.asInstanceOf[js.Any])
    if (LOG2E != null) __obj.updateDynamic("LOG2E")(LOG2E.asInstanceOf[js.Any])
    if (LOG2EDependencies != null) __obj.updateDynamic("LOG2EDependencies")(LOG2EDependencies.asInstanceOf[js.Any])
    if (MatrixDependencies != null) __obj.updateDynamic("MatrixDependencies")(MatrixDependencies.asInstanceOf[js.Any])
    if (NaN != null) __obj.updateDynamic("NaN")(NaN.asInstanceOf[js.Any])
    if (NaNDependencies != null) __obj.updateDynamic("NaNDependencies")(NaNDependencies.asInstanceOf[js.Any])
    if (NodeDependencies != null) __obj.updateDynamic("NodeDependencies")(NodeDependencies.asInstanceOf[js.Any])
    if (ObjectNodeDependencies != null) __obj.updateDynamic("ObjectNodeDependencies")(ObjectNodeDependencies.asInstanceOf[js.Any])
    if (OperatorNodeDependencies != null) __obj.updateDynamic("OperatorNodeDependencies")(OperatorNodeDependencies.asInstanceOf[js.Any])
    if (PIDependencies != null) __obj.updateDynamic("PIDependencies")(PIDependencies.asInstanceOf[js.Any])
    if (ParenthesisNodeDependencies != null) __obj.updateDynamic("ParenthesisNodeDependencies")(ParenthesisNodeDependencies.asInstanceOf[js.Any])
    if (ParserDependencies != null) __obj.updateDynamic("ParserDependencies")(ParserDependencies.asInstanceOf[js.Any])
    if (RangeDependencies != null) __obj.updateDynamic("RangeDependencies")(RangeDependencies.asInstanceOf[js.Any])
    if (RangeNodeDependencies != null) __obj.updateDynamic("RangeNodeDependencies")(RangeNodeDependencies.asInstanceOf[js.Any])
    if (RelationalNodeDependencies != null) __obj.updateDynamic("RelationalNodeDependencies")(RelationalNodeDependencies.asInstanceOf[js.Any])
    if (ResultSetDependencies != null) __obj.updateDynamic("ResultSetDependencies")(ResultSetDependencies.asInstanceOf[js.Any])
    if (SQRT1_2 != null) __obj.updateDynamic("SQRT1_2")(SQRT1_2.asInstanceOf[js.Any])
    if (SQRT1_2Dependencies != null) __obj.updateDynamic("SQRT1_2Dependencies")(SQRT1_2Dependencies.asInstanceOf[js.Any])
    if (SQRT2 != null) __obj.updateDynamic("SQRT2")(SQRT2.asInstanceOf[js.Any])
    if (SQRT2Dependencies != null) __obj.updateDynamic("SQRT2Dependencies")(SQRT2Dependencies.asInstanceOf[js.Any])
    if (SpaDependencies != null) __obj.updateDynamic("SpaDependencies")(SpaDependencies.asInstanceOf[js.Any])
    if (SparseMatrixDependencies != null) __obj.updateDynamic("SparseMatrixDependencies")(SparseMatrixDependencies.asInstanceOf[js.Any])
    if (SymbolNodeDependencies != null) __obj.updateDynamic("SymbolNodeDependencies")(SymbolNodeDependencies.asInstanceOf[js.Any])
    if (UnitDependencies != null) __obj.updateDynamic("UnitDependencies")(UnitDependencies.asInstanceOf[js.Any])
    if (abs != null) __obj.updateDynamic("abs")(js.Any.fromFunction1(abs))
    if (absDependencies != null) __obj.updateDynamic("absDependencies")(absDependencies.asInstanceOf[js.Any])
    if (acos != null) __obj.updateDynamic("acos")(js.Any.fromFunction1(acos))
    if (acosDependencies != null) __obj.updateDynamic("acosDependencies")(acosDependencies.asInstanceOf[js.Any])
    if (acosh != null) __obj.updateDynamic("acosh")(js.Any.fromFunction1(acosh))
    if (acoshDependencies != null) __obj.updateDynamic("acoshDependencies")(acoshDependencies.asInstanceOf[js.Any])
    if (acot != null) __obj.updateDynamic("acot")(js.Any.fromFunction1(acot))
    if (acotDependencies != null) __obj.updateDynamic("acotDependencies")(acotDependencies.asInstanceOf[js.Any])
    if (acoth != null) __obj.updateDynamic("acoth")(js.Any.fromFunction1(acoth))
    if (acothDependencies != null) __obj.updateDynamic("acothDependencies")(acothDependencies.asInstanceOf[js.Any])
    if (acsc != null) __obj.updateDynamic("acsc")(js.Any.fromFunction1(acsc))
    if (acscDependencies != null) __obj.updateDynamic("acscDependencies")(acscDependencies.asInstanceOf[js.Any])
    if (acsch != null) __obj.updateDynamic("acsch")(js.Any.fromFunction1(acsch))
    if (acschDependencies != null) __obj.updateDynamic("acschDependencies")(acschDependencies.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addDependencies != null) __obj.updateDynamic("addDependencies")(addDependencies.asInstanceOf[js.Any])
    if (addScalarDependencies != null) __obj.updateDynamic("addScalarDependencies")(addScalarDependencies.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (and != null) __obj.updateDynamic("and")(js.Any.fromFunction2(and))
    if (andDependencies != null) __obj.updateDynamic("andDependencies")(andDependencies.asInstanceOf[js.Any])
    if (applyDependencies != null) __obj.updateDynamic("applyDependencies")(applyDependencies.asInstanceOf[js.Any])
    if (applyTransformDependencies != null) __obj.updateDynamic("applyTransformDependencies")(applyTransformDependencies.asInstanceOf[js.Any])
    if (arg != null) __obj.updateDynamic("arg")(js.Any.fromFunction1(arg))
    if (argDependencies != null) __obj.updateDynamic("argDependencies")(argDependencies.asInstanceOf[js.Any])
    if (asec != null) __obj.updateDynamic("asec")(js.Any.fromFunction1(asec))
    if (asecDependencies != null) __obj.updateDynamic("asecDependencies")(asecDependencies.asInstanceOf[js.Any])
    if (asech != null) __obj.updateDynamic("asech")(js.Any.fromFunction1(asech))
    if (asechDependencies != null) __obj.updateDynamic("asechDependencies")(asechDependencies.asInstanceOf[js.Any])
    if (asin != null) __obj.updateDynamic("asin")(js.Any.fromFunction1(asin))
    if (asinDependencies != null) __obj.updateDynamic("asinDependencies")(asinDependencies.asInstanceOf[js.Any])
    if (asinh != null) __obj.updateDynamic("asinh")(js.Any.fromFunction1(asinh))
    if (asinhDependencies != null) __obj.updateDynamic("asinhDependencies")(asinhDependencies.asInstanceOf[js.Any])
    if (atan != null) __obj.updateDynamic("atan")(js.Any.fromFunction1(atan))
    if (atan2 != null) __obj.updateDynamic("atan2")(js.Any.fromFunction2(atan2))
    if (atan2Dependencies != null) __obj.updateDynamic("atan2Dependencies")(atan2Dependencies.asInstanceOf[js.Any])
    if (atanDependencies != null) __obj.updateDynamic("atanDependencies")(atanDependencies.asInstanceOf[js.Any])
    if (atanh != null) __obj.updateDynamic("atanh")(js.Any.fromFunction1(atanh))
    if (atanhDependencies != null) __obj.updateDynamic("atanhDependencies")(atanhDependencies.asInstanceOf[js.Any])
    if (atomicMassDependencies != null) __obj.updateDynamic("atomicMassDependencies")(atomicMassDependencies.asInstanceOf[js.Any])
    if (avogadroDependencies != null) __obj.updateDynamic("avogadroDependencies")(avogadroDependencies.asInstanceOf[js.Any])
    if (bellNumbers != null) __obj.updateDynamic("bellNumbers")(js.Any.fromFunction1(bellNumbers))
    if (bellNumbersDependencies != null) __obj.updateDynamic("bellNumbersDependencies")(bellNumbersDependencies.asInstanceOf[js.Any])
    if (bignumber != null) __obj.updateDynamic("bignumber")(js.Any.fromFunction1(bignumber))
    if (bignumberDependencies != null) __obj.updateDynamic("bignumberDependencies")(bignumberDependencies.asInstanceOf[js.Any])
    if (bitAnd != null) __obj.updateDynamic("bitAnd")(js.Any.fromFunction2(bitAnd))
    if (bitAndDependencies != null) __obj.updateDynamic("bitAndDependencies")(bitAndDependencies.asInstanceOf[js.Any])
    if (bitNot != null) __obj.updateDynamic("bitNot")(js.Any.fromFunction1(bitNot))
    if (bitNotDependencies != null) __obj.updateDynamic("bitNotDependencies")(bitNotDependencies.asInstanceOf[js.Any])
    if (bitOr != null) __obj.updateDynamic("bitOr")(js.Any.fromFunction2(bitOr))
    if (bitOrDependencies != null) __obj.updateDynamic("bitOrDependencies")(bitOrDependencies.asInstanceOf[js.Any])
    if (bitXor != null) __obj.updateDynamic("bitXor")(js.Any.fromFunction2(bitXor))
    if (bitXorDependencies != null) __obj.updateDynamic("bitXorDependencies")(bitXorDependencies.asInstanceOf[js.Any])
    if (bohrMagnetonDependencies != null) __obj.updateDynamic("bohrMagnetonDependencies")(bohrMagnetonDependencies.asInstanceOf[js.Any])
    if (bohrRadiusDependencies != null) __obj.updateDynamic("bohrRadiusDependencies")(bohrRadiusDependencies.asInstanceOf[js.Any])
    if (boltzmannDependencies != null) __obj.updateDynamic("boltzmannDependencies")(boltzmannDependencies.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(js.Any.fromFunction1(boolean))
    if (booleanDependencies != null) __obj.updateDynamic("booleanDependencies")(booleanDependencies.asInstanceOf[js.Any])
    if (catalan != null) __obj.updateDynamic("catalan")(js.Any.fromFunction1(catalan))
    if (catalanDependencies != null) __obj.updateDynamic("catalanDependencies")(catalanDependencies.asInstanceOf[js.Any])
    if (cbrt != null) __obj.updateDynamic("cbrt")(js.Any.fromFunction2(cbrt))
    if (cbrtDependencies != null) __obj.updateDynamic("cbrtDependencies")(cbrtDependencies.asInstanceOf[js.Any])
    if (ceil != null) __obj.updateDynamic("ceil")(js.Any.fromFunction1(ceil))
    if (ceilDependencies != null) __obj.updateDynamic("ceilDependencies")(ceilDependencies.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(js.Any.fromFunction1(chain))
    if (chainDependencies != null) __obj.updateDynamic("chainDependencies")(chainDependencies.asInstanceOf[js.Any])
    if (classicalElectronRadiusDependencies != null) __obj.updateDynamic("classicalElectronRadiusDependencies")(classicalElectronRadiusDependencies.asInstanceOf[js.Any])
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction1(clone))
    if (cloneDependencies != null) __obj.updateDynamic("cloneDependencies")(cloneDependencies.asInstanceOf[js.Any])
    if (columnDependencies != null) __obj.updateDynamic("columnDependencies")(columnDependencies.asInstanceOf[js.Any])
    if (columnTransformDependencies != null) __obj.updateDynamic("columnTransformDependencies")(columnTransformDependencies.asInstanceOf[js.Any])
    if (combinations != null) __obj.updateDynamic("combinations")(js.Any.fromFunction2(combinations))
    if (combinationsDependencies != null) __obj.updateDynamic("combinationsDependencies")(combinationsDependencies.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2(compare))
    if (compareDependencies != null) __obj.updateDynamic("compareDependencies")(compareDependencies.asInstanceOf[js.Any])
    if (compareNatural != null) __obj.updateDynamic("compareNatural")(js.Any.fromFunction2(compareNatural))
    if (compareNaturalDependencies != null) __obj.updateDynamic("compareNaturalDependencies")(compareNaturalDependencies.asInstanceOf[js.Any])
    if (compareText != null) __obj.updateDynamic("compareText")(js.Any.fromFunction2(compareText))
    if (compareTextDependencies != null) __obj.updateDynamic("compareTextDependencies")(compareTextDependencies.asInstanceOf[js.Any])
    if (compile != null) __obj.updateDynamic("compile")(js.Any.fromFunction1(compile))
    if (compileDependencies != null) __obj.updateDynamic("compileDependencies")(compileDependencies.asInstanceOf[js.Any])
    if (complex != null) __obj.updateDynamic("complex")(js.Any.fromFunction1(complex))
    if (complexDependencies != null) __obj.updateDynamic("complexDependencies")(complexDependencies.asInstanceOf[js.Any])
    if (composition != null) __obj.updateDynamic("composition")(js.Any.fromFunction2(composition))
    if (compositionDependencies != null) __obj.updateDynamic("compositionDependencies")(compositionDependencies.asInstanceOf[js.Any])
    if (concat != null) __obj.updateDynamic("concat")(js.Any.fromFunction1(concat))
    if (concatDependencies != null) __obj.updateDynamic("concatDependencies")(concatDependencies.asInstanceOf[js.Any])
    if (concatTransformDependencies != null) __obj.updateDynamic("concatTransformDependencies")(concatTransformDependencies.asInstanceOf[js.Any])
    if (conductanceQuantumDependencies != null) __obj.updateDynamic("conductanceQuantumDependencies")(conductanceQuantumDependencies.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(js.Any.fromFunction1(config))
    if (conj != null) __obj.updateDynamic("conj")(js.Any.fromFunction1(conj))
    if (conjDependencies != null) __obj.updateDynamic("conjDependencies")(conjDependencies.asInstanceOf[js.Any])
    if (cos != null) __obj.updateDynamic("cos")(js.Any.fromFunction1(cos))
    if (cosDependencies != null) __obj.updateDynamic("cosDependencies")(cosDependencies.asInstanceOf[js.Any])
    if (cosh != null) __obj.updateDynamic("cosh")(js.Any.fromFunction1(cosh))
    if (coshDependencies != null) __obj.updateDynamic("coshDependencies")(coshDependencies.asInstanceOf[js.Any])
    if (cot != null) __obj.updateDynamic("cot")(js.Any.fromFunction1(cot))
    if (cotDependencies != null) __obj.updateDynamic("cotDependencies")(cotDependencies.asInstanceOf[js.Any])
    if (coth != null) __obj.updateDynamic("coth")(js.Any.fromFunction1(coth))
    if (cothDependencies != null) __obj.updateDynamic("cothDependencies")(cothDependencies.asInstanceOf[js.Any])
    if (coulombDependencies != null) __obj.updateDynamic("coulombDependencies")(coulombDependencies.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (createUnit != null) __obj.updateDynamic("createUnit")(js.Any.fromFunction3(createUnit))
    if (createUnitDependencies != null) __obj.updateDynamic("createUnitDependencies")(createUnitDependencies.asInstanceOf[js.Any])
    if (cross != null) __obj.updateDynamic("cross")(js.Any.fromFunction2(cross))
    if (crossDependencies != null) __obj.updateDynamic("crossDependencies")(crossDependencies.asInstanceOf[js.Any])
    if (csc != null) __obj.updateDynamic("csc")(js.Any.fromFunction1(csc))
    if (cscDependencies != null) __obj.updateDynamic("cscDependencies")(cscDependencies.asInstanceOf[js.Any])
    if (csch != null) __obj.updateDynamic("csch")(js.Any.fromFunction1(csch))
    if (cschDependencies != null) __obj.updateDynamic("cschDependencies")(cschDependencies.asInstanceOf[js.Any])
    if (ctransposeDependencies != null) __obj.updateDynamic("ctransposeDependencies")(ctransposeDependencies.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(js.Any.fromFunction1(cube))
    if (cubeDependencies != null) __obj.updateDynamic("cubeDependencies")(cubeDependencies.asInstanceOf[js.Any])
    if (deepEqual != null) __obj.updateDynamic("deepEqual")(js.Any.fromFunction2(deepEqual))
    if (deepEqualDependencies != null) __obj.updateDynamic("deepEqualDependencies")(deepEqualDependencies.asInstanceOf[js.Any])
    if (derivative != null) __obj.updateDynamic("derivative")(js.Any.fromFunction3(derivative))
    if (derivativeDependencies != null) __obj.updateDynamic("derivativeDependencies")(derivativeDependencies.asInstanceOf[js.Any])
    if (det != null) __obj.updateDynamic("det")(js.Any.fromFunction1(det))
    if (detDependencies != null) __obj.updateDynamic("detDependencies")(detDependencies.asInstanceOf[js.Any])
    if (deuteronMassDependencies != null) __obj.updateDynamic("deuteronMassDependencies")(deuteronMassDependencies.asInstanceOf[js.Any])
    if (diag != null) __obj.updateDynamic("diag")(js.Any.fromFunction2(diag))
    if (diagDependencies != null) __obj.updateDynamic("diagDependencies")(diagDependencies.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(js.Any.fromFunction2(distance))
    if (distanceDependencies != null) __obj.updateDynamic("distanceDependencies")(distanceDependencies.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(js.Any.fromFunction2(divide))
    if (divideDependencies != null) __obj.updateDynamic("divideDependencies")(divideDependencies.asInstanceOf[js.Any])
    if (divideScalarDependencies != null) __obj.updateDynamic("divideScalarDependencies")(divideScalarDependencies.asInstanceOf[js.Any])
    if (dot != null) __obj.updateDynamic("dot")(js.Any.fromFunction2(dot))
    if (dotDependencies != null) __obj.updateDynamic("dotDependencies")(dotDependencies.asInstanceOf[js.Any])
    if (dotDivide != null) __obj.updateDynamic("dotDivide")(js.Any.fromFunction2(dotDivide))
    if (dotDivideDependencies != null) __obj.updateDynamic("dotDivideDependencies")(dotDivideDependencies.asInstanceOf[js.Any])
    if (dotMultiply != null) __obj.updateDynamic("dotMultiply")(js.Any.fromFunction2(dotMultiply))
    if (dotMultiplyDependencies != null) __obj.updateDynamic("dotMultiplyDependencies")(dotMultiplyDependencies.asInstanceOf[js.Any])
    if (dotPow != null) __obj.updateDynamic("dotPow")(js.Any.fromFunction2(dotPow))
    if (dotPowDependencies != null) __obj.updateDynamic("dotPowDependencies")(dotPowDependencies.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (eDependencies != null) __obj.updateDynamic("eDependencies")(eDependencies.asInstanceOf[js.Any])
    if (efimovFactorDependencies != null) __obj.updateDynamic("efimovFactorDependencies")(efimovFactorDependencies.asInstanceOf[js.Any])
    if (electricConstantDependencies != null) __obj.updateDynamic("electricConstantDependencies")(electricConstantDependencies.asInstanceOf[js.Any])
    if (electronMassDependencies != null) __obj.updateDynamic("electronMassDependencies")(electronMassDependencies.asInstanceOf[js.Any])
    if (elementaryChargeDependencies != null) __obj.updateDynamic("elementaryChargeDependencies")(elementaryChargeDependencies.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(js.Any.fromFunction2(equal))
    if (equalDependencies != null) __obj.updateDynamic("equalDependencies")(equalDependencies.asInstanceOf[js.Any])
    if (equalScalarDependencies != null) __obj.updateDynamic("equalScalarDependencies")(equalScalarDependencies.asInstanceOf[js.Any])
    if (equalText != null) __obj.updateDynamic("equalText")(js.Any.fromFunction2(equalText))
    if (equalTextDependencies != null) __obj.updateDynamic("equalTextDependencies")(equalTextDependencies.asInstanceOf[js.Any])
    if (erf != null) __obj.updateDynamic("erf")(js.Any.fromFunction1(erf))
    if (erfDependencies != null) __obj.updateDynamic("erfDependencies")(erfDependencies.asInstanceOf[js.Any])
    if (evalDependencies != null) __obj.updateDynamic("evalDependencies")(evalDependencies.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction2(evaluate))
    if (evaluateDependencies != null) __obj.updateDynamic("evaluateDependencies")(evaluateDependencies.asInstanceOf[js.Any])
    if (exp != null) __obj.updateDynamic("exp")(js.Any.fromFunction1(exp))
    if (expDependencies != null) __obj.updateDynamic("expDependencies")(expDependencies.asInstanceOf[js.Any])
    if (expm != null) __obj.updateDynamic("expm")(js.Any.fromFunction1(expm))
    if (expm1 != null) __obj.updateDynamic("expm1")(js.Any.fromFunction1(expm1))
    if (expm1Dependencies != null) __obj.updateDynamic("expm1Dependencies")(expm1Dependencies.asInstanceOf[js.Any])
    if (expmDependencies != null) __obj.updateDynamic("expmDependencies")(expmDependencies.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (eyeDependencies != null) __obj.updateDynamic("eyeDependencies")(eyeDependencies.asInstanceOf[js.Any])
    if (factorial != null) __obj.updateDynamic("factorial")(js.Any.fromFunction1(factorial))
    if (factorialDependencies != null) __obj.updateDynamic("factorialDependencies")(factorialDependencies.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(js.Any.fromFunction4(factory))
    if (falseDependencies != null) __obj.updateDynamic("falseDependencies")(falseDependencies.asInstanceOf[js.Any])
    if (faradayDependencies != null) __obj.updateDynamic("faradayDependencies")(faradayDependencies.asInstanceOf[js.Any])
    if (fermiCouplingDependencies != null) __obj.updateDynamic("fermiCouplingDependencies")(fermiCouplingDependencies.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (filterDependencies != null) __obj.updateDynamic("filterDependencies")(filterDependencies.asInstanceOf[js.Any])
    if (filterTransformDependencies != null) __obj.updateDynamic("filterTransformDependencies")(filterTransformDependencies.asInstanceOf[js.Any])
    if (fineStructureDependencies != null) __obj.updateDynamic("fineStructureDependencies")(fineStructureDependencies.asInstanceOf[js.Any])
    if (firstRadiationDependencies != null) __obj.updateDynamic("firstRadiationDependencies")(firstRadiationDependencies.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1(fix))
    if (fixDependencies != null) __obj.updateDynamic("fixDependencies")(fixDependencies.asInstanceOf[js.Any])
    if (flatten != null) __obj.updateDynamic("flatten")(js.Any.fromFunction1(flatten))
    if (flattenDependencies != null) __obj.updateDynamic("flattenDependencies")(flattenDependencies.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(js.Any.fromFunction1(floor))
    if (floorDependencies != null) __obj.updateDynamic("floorDependencies")(floorDependencies.asInstanceOf[js.Any])
    if (forEach != null) __obj.updateDynamic("forEach")(js.Any.fromFunction2(forEach))
    if (forEachDependencies != null) __obj.updateDynamic("forEachDependencies")(forEachDependencies.asInstanceOf[js.Any])
    if (forEachTransformDependencies != null) __obj.updateDynamic("forEachTransformDependencies")(forEachTransformDependencies.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (formatDependencies != null) __obj.updateDynamic("formatDependencies")(formatDependencies.asInstanceOf[js.Any])
    if (fraction != null) __obj.updateDynamic("fraction")(js.Any.fromFunction1(fraction))
    if (fractionDependencies != null) __obj.updateDynamic("fractionDependencies")(fractionDependencies.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(js.Any.fromFunction1(gamma))
    if (gammaDependencies != null) __obj.updateDynamic("gammaDependencies")(gammaDependencies.asInstanceOf[js.Any])
    if (gasConstantDependencies != null) __obj.updateDynamic("gasConstantDependencies")(gasConstantDependencies.asInstanceOf[js.Any])
    if (gcd != null) __obj.updateDynamic("gcd")(js.Any.fromFunction1(gcd))
    if (gcdDependencies != null) __obj.updateDynamic("gcdDependencies")(gcdDependencies.asInstanceOf[js.Any])
    if (getMatrixDataTypeDependencies != null) __obj.updateDynamic("getMatrixDataTypeDependencies")(getMatrixDataTypeDependencies.asInstanceOf[js.Any])
    if (gravitationConstantDependencies != null) __obj.updateDynamic("gravitationConstantDependencies")(gravitationConstantDependencies.asInstanceOf[js.Any])
    if (gravityDependencies != null) __obj.updateDynamic("gravityDependencies")(gravityDependencies.asInstanceOf[js.Any])
    if (hartreeEnergyDependencies != null) __obj.updateDynamic("hartreeEnergyDependencies")(hartreeEnergyDependencies.asInstanceOf[js.Any])
    if (hasNumericValueDependencies != null) __obj.updateDynamic("hasNumericValueDependencies")(hasNumericValueDependencies.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(js.Any.fromFunction1(help))
    if (helpDependencies != null) __obj.updateDynamic("helpDependencies")(helpDependencies.asInstanceOf[js.Any])
    if (hypot != null) __obj.updateDynamic("hypot")(js.Any.fromFunction1(hypot))
    if (hypotDependencies != null) __obj.updateDynamic("hypotDependencies")(hypotDependencies.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (iDependencies != null) __obj.updateDynamic("iDependencies")(iDependencies.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(js.Any.fromFunction2(identity))
    if (identityDependencies != null) __obj.updateDynamic("identityDependencies")(identityDependencies.asInstanceOf[js.Any])
    if (im != null) __obj.updateDynamic("im")(js.Any.fromFunction1(im))
    if (imDependencies != null) __obj.updateDynamic("imDependencies")(imDependencies.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(js.Any.fromFunction2(`import`))
    if (index != null) __obj.updateDynamic("index")(js.Any.fromFunction1(index))
    __obj.asInstanceOf[PartialMathJsStatic]
  }
}

