package typings.heremaps.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a spatial map object which provides its projected geometry.
  */
@js.native
trait Spatial_ extends Object {
  
  /**
    * To get the arrow style of this spatial object or undefined if no style is defined. A returned arrow style is treated as immutable and must not be modified afterwards to prevent
    * inconsistancies!
    * @returns {(H.map.ArrowStyle | undefined)}
    */
  def getArrows(): ArrowStyle | Unit = js.native
  
  /**
    * To get the drawing style of this object. The returned style is treated as immutable and must not be modified afterwards to prevent inconsistancies!
    * @returns {H.map.SpatialStyle}
    */
  def getStyle(): SpatialStyle = js.native
  
  /**
    * Indicates whether this spatial object represents a closed shape
    * @returns {boolean}
    */
  def isClosed(): Boolean = js.native
  
  /**
    * To set the arrow style of this object.
    * @param opt_arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - the arrow style to be applied
    * @returns {H.map.Spatial} - the Spatial instance itself
    */
  def setArrows(): Spatial = js.native
  def setArrows(opt_arrows: ArrowStyle): Spatial = js.native
  def setArrows(opt_arrows: Options): Spatial = js.native
  
  /**
    * To set the drawing style of this object. If the passed opt_style argument is an instance of H.map.SpatialStyle it is treated as immutable and must not be modified afterwards to prevent
    * inconsistancies!
    * @param opt_style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - The style to set. If it evaluates to a falsy the H.map.SpatialStyle.DEFAULT_STYLE is used.
    * @returns {H.map.Spatial} - the Spatial instance itself
    */
  def setStyle(): Spatial = js.native
  def setStyle(opt_style: SpatialStyle): Spatial = js.native
  def setStyle(opt_style: typings.heremaps.H.map.SpatialStyle.Options): Spatial = js.native
}
