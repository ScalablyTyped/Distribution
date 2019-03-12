package typings
package markoLib.srcCompilerTaglibDashLoaderTransformerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  var id: scala.Double
  var name: java.lang.String | scala.Null
  var path: java.lang.String | scala.Null
  var priority: js.Any
  var properties: js.Any
  var tag: markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced | scala.Null
  var taglibId: java.lang.String
  def getFunc(): js.Any
}

object Transformer {
  @scala.inline
  def apply(
    getFunc: () => js.Any,
    id: scala.Double,
    priority: js.Any,
    properties: js.Any,
    taglibId: java.lang.String,
    name: java.lang.String = null,
    path: java.lang.String = null,
    tag: markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced = null
  ): Transformer = {
    val __obj = js.Dynamic.literal(getFunc = js.Any.fromFunction0(getFunc), id = id, priority = priority, properties = properties, taglibId = taglibId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Transformer]
  }
}

