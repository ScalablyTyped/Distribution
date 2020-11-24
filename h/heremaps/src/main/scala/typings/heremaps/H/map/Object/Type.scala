package typings.heremaps.H.map.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
/**
  * The major types of map objects
  */
@JSGlobal("H.map.Object.Type")
@js.native
object Type extends js.Object {
  
  /** spatial object */
  @js.native
  sealed trait ANY extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait DOM_MARKER extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait GROUP extends Type
  
  /** Marker object */
  @js.native
  sealed trait MARKER extends Type
  
  /** spatial object */
  @js.native
  sealed trait OVERLAY extends Type
  
  /** spatial object */
  @js.native
  sealed trait SPATIAL extends Type
}
