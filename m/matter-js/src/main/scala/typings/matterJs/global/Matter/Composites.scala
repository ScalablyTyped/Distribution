package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Composites")
@js.native
class Composites ()
  extends typings.matterJs.mod.Composites
/* static members */
object Composites {
  
  @JSGlobal("Matter.Composites")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("car")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], wheelSize.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def chain(
    composite: typings.matterJs.mod.Composite,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: js.Any
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(composite.asInstanceOf[js.Any], xOffsetA.asInstanceOf[js.Any], yOffsetA.asInstanceOf[js.Any], xOffsetB.asInstanceOf[js.Any], yOffsetB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def mesh(
    composite: typings.matterJs.mod.Composite,
    columns: Double,
    rows: Double,
    crossBrace: Boolean,
    options: js.Any
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(composite.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], crossBrace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def pyramid(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("pyramid")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def softBody(
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
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("softBody")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], crossBrace.asInstanceOf[js.Any], particleRadius.asInstanceOf[js.Any], particleOptions.asInstanceOf[js.Any], constraintOptions.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def stack(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
}
