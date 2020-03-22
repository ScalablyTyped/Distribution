package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/LinkedCollection", JSImport.Namespace)
@js.native
object linkedCollectionMod extends js.Object {
  @js.native
  trait LinkedCollection
    extends typings.jsData.collectionMod.default {
    var datastore: js.Any = js.native
    def _addMeta(record: js.Any, timestamp: js.Any): Unit = js.native
    def _clearMeta(record: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends LinkedCollection {
    def this(records: js.Any, opts: js.Any) = this()
  }
  
}

