package typings.maplibreGl.mod

import typings.maplibreGl.anon.TypeofsetTimeout
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Hash")
@js.native
open class Hash () extends StObject {
  def this(hashName: String) = this()
  
  def _getCurrentHash(): Any = js.native
  
  var _hashName: String = js.native
  
  var _map: Map = js.native
  
  def _onHashChange(): Boolean = js.native
  
  def _updateHash(): ReturnType[TypeofsetTimeout] = js.native
  
  def _updateHashUnthrottled(): scala.Unit = js.native
  
  def addTo(map: Map): this.type = js.native
  
  def getHashString(): String = js.native
  def getHashString(mapFeedback: Boolean): String = js.native
  
  def remove(): this.type = js.native
}
