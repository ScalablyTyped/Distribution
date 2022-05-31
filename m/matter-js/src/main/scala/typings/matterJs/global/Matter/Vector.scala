package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Vector")
@js.native
class Vector ()
  extends typings.matterJs.mod.Vector
/* static members */
object Vector {
  
  @JSGlobal("Matter.Vector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  inline def add(vectorA: typings.matterJs.mod.Vector, vectorB: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  inline def add(
    vectorA: typings.matterJs.mod.Vector,
    vectorB: typings.matterJs.mod.Vector,
    output: typings.matterJs.mod.Vector
  ): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  inline def angle(vectorA: typings.matterJs.mod.Vector, vectorB: typings.matterJs.mod.Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  inline def clone(vector: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  inline def create(): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Vector]
  inline def create(x: Double): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  inline def create(x: Double, y: Double): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  inline def create(x: Unit, y: Double): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  inline def cross(vectorA: typings.matterJs.mod.Vector, vectorB: typings.matterJs.mod.Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  inline def cross3(
    vectorA: typings.matterJs.mod.Vector,
    vectorB: typings.matterJs.mod.Vector,
    vectorC: typings.matterJs.mod.Vector
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross3")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], vectorC.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  inline def div(vector: typings.matterJs.mod.Vector, scalar: Double): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  inline def dot(vectorA: typings.matterJs.mod.Vector, vectorB: typings.matterJs.mod.Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  inline def magnitude(vector: typings.matterJs.mod.Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  inline def magnitudeSquared(vector: typings.matterJs.mod.Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  inline def mult(vector: typings.matterJs.mod.Vector, scalar: Double): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("mult")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  inline def neg(vector: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  inline def normalise(vector: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("normalise")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  inline def perp(vector: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  inline def perp(vector: typings.matterJs.mod.Vector, negate: Boolean): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any], negate.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  inline def rotate(vector: typings.matterJs.mod.Vector, angle: Double): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  inline def rotateAbout(vector: typings.matterJs.mod.Vector, angle: Double, point: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  inline def rotateAbout(
    vector: typings.matterJs.mod.Vector,
    angle: Double,
    point: typings.matterJs.mod.Vector,
    output: typings.matterJs.mod.Vector
  ): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  inline def sub(vectorA: typings.matterJs.mod.Vector, vectorB: typings.matterJs.mod.Vector): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
  inline def sub(
    vectorA: typings.matterJs.mod.Vector,
    vectorB: typings.matterJs.mod.Vector,
    optional: typings.matterJs.mod.Vector
  ): typings.matterJs.mod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Vector]
}
