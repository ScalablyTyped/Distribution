package typings.heremaps.HNs.serviceNs.PlacesServiceNs

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
  
  /* 3 */ val AROUND: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.AROUND with Double = js.native
  /* 5 */ val CATEGORIES: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.CATEGORIES with Double = js.native
  /* 2 */ val EXPLORE: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.EXPLORE with Double = js.native
  /* 4 */ val HERE: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.HERE with Double = js.native
  /* 0 */ val SEARCH: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.SEARCH with Double = js.native
  /* 1 */ val SUGGEST: typings.heremaps.HNs.serviceNs.PlacesServiceNs.EntryPoint.SUGGEST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntryPoint with Double] = js.native
}

