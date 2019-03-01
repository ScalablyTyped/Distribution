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

object BaseCondition {
  @scala.inline
  def apply[P](
    $all: js.Array[P],
    $elemMatch: stdLib.Partial[P],
    $gt: P,
    $gte: P,
    $in: js.Array[P],
    $lt: P,
    $lte: P,
    $mod: js.Tuple2[scala.Double, scala.Double],
    $ne: P,
    $nin: js.Array[P]
  ): BaseCondition[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$all")($all)
    __obj.updateDynamic("$elemMatch")($elemMatch)
    __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    __obj.updateDynamic("$in")($in)
    __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    __obj.updateDynamic("$mod")($mod)
    __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    __obj.updateDynamic("$nin")($nin)
    __obj.asInstanceOf[BaseCondition[P]]
  }
}

