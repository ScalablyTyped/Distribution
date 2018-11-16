package typings
package haversineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object haversineLibStrings {
  @js.native
  sealed trait `[lat,lon]` extends js.Object
  
  @js.native
  sealed trait `[lon,lat]` extends js.Object
  
  @js.native
  sealed trait geojson extends js.Object
  
  @js.native
  sealed trait km extends js.Object
  
  @js.native
  sealed trait meter extends js.Object
  
  @js.native
  sealed trait mile extends js.Object
  
  @js.native
  sealed trait nmi extends js.Object
  
  @js.native
  sealed trait `{lon,lat}` extends js.Object
  
  def `[lat,lon]`: `[lat,lon]` = "[lat,lon]".asInstanceOf[`[lat,lon]`]
  def `[lon,lat]`: `[lon,lat]` = "[lon,lat]".asInstanceOf[`[lon,lat]`]
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  def km: km = "km".asInstanceOf[km]
  def meter: meter = "meter".asInstanceOf[meter]
  def mile: mile = "mile".asInstanceOf[mile]
  def nmi: nmi = "nmi".asInstanceOf[nmi]
  def `{lon,lat}`: `{lon,lat}` = "{lon,lat}".asInstanceOf[`{lon,lat}`]
}

