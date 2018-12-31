package typings
package jsonqueryLib.jsonqueryMod.jsonqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCondition[P] extends js.Object {
  @JSName("$all")
  var $all: js.Array[P]
  @JSName("$elemMatch")
  var $elemMatch: stdLib.Partial[P]
  @JSName("$gt")
  var $gt: P
  @JSName("$gte")
  var $gte: P
  @JSName("$in")
  var $in: js.Array[P]
  @JSName("$lt")
  var $lt: P
  @JSName("$lte")
  var $lte: P
  @JSName("$mod")
  var $mod: js.Tuple2[scala.Double, scala.Double]
  @JSName("$ne")
  var $ne: P
  @JSName("$nin")
  var $nin: js.Array[P]
}

