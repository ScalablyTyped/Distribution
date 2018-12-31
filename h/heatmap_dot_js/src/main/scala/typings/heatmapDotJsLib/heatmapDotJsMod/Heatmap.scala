package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heatmap.js", "Heatmap")
@js.native
class Heatmap[V /* <: java.lang.String */, X /* <: java.lang.String */, Y /* <: java.lang.String */] () extends js.Object {
  /**
    * Use this functionality only for adding datapoints on the fly, not for data
    * initialization! heatmapInstance.addData adds a single or multiple
    * datapoints to the heatmap's datastore.
    *
    * @example <caption>A single datapoint</caption>
    *
    * var dataPoint = {
    *   x: 5, // x coordinate of the datapoint, a number
    *   y: 5, // y coordinate of the datapoint, a number
    *   value: 100 // the value at datapoint(x, y)
    * };
    * heatmapInstance.addData(dataPoint);
    *
    * @example <caption>multiple datapoints</caption>
    *
    * // for data initialization use setData!!
    * var dataPoints = [dataPoint, dataPoint, dataPoint, dataPoint];
    * heatmapInstance.addData(dataPoints);
    */
  def addData(dataPoint: DataPoint[V, X, Y]): this.type = js.native
  def addData(dataPoint: js.Array[DataPoint[V, X, Y]]): this.type = js.native
  /**
    * Reconfigures a heatmap instance after it has been initialized. Triggers a
    * complete rerendering.
    *
    * NOTE: This returns a reference to itself, but also offers an opportunity
    * to change the `xField`, `yField` and `valueField` options, which can
    * change the type of the `Heatmap` instance.
    *
    * @example
    *
    * var nuConfig = {
    *   radius: 10,
    *   maxOpacity: .5,
    *   minOpacity: 0,
    *   blur: .75
    * };
    * heatmapInstance.configure(nuConfig);
    */
  def configure[Vn /* <: java.lang.String */, Xn /* <: java.lang.String */, Yn /* <: java.lang.String */](configObject: HeatmapConfiguration[Vn, Xn, Yn]): Heatmap[Vn, Xn, Yn] = js.native
  /**
    * Returns a persistable and reimportable (with setData) JSON object.
    *
    * @example
    *
    * var currentData = heatmapInstance.getData();
    * // now let's create a new instance and set the data
    * var heatmap2 = h337.create(config);
    * heatmap2.setData(currentData); // now both heatmap instances have the same content
    */
  def getData(): HeatmapData[DataCircle] = js.native
  /**
    * Returns dataURL string.
    *
    * The returned value is the base64 encoded dataURL of the heatmap instance.
    *
    * @example
    *
    * heatmapInstance.getDataURL(); // data:image/png;base64...
    * // ready for saving locally or on the server
    */
  def getDataURL(): java.lang.String = js.native
  /**
    * Returns value at datapoint position.
    *
    * The returned value is an interpolated value based on the gradient blending
    * if point is not in store.
    *
    * @example
    *
    * heatmapInstance.addData({ x: 10, y: 10, value: 100});
    * // get the value at x=10, y=10
    * heatmapInstance.getValueAt({ x: 10, y: 10 }); // returns 100
    */
  def getValueAt(point: heatmapDotJsLib.Anon_Y): scala.Double = js.native
  /**
    * Repaints the whole heatmap canvas.
    */
  def repaint(): this.type = js.native
  /**
    * Initialize a heatmap instance with the given dataset. Removes all
    * previously existing points from the heatmap instance and re-initializes
    * the datastore.
    *
    * @example
    *
    * var data = {
    *   max: 100,
    *   min: 0,
    *   data: [
    *     dataPoint, dataPoint, dataPoint, dataPoint
    *   ]
    * };
    * heatmapInstance.setData(data);
    */
  def setData(data: HeatmapData[DataPoint[V, X, Y]]): this.type = js.native
  /**
    * Changes the upper bound of your dataset and triggers a complete
    * rerendering.
    *
    * @example
    *
    * heatmapInstance.setDataMax(200);
    * // setting the maximum value triggers a complete rerendering of the heatmap
    * heatmapInstance.setDataMax(100);
    */
  def setDataMax(number: scala.Double): this.type = js.native
  /**
    * Changes the lower bound of your dataset and triggers a complete
    * rerendering.
    *
    * @example
    *
    * heatmapInstance.setDataMin(10);
    * // setting the minimum value triggers a complete rerendering of the heatmap
    * heatmapInstance.setDataMin(0);
    */
  def setDataMin(number: scala.Double): this.type = js.native
}

