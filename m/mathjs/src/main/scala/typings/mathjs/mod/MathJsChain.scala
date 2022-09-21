package typings.mathjs.mod

import typings.decimalJs.mod.Decimal
import typings.mathjs.mathjsStrings.asc
import typings.mathjs.mathjsStrings.biased
import typings.mathjs.mathjsStrings.dense
import typings.mathjs.mathjsStrings.desc
import typings.mathjs.mathjsStrings.natural
import typings.mathjs.mathjsStrings.sparse
import typings.mathjs.mathjsStrings.unbiased
import typings.mathjs.mathjsStrings.uncorrected
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathJsChain[TValue] extends StObject {
  
  /*************************************************************************
    * Arithmetic functions
    ************************************************************************/
  /**
    * Calculate the absolute value of a number. For matrices, the function
    * is evaluated element wise.
    */
  def abs(): MathJsChain[Double] = js.native
  
  /*************************************************************************
    * Trigonometry functions
    ************************************************************************/
  /**
    * Calculate the inverse cosine of a value. For matrices, the function
    * is evaluated element wise.
    */
  def acos(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic arccos of a value, defined as acosh(x) =
    * ln(sqrt(x^2 - 1) + x). For matrices, the function is evaluated
    * element wise.
    */
  def acosh(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse cotangent of a value. For matrices, the
    * function is evaluated element wise.
    */
  def acot(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic arccotangent of a value, defined as acoth(x)
    * = (ln((x+1)/x) + ln(x/(x-1))) / 2. For matrices, the function is
    * evaluated element wise.
    */
  def acoth(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse cosecant of a value. For matrices, the function
    * is evaluated element wise.
    */
  def acsc(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic arccosecant of a value, defined as acsch(x)
    * = ln(1/x + sqrt(1/x^2 + 1)). For matrices, the function is evaluated
    * element wise.
    */
  def acsch(): MathJsChain[Double] = js.native
  
  def add(y: js.Array[js.Array[MathNumericType] | MathNumericType]): MathJsChain[js.Array[MathNumericType]] = js.native
  /**
    * Add two values, x + y. For matrices, the function is evaluated
    * element wise.
    * @param y Second value to add
    */
  def add(y: Double): MathJsChain[Double] = js.native
  def add(y: Decimal): MathJsChain[Decimal] = js.native
  def add(y: Complex): MathJsChain[Complex] = js.native
  def add(y: Fraction): MathJsChain[Fraction] = js.native
  def add(y: MathType): MathJsChain[MathType] = js.native
  def add(y: Matrix): MathJsChain[Matrix] = js.native
  def add(y: Unit): MathJsChain[Unit] = js.native
  
  /*************************************************************************
    * Logical functions
    ************************************************************************/
  /**
    * Logical and. Test whether two values are both defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param y Second value to and
    */
  def and(y: Double): MathJsChain[Boolean | MathCollection] = js.native
  def and(y: BigNumber): MathJsChain[Boolean | MathCollection] = js.native
  def and(y: Complex): MathJsChain[Boolean | MathCollection] = js.native
  def and(y: MathCollection): MathJsChain[Boolean | MathCollection] = js.native
  def and(y: Unit): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Apply a function that maps an array to a scalar along a given axis of the
    * matrix or array. Returns a new matrix or array with one less dimension
    * than the input.
    * @param dim The dimension along which the callback is applied
    * @param callback The callback function that is applied. This Function should take an
    * array or 1-d matrix as an input and return a number.
    * @returns The residual matrix with the function applied over some dimension.
    */
  @JSName("apply")
  def apply[T /* <: MathCollection */](dim: Double, callback: js.Function1[/* array */ js.Array[MathType] | Matrix, Double]): MathJsChain[T] = js.native
  
  /*************************************************************************
    * Complex functions
    ************************************************************************/
  /**
    * Compute the argument of a complex value. For a complex number a + bi,
    * the argument is computed as atan2(b, a). For matrices, the function
    * is evaluated element wise.
    */
  def arg(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse secant of a value. For matrices, the function
    * is evaluated element wise.
    */
  def asec(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic arcsecant of a value, defined as asech(x) =
    * ln(sqrt(1/x^2 - 1) + 1/x). For matrices, the function is evaluated
    * element wise.
    */
  def asech(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse sine of a value. For matrices, the function is
    * evaluated element wise.
    */
  def asin(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic arcsine of a value, defined as asinh(x) =
    * ln(x + sqrt(x^2 + 1)). For matrices, the function is evaluated
    * element wise.
    */
  def asinh(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse tangent of a value. For matrices, the function
    * is evaluated element wise.
    */
  def atan(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the inverse tangent function with two arguments, y/x. By
    * providing two arguments, the right quadrant of the computed angle can
    * be determined. For matrices, the function is evaluated element wise.
    */
  def atan2(x: Double): MathJsChain[Double] = js.native
  def atan2(x: MathCollection): MathJsChain[MathCollection] = js.native
  
  /**
    * Calculate the hyperbolic arctangent of a value, defined as atanh(x) =
    * ln((1 + x)/(1 - x)) / 2. For matrices, the function is evaluated
    * element wise.
    */
  def atanh(): MathJsChain[Double] = js.native
  
  /*************************************************************************
    * Combinatorics functions
    ************************************************************************/
  /**
    * The Bell Numbers count the number of partitions of a set. A partition
    * is a pairwise disjoint subset of S whose union is S. bellNumbers only
    * takes integer arguments. The following condition must be enforced: n
    * >= 0
    */
  def bellNumbers(): MathJsChain[Double] = js.native
  
  /*************************************************************************
    * Construction functions
    ************************************************************************/
  /**
    * Create a BigNumber, which can store numbers with arbitrary precision.
    * When a matrix is provided, all elements will be converted to
    * BigNumber.
    */
  def bignumber(): MathJsChain[BigNumber] = js.native
  @JSName("bignumber")
  def bignumber_T_MathCollection[T /* <: MathCollection */](): MathJsChain[T] = js.native
  
  /*************************************************************************
    * Bitwise functions
    ************************************************************************/
  /**
    * Bitwise AND two values, x & y. For matrices, the function is
    * evaluated element wise.
    * @param y Second value to and
    */
  def bitAnd[T /* <: Double | BigNumber | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  def bitAnd[T /* <: Double | BigNumber | MathCollection */](y: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  def bitAnd[T /* <: Double | BigNumber | MathCollection */](y: MathCollection): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Bitwise NOT value, ~x. For matrices, the function is evaluated
    * element wise. For units, the function is evaluated on the best prefix
    * base.
    */
  def bitNot(): MathJsChain[Double] = js.native
  
  /**
    * Bitwise OR two values, x | y. For matrices, the function is evaluated
    * element wise. For units, the function is evaluated on the lowest
    * print base.
    * @param y Second value to or
    */
  def bitOr(y: Double): MathJsChain[Double] = js.native
  def bitOr(y: BigNumber): MathJsChain[BigNumber] = js.native
  def bitOr(y: MathArray): MathJsChain[MathArray] = js.native
  def bitOr(y: Matrix): MathJsChain[Matrix] = js.native
  
  /**
    * Bitwise XOR two values, x ^ y. For matrices, the function is
    * evaluated element wise.
    * @param y Second value to xor
    */
  def bitXor[T /* <: Double | BigNumber | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  def bitXor[T /* <: Double | BigNumber | MathCollection */](y: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  def bitXor[T /* <: Double | BigNumber | MathCollection */](y: MathCollection): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Create a boolean or convert a string or number to a boolean. In case
    * of a number, true is returned for non-zero numbers, and false in case
    * of zero. Strings can be 'true' or 'false', or can contain a number.
    * When value is a matrix, all elements will be converted to boolean.
    */
  def boolean(): MathJsChain[Boolean] = js.native
  
  /**
    * The Catalan Numbers enumerate combinatorial structures of many
    * different types. catalan only takes integer arguments. The following
    * condition must be enforced: n >= 0
    */
  def catalan(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the cubic root of a value. For matrices, the function is
    * evaluated element wise.
    * @param allRoots Optional, false by default. Only applicable when x is
    * a number or complex number. If true, all complex roots are returned,
    * if false (default) the principal root is returned.
    */
  def cbrt(): MathJsChain[Double] = js.native
  def cbrt(allRoots: Boolean): MathJsChain[Double] = js.native
  
  // Rounding functions grouped for similarity
  /**
    * Round a value towards plus infinity If x is complex, both real and
    * imaginary part are rounded towards plus infinity. For matrices, the
    * function is evaluated element wise.
    * @param n Number of decimals Default value: 0.
    */
  def ceil(): MathJsChain[MathNumericType] = js.native
  def ceil(n: Double): MathJsChain[MathNumericType] = js.native
  def ceil(n: BigNumber): MathJsChain[MathNumericType] = js.native
  def ceil(n: MathCollection): MathJsChain[MathNumericType] = js.native
  
  /*************************************************************************
    * Probability functions
    ************************************************************************/
  /**
    * Compute the number of ways of picking k unordered outcomes from n
    * possibilities. Combinations only takes integer arguments. The
    * following condition must be enforced: k <= n.
    * @param k Number of objects in the subset
    */
  def combinations[T /* <: Double | BigNumber */](n: MathJsChain[T], k: Double): MathJsChain[NoLiteralType[T]] = js.native
  def combinations[T /* <: Double | BigNumber */](n: MathJsChain[T], k: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  def compare(y: String): MathJsChain[Double | BigNumber | Fraction | MathCollection] = js.native
  /*************************************************************************
    * Relational functions
    ************************************************************************/
  /**
    * Compare two values. Returns 1 when x > y, -1 when x < y, and 0 when x
    * == y. x and y are considered equal when the relative difference
    * between x and y is smaller than the configured epsilon. The function
    * cannot be used to compare values smaller than approximately 2.22e-16.
    * For matrices, the function is evaluated element wise.
    * @param y Second value to compare
    */
  def compare(y: MathType): MathJsChain[Double | BigNumber | Fraction | MathCollection] = js.native
  
  /**
    * Compare two values of any type in a deterministic, natural way. For
    * numeric values, the function works the same as math.compare. For
    * types of values that can’t be compared mathematically, the function
    * compares in a natural way.
    * @param y Second value to compare
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def compareNatural(y: Any): MathJsChain[Double] = js.native
  
  /**
    * Compare two strings lexically. Comparison is case sensitive. Returns
    * 1 when x > y, -1 when x < y, and 0 when x == y. For matrices, the
    * function is evaluated element wise.
    * @param y Second string to compare
    */
  def compareText(y: String): MathJsChain[Double | MathCollection] = js.native
  def compareText(y: MathCollection): MathJsChain[Double | MathCollection] = js.native
  
  /*************************************************************************
    * Expression functions
    ************************************************************************/
  /**
    * Parse and compile an expression. Returns a an object with a function
    * evaluate([scope]) to evaluate the compiled expression.
    */
  def compile(): MathJsChain[EvalFunction] = js.native
  
  /**
    * Create a complex value or convert a value to a complex value.
    * @param im Argument specifying the imaginary part of the complex
    * number
    */
  def complex(): MathJsChain[Complex] = js.native
  def complex(im: Double): MathJsChain[Complex] = js.native
  
  /**
    * The composition counts of n into k parts. Composition only takes
    * integer arguments. The following condition must be enforced: k <= n.
    * @param k Number of objects in the subset
    */
  def composition[T /* <: Double | BigNumber */](k: Double): MathJsChain[NoLiteralType[T]] = js.native
  def composition[T /* <: Double | BigNumber */](k: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  /*************************************************************************
    * Matrix functions
    ************************************************************************/
  /**
    * Concatenate two or more matrices. dim: number is a zero-based
    * dimension over which to concatenate the matrices. By default the last
    * dimension of the matrices.
    */
  def concat(): MathJsChain[MathCollection] = js.native
  
  /**
    * Compute the complex conjugate of a complex value. If x = a+bi, the
    * complex conjugate of x is a - bi. For matrices, the function is
    * evaluated element wise.
    */
  def conj[T /* <: Double | BigNumber | Complex | MathCollection */](): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Calculate the cosine of a value. For matrices, the function is
    * evaluated element wise.
    */
  def cos(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic cosine of a value, defined as cosh(x) = 1/2
    * * (exp(x) + exp(-x)). For matrices, the function is evaluated element
    * wise.
    */
  def cosh(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the cotangent of a value. cot(x) is defined as 1 / tan(x).
    * For matrices, the function is evaluated element wise.
    */
  def cot(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic cotangent of a value, defined as coth(x) = 1
    * / tanh(x). For matrices, the function is evaluated element wise.
    */
  def coth(): MathJsChain[Double] = js.native
  
  /**
    * Count the number of elements of a matrix, array or string.
    */
  def count(): MathJsChain[Double] = js.native
  
  /**
    * Create a user-defined unit and register it with the Unit type.
    * @param definition Definition of the unit in terms of existing units.
    * For example, ‘0.514444444 m / s’.
    * @param options (optional) An object containing any of the following
    * properties:</br>- prefixes {string} “none”, “short”, “long”,
    * “binary_short”, or “binary_long”. The default is “none”.</br>-
    * aliases {Array} Array of strings. Example: [‘knots’, ‘kt’,
    * ‘kts’]</br>- offset {Numeric} An offset to apply when converting from
    * the unit. For example, the offset for celsius is 273.15. Default is
    * 0.
    */
  def createUnit(): MathJsChain[Unit] = js.native
  def createUnit(definition: String): MathJsChain[Unit] = js.native
  def createUnit(definition: String, options: CreateUnitOptions): MathJsChain[Unit] = js.native
  def createUnit(definition: scala.Unit, options: CreateUnitOptions): MathJsChain[Unit] = js.native
  def createUnit(definition: Unit): MathJsChain[Unit] = js.native
  def createUnit(definition: UnitDefinition): MathJsChain[Unit] = js.native
  def createUnit(definition: UnitDefinition, options: CreateUnitOptions): MathJsChain[Unit] = js.native
  def createUnit(definition: Unit, options: CreateUnitOptions): MathJsChain[Unit] = js.native
  def createUnit(options: CreateUnitOptions): MathJsChain[Unit] = js.native
  
  /**
    * Calculate the cross product for two vectors in three dimensional
    * space. The cross product of A = [a1, a2, a3] and B =[b1, b2, b3] is
    * defined as: cross(A, B) = [ a2 * b3 - a3 * b2, a3 * b1 - a1 * b3, a1
    * * b2 - a2 * b1 ]
    * @param y Second vector
    */
  def cross(y: MathCollection): MathJsChain[Matrix | MathArray] = js.native
  
  /**
    * Calculate the cosecant of a value, defined as csc(x) = 1/sin(x). For
    * matrices, the function is evaluated element wise.
    */
  def csc(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic cosecant of a value, defined as csch(x) = 1
    * / sinh(x). For matrices, the function is evaluated element wise.
    */
  def csch(): MathJsChain[Double] = js.native
  
  // End of rounding group
  /**
    * Compute the cube of a value, x * x * x. For matrices, the function is
    * evaluated element wise.
    */
  def cube(): MathJsChain[Double] = js.native
  
  /**
    * Test element wise whether two matrices are equal. The function
    * accepts both matrices and scalar values.
    * @param y Second amtrix to compare
    */
  def deepEqual(y: MathType): MathJsChain[Double | BigNumber | Fraction | Complex | Unit | MathCollection] = js.native
  
  def derivative(variable: String): MathJsChain[MathNode] = js.native
  def derivative(variable: String, options: typings.mathjs.anon.Simplify): MathJsChain[MathNode] = js.native
  /*************************************************************************
    * Algebra functions
    ************************************************************************/
  /**
    * @param variable The variable over which to differentiate
    * @param options There is one option available, simplify, which is true
    * by default. When false, output will not be simplified.
    */
  def derivative(variable: MathNode): MathJsChain[MathNode] = js.native
  def derivative(variable: MathNode, options: typings.mathjs.anon.Simplify): MathJsChain[MathNode] = js.native
  
  /**
    * Calculate the determinant of a matrix.
    */
  def det(): MathJsChain[Double] = js.native
  
  /**
    * Create a diagonal matrix or retrieve the diagonal of a matrix. When x
    * is a vector, a matrix with vector x on the diagonal will be returned.
    * When x is a two dimensional matrix, the matrixes kth diagonal will be
    * returned as vector. When k is positive, the values are placed on the
    * super diagonal. When k is negative, the values are placed on the sub
    * diagonal.
    * @param k The diagonal where the vector will be filled in or
    * retrieved. Default value: 0.
    * @param format The matrix storage format. Default value: 'dense'.
    */
  def diag(): MathJsChain[Matrix] = js.native
  def diag(format: String): MathJsChain[Matrix] = js.native
  def diag(k: Double): MathJsChain[Matrix | MathArray] = js.native
  def diag(k: Double, format: String): MathJsChain[Matrix | MathArray] = js.native
  def diag(k: BigNumber): MathJsChain[Matrix | MathArray] = js.native
  def diag(k: BigNumber, format: String): MathJsChain[Matrix | MathArray] = js.native
  
  /*************************************************************************
    * Geometry functions
    ************************************************************************/
  /**
    * Calculates: The eucledian distance between two points in 2 and 3
    * dimensional spaces. Distance between point and a line in 2 and 3
    * dimensional spaces. Pairwise distance between a set of 2D or 3D
    * points NOTE: When substituting coefficients of a line(a, b and c),
    * use ax + by + c = 0 instead of ax + by = c For parametric equation of
    * a 3D line, x0, y0, z0, a, b, c are from: (x−x0, y−y0, z−z0) = t(a, b,
    * c)
    * @param y Coordinates of the second point
    */
  def distance(y: MathCollection | js.Object): MathJsChain[Double | BigNumber] = js.native
  
  def divide(y: Double): MathJsChain[Unit] = js.native
  def divide(y: MathType): MathJsChain[MathType] = js.native
  /**
    * Divide two values, x / y. To divide matrices, x is multiplied with
    * the inverse of y: x * inv(y).
    * @param y Denominator
    */
  def divide(y: Unit): MathJsChain[Unit | Double] = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def done(): TValue = js.native
  
  /**
    * Calculate the dot product of two vectors. The dot product of A = [a1,
    * a2, a3, ..., an] and B = [b1, b2, b3, ..., bn] is defined as: dot(A,
    * B) = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
    * @param y Second vector
    */
  def dot(y: MathCollection): MathJsChain[Double] = js.native
  
  /**
    * Divide two matrices element wise. The function accepts both matrices
    * and scalar values.
    * @param y Denominator
    */
  def dotDivide(y: MathType): MathJsChain[MathType] = js.native
  
  /**
    * Multiply two matrices element wise. The function accepts both
    * matrices and scalar values.
    * @param y Right hand value
    */
  def dotMultiply(y: MathType): MathJsChain[MathType] = js.native
  
  /**
    * Calculates the power of x to y element wise.
    * @param y The exponent
    */
  def dotPow(y: MathType): MathJsChain[MathType] = js.native
  
  def equal(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether two values are equal.
    *
    * The function tests whether the relative difference between x and y is
    * smaller than the configured epsilon. The function cannot be used to
    * compare values smaller than approximately 2.22e-16. For matrices, the
    * function is evaluated element wise. In case of complex numbers, x.re
    * must equal y.re, and x.im must equal y.im. Values null and undefined
    * are compared strictly, thus null is only equal to null and nothing
    * else, and undefined is only equal to undefined and nothing else.
    * @param y Second value to compare
    */
  def equal(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Check equality of two strings. Comparison is case sensitive. For
    * matrices, the function is evaluated element wise.
    * @param y Second string to compare
    */
  def equalText(y: String): MathJsChain[Double | MathCollection] = js.native
  def equalText(y: MathCollection): MathJsChain[Double | MathCollection] = js.native
  
  /*************************************************************************
    * Special functions
    ************************************************************************/
  /**
    * Compute the erf function of a value using a rational Chebyshev
    * approximations for different intervals of x.
    */
  def erf[T /* <: Double | MathCollection */](): MathJsChain[NoLiteralType[T]] = js.native
  
  // TODO properly type this
  /**
    * Evaluate an expression.
    * @param scope Scope to read/write variables
    */
  def evaluate(): MathJsChain[Any] = js.native
  def evaluate(scope: js.Object): MathJsChain[Any] = js.native
  
  /**
    * Calculate the exponent of a value. For matrices, the function is
    * evaluated element wise.
    */
  def exp(): MathJsChain[Double] = js.native
  
  /**
    * Compute the matrix exponential, expm(A) = e^A. The matrix must be
    * square. Not to be confused with exp(a), which performs element-wise
    * exponentiation. The exponential is calculated using the Padé
    * approximant with scaling and squaring; see “Nineteen Dubious Ways to
    * Compute the Exponential of a Matrix,” by Moler and Van Loan.
    */
  def expm(): MathJsChain[Matrix] = js.native
  
  /**
    * Calculate the value of subtracting 1 from the exponential value. For
    * matrices, the function is evaluated element wise.
    */
  def expm1(): MathJsChain[Double] = js.native
  
  /**
    * Compute the factorial of a value Factorial only supports an integer
    * value as argument. For matrices, the function is evaluated element
    * wise.
    */
  def factorial[T /* <: Double | BigNumber | MathCollection */](n: MathJsChain[T]): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Filter the items in an array or one dimensional matrix.
    */
  def filter(
    test: js.Function3[
      /* value */ Any, 
      /* index */ Any, 
      /* matrix */ Matrix | MathArray | js.Array[String], 
      Boolean
    ]
  ): MathJsChain[Matrix | MathArray] = js.native
  def filter(test: js.RegExp): MathJsChain[Matrix | MathArray] = js.native
  
  /**
    * Round a value towards zero. For matrices, the function is evaluated
    * element wise.
    * @param n Number of decimals Default value: 0.
    */
  def fix(): MathJsChain[MathNumericType] = js.native
  def fix(n: Double): MathJsChain[MathNumericType] = js.native
  def fix(n: BigNumber): MathJsChain[MathNumericType] = js.native
  def fix(n: MathCollection): MathJsChain[MathNumericType] = js.native
  
  /**
    * Flatten a multi dimensional matrix into a single dimensional matrix.
    */
  def flatten[T /* <: MathCollection */](x: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Round a value towards minus infinity. For matrices, the function is
    * evaluated element wise.
    * @param n Number of decimals Default value: 0.
    */
  def floor(): MathJsChain[MathNumericType] = js.native
  def floor(n: Double): MathJsChain[MathNumericType] = js.native
  def floor(n: BigNumber): MathJsChain[MathNumericType] = js.native
  def floor(n: MathCollection): MathJsChain[MathNumericType] = js.native
  
  /**
    * Iterate over all elements of a matrix/array, and executes the given
    * callback function.
    */
  def forEach[T /* <: Matrix | MathArray */](
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* value */ Any, /* index */ Any, /* matrix */ T, scala.Unit]
  ): MathJsChain[T] = js.native
  
  /*************************************************************************
    * String functions
    ************************************************************************/
  /**
    * Format a value of any type into a string.
    * @param options An object with formatting options.
    * @param callback A custom formatting function, invoked for all numeric
    * elements in value, for example all elements of a matrix, or the real
    * and imaginary parts of a complex number. This callback can be used to
    * override the built-in numeric notation with any type of formatting.
    * Function callback is called with value as parameter and must return a
    * string.
    * @see http://mathjs.org/docs/reference/functions/format.html
    */
  def format(// eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: js.Function1[/* item */ Any, String]
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: js.Function1[/* item */ Any, String],
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function1[/* value */ Any, String]
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: Double
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: Double,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function1[/* value */ Any, String]
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: scala.Unit,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function1[/* value */ Any, String]
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: FormatOptions
  ): MathJsChain[String] = js.native
  def format(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  value: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: FormatOptions,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function1[/* value */ Any, String]
  ): MathJsChain[String] = js.native
  
  /**
    * Create a fraction convert a value to a fraction.
    * @param denominator Argument specifying the denominator of the
    * fraction
    */
  def fraction(): MathJsChain[Fraction] = js.native
  def fraction(denominator: Double): MathJsChain[Fraction] = js.native
  
  /**
    * Compute the gamma function of a value using Lanczos approximation for
    * small values, and an extended Stirling approximation for large
    * values. For matrices, the function is evaluated element wise.
    */
  def gamma[T /* <: Double | BigNumber | Complex | MathCollection */](n: MathJsChain[T]): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Calculate the greatest common divisor for two or more values or
    * arrays. For matrices, the function is evaluated element wise.
    */
  def gcd(args: (BigNumber | Double | Fraction | MathArray | Matrix)*): MathJsChain[Double] = js.native
  
  /**
    * Retrieve help on a function or data type. Help files are retrieved
    * from the documentation in math.expression.docs.
    */
  def help(): MathJsChain[Any] = js.native
  
  /**
    * Calculate the hypotenusa of a list with values. The hypotenusa is
    * defined as: hypot(a, b, c, ...) = sqrt(a^2 + b^2 + c^2 + ...) For
    * matrix input, the hypotenusa is calculated for all values in the
    * matrix.
    */
  def hypot(): MathJsChain[Double] = js.native
  
  /**
    * Create a 2-dimensional identity matrix with size m x n or n x n. The
    * matrix has ones on the diagonal and zeros elsewhere.
    * @param format The Matrix storage format
    */
  def identity(): MathJsChain[Matrix | MathArray | Double] = js.native
  def identity(format: String): MathJsChain[Matrix | MathArray | Double] = js.native
  /**
    * @param n The y dimension for the matrix
    * @param format The Matrix storage format
    */
  def identity(n: Double): MathJsChain[Matrix | MathArray | Double] = js.native
  def identity(n: Double, format: String): MathJsChain[Matrix | MathArray | Double] = js.native
  
  /**
    * Get the imaginary part of a complex number. For a complex number a +
    * bi, the function returns b. For matrices, the function is evaluated
    * element wise.
    */
  def im(): MathJsChain[Double] = js.native
  
  /**
    * Create an index. An Index can store ranges having start, step, and
    * end for multiple dimensions. Matrix.get, Matrix.set, and math.subset
    * accept an Index as input.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def index(): MathJsChain[Index] = js.native
  
  /**
    * Calculates the point of intersection of two lines in two or three
    * dimensions and of a line and a plane in three dimensions. The inputs
    * are in the form of arrays or 1 dimensional matrices. The line
    * intersection functions return null if the lines do not meet. Note:
    * Fill the plane coefficients as x + y + z = c and not as x + y + z + c
    * = 0.
    * @param x Co-ordinates of second end-point of first line
    * @param y Co-ordinates of first end-point of second line OR
    * Coefficients of the plane's equation
    * @param z Co-ordinates of second end-point of second line OR null if
    * the calculation is for line and plane
    */
  def intersect(x: MathCollection, y: MathCollection, z: MathCollection): MathJsChain[MathArray] = js.native
  
  /**
    * Calculate the inverse of a square matrix.
    */
  def inv[T /* <: Double | Complex | MathCollection */](): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Test whether a value is an integer number. The function supports
    * number, BigNumber, and Fraction. The function is evaluated
    * element-wise in case of Array or Matrix input.
    */
  def isInteger(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is NaN (not a number). The function supports
    * types number, BigNumber, Fraction, Unit and Complex. The function is
    * evaluated element-wise in case of Array or Matrix input.
    */
  def isNaN(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is negative: smaller than zero. The function
    * supports types number, BigNumber, Fraction, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    */
  def isNegative(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is an numeric value. The function is evaluated
    * element-wise in case of Array or Matrix input.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def isNumeric(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is positive: larger than zero. The function
    * supports types number, BigNumber, Fraction, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    */
  def isPositive(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is prime: has no divisors other than itself and
    * one. The function supports type number, bignumber. The function is
    * evaluated element-wise in case of Array or Matrix input.
    */
  def isPrime(): MathJsChain[Boolean] = js.native
  
  /**
    * Test whether a value is zero. The function can check for zero for
    * types number, BigNumber, Fraction, Complex, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    */
  def isZero(): MathJsChain[Boolean] = js.native
  
  /**
    * Calculate the Kullback-Leibler (KL) divergence between two
    * distributions
    * @param p Second vector
    */
  def kldivergence(p: MathCollection): MathJsChain[Double] = js.native
  
  def kron(y: MathArray): MathJsChain[Matrix] = js.native
  /**
    * Calculate the kronecker product of two matrices or vectors
    * @param y Second vector
    */
  def kron(y: Matrix): MathJsChain[Matrix] = js.native
  
  def larger(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether value x is larger than y. The function returns true when
    * x is larger than y and the relative difference between x and y is
    * larger than the configured epsilon. The function cannot be used to
    * compare values smaller than approximately 2.22e-16. For matrices, the
    * function is evaluated element wise.
    * @param y Second value to compare
    */
  def larger(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  def largerEq(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether value x is larger or equal to y. The function returns
    * true when x is larger than y or the relative difference between x and
    * y is smaller than the configured epsilon. The function cannot be used
    * to compare values smaller than approximately 2.22e-16. For matrices,
    * the function is evaluated element wise.
    * @param y Second value to vcompare
    */
  def largerEq(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Calculate the least common multiple for two or more values or arrays.
    * lcm is defined as: lcm(a, b) = abs(a * b) / gcd(a, b) For matrices,
    * the function is evaluated element wise.
    * @param b An integer number
    */
  def lcm(b: Double): MathJsChain[Double] = js.native
  def lcm(b: BigNumber): MathJsChain[BigNumber] = js.native
  def lcm(b: MathArray): MathJsChain[MathArray] = js.native
  def lcm(b: Matrix): MathJsChain[Matrix] = js.native
  
  /**
    * Bitwise left logical shift of a value x by y number of bits, x << y.
    * For matrices, the function is evaluated element wise. For units, the
    * function is evaluated on the best prefix base.
    * @param y Amount of shifts
    */
  def leftShift[T /* <: Double | BigNumber | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  def leftShift[T /* <: Double | BigNumber | MathCollection */](y: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Calculate the logarithm of a value. For matrices, the function is
    * evaluated element wise.
    * @param base Optional base for the logarithm. If not provided, the
    * natural logarithm of x is calculated. Default value: e.
    */
  def log[T /* <: Double | BigNumber | Complex | MathCollection */](): MathJsChain[NoLiteralType[T]] = js.native
  def log[T /* <: Double | BigNumber | Complex | MathCollection */](base: Double): MathJsChain[NoLiteralType[T]] = js.native
  def log[T /* <: Double | BigNumber | Complex | MathCollection */](base: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  def log[T /* <: Double | BigNumber | Complex | MathCollection */](base: Complex): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Calculate the 10-base of a value. This is the same as calculating
    * log(x, 10). For matrices, the function is evaluated element wise.
    */
  def log10(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the logarithm of a value+1. For matrices, the function is
    * evaluated element wise.
    */
  def log1p(): MathJsChain[Double] = js.native
  def log1p(base: Double): MathJsChain[Double] = js.native
  def log1p(base: BigNumber): MathJsChain[Double] = js.native
  def log1p(base: Complex): MathJsChain[Double] = js.native
  
  /**
    * Calculate the 2-base of a value. This is the same as calculating
    * log(x, 2). For matrices, the function is evaluated element wise.
    */
  def log2(): MathJsChain[Double] = js.native
  
  def lsolve(b: MathArray): MathJsChain[Matrix] = js.native
  /**
    * Solves the linear equation system by forwards substitution. Matrix
    * must be a lower triangular matrix.
    * @param b A column vector with the b values
    */
  def lsolve(b: Matrix): MathJsChain[Matrix] = js.native
  
  /**
    * Calculate the Matrix LU decomposition with partial pivoting. Matrix A
    * is decomposed in two matrices (L, U) and a row permutation vector p
    * where A[p,:] = L * U
    */
  def lup(): MathJsChain[LUDecomposition] = js.native
  
  def lusolve(b: MathArray): MathJsChain[Matrix] = js.native
  def lusolve(b: MathArray, order: Double): MathJsChain[Matrix] = js.native
  def lusolve(b: MathArray, order: Double, threshold: Double): MathJsChain[Matrix] = js.native
  def lusolve(b: MathArray, order: scala.Unit, threshold: Double): MathJsChain[Matrix] = js.native
  /**
    * Solves the linear system A * x = b where A is an [n x n] matrix and b
    * is a [n] column vector.
    * @param b Column Vector
    * @param order The Symbolic Ordering and Analysis order, see slu for
    * details. Matrix must be a SparseMatrix
    * @param threshold Partial pivoting threshold (1 for partial pivoting),
    * see slu for details. Matrix must be a SparseMatrix.
    */
  def lusolve(b: Matrix): MathJsChain[Matrix] = js.native
  def lusolve(b: Matrix, order: Double): MathJsChain[Matrix] = js.native
  def lusolve(b: Matrix, order: Double, threshold: Double): MathJsChain[Matrix] = js.native
  def lusolve(b: Matrix, order: scala.Unit, threshold: Double): MathJsChain[Matrix] = js.native
  
  /*************************************************************************
    * Statistics functions
    ************************************************************************/
  /**
    * Compute the median absolute deviation of a matrix or a list with
    * values. The median absolute deviation is defined as the median of the
    * absolute deviations from the median.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def mad(): MathJsChain[Any] = js.native
  
  /**
    * Iterate over all elements of a matrix/array, and executes the given
    * callback function.
    * @param callback The callback function is invoked with three
    * parameters: the value of the element, the index of the element, and
    * the Matrix/array being traversed.
    */
  def map[T /* <: Matrix | MathArray */](
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* value */ Any, /* index */ Any, /* matrix */ T, MathType | String]
  ): MathJsChain[T] = js.native
  
  /**
    * Create a Matrix. The function creates a new math.type.Matrix object
    * from an Array. A Matrix has utility functions to manipulate the data
    * in the matrix, like getting the size and getting or setting values in
    * the matrix. Supported storage formats are 'dense' and 'sparse'.
    */
  def matrix(): MathJsChain[Matrix] = js.native
  def matrix(format: sparse | dense): MathJsChain[Matrix] = js.native
  def matrix(format: sparse | dense, dataType: String): MathJsChain[Matrix] = js.native
  def matrix(format: scala.Unit, dataType: String): MathJsChain[Matrix] = js.native
  
  /**
    * Compute the maximum value of a matrix or a list with values. In case
    * of a multi dimensional array, the maximum of the flattened array will
    * be calculated. When dim is provided, the maximum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param dim The maximum over the selected dimension
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def max(): MathJsChain[Any] = js.native
  def max(dim: Double): MathJsChain[Any] = js.native
  
  /**
    * Compute the mean value of matrix or a list with values. In case of a
    * multi dimensional array, the mean of the flattened array will be
    * calculated. When dim is provided, the maximum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param dim The mean over the selected dimension
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def mean(): MathJsChain[Any] = js.native
  def mean(dim: Double): MathJsChain[Any] = js.native
  
  /**
    * Compute the median of a matrix or a list with values. The values are
    * sorted and the middle value is returned. In case of an even number of
    * values, the average of the two middle values is returned. Supported
    * types of values are: Number, BigNumber, Unit In case of a (multi
    * dimensional) array or matrix, the median of all elements will be
    * calculated.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def median(): MathJsChain[Any] = js.native
  def median(dim: Double): MathJsChain[Any] = js.native
  
  /**
    * Compute the minimum value of a matrix or a list of values. In case of
    * a multi dimensional array, the minimum of the flattened array will be
    * calculated. When dim is provided, the minimum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param dim The minimum over the selected dimension
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def min(): MathJsChain[js.Array[MathType]] = js.native
  def min(dim: Double): MathJsChain[Any] = js.native
  
  /**
    * Calculates the modulus, the remainder of an integer division. For
    * matrices, the function is evaluated element wise. The modulus is
    * defined as: x - y * floor(x / y)
    * @see http://en.wikipedia.org/wiki/Modulo_operation.
    * @param y Divisor
    */
  def mod[T /* <: Double | BigNumber | Fraction | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  def mod[T /* <: Double | BigNumber | Fraction | MathCollection */](y: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  def mod[T /* <: Double | BigNumber | Fraction | MathCollection */](y: Fraction): MathJsChain[NoLiteralType[T]] = js.native
  def mod[T /* <: Double | BigNumber | Fraction | MathCollection */](y: MathCollection): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Computes the mode of a set of numbers or a list with values(numbers
    * or characters). If there are more than one modes, it returns a list
    * of those values.
    */
  def mode(): MathJsChain[js.Array[MathType]] = js.native
  
  /**
    * Multinomial Coefficients compute the number of ways of picking a1,
    * a2, ..., ai unordered outcomes from n possibilities. multinomial
    * takes one array of integers as an argument. The following condition
    * must be enforced: every ai <= 0
    */
  def multinomial[T /* <: Double | BigNumber */](a: MathJsChain[js.Array[T]]): MathJsChain[NoLiteralType[T]] = js.native
  
  def multiply(y: Double): MathJsChain[Double] = js.native
  def multiply(y: MathType): MathJsChain[MathType] = js.native
  def multiply(y: Unit): MathJsChain[Unit] = js.native
  /**
    * Multiply two values, x * y. The result is squeezed. For matrices, the
    * matrix product is calculated.
    * @param y The second value to multiply
    */
  @JSName("multiply")
  def multiply_T_UnionMatrixMathArray[T /* <: Matrix | MathArray */](y: MathType): MathJsChain[T] = js.native
  
  /**
    * Calculate the norm of a number, vector or matrix. The second
    * parameter p is optional. If not provided, it defaults to 2.
    * @param p Vector space. Supported numbers include Infinity and
    * -Infinity. Supported strings are: 'inf', '-inf', and 'fro' (The
    * Frobenius norm) Default value: 2.
    */
  def norm(): MathJsChain[Double | BigNumber] = js.native
  def norm(p: String): MathJsChain[Double | BigNumber] = js.native
  def norm(p: Double): MathJsChain[Double | BigNumber] = js.native
  def norm(p: BigNumber): MathJsChain[Double | BigNumber] = js.native
  
  /**
    * Logical not. Flips boolean value of a given parameter. For matrices,
    * the function is evaluated element wise.
    */
  def not(): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Calculate the nth root of a value. The principal nth root of a
    * positive real number A, is the positive real solution of the equation
    * x^root = A For matrices, the function is evaluated element wise.
    * @param root The root. Default value: 2.
    */
  def nthRoot(): MathJsChain[Double | Complex | MathCollection] = js.native
  def nthRoot(root: Double): MathJsChain[Double | Complex | MathCollection] = js.native
  def nthRoot(root: BigNumber): MathJsChain[Double | Complex | MathCollection] = js.native
  
  /**
    * Create a number or convert a string, boolean, or unit to a number.
    * When value is a matrix, all elements will be converted to number.
    * @param valuelessUnit A valueless unit, used to convert a unit to a
    * number
    */
  def number(): MathJsChain[Double] = js.native
  def number(valuelessUnit: String): MathJsChain[Double] = js.native
  def number(valuelessUnit: Unit): MathJsChain[Double] = js.native
  
  /**
    * Create a matrix filled with ones. The created matrix can have one or
    * multiple dimensions.
    * @param format The matrix storage format
    */
  def ones(): MathJsChain[MathCollection] = js.native
  def ones(format: String): MathJsChain[MathCollection] = js.native
  
  /**
    * Logical or. Test if at least one value is defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param y Second value to or
    */
  def or(y: Double): MathJsChain[Boolean | MathCollection] = js.native
  def or(y: BigNumber): MathJsChain[Boolean | MathCollection] = js.native
  def or(y: Complex): MathJsChain[Boolean | MathCollection] = js.native
  def or(y: MathCollection): MathJsChain[Boolean | MathCollection] = js.native
  def or(y: Unit): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * @param options Available options: nodes - a set of custome nodes
    */
  /**
    * Parse an expression. Returns a node tree, which can be evaluated by
    * invoking node.evaluate();
    * @param options Available options: nodes - a set of custome nodes
    */
  def parse(): MathJsChain[js.Array[MathNode]] = js.native
  def parse(// eslint-disable-next-line @typescript-eslint/no-explicit-any
  options: Any): MathJsChain[js.Array[MathNode]] = js.native
  
  /**
    * Partition-based selection of an array or 1D matrix. Will find the kth
    * smallest value, and mutates the input array. Uses Quickselect.
    * @param k The kth smallest value to be retrieved; zero-based index
    * @param compare  An optional comparator function. The function is
    * called as compare(a, b), and must return 1 when a > b, -1 when a < b,
    * and 0 when a == b. Default value: 'asc'.
    */
  def partitionSelect(k: Double): MathJsChain[MathCollection] = js.native
  def partitionSelect(k: Double, // eslint-disable-next-line @typescript-eslint/no-explicit-any
  compare: asc | desc): MathJsChain[MathCollection] = js.native
  def partitionSelect(
    k: Double,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  compare: js.Function2[/* a */ Any, /* b */ Any, Double]
  ): MathJsChain[MathCollection] = js.native
  
  /**
    * Compute the number of ways of obtaining an ordered subset of k
    * elements from a set of n elements. Permutations only takes integer
    * arguments. The following condition must be enforced: k <= n.
    * @param k The number of objects in the subset
    */
  def permutations[T /* <: Double | BigNumber */](n: MathJsChain[T]): MathJsChain[NoLiteralType[T]] = js.native
  def permutations[T /* <: Double | BigNumber */](n: MathJsChain[T], k: Double): MathJsChain[NoLiteralType[T]] = js.native
  def permutations[T /* <: Double | BigNumber */](n: MathJsChain[T], k: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Random pick a value from a one dimensional array. Array element is
    * picked using a random function with uniform distribution.
    * @param number An int or float
    * @param weights An array of ints or floats
    */
  def pickRandom[T](): MathJsChain[T] = js.native
  def pickRandom[T](number: Double): MathJsChain[js.Array[T]] = js.native
  def pickRandom[T](number: Double, weights: js.Array[Double]): MathJsChain[js.Array[T]] = js.native
  
  /**
    * Calculates the power of x to y, x ^ y. Matrix exponentiation is
    * supported for square matrices x, and positive integer exponents y.
    * @param y The exponent
    */
  def pow(y: Double): MathJsChain[MathType] = js.native
  def pow(y: BigNumber): MathJsChain[MathType] = js.native
  def pow(y: Complex): MathJsChain[MathType] = js.native
  
  /**
    * Interpolate values into a string template.
    * @param values An object containing variables which will be filled in
    * in the template.
    * @param precision Number of digits to format numbers. If not provided,
    * the value will not be rounded.
    * @param options Formatting options, or the number of digits to format
    * numbers. See function math.format for a description of all options.
    */
  def print(// eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any): MathJsChain[String] = js.native
  def print(// eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any, precision: Double): MathJsChain[String] = js.native
  def print(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any,
    precision: Double,
    options: js.Object
  ): MathJsChain[String] = js.native
  def print(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any,
    precision: Double,
    options: Double
  ): MathJsChain[String] = js.native
  def print(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any,
    precision: scala.Unit,
    options: js.Object
  ): MathJsChain[String] = js.native
  def print(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  values: Any,
    precision: scala.Unit,
    options: Double
  ): MathJsChain[String] = js.native
  
  /**
    * Compute the product of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the sum of all elements will be
    * calculated.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def prod(): MathJsChain[Any] = js.native
  
  /**
    * Calculate the Matrix QR decomposition. Matrix A is decomposed in two
    * matrices (Q, R) where Q is an orthogonal matrix and R is an upper
    * triangular matrix.
    */
  def qr(): MathJsChain[QRDecomposition] = js.native
  
  /**
    * Compute the prob order quantile of a matrix or a list with values.
    * The sequence is sorted and the middle value is returned. Supported
    * types of sequence values are: Number, BigNumber, Unit Supported types
    * of probability are: Number, BigNumber In case of a (multi
    * dimensional) array or matrix, the prob order quantile of all elements
    * will be calculated.
    * @param probOrN prob is the order of the quantile, while N is the
    * amount of evenly distributed steps of probabilities; only one of
    * these options can be provided
    * @param sorted =false is data sorted in ascending order
    */
  def quantileSeq(A: MathJsChain[MathCollection], prob: Double): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  def quantileSeq(A: MathJsChain[MathCollection], prob: Double, sorted: Boolean): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  def quantileSeq(A: MathJsChain[MathCollection], prob: BigNumber): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  def quantileSeq(A: MathJsChain[MathCollection], prob: BigNumber, sorted: Boolean): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  def quantileSeq(A: MathJsChain[MathCollection], prob: MathArray): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  def quantileSeq(A: MathJsChain[MathCollection], prob: MathArray, sorted: Boolean): MathJsChain[Double | BigNumber | Unit | MathArray] = js.native
  
  /**
    * Return a random number larger or equal to min and smaller than max
    * using a uniform distribution.
    * @param min Minimum boundary for the random value, included
    * @param max Maximum boundary for the random value, excluded
    */
  def random(): MathJsChain[Double] = js.native
  def random(max: Double): MathJsChain[Double] = js.native
  def random[T /* <: MathCollection */](min: Double, max: Double): MathJsChain[T] = js.native
  def random[T /* <: MathCollection */](min: scala.Unit, max: Double): MathJsChain[T] = js.native
  
  /**
    * Return a random integer number larger or equal to min and smaller
    * than max using a uniform distribution.
    * @param min Minimum boundary for the random value, included
    * @param max Maximum boundary for the random value, excluded
    */
  def randomInt[T /* <: MathCollection */](): MathJsChain[T] = js.native
  def randomInt[T /* <: MathCollection */](max: Double): MathJsChain[T] = js.native
  // tslint:disable-next-line unified-signatures
  def randomInt[T /* <: MathCollection */](min: Double, max: Double): MathJsChain[T] = js.native
  
  // tslint:disable-next-line unified-signatures
  @JSName("random")
  def random_T_MathCollection[T /* <: MathCollection */](): MathJsChain[T] = js.native
  @JSName("random")
  def random_T_MathCollection[T /* <: MathCollection */](min: Double): MathJsChain[T] = js.native
  
  /**
    * Create an array from a range. By default, the range end is excluded.
    * This can be customized by providing an extra parameter includeEnd.
    * @param end End of the range, excluded by default, included when
    * parameter includeEnd=true
    * @param step Step size. Default value is 1.
    * @param includeEnd: Option to specify whether to include the end or
    * not. False by default
    */
  def range(): MathJsChain[Matrix] = js.native
  def range(end: Double): MathJsChain[Matrix] = js.native
  def range(end: Double, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(end: Double, step: Double): MathJsChain[Matrix] = js.native
  def range(end: Double, step: Double, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(end: Double, step: BigNumber): MathJsChain[Matrix] = js.native
  def range(end: Double, step: BigNumber, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(end: BigNumber): MathJsChain[Matrix] = js.native
  def range(end: BigNumber, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(end: BigNumber, step: Double): MathJsChain[Matrix] = js.native
  def range(end: BigNumber, step: Double, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(end: BigNumber, step: BigNumber): MathJsChain[Matrix] = js.native
  def range(end: BigNumber, step: BigNumber, includeEnd: Boolean): MathJsChain[Matrix] = js.native
  def range(includeEnd: Boolean): MathJsChain[Matrix] = js.native
  
  /**
    * Transform a rationalizable expression in a rational fraction. If
    * rational fraction is one variable polynomial then converts the
    * numerator and denominator in canonical form, with decreasing
    * exponents, returning the coefficients of numerator.
    * @param optional scope of expression or true for already evaluated
    * rational expression at input
    * @param detailed  optional True if return an object, false if return
    * expression node (default)
    */
  def rationalize(): MathJsChain[MathNode] = js.native
  def rationalize(optional: js.Object): MathJsChain[MathNode] = js.native
  def rationalize(optional: js.Object, detailed: Boolean): MathJsChain[MathNode] = js.native
  def rationalize(optional: Boolean): MathJsChain[MathNode] = js.native
  def rationalize(optional: Boolean, detailed: Boolean): MathJsChain[MathNode] = js.native
  def rationalize(optional: scala.Unit, detailed: Boolean): MathJsChain[MathNode] = js.native
  
  /**
    * Get the real part of a complex number. For a complex number a + bi,
    * the function returns a. For matrices, the function is evaluated
    * element wise.
    */
  def re(): MathJsChain[Double] = js.native
  
  /**
    * Reshape a multi dimensional array to fit the specified dimensions
    * @param sizes One dimensional array with integral sizes for each
    * dimension
    */
  def reshape[T /* <: MathCollection */](sizes: js.Array[Double]): MathJsChain[T] = js.native
  
  /**
    * Resize a matrix
    * @param size One dimensional array with numbers
    * @param defaultValue Zero by default, except in case of a string, in
    * that case defaultValue = ' ' Default value: 0.
    */
  def resize[T /* <: MathCollection */](size: MathCollection): MathJsChain[T] = js.native
  def resize[T /* <: MathCollection */](size: MathCollection, defaultValue: String): MathJsChain[T] = js.native
  def resize[T /* <: MathCollection */](size: MathCollection, defaultValue: Double): MathJsChain[T] = js.native
  
  /**
    *  Replaces variable nodes with their scoped values
    * @param scope Scope to read/write variables
    */
  def resolve(): MathJsChain[MathNode] = js.native
  def resolve(// eslint-disable-next-line @typescript-eslint/no-explicit-any
  scope: Record[String, Any]): MathJsChain[MathNode] = js.native
  
  /**
    * Bitwise right arithmetic shift of a value x by y number of bits, x >>
    * y. For matrices, the function is evaluated element wise. For units,
    * the function is evaluated on the best prefix base.
    * @param y Amount of shifts
    */
  def rightArithShift[T /* <: Double | BigNumber | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  def rightArithShift[T /* <: Double | BigNumber | MathCollection */](y: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Bitwise right logical shift of value x by y number of bits, x >>> y.
    * For matrices, the function is evaluated element wise. For units, the
    * function is evaluated on the best prefix base.
    * @param y Amount of shifts
    */
  def rightLogShift[T /* <: Double | MathCollection */](y: Double): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Round a value towards the nearest integer. For matrices, the function
    * is evaluated element wise.
    * @param n Number of decimals Default value: 0.
    */
  def round(): MathJsChain[MathNumericType] = js.native
  def round(n: Double): MathJsChain[MathNumericType] = js.native
  def round(n: BigNumber): MathJsChain[MathNumericType] = js.native
  def round(n: MathCollection): MathJsChain[MathNumericType] = js.native
  
  /**
    * Calculate the secant of a value, defined as sec(x) = 1/cos(x). For
    * matrices, the function is evaluated element wise.
    */
  def sec(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic secant of a value, defined as sech(x) = 1 /
    * cosh(x). For matrices, the function is evaluated element wise.
    */
  def sech(): MathJsChain[Double] = js.native
  
  /*************************************************************************
    * Set functions
    ************************************************************************/
  /**
    * Create the cartesian product of two (multi)sets. Multi-dimension
    * arrays will be converted to single-dimension arrays and the values
    * will be sorted in ascending order before the operation.
    * @param a2 A (multi)set
    */
  def setCartesian[T /* <: MathCollection */](a2: MathCollection): MathJsChain[T] = js.native
  
  /**
    * Create the difference of two (multi)sets: every element of set1, that
    * is not the element of set2. Multi-dimension arrays will be converted
    * to single-dimension arrays before the operation
    * @param a2 A (multi)set
    */
  def setDifference[T /* <: MathCollection */](a2: MathCollection): MathJsChain[T] = js.native
  
  /**
    * Collect the distinct elements of a multiset. A multi-dimension array
    * will be converted to a single-dimension array before the operation.
    */
  def setDistinct[T /* <: MathCollection */](a: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Create the intersection of two (multi)sets. Multi-dimension arrays
    * will be converted to single-dimension arrays before the operation.
    * @param a2 A (multi)set
    */
  def setIntersect[T /* <: MathCollection */](a2: MathCollection): MathJsChain[T] = js.native
  
  /**
    * Check whether a (multi)set is a subset of another (multi)set. (Every
    * element of set1 is the element of set2.) Multi-dimension arrays will
    * be converted to single-dimension arrays before the operation.
    * @param a2 A (multi)set
    */
  def setIsSubset(a2: MathCollection): MathJsChain[Boolean] = js.native
  
  /**
    * Count the multiplicity of an element in a multiset. A multi-dimension
    * array will be converted to a single-dimension array before the
    * operation.
    * @param a A multiset
    */
  def setMultiplicity(e: MathJsChain[Double | BigNumber | Fraction | Complex], a: MathCollection): MathJsChain[Double] = js.native
  
  /**
    * Create the powerset of a (multi)set. (The powerset contains very
    * possible subsets of a (multi)set.) A multi-dimension array will be
    * converted to a single-dimension array before the operation.
    */
  def setPowerset[T /* <: MathCollection */](a: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Count the number of elements of a (multi)set. When a second parameter
    * is ‘true’, count only the unique values. A multi-dimension array will
    * be converted to a single-dimension array before the operation.
    */
  def setSize(): MathJsChain[Double] = js.native
  
  /**
    * Create the symmetric difference of two (multi)sets. Multi-dimension
    * arrays will be converted to single-dimension arrays before the
    * operation.
    * @param a2 A (multi)set
    */
  def setSymDifference[T /* <: MathCollection */](a2: MathCollection): MathJsChain[T] = js.native
  
  /**
    * Create the union of two (multi)sets. Multi-dimension arrays will be
    * converted to single-dimension arrays before the operation.
    * @param a2 A (multi)set
    */
  def setUnion[T /* <: MathCollection */](a2: MathCollection): MathJsChain[T] = js.native
  
  /**
    * Compute the sign of a value. The sign of a value x is: 1 when x > 1
    * -1 when x < 0 0 when x == 0 For matrices, the function is evaluated
    * element wise.
    * @param x The number for which to determine the sign
    * @returns The sign of x
    */
  def sign(): MathJsChain[Double] = js.native
  
  /**
    * Simplify an expression tree.
    * @param rules A list of rules are applied to an expression, repeating
    * over the list until no further changes are made. It’s possible to
    * pass a custom set of rules to the function as second argument. A rule
    * can be specified as an object, string, or function.
    * @param scope Scope to variables
    * @param options Options to configure the behavior of simplify
    */
  def simplify(): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule]): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule], scope: js.Object): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule], scope: js.Object, options: SimplifyOptions): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule], scope: scala.Unit, options: SimplifyOptions): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule], scope: Map[String, MathType]): MathJsChain[MathNode] = js.native
  def simplify(rules: js.Array[SimplifyRule], scope: Map[String, MathType], options: SimplifyOptions): MathJsChain[MathNode] = js.native
  def simplify(rules: scala.Unit, scope: js.Object): MathJsChain[MathNode] = js.native
  def simplify(rules: scala.Unit, scope: js.Object, options: SimplifyOptions): MathJsChain[MathNode] = js.native
  def simplify(rules: scala.Unit, scope: scala.Unit, options: SimplifyOptions): MathJsChain[MathNode] = js.native
  def simplify(rules: scala.Unit, scope: Map[String, MathType]): MathJsChain[MathNode] = js.native
  def simplify(rules: scala.Unit, scope: Map[String, MathType], options: SimplifyOptions): MathJsChain[MathNode] = js.native
  
  def simplifyConstant(): MathJsChain[MathNode] = js.native
  def simplifyConstant(options: SimplifyOptions): MathJsChain[MathNode] = js.native
  
  def simplifyCore(): MathJsChain[MathNode] = js.native
  def simplifyCore(options: SimplifyOptions): MathJsChain[MathNode] = js.native
  
  /**
    * Calculate the sine of a value. For matrices, the function is
    * evaluated element wise.
    */
  def sin(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic sine of a value, defined as sinh(x) = 1/2 *
    * (exp(x) - exp(-x)). For matrices, the function is evaluated element
    * wise.
    */
  def sinh(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the size of a matrix or scalar.
    */
  def size(): MathJsChain[MathCollection] = js.native
  
  /**
    * Calculate the Sparse Matrix LU decomposition with full pivoting.
    * Sparse Matrix A is decomposed in two matrices (L, U) and two
    * permutation vectors (pinv, q) where P * A * Q = L * U
    * @param order The Symbolic Ordering and Analysis order: 0 - Natural
    * ordering, no permutation vector q is returned 1 - Matrix must be
    * square, symbolic ordering and analisis is performed on M = A + A' 2 -
    * Symbolic ordering and analysis is performed on M = A' * A. Dense
    * columns from A' are dropped, A recreated from A'. This is appropriate
    * for LU factorization of non-symmetric matrices. 3 - Symbolic ordering
    * and analysis is performed on M = A' * A. This is best used for LU
    * factorization is matrix M has no dense rows. A dense row is a row
    * with more than 10*sqr(columns) entries.
    * @param threshold Partial pivoting threshold (1 for partial pivoting)
    */
  def slu(order: Double, threshold: Double): MathJsChain[SLUDecomposition] = js.native
  
  def smaller(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether value x is smaller than y. The function returns true
    * when x is smaller than y and the relative difference between x and y
    * is smaller than the configured epsilon. The function cannot be used
    * to compare values smaller than approximately 2.22e-16. For matrices,
    * the function is evaluated element wise.
    * @param y Second value to vcompare
    */
  def smaller(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  def smallerEq(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether value x is smaller or equal to y. The function returns
    * true when x is smaller than y or the relative difference between x
    * and y is smaller than the configured epsilon. The function cannot be
    * used to compare values smaller than approximately 2.22e-16. For
    * matrices, the function is evaluated element wise.
    * @param y Second value to compare
    */
  def smallerEq(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  def sort[T /* <: Matrix | MathArray */](// eslint-disable-next-line @typescript-eslint/no-explicit-any
  compare: asc | desc | natural): MathJsChain[T] = js.native
  /**
    * Sort the items in a matrix
    * @param compare An optional _comparator function or name. The function
    * is called as compare(a, b), and must return 1 when a > b, -1 when a <
    * b, and 0 when a == b. Default value: ‘asc’
    */
  def sort[T /* <: Matrix | MathArray */](
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  compare: js.Function2[/* a */ Any, /* b */ Any, Double]
  ): MathJsChain[T] = js.native
  
  /**
    * Create a Sparse Matrix. The function creates a new math.type.Matrix
    * object from an Array. A Matrix has utility functions to manipulate
    * the data in the matrix, like getting the size and getting or setting
    * values in the matrix.
    * @param dataType Sparse Matrix data type
    */
  def sparse(): MathJsChain[Matrix] = js.native
  def sparse(dataType: String): MathJsChain[Matrix] = js.native
  
  /**
    * Split a unit in an array of units whose sum is equal to the original
    * unit.
    * @param parts An array of strings or valueless units
    */
  def splitUnit(parts: js.Array[Unit]): MathJsChain[js.Array[Unit]] = js.native
  
  /**
    * Calculate the square root of a value. For matrices, the function is
    * evaluated element wise.
    */
  def sqrt(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the principal square root of a square matrix. The principal
    * square root matrix X of another matrix A is such that X * X = A.
    */
  def sqrtm[T /* <: MathCollection */](A: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Compute the square of a value, x * x. For matrices, the function is
    * evaluated element wise.
    */
  def square(): MathJsChain[Double] = js.native
  
  /**
    * Squeeze a matrix, remove inner and outer singleton dimensions from a
    * matrix.
    */
  def squeeze[T /* <: MathCollection */](x: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Compute the standard deviation of a matrix or a list with values. The
    * standard deviations is defined as the square root of the variance:
    * std(A) = sqrt(variance(A)). In case of a (multi dimensional) array or
    * matrix, the standard deviation over all elements will be calculated.
    * Optionally, the type of normalization can be specified as second
    * parameter. The parameter normalization can be one of the following
    * values: 'unbiased' (default) The sum of squared errors is divided by
    * (n - 1) 'uncorrected' The sum of squared errors is divided by n
    * 'biased' The sum of squared errors is divided by (n + 1)
    * @param dim A dimension to compute standard deviation.
    * @param normalization Determines how to normalize the variance. Choose
    * ‘unbiased’ (default), ‘uncorrected’, or ‘biased’. Default value:
    * ‘unbiased’.
    * @returns The standard deviation
    */
  /**
    * Compute the standard deviation of a matrix or a list with values. The
    * standard deviations is defined as the square root of the variance:
    * std(A) = sqrt(variance(A)). In case of a (multi dimensional) array or
    * matrix, the standard deviation over all elements will be calculated.
    * Optionally, the type of normalization can be specified as second
    * parameter. The parameter normalization can be one of the following
    * values: 'unbiased' (default) The sum of squared errors is divided by
    * (n - 1) 'uncorrected' The sum of squared errors is divided by n
    * 'biased' The sum of squared errors is divided by (n + 1)
    * @param normalization Determines how to normalize the variance. Choose
    * ‘unbiased’ (default), ‘uncorrected’, or ‘biased’. Default value:
    * ‘unbiased’.
    * @returns The standard deviation
    */
  def std(): MathJsChain[Double] = js.native
  def std(dim: Double): MathJsChain[Double] = js.native
  def std(dim: Double, normalization: biased | unbiased | uncorrected): MathJsChain[Double] = js.native
  def std(dim: scala.Unit, normalization: biased | unbiased | uncorrected): MathJsChain[Double] = js.native
  /**
    * Compute the sum of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the sum of all elements will be
    * calculated.
    */
  def std(normalization: unbiased | uncorrected | biased): MathJsChain[Double] = js.native
  
  /**
    * The Stirling numbers of the second kind, counts the number of ways to
    * partition a set of n labelled objects into k nonempty unlabelled
    * subsets. stirlingS2 only takes integer arguments. The following
    * condition must be enforced: k <= n. If n = k or k = 1, then s(n,k) =
    * 1
    * @param k Number of objects in the subset
    */
  def stirlingS2[T /* <: Double | BigNumber */](k: Double): MathJsChain[NoLiteralType[T]] = js.native
  def stirlingS2[T /* <: Double | BigNumber */](k: BigNumber): MathJsChain[NoLiteralType[T]] = js.native
  
  /**
    * Create a string or convert any object into a string. Elements of
    * Arrays and Matrices are processed element wise.
    */
  def string(): MathJsChain[String] = js.native
  
  /**
    * Get or set a subset of a matrix or string.
    * @param index For each dimension, an index or list of indices to get or set
    * @param replacement An array, matrix, or scalar. If provided, the
    * subset is replaced with replacement. If not provided, the subset is
    * returned
    * @param defaultValue Default value, filled in on new entries when the
    * matrix is resized. If not provided, math.matrix elements will be left
    * undefined. Default value: undefined.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def subset[T /* <: MathCollection | String */](index: Index): MathJsChain[T] = js.native
  def subset[T /* <: MathCollection | String */](index: Index, // eslint-disable-next-line @typescript-eslint/no-explicit-any
  replacement: Any): MathJsChain[T] = js.native
  def subset[T /* <: MathCollection | String */](
    index: Index,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  replacement: Any,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  defaultValue: Any
  ): MathJsChain[T] = js.native
  def subset[T /* <: MathCollection | String */](
    index: Index,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  replacement: scala.Unit,
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  defaultValue: Any
  ): MathJsChain[T] = js.native
  
  def subtract(y: js.Array[js.Array[MathNumericType] | MathNumericType]): MathJsChain[js.Array[MathNumericType]] = js.native
  /**
    * Subtract two values, x - y. For matrices, the function is evaluated
    * element wise.
    * @param y Value to subtract from x
    */
  def subtract(y: Double): MathJsChain[Double] = js.native
  def subtract(y: Decimal): MathJsChain[Decimal] = js.native
  def subtract(y: Complex): MathJsChain[Complex] = js.native
  def subtract(y: Fraction): MathJsChain[Fraction] = js.native
  def subtract(y: MathType): MathJsChain[MathType] = js.native
  def subtract(y: Matrix): MathJsChain[Matrix] = js.native
  def subtract(y: Unit): MathJsChain[Unit] = js.native
  
  /**
    * Compute the sum of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the sum of all elements will be
    * calculated.
    */
  def sum(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the tangent of a value. tan(x) is equal to sin(x) / cos(x).
    * For matrices, the function is evaluated element wise.
    */
  def tan(): MathJsChain[Double] = js.native
  
  /**
    * Calculate the hyperbolic tangent of a value, defined as tanh(x) =
    * (exp(2 * x) - 1) / (exp(2 * x) + 1). For matrices, the function is
    * evaluated element wise.
    */
  def tanh(): MathJsChain[Double] = js.native
  
  def to(unit: String): MathJsChain[Unit | MathCollection] = js.native
  /*************************************************************************
    * Unit functions
    ************************************************************************/
  /**
    * Change the unit of a value. For matrices, the function is evaluated
    * element wise.
    * @param unit New unit. Can be a string like "cm" or a unit without
    * value.
    */
  def to(unit: Unit): MathJsChain[Unit | MathCollection] = js.native
  
  /**
    * Calculate the trace of a matrix: the sum of the elements on the main
    * diagonal of a square matrix.
    */
  def trace(): MathJsChain[Double] = js.native
  
  /**
    * Transpose a matrix. All values of the matrix are reflected over its
    * main diagonal. Only two dimensional matrices are supported.
    */
  def transpose[T /* <: MathCollection */](x: MathJsChain[T]): MathJsChain[T] = js.native
  
  /**
    * Determine the type of a variable.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def typeOf(): MathJsChain[String] = js.native
  
  /**
    * Inverse the sign of a value, apply a unary minus operation. For
    * matrices, the function is evaluated element wise. Boolean values and
    * strings will be converted to a number. For complex numbers, both real
    * and complex value are inverted.
    */
  def unaryMinus(): MathJsChain[Double] = js.native
  
  /**
    * Unary plus operation. Boolean values and strings will be converted to
    * a number, numeric values will be returned as is. For matrices, the
    * function is evaluated element wise.
    */
  def unaryPlus(): MathJsChain[Double] = js.native
  
  def unequal(y: String): MathJsChain[Boolean | MathCollection] = js.native
  /**
    * Test whether two values are unequal. The function tests whether the
    * relative difference between x and y is larger than the configured
    * epsilon. The function cannot be used to compare values smaller than
    * approximately 2.22e-16. For matrices, the function is evaluated
    * element wise. In case of complex numbers, x.re must unequal y.re, or
    * x.im must unequal y.im. Values null and undefined are compared
    * strictly, thus null is unequal with everything except null, and
    * undefined is unequal with everything except undefined.
    * @param y Second value to vcompare
    */
  def unequal(y: MathType): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Create a unit. Depending on the passed arguments, the function will
    * create and return a new math.type.Unit object. When a matrix is
    * provided, all elements will be converted to units.
    * @param unit The unit to be created
    */
  def unit(): MathJsChain[Unit] = js.native
  def unit(unit: String): MathJsChain[Unit] = js.native
  
  def usolve(b: MathArray): MathJsChain[Matrix] = js.native
  /**
    * Solves the linear equation system by backward substitution. Matrix
    * must be an upper triangular matrix. U * x = b
    * @param b A column vector with the b values
    */
  def usolve(b: Matrix): MathJsChain[Matrix] = js.native
  
  /**
    * Compute the variance of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the variance over all elements
    * will be calculated. Optionally, the type of normalization can be
    * specified as second parameter. The parameter normalization can be one
    * of the following values: 'unbiased' (default) The sum of squared
    * errors is divided by (n - 1) 'uncorrected' The sum of squared errors
    * is divided by n 'biased' The sum of squared errors is divided by (n +
    * 1) Note that older browser may not like the variable name var. In
    * that case, the function can be called as math['var'](...) instead of
    * math.variance(...).
    * @param dim a dimension to compute variance.
    * @param normalization normalization Determines how to normalize the
    * variance. Choose ‘unbiased’ (default), ‘uncorrected’, or ‘biased’.
    * Default value: ‘unbiased’.
    * @returns The variance
    */
  /**
    * Compute the variance of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the variance over all elements
    * will be calculated. Optionally, the type of normalization can be
    * specified as second parameter. The parameter normalization can be one
    * of the following values: 'unbiased' (default) The sum of squared
    * errors is divided by (n - 1) 'uncorrected' The sum of squared errors
    * is divided by n 'biased' The sum of squared errors is divided by (n +
    * 1) Note that older browser may not like the variable name var. In
    * that case, the function can be called as math['var'](...) instead of
    * math.variance(...).
    * @param normalization normalization Determines how to normalize the
    * variance. Choose ‘unbiased’ (default), ‘uncorrected’, or ‘biased’.
    * Default value: ‘unbiased’.
    * @returns The variance
    */
  def variance(): MathJsChain[Double] = js.native
  def variance(dimension: Double): MathJsChain[js.Array[Double]] = js.native
  def variance(dimension: Double, normalization: unbiased | uncorrected | biased): MathJsChain[js.Array[Double]] = js.native
  def variance(dimension: scala.Unit, normalization: unbiased | uncorrected | biased): MathJsChain[js.Array[Double]] = js.native
  def variance(normalization: unbiased | uncorrected | biased): MathJsChain[Double] = js.native
  
  /**
    * Calculate the extended greatest common divisor for two values. See
    * http://en.wikipedia.org/wiki/Extended_Euclidean_algorithm.
    * @param b An integer number
    */
  def xgcd(b: Double): MathJsChain[MathArray] = js.native
  def xgcd(b: BigNumber): MathJsChain[MathArray] = js.native
  
  /**
    * Logical xor. Test whether one and only one value is defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param y Second value to xor
    */
  def xor(y: Double): MathJsChain[Boolean | MathCollection] = js.native
  def xor(y: BigNumber): MathJsChain[Boolean | MathCollection] = js.native
  def xor(y: Complex): MathJsChain[Boolean | MathCollection] = js.native
  def xor(y: MathCollection): MathJsChain[Boolean | MathCollection] = js.native
  def xor(y: Unit): MathJsChain[Boolean | MathCollection] = js.native
  
  /**
    * Create a matrix filled with zeros. The created matrix can have one or
    * multiple dimensions.
    * @param format The matrix storage format
    * @returns A matrix filled with zeros
    */
  def zeros(): MathJsChain[MathCollection] = js.native
  def zeros(format: String): MathJsChain[MathCollection] = js.native
}
