package typings.iitc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iitc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class DataCache ()
    extends typings.iitc.dataCacheMod.DataCache
  
  @js.native
  object IITC extends js.Object {
    
    /** Field-Polygon */
    @js.native
    class Field ()
      extends typings.iitc.iitctypesMod.IITC.Field
    
    /** Link-Marker */
    @js.native
    class Link ()
      extends typings.iitc.iitctypesMod.IITC.Link
    
    /** Portal-Marker */
    @js.native
    class Portal ()
      extends typings.iitc.iitctypesMod.IITC.Portal
  }
  
  @js.native
  class MapDataRequest ()
    extends typings.iitc.mapDataRequestMod.MapDataRequest
  
  @js.native
  class Render ()
    extends typings.iitc.mapDataRenderMod.Render
  
  @js.native
  class RenderDebugTiles ()
    extends typings.iitc.mapDataDebugMod.RenderDebugTiles
}
