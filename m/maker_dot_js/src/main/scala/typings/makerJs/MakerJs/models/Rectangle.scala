package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IMeasure
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Rectangle")
@js.native
class Rectangle protected () extends IModel {
  /**
    * Create a rectangle from a measurement.
    *
    * Example:
    * ```
    * //Create a rectangle from a measurement.
    * var makerjs = require('makerjs');
    * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to measure.
    * var m = makerjs.measure.modelExtents(e);    // measure the ellipse.
    * var r = new makerjs.models.Rectangle(m);    // draws a rectangle surrounding the ellipse.
    * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
    * document.write(svg);
    * ```
    *
    * @param measurement IMeasure object. See http://microsoft.github.io/maker.js/docs/api/modules/makerjs.measure.html#pathextents and http://microsoft.github.io/maker.js/docs/api/modules/makerjs.measure.html#modelextents to get measurements of paths and models.
    */
  def this(measurement: IMeasure) = this()
  /**
    * Create a rectangle which will surround a model.
    *
    * Example:
    * ```
    * //Create a rectangle which will surround a model
    * var makerjs = require('makerjs');
    * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to surround.
    * var r = new makerjs.models.Rectangle(e, 3); // draws a rectangle surrounding the ellipse by 3 units.
    * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
    * document.write(svg);
    * ```
    *
    * @param modelToSurround IModel object.
    * @param margin Optional distance from the model.
    */
  def this(modelToSurround: IModel) = this()
  def this(modelToSurround: IModel, margin: Double) = this()
  /**
    * Create a rectangle from width and height.
    *
    * Example:
    * ```
    * //Create a rectangle from width and height
    * var makerjs = require('makerjs');
    * var model = new makerjs.models.Rectangle(50, 100);
    * var svg = makerjs.exporter.toSVG(model);
    * document.write(svg);
    * ```
    *
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    */
  def this(width: Double, height: Double) = this()
  @JSName("origin")
  var origin_Rectangle: IPoint = js.native
  @JSName("paths")
  var paths_Rectangle: IPathMap = js.native
}

