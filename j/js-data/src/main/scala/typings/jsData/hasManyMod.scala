package typings.jsData

import typings.jsData.relationMod.Relation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Relation/HasMany", JSImport.Namespace)
@js.native
object hasManyMod extends js.Object {
  @js.native
  class HasManyRelation () extends Relation {
    var foreignKeys: js.Any = js.native
    var localKeys: js.Any = js.native
    def createParentRecord(props: js.Any, opts: js.Any): js.Any = js.native
    def findExistingLinksByForeignKeys(id: js.Any): js.Any = js.native
    def findExistingLinksByLocalKeys(ids: js.Any): js.Any = js.native
    def findExistingLinksFor(record: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object HasManyRelation extends js.Object {
    var TYPE_NAME: String = js.native
  }
  
}

