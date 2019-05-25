package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithOptions extends js.Object {
  var all: scala.Double
  var ids: scala.Double
  var indexer: java.lang.String
  var keys: scala.Double
  var labels: scala.Double
  var list: scala.Double
  var map: scala.Double
  var none: scala.Double
  var tokens: java.lang.String
  var values: scala.Double
}

object WithOptions {
  @scala.inline
  def apply(
    all: scala.Double,
    ids: scala.Double,
    indexer: java.lang.String,
    keys: scala.Double,
    labels: scala.Double,
    list: scala.Double,
    map: scala.Double,
    none: scala.Double,
    tokens: java.lang.String,
    values: scala.Double
  ): WithOptions = {
    val __obj = js.Dynamic.literal(all = all, ids = ids, indexer = indexer, keys = keys, labels = labels, list = list, map = map, none = none, tokens = tokens, values = values)
  
    __obj.asInstanceOf[WithOptions]
  }
}

