package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Control * / any */ trait ShareControl extends js.Object {
  def onAdd(map: Map): js.Any
}

object ShareControl {
  @scala.inline
  def apply(onAdd: Map => js.Any): ShareControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd))
  
    __obj.asInstanceOf[ShareControl]
  }
}

@JSGlobal("L.mapbox.shareControl")
@js.native
object shareControl extends js.Object {
  // ShareControl
  //////////////////////////////////////////////////////////////////////
  /**
  		 * Adds a "Share" button to the map, which can be used to share the map to Twitter or Facebook, or generate HTML for a map embed.
  		 */
  def apply(id: String): ShareControl = js.native
  def apply(id: String, options: ShareControlOptions): ShareControl = js.native
}

