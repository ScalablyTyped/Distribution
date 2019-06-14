package typings
package heremapsLib.HNs.serviceNs.PlacesServiceNs

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
  sealed trait AROUND
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  @js.native
  sealed trait CATEGORIES
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  @js.native
  sealed trait EXPLORE
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  @js.native
  sealed trait HERE
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  @js.native
  sealed trait SEARCH
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  @js.native
  sealed trait SUGGEST
    extends heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint
  
  /* 3 */ val AROUND: AROUND with scala.Double = js.native
  /* 5 */ val CATEGORIES: CATEGORIES with scala.Double = js.native
  /* 2 */ val EXPLORE: EXPLORE with scala.Double = js.native
  /* 4 */ val HERE: HERE with scala.Double = js.native
  /* 0 */ val SEARCH: SEARCH with scala.Double = js.native
  /* 1 */ val SUGGEST: SUGGEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint with scala.Double] = js.native
}

