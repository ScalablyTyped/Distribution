package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Handler")
@js.native
class Handler protected () extends Class {
  def this(map: Map_) = this()
  
  // Extension methods
  var addHooks: js.UndefOr[js.Function0[Unit]] = js.native
  
  def disable(): this.type = js.native
  
  def enable(): this.type = js.native
  
  def enabled(): Boolean = js.native
  
  var removeHooks: js.UndefOr[js.Function0[Unit]] = js.native
}
