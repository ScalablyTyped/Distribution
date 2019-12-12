package typings.heremaps.H.service.PlacesService

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.service.PlacesService.EntryPoint.AROUND
import typings.heremaps.H.service.PlacesService.EntryPoint.CATEGORIES
import typings.heremaps.H.service.PlacesService.EntryPoint.EXPLORE
import typings.heremaps.H.service.PlacesService.EntryPoint.HERE
import typings.heremaps.H.service.PlacesService.EntryPoint.SEARCH
import typings.heremaps.H.service.PlacesService.EntryPoint.SUGGEST
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntryPoint with Double] = js.native
  /* 3 */ @js.native
  object AROUND extends TopLevel[AROUND with Double]
  
  /* 5 */ @js.native
  object CATEGORIES extends TopLevel[CATEGORIES with Double]
  
  /* 2 */ @js.native
  object EXPLORE extends TopLevel[EXPLORE with Double]
  
  /* 4 */ @js.native
  object HERE extends TopLevel[HERE with Double]
  
  /* 0 */ @js.native
  object SEARCH extends TopLevel[SEARCH with Double]
  
  /* 1 */ @js.native
  object SUGGEST extends TopLevel[SUGGEST with Double]
  
}

