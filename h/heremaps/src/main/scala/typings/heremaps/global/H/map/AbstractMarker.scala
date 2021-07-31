package typings.heremaps.global.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.map.AbstractMarker.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents marker, which offers a means of identifying a location on the map with an icon.
  */
@JSGlobal("H.map.AbstractMarker")
@js.native
abstract class AbstractMarker protected ()
  extends StObject
     with typings.heremaps.H.map.AbstractMarker {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - The location of this marker
    * @param opt_options {H.map.AbstractMarker.Options=} - The values to initialize this marker
    */
  def this(position: IPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
}
