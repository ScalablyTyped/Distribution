package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CollisionGroups")
@js.native
open class CollisionGroups protected () extends StObject {
  def this(crossSourceCollisions: Boolean) = this()
  
  var collisionGroups: StringDictionary[CollisionGroup] = js.native
  
  var crossSourceCollisions: Boolean = js.native
  
  def get(sourceID: String): CollisionGroup = js.native
  
  var maxGroupID: Double = js.native
}
