package typings.jsData

import typings.jsData.relationMod.Relation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Relation/BelongsTo", JSImport.Namespace)
@js.native
object belongsToMod extends js.Object {
  @js.native
  class BelongsToRelation () extends Relation {
    def createChildRecord(): Unit = js.native
    def createParentRecord(props: js.Any, opts: js.Any): js.Any = js.native
    def findExistingLinksFor(record: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BelongsToRelation extends js.Object {
    var TYPE_NAME: String = js.native
  }
  
}

