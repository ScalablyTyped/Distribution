package typings.makerjs.mod

import typings.makerjs.MakerJs.IChain
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  @JSImport("makerjs", "layout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Layout the children of a model along a chain.
    * The x-position of each child will be projected onto the chain so that the proportion between children is maintained.
    * The projected positions of the children will become an array of points that approximate the chain.
    * Each child will be rotated such that it will be mitered according to the vertex angles formed by this series of points.
    *
    * @param parentModel The model containing children to lay out.
    * @param onChain The chain on which to lay out.
    * @param baseline Numeric percentage value of vertical displacement from the chain. Default is zero.
    * @param reversed Flag to travel along the chain in reverse. Default is false.
    * @param contain Flag to contain the children layout within the length of the chain. Default is false.
    * @param rotate Flag to rotate the child to mitered angle. Default is true.
    * @returns The parentModel, for cascading.
    */
  inline def childrenOnChain(parentModel: IModel, onChain: IChain): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Double, reversed: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Double, reversed: Boolean, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Double,
    reversed: Boolean,
    contain: Boolean,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Double,
    reversed: Boolean,
    contain: Unit,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Double, reversed: Unit, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Double,
    reversed: Unit,
    contain: Boolean,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Double,
    reversed: Unit,
    contain: Unit,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Unit, reversed: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Unit, reversed: Boolean, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Unit,
    reversed: Boolean,
    contain: Boolean,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Unit,
    reversed: Boolean,
    contain: Unit,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(parentModel: IModel, onChain: IChain, baseline: Unit, reversed: Unit, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Unit,
    reversed: Unit,
    contain: Boolean,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnChain(
    parentModel: IModel,
    onChain: IChain,
    baseline: Unit,
    reversed: Unit,
    contain: Unit,
    rotated: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnChain")(parentModel.asInstanceOf[js.Any], onChain.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotated.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout the children of a model along a path.
    * The x-position of each child will be projected onto the path so that the proportion between children is maintained.
    * Each child will be rotated such that it will be perpendicular to the path at the child's x-center.
    *
    * @param parentModel The model containing children to lay out.
    * @param onPath The path on which to lay out.
    * @param baseline Numeric percentage value of vertical displacement from the path. Default is zero.
    * @param reversed Flag to travel along the path in reverse. Default is false.
    * @param contain Flag to contain the children layout within the length of the path. Default is false.
    * @param rotate Flag to rotate the child to perpendicular. Default is true.
    * @returns The parentModel, for cascading.
    */
  inline def childrenOnPath(parentModel: IModel, onPath: IPath): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Double, reversed: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Double, reversed: Boolean, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Double,
    reversed: Boolean,
    contain: Boolean,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Double,
    reversed: Boolean,
    contain: Unit,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Double, reversed: Unit, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Double,
    reversed: Unit,
    contain: Boolean,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Double,
    reversed: Unit,
    contain: Unit,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Unit, reversed: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Unit, reversed: Boolean, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Unit,
    reversed: Boolean,
    contain: Boolean,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Unit,
    reversed: Boolean,
    contain: Unit,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Unit, reversed: Unit, contain: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(
    parentModel: IModel,
    onPath: IPath,
    baseline: Unit,
    reversed: Unit,
    contain: Boolean,
    rotate: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def childrenOnPath(parentModel: IModel, onPath: IPath, baseline: Unit, reversed: Unit, contain: Unit, rotate: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenOnPath")(parentModel.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], baseline.asInstanceOf[js.Any], reversed.asInstanceOf[js.Any], contain.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a brick format. Alternating rows will have an additional item in each row.
    *
    * Examples:
    * ```
    * //Brick wall
    * var m = require('makerjs');
    * var brick = new m.models.RoundRectangle(50, 30, 4);
    * var wall = m.layout.cloneToBrick(brick, 8, 6, 3);
    * document.write(m.exporter.toSVG(wall));
    * ```
    *
    * ```
    * //Fish scales
    * var m = require('makerjs');
    * var arc = new m.paths.Arc([0, 0], 50, 20, 160);
    * var scales = m.layout.cloneToBrick(arc, 8, 20);
    * document.write(m.exporter.toSVG(scales));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param xCount Number of columns in the brick grid.
    * @param yCount Number of rows in the brick grid.
    * @param margin Optional numeric distance between each clone. Can also be a 2 dimensional array of numbers, to specify distances in x and y dimensions.
    * @returns A new model with clones in a brick layout.
    */
  inline def cloneToBrick(itemToClone: IModel, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToBrick(itemToClone: IModel, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToBrick(itemToClone: IModel, xCount: Double, yCount: Double, margin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToBrick(itemToClone: IPath, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToBrick(itemToClone: IPath, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToBrick(itemToClone: IPath, xCount: Double, yCount: Double, margin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToBrick")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a column format.
    *
    * Example:
    * ```
    * //Grooves for a finger joint
    * var m = require('makerjs');
    *
    * var dogbone = new m.models.Dogbone(50, 20, 2, -1, false);
    *
    * var grooves = m.layout.cloneToColumn(dogbone, 5, 20);
    *
    * document.write(m.exporter.toSVG(grooves));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param count Number of clones in the column.
    * @param margin Optional distance between each clone.
    * @returns A new model with clones in a column.
    */
  inline def cloneToColumn(itemToClone: IModel, count: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToColumn")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToColumn(itemToClone: IModel, count: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToColumn")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToColumn(itemToClone: IPath, count: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToColumn")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToColumn(itemToClone: IPath, count: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToColumn")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a grid format.
    *
    * Example:
    * ```
    * //Grid of squares
    * var m = require('makerjs');
    * var square = new m.models.Square(43);
    * var grid = m.layout.cloneToGrid(square, 5, 5, 7);
    * document.write(m.exporter.toSVG(grid));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param xCount Number of columns in the grid.
    * @param yCount Number of rows in the grid.
    * @param margin Optional numeric distance between each clone. Can also be a 2 dimensional array of numbers, to specify distances in x and y dimensions.
    * @returns A new model with clones in a grid layout.
    */
  inline def cloneToGrid(itemToClone: IModel, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToGrid(itemToClone: IModel, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToGrid(itemToClone: IModel, xCount: Double, yCount: Double, margin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToGrid(itemToClone: IPath, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToGrid(itemToClone: IPath, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToGrid(itemToClone: IPath, xCount: Double, yCount: Double, margin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToGrid")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a honeycomb format. Alternating rows will have an additional item in each row.
    *
    * Examples:
    * ```
    * //Honeycomb
    * var m = require('makerjs');
    * var hex = new m.models.Polygon(6, 50, 30);
    * var pattern = m.layout.cloneToHoneycomb(hex, 8, 9, 10);
    * document.write(m.exporter.toSVG(pattern));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param xCount Number of columns in the honeycomb grid.
    * @param yCount Number of rows in the honeycomb grid.
    * @param margin Optional distance between each clone.
    * @returns A new model with clones in a honeycomb layout.
    */
  inline def cloneToHoneycomb(itemToClone: IModel, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToHoneycomb")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToHoneycomb(itemToClone: IModel, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToHoneycomb")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToHoneycomb(itemToClone: IPath, xCount: Double, yCount: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToHoneycomb")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToHoneycomb(itemToClone: IPath, xCount: Double, yCount: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToHoneycomb")(itemToClone.asInstanceOf[js.Any], xCount.asInstanceOf[js.Any], yCount.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a radial format.
    *
    * Example:
    * ```
    * //daisy petals
    * var makerjs = require('makerjs');
    *
    * var belt = new makerjs.models.Belt(5, 50, 20);
    *
    * makerjs.model.move(belt, [25, 0]);
    *
    * var petals = makerjs.layout.cloneToRadial(belt, 8, 45);
    *
    * document.write(makerjs.exporter.toSVG(petals));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param count Number of clones in the radial result.
    * @param angleInDegrees angle of rotation between clones..
    * @returns A new model with clones in a radial format.
    */
  inline def cloneToRadial(itemToClone: IModel, count: Double, angleInDegrees: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRadial")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRadial(itemToClone: IModel, count: Double, angleInDegrees: Double, rotationOrigin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRadial")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any], rotationOrigin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRadial(itemToClone: IPath, count: Double, angleInDegrees: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRadial")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRadial(itemToClone: IPath, count: Double, angleInDegrees: Double, rotationOrigin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRadial")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any], rotationOrigin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Layout clones in a row format.
    *
    * Example:
    * ```
    * //Tongue and grooves for a box joint
    * var m = require('makerjs');
    * var tongueWidth = 60;
    * var grooveWidth = 50;
    * var grooveDepth = 30;
    * var groove = new m.models.Dogbone(grooveWidth, grooveDepth, 5, 0, true);
    *
    * groove.paths['leftTongue'] = new m.paths.Line([-tongueWidth / 2, 0], [0, 0]);
    * groove.paths['rightTongue'] = new m.paths.Line([grooveWidth, 0], [grooveWidth + tongueWidth / 2, 0]);
    *
    * var tongueAndGrooves = m.layout.cloneToRow(groove, 3);
    *
    * document.write(m.exporter.toSVG(tongueAndGrooves));
    * ```
    *
    * @param itemToClone: Either a model or a path object.
    * @param count Number of clones in the row.
    * @param margin Optional distance between each clone.
    * @returns A new model with clones in a row.
    */
  inline def cloneToRow(itemToClone: IModel, count: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRow")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRow(itemToClone: IModel, count: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRow")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRow(itemToClone: IPath, count: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRow")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def cloneToRow(itemToClone: IPath, count: Double, margin: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneToRow")(itemToClone.asInstanceOf[js.Any], count.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[IModel]
}
