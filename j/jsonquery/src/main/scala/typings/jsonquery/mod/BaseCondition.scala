package typings.jsonquery.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCondition[P] extends js.Object {
  @JSName("$all")
  var $all: js.Array[P]
  @JSName("$elemMatch")
  var $elemMatch: Partial[P]
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
  var $mod: js.Tuple2[Double, Double]
  @JSName("$ne")
  var $ne: P
  @JSName("$nin")
  var $nin: js.Array[P]
}

object BaseCondition {
  @scala.inline
  def apply[P](
    $all: js.Array[P],
    $elemMatch: Partial[P],
    $gt: P,
    $gte: P,
    $in: js.Array[P],
    $lt: P,
    $lte: P,
    $mod: js.Tuple2[Double, Double],
    $ne: P,
    $nin: js.Array[P]
  ): BaseCondition[P] = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $elemMatch = $elemMatch.asInstanceOf[js.Any], $gt = $gt.asInstanceOf[js.Any], $gte = $gte.asInstanceOf[js.Any], $in = $in.asInstanceOf[js.Any], $lt = $lt.asInstanceOf[js.Any], $lte = $lte.asInstanceOf[js.Any], $mod = $mod.asInstanceOf[js.Any], $ne = $ne.asInstanceOf[js.Any], $nin = $nin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseCondition[P]]
  }
}

