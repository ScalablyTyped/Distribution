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
  
  val AROUND: AROUND with java.lang.String = js.native
  val CATEGORIES: CATEGORIES with java.lang.String = js.native
  val EXPLORE: EXPLORE with java.lang.String = js.native
  val HERE: HERE with java.lang.String = js.native
  val SEARCH: SEARCH with java.lang.String = js.native
  val SUGGEST: SUGGEST with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint with java.lang.String] = js.native
}

