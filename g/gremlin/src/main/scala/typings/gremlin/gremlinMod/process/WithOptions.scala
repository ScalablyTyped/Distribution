package typings.gremlin.gremlinMod.process

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithOptions extends js.Object {
  var all: Double
  var ids: Double
  var indexer: String
  var keys: Double
  var labels: Double
  var list: Double
  var map: Double
  var none: Double
  var tokens: String
  var values: Double
}

object WithOptions {
  @scala.inline
  def apply(
    all: Double,
    ids: Double,
    indexer: String,
    keys: Double,
    labels: Double,
    list: Double,
    map: Double,
    none: Double,
    tokens: String,
    values: Double
  ): WithOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithOptions]
  }
}

@JSImport("gremlin", "process.withOptions")
@js.native
object withOptions extends TopLevel[WithOptions]

