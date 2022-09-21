package typings.matterJs.global.Matter

import typings.matterJs.mod.IBodyDefinition
import typings.matterJs.mod.IChamferableBodyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Bodies")
@js.native
open class Bodies ()
  extends typings.matterJs.mod.Bodies
/* static members */
object Bodies {
  
  @JSGlobal("Matter.Bodies")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new rigid body model with a circle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method circle
    * @param {number} x
    * @param {number} y
    * @param {number} radius
    * @param {any} [options]
    * @param {number} [maxSides]
    * @returns {Body} A new circle body
    */
  inline def circle(x: Double, y: Double, radius: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def circle(x: Double, y: Double, radius: Double, options: Unit, maxSides: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any], maxSides.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition, maxSides: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any], maxSides.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices).
    * If the vertices are convex, they will pass through as supplied.
    * Otherwise if the vertices are concave, they will be decomposed if [poly-decomp.js](https://github.com/schteppe/poly-decomp.js) is available.
    * Note that this process is not guaranteed to support complex sets of vertices (e.g. those with holes may fail).
    * By default the decomposition will discard collinear edges (to improve performance).
    * It can also optionally discard any parts that have an area less than `minimumArea`.
    * If the vertices can not be decomposed, the result will fall back to using the convex hull.
    * The options parameter is an object that specifies any `Matter.Body` properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method fromVertices
    * @param {number} x
    * @param {number} y
    * @param {Vertex[][]} vertexSets
    * @param {any} [options]
    * @param {boolean} [flagInternal=false]
    * @param {number} [removeCollinear=0.01]
    * @param {number} [minimumArea=10]
    * @param {number} [removeDuplicatePoints=0.01]
    * @returns {Body}
    */
  inline def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]]): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.matterJs.mod.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Unit,
    removeDuplicatePoints: Double
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any], removeDuplicatePoints.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  
  /**
    * Creates a new rigid body model with a regular polygon hull with the given number of sides.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method polygon
    * @param {number} x
    * @param {number} y
    * @param {number} sides
    * @param {number} radius
    * @param {any} [options]
    * @returns {Body} A new regular polygon body
    */
  inline def polygon(x: Double, y: Double, sides: Double, radius: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def polygon(x: Double, y: Double, sides: Double, radius: Double, options: IChamferableBodyDefinition): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  
  /**
    * Creates a new rigid body model with a rectangle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method rectangle
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {any} [options]
    * @returns {Body} A new rectangle body
    */
  inline def rectangle(x: Double, y: Double, width: Double, height: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def rectangle(x: Double, y: Double, width: Double, height: Double, options: IChamferableBodyDefinition): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  
  /**
    * Creates a new rigid body model with a trapezoid hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method trapezoid
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {number} slope
    * @param {any} [options]
    * @returns {Body} A new trapezoid body
    */
  inline def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("trapezoid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], slope.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
  inline def trapezoid(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    slope: Double,
    options: IChamferableBodyDefinition
  ): typings.matterJs.mod.Body = (^.asInstanceOf[js.Dynamic].applyDynamic("trapezoid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], slope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body]
}
