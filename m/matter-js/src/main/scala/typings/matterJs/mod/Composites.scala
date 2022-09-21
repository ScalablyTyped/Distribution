package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Composites")
@js.native
open class Composites () extends StObject
/* static members */
object Composites {
  
  @JSImport("matter-js", "Composites")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This has now moved to the [car example](https://github.com/liabru/matter-js/blob/master/examples/car.js), follow that instead as this function is deprecated here.
    * @deprecated moved to car example
    * @method car
    * @param {number} xx
    * @param {number} yy
    * @param {number} width
    * @param {number} height
    * @param {number} wheelSize
    * @returns {Composite} A new composite car body
    */
  inline def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("car")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], wheelSize.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * Chains all bodies in the given composite together using constraints.
    * @method chain
    * @param {Composite} composite
    * @param {number} xOffsetA
    * @param {number} yOffsetA
    * @param {number} xOffsetB
    * @param {number} yOffsetB
    * @param {any} options
    * @returns {Composite} A new composite containing objects chained together with constraints
    */
  inline def chain(
    composite: Composite,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: Any
  ): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(composite.asInstanceOf[js.Any], xOffsetA.asInstanceOf[js.Any], yOffsetA.asInstanceOf[js.Any], xOffsetB.asInstanceOf[js.Any], yOffsetB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @method mesh
    * @param {Composite} composite
    * @param {number} columns
    * @param {number} rows
    * @param {boolean} crossBrace
    * @param {any} options
    * @returns {Composite} The composite containing objects meshed together with constraints
    */
  inline def mesh(composite: Composite, columns: Double, rows: Double, crossBrace: Boolean, options: Any): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(composite.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], crossBrace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * This has now moved to the [newtonsCradle example](https://github.com/liabru/matter-js/blob/master/examples/newtonsCradle.js), follow that instead as this function is deprecated here.
    * @deprecated moved to newtonsCradle example
    * @method newtonsCradle
    * @param {number} xx
    * @param {number} yy
    * @param {number} number
    * @param {number} size
    * @param {number} length
    * @returns {Composite} A new composite newtonsCradle body
    */
  inline def newtonsCradle(xx: Double, yy: Double, _number: Double, size: Double, length: Double): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("newtonsCradle")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], _number.asInstanceOf[js.Any], size.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
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
    * @returns {Composite} A new composite containing objects created in the callback
    */
  inline def pyramid(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("pyramid")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * This has now moved to the [softBody example](https://github.com/liabru/matter-js/blob/master/examples/softBody.js)
    * and the [cloth example](https://github.com/liabru/matter-js/blob/master/examples/cloth.js), follow those instead as this function is deprecated here.
    * @deprecated moved to softBody and cloth examples
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
    * @returns {Composite} A new composite softBody
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
    particleOptions: Any,
    constraintOptions: Any
  ): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("softBody")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], crossBrace.asInstanceOf[js.Any], particleRadius.asInstanceOf[js.Any], particleOptions.asInstanceOf[js.Any], constraintOptions.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
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
    * @returns {Composite} A new composite containing objects created in the callback
    */
  inline def stack(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(xx.asInstanceOf[js.Any], yy.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columnGap.asInstanceOf[js.Any], rowGap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Composite]
}
