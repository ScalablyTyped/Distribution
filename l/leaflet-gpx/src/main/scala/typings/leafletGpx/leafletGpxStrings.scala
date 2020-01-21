package typings.leafletGpx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object leafletGpxStrings {
  @js.native
  sealed trait route extends js.Object
  
  @js.native
  sealed trait track extends js.Object
  
  @js.native
  sealed trait waypoint extends js.Object
  
  @scala.inline
  def route: route = "route".asInstanceOf[route]
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  @scala.inline
  def waypoint: waypoint = "waypoint".asInstanceOf[waypoint]
}

