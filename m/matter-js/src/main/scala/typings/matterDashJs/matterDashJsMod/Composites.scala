package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Composites")
@js.native
class Composites () extends js.Object {
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @method newtonsCradle
    * @param {number} xx
    * @param {number} yy
    * @param {number} number
    * @param {number} size
    * @param {number} length
    * @return {composite} A new composite newtonsCradle body
    */
  def newtonsCradle(xx: Double, yy: Double, _number: Double, size: Double, length: Double): Composite = js.native
}

/* static members */
@JSImport("matter-js", "Composites")
@js.native
object Composites extends js.Object {
  /**
    * Creates a composite with simple car setup of bodies and constraints.
    * @method car
    * @param {number} xx
    * @param {number} yy
    * @param {number} width
    * @param {number} height
    * @param {number} wheelSize
    * @return {composite} A new composite car body
    */
  def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): Composite = js.native
  /**
    * Chains all bodies in the given composite together using constraints.
    * @method chain
    * @param {composite} composite
    * @param {number} xOffsetA
    * @param {number} yOffsetA
    * @param {number} xOffsetB
    * @param {number} yOffsetB
    * @param {object} options
    * @return {composite} A new composite containing objects chained together with constraints
    */
  def chain(
    composite: Composite,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: js.Any
  ): Composite = js.native
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @method mesh
    * @param {composite} composite
    * @param {number} columns
    * @param {number} rows
    * @param {boolean} crossBrace
    * @param {object} options
    * @return {composite} The composite containing objects meshed together with constraints
    */
  def mesh(composite: Composite, columns: Double, rows: Double, crossBrace: Boolean, options: js.Any): Composite = js.native
  /**
    * Create a new composite containing bodies created in the callback in a pyramid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method pyramid
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def pyramid(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = js.native
  /**
    * Creates a simple soft body like object.
    * @method softBody
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {boolean} crossBrace
    * @param {number} particleRadius
    * @param {} particleOptions
    * @param {} constraintOptions
    * @return {composite} A new composite softBody
    */
  def softBody(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: js.Any,
    constraintOptions: js.Any
  ): Composite = js.native
  /**
    * Create a new composite containing bodies created in the callback in a grid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method stack
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def stack(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = js.native
}

