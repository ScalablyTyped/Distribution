package typings.heremaps.global.H.service

import typings.heremaps.H.service.PlacesService.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Places service implements a low level places RestApi access. Please refer to Restful API documentation for providing parameters and handling response objects.
  */
@JSGlobal("H.service.PlacesService")
@js.native
/**
  * Constructor
  * @param opt_options {H.service.PlacesService.Options=}
  */
class PlacesService ()
  extends typings.heremaps.H.service.PlacesService {
  def this(opt_options: Options) = this()
}
@JSGlobal("H.service.PlacesService")
@js.native
object PlacesService extends js.Object {
  
  /**
    * List of available entry points
    */
  @js.native
  object EntryPoint extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.service.PlacesService.EntryPoint with Double] = js.native
    
    /* 3 */ val AROUND: typings.heremaps.H.service.PlacesService.EntryPoint.AROUND with Double = js.native
    
    /* 5 */ val CATEGORIES: typings.heremaps.H.service.PlacesService.EntryPoint.CATEGORIES with Double = js.native
    
    /* 2 */ val EXPLORE: typings.heremaps.H.service.PlacesService.EntryPoint.EXPLORE with Double = js.native
    
    /* 4 */ val HERE: typings.heremaps.H.service.PlacesService.EntryPoint.HERE with Double = js.native
    
    /* 0 */ val SEARCH: typings.heremaps.H.service.PlacesService.EntryPoint.SEARCH with Double = js.native
    
    /* 1 */ val SUGGEST: typings.heremaps.H.service.PlacesService.EntryPoint.SUGGEST with Double = js.native
  }
}
