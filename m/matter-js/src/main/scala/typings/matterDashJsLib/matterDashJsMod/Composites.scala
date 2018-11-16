package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Composites")
@js.native
class Composites ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Composites {
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
  /* CompleteClass */
  override def newtonsCradle(
    xx: scala.Double,
    yy: scala.Double,
    _number: scala.Double,
    size: scala.Double,
    length: scala.Double
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
}

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
  def car(
    xx: scala.Double,
    yy: scala.Double,
    width: scala.Double,
    height: scala.Double,
    wheelSize: scala.Double
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
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
    composite: matterDashJsLib.matterDashJsMod.MatterNs.Composite,
    xOffsetA: scala.Double,
    yOffsetA: scala.Double,
    xOffsetB: scala.Double,
    yOffsetB: scala.Double,
    options: js.Any
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
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
  def mesh(
    composite: matterDashJsLib.matterDashJsMod.MatterNs.Composite,
    columns: scala.Double,
    rows: scala.Double,
    crossBrace: scala.Boolean,
    options: js.Any
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
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
    xx: scala.Double,
    yy: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    callback: js.Function
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
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
    xx: scala.Double,
    yy: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    crossBrace: scala.Boolean,
    particleRadius: scala.Double,
    particleOptions: js.Any,
    constraintOptions: js.Any
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
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
    xx: scala.Double,
    yy: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    callback: js.Function
  ): matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
}

