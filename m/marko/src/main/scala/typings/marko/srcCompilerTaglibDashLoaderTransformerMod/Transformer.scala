package typings.marko.srcCompilerTaglibDashLoaderTransformerMod

import typings.marko.srcCompilerTaglibDashLoaderTagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  var id: Double
  var name: String | Null
  var path: String | Null
  var priority: js.Any
  var properties: js.Any
  var tag: ^  | Null
  var taglibId: String
  def getFunc(): js.Any
}

object Transformer {
  @scala.inline
  def apply(
    getFunc: () => js.Any,
    id: Double,
    priority: js.Any,
    properties: js.Any,
    taglibId: String,
    name: String = null,
    path: String = null,
    tag: ^ = null
  ): Transformer = {
    val __obj = js.Dynamic.literal(getFunc = js.Any.fromFunction0(getFunc), id = id, priority = priority, properties = properties, taglibId = taglibId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Transformer]
  }
}

