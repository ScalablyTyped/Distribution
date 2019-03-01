package typings
package graphqlDashImportLib.graphqlDashImportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawModule extends js.Object {
  var from: java.lang.String
  var imports: js.Array[java.lang.String]
}

object RawModule {
  @scala.inline
  def apply(from: java.lang.String, imports: js.Array[java.lang.String]): RawModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("imports")(imports)
    __obj.asInstanceOf[RawModule]
  }
}

