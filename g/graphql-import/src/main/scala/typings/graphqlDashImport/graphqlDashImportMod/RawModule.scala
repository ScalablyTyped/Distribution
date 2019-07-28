package typings.graphqlDashImport.graphqlDashImportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawModule extends js.Object {
  var from: String
  var imports: js.Array[String]
}

object RawModule {
  @scala.inline
  def apply(from: String, imports: js.Array[String]): RawModule = {
    val __obj = js.Dynamic.literal(from = from, imports = imports)
  
    __obj.asInstanceOf[RawModule]
  }
}

