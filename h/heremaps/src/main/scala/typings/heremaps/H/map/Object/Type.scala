package typings.heremaps.H.map.Object

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.map.Object.Type.ANY
import typings.heremaps.H.map.Object.Type.DOM_MARKER
import typings.heremaps.H.map.Object.Type.GROUP
import typings.heremaps.H.map.Object.Type.MARKER
import typings.heremaps.H.map.Object.Type.OVERLAY
import typings.heremaps.H.map.Object.Type.SPATIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 0 */ @js.native
  object ANY extends TopLevel[ANY with Double]
  
  /* 4 */ @js.native
  object DOM_MARKER extends TopLevel[DOM_MARKER with Double]
  
  /* 5 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  /* 3 */ @js.native
  object MARKER extends TopLevel[MARKER with Double]
  
  /* 1 */ @js.native
  object OVERLAY extends TopLevel[OVERLAY with Double]
  
  /* 2 */ @js.native
  object SPATIAL extends TopLevel[SPATIAL with Double]
  
}

