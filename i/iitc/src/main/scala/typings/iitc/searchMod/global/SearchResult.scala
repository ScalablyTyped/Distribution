package typings.iitc.searchMod.global

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.spectrum.JQuery
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.iitc.searchMod.global.SearchResultPosition
  - typings.iitc.searchMod.global.SearchResultBounds
*/
trait SearchResult extends js.Object
object SearchResult {
  
  @scala.inline
  def SearchResultPosition(
    description: JQuery | js.Array[_] | Element | Text | String,
    position: LatLngExpression,
    title: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  def SearchResultBounds(
    bounds: LatLngBoundsExpression,
    description: JQuery | js.Array[_] | Element | Text | String,
    title: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}
