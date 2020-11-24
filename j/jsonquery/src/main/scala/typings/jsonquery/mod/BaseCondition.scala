package typings.jsonquery.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCondition[P] extends js.Object {
  
  @JSName("$all")
  var $all: js.Array[P] = js.native
  
  @JSName("$elemMatch")
  var $elemMatch: Partial[P] = js.native
  
  @JSName("$gt")
  var $gt: P = js.native
  
  @JSName("$gte")
  var $gte: P = js.native
  
  @JSName("$in")
  var $in: js.Array[P] = js.native
  
  @JSName("$lt")
  var $lt: P = js.native
  
  @JSName("$lte")
  var $lte: P = js.native
  
  @JSName("$mod")
  var $mod: js.Tuple2[Double, Double] = js.native
  
  @JSName("$ne")
  var $ne: P = js.native
  
  @JSName("$nin")
  var $nin: js.Array[P] = js.native
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
  
  @scala.inline
  implicit class BaseConditionOps[Self <: BaseCondition[_], P] (val x: Self with BaseCondition[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$allVarargs(value: P*): Self = this.set("$all", js.Array(value :_*))
    
    @scala.inline
    def set$all(value: js.Array[P]): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$elemMatch(value: Partial[P]): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gt(value: P): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gte(value: P): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$inVarargs(value: P*): Self = this.set("$in", js.Array(value :_*))
    
    @scala.inline
    def set$in(value: js.Array[P]): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lt(value: P): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lte(value: P): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$mod(value: js.Tuple2[Double, Double]): Self = this.set("$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ne(value: P): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ninVarargs(value: P*): Self = this.set("$nin", js.Array(value :_*))
    
    @scala.inline
    def set$nin(value: js.Array[P]): Self = this.set("$nin", value.asInstanceOf[js.Any])
  }
}
