package typings.jsData

import typings.jsData.relationMod.Relation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Relation/HasOne", JSImport.Namespace)
@js.native
object hasOneMod extends js.Object {
  @js.native
  class HasOneRelation () extends Relation
  
  /* static members */
  @js.native
  object HasOneRelation extends js.Object {
    var TYPE_NAME: String = js.native
  }
  
}

