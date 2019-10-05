package typings.heredatalens.H.datalens.ObjectLayer

import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.map.Icon
import typings.heremaps.H.util.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.datalens.ObjectLayer")
@js.native
object ^ extends js.Object {
  /**
    * A factory method for data-driven icons. The method allows you to build an icon from SVG markup or JsonML object. Provides caching of icons with the same markup.
    * @param svg - SVG presented as markup or JsonML Array
    * @param options - Icon options (eg size and anchor). Note that the default anchor is in the middle.
    * @param options.size - When the icon is a square, you can define the size as a number in pixels
    * @returns - Icon which can be used for marker or cluster
    */
  def createIcon(svg: String): Icon = js.native
  def createIcon(svg: String, options: typings.heremaps.H.map.Icon.Options): Icon = js.native
  def createIcon(svg: js.Array[_]): Icon = js.native
  def createIcon(svg: js.Array[_], options: typings.heremaps.H.map.Icon.Options): Icon = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: Data): js.Array[Row] = js.native
  /**
    * Returns cache of icons created with the createIcon method. Can be used to clean the icon cache.
    * @return - Icon cache
    */
  def getIconCache(): Cache = js.native
}

