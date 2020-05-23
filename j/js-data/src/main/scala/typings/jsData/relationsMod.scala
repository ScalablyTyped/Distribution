package typings.jsData

import typings.jsData.relationMod.RelationOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/relations", JSImport.Namespace)
@js.native
object relationsMod extends js.Object {
  @js.native
  abstract class Relation protected ()
    extends typings.jsData.relationMod.Relation {
    def this(relatedMapper: js.Any) = this()
    def this(relatedMapper: js.Any, options: RelationOpts) = this()
  }
  
  val belongsToType: /* "belongsTo" */ String = js.native
  val hasManyType: /* "hasMany" */ String = js.native
  val hasOneType: /* "hasOne" */ String = js.native
  /* static members */
  @js.native
  object Relation extends js.Object {
    var belongsTo: js.Any = js.native
    var hasMany: js.Any = js.native
    var hasOne: js.Any = js.native
  }
  
}

