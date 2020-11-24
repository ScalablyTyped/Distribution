package typings.heremaps.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents style attributes for arrows to be rendered along a polyline. A ArrowStyle instance is always treated as immutable to avoid inconstiencies and must not modified.
  */
@js.native
trait ArrowStyle_ extends js.Object {
  
  /**
    * This method checks value-equality with another arrow style.
    * @param other {(H.map.ArrowStyle | H.map.ArrowStyle.Options)} - the arrow style to compare with
    * @returns {boolean} - true if the arrow styles are value-equal, otherwise false
    */
  def equals(other: ArrowStyle): Boolean = js.native
  def equals(other: Options): Boolean = js.native
}
