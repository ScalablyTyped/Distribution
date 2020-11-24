package typings.heremaps.global.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents style attributes for arrows to be rendered along a polyline. A ArrowStyle instance is always treated as immutable to avoid inconstiencies and must not modified.
  */
@JSGlobal("H.map.ArrowStyle")
@js.native
/**
  * Constructor
  * @param opt_options {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=}
  */
class ArrowStyle ()
  extends typings.heremaps.H.map.ArrowStyle {
  def this(opt_options: typings.heremaps.H.map.ArrowStyle) = this()
  def this(opt_options: Options) = this()
}
