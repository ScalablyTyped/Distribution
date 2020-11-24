package typings.iitc.mapDataCalcToolsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TILE_PARAMS")
@js.native
object TILE_PARAMS extends js.Object {
  
  /**
    * @default  [1,1,1,40,40,80,80,320,1000,2000,2000,4000,8000,16000,16000,32000];
    */
  var TILES_PER_EDGE: js.Array[Double] = js.native
  
  /**
    * @default [8,8,8,8,7,7,7,6,6,5,4,4,3,2,2,1,1];
    */
  var ZOOM_TO_LEVEL: js.Array[Double] = js.native
  
  /**
    * @default [200000,200000,200000,200000,200000,60000,60000,10000,5000,2500,2500,800,300,0,0];
    */
  var ZOOM_TO_LINK_LENGTH: js.Array[Double] = js.native
}
