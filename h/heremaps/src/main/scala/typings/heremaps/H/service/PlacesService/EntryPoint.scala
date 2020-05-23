package typings.heremaps.H.service.PlacesService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntryPoint extends js.Object

/**
  * List of available entry points
  */
@JSGlobal("H.service.PlacesService.EntryPoint")
@js.native
object EntryPoint extends js.Object {
  @js.native
  sealed trait AROUND extends EntryPoint
  
  @js.native
  sealed trait CATEGORIES extends EntryPoint
  
  @js.native
  sealed trait EXPLORE extends EntryPoint
  
  @js.native
  sealed trait HERE extends EntryPoint
  
  @js.native
  sealed trait SEARCH extends EntryPoint
  
  @js.native
  sealed trait SUGGEST extends EntryPoint
  
}

