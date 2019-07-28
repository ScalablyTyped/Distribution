package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataObject extends js.Object {
  /**
    * The name of the data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The SVG path.
    */
  var path: SVGPathArray
  /**
    * The GeoJSON meta data.
    */
  var properties: js.UndefOr[js.Object] = js.undefined
}

object MapDataObject {
  @scala.inline
  def apply(path: SVGPathArray, name: String = null, properties: js.Object = null): MapDataObject = {
    val __obj = js.Dynamic.literal(path = path)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[MapDataObject]
  }
}

