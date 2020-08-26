package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Y in keyof lokijs.LokiOps ]:? any} */
@js.native
trait YinkeyofLokiOpsany extends js.Object {
  @JSName("$aeq")
  var $aeq: js.UndefOr[js.Any] = js.native
  @JSName("$and")
  var $and: js.UndefOr[js.Any] = js.native
  @JSName("$between")
  var $between: js.UndefOr[js.Any] = js.native
  @JSName("$contains")
  var $contains: js.UndefOr[js.Any] = js.native
  @JSName("$containsAny")
  var $containsAny: js.UndefOr[js.Any] = js.native
  @JSName("$containsNone")
  var $containsNone: js.UndefOr[js.Any] = js.native
  @JSName("$containsString")
  var $containsString: js.UndefOr[js.Any] = js.native
  @JSName("$definedin")
  var $definedin: js.UndefOr[js.Any] = js.native
  @JSName("$dteq")
  var $dteq: js.UndefOr[js.Any] = js.native
  @JSName("$eq")
  var $eq: js.UndefOr[js.Any] = js.native
  @JSName("$finite")
  var $finite: js.UndefOr[js.Any] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[js.Any] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[js.Any] = js.native
  @JSName("$in")
  var $in: js.UndefOr[js.Any] = js.native
  @JSName("$jbetween")
  var $jbetween: js.UndefOr[js.Any] = js.native
  @JSName("$jgt")
  var $jgt: js.UndefOr[js.Any] = js.native
  @JSName("$jgte")
  var $jgte: js.UndefOr[js.Any] = js.native
  @JSName("$jlt")
  var $jlt: js.UndefOr[js.Any] = js.native
  @JSName("$jlte")
  var $jlte: js.UndefOr[js.Any] = js.native
  @JSName("$keyin")
  var $keyin: js.UndefOr[js.Any] = js.native
  @JSName("$len")
  var $len: js.UndefOr[js.Any] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[js.Any] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[js.Any] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[js.Any] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[js.Any] = js.native
  @JSName("$nkeyin")
  var $nkeyin: js.UndefOr[js.Any] = js.native
  @JSName("$not")
  var $not: js.UndefOr[js.Any] = js.native
  @JSName("$or")
  var $or: js.UndefOr[js.Any] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[js.Any] = js.native
  @JSName("$size")
  var $size: js.UndefOr[js.Any] = js.native
  @JSName("$type")
  var $type: js.UndefOr[js.Any] = js.native
  @JSName("$undefinedin")
  var $undefinedin: js.UndefOr[js.Any] = js.native
  @JSName("$where")
  var $where: js.UndefOr[js.Any] = js.native
}

object YinkeyofLokiOpsany {
  @scala.inline
  def apply(): YinkeyofLokiOpsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YinkeyofLokiOpsany]
  }
  @scala.inline
  implicit class YinkeyofLokiOpsanyOps[Self <: YinkeyofLokiOpsany] (val x: Self) extends AnyVal {
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
    def set$aeq(value: js.Any): Self = this.set("$aeq", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$aeq: Self = this.set("$aeq", js.undefined)
    @scala.inline
    def set$and(value: js.Any): Self = this.set("$and", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    @scala.inline
    def set$between(value: js.Any): Self = this.set("$between", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$between: Self = this.set("$between", js.undefined)
    @scala.inline
    def set$contains(value: js.Any): Self = this.set("$contains", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$contains: Self = this.set("$contains", js.undefined)
    @scala.inline
    def set$containsAny(value: js.Any): Self = this.set("$containsAny", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$containsAny: Self = this.set("$containsAny", js.undefined)
    @scala.inline
    def set$containsNone(value: js.Any): Self = this.set("$containsNone", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$containsNone: Self = this.set("$containsNone", js.undefined)
    @scala.inline
    def set$containsString(value: js.Any): Self = this.set("$containsString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$containsString: Self = this.set("$containsString", js.undefined)
    @scala.inline
    def set$definedin(value: js.Any): Self = this.set("$definedin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$definedin: Self = this.set("$definedin", js.undefined)
    @scala.inline
    def set$dteq(value: js.Any): Self = this.set("$dteq", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$dteq: Self = this.set("$dteq", js.undefined)
    @scala.inline
    def set$eq(value: js.Any): Self = this.set("$eq", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    @scala.inline
    def set$finite(value: js.Any): Self = this.set("$finite", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$finite: Self = this.set("$finite", js.undefined)
    @scala.inline
    def set$gt(value: js.Any): Self = this.set("$gt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    @scala.inline
    def set$gte(value: js.Any): Self = this.set("$gte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    @scala.inline
    def set$in(value: js.Any): Self = this.set("$in", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    @scala.inline
    def set$jbetween(value: js.Any): Self = this.set("$jbetween", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jbetween: Self = this.set("$jbetween", js.undefined)
    @scala.inline
    def set$jgt(value: js.Any): Self = this.set("$jgt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jgt: Self = this.set("$jgt", js.undefined)
    @scala.inline
    def set$jgte(value: js.Any): Self = this.set("$jgte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jgte: Self = this.set("$jgte", js.undefined)
    @scala.inline
    def set$jlt(value: js.Any): Self = this.set("$jlt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jlt: Self = this.set("$jlt", js.undefined)
    @scala.inline
    def set$jlte(value: js.Any): Self = this.set("$jlte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jlte: Self = this.set("$jlte", js.undefined)
    @scala.inline
    def set$keyin(value: js.Any): Self = this.set("$keyin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$keyin: Self = this.set("$keyin", js.undefined)
    @scala.inline
    def set$len(value: js.Any): Self = this.set("$len", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$len: Self = this.set("$len", js.undefined)
    @scala.inline
    def set$lt(value: js.Any): Self = this.set("$lt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    @scala.inline
    def set$lte(value: js.Any): Self = this.set("$lte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    @scala.inline
    def set$ne(value: js.Any): Self = this.set("$ne", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    @scala.inline
    def set$nin(value: js.Any): Self = this.set("$nin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nin: Self = this.set("$nin", js.undefined)
    @scala.inline
    def set$nkeyin(value: js.Any): Self = this.set("$nkeyin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nkeyin: Self = this.set("$nkeyin", js.undefined)
    @scala.inline
    def set$not(value: js.Any): Self = this.set("$not", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    @scala.inline
    def set$or(value: js.Any): Self = this.set("$or", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
    @scala.inline
    def set$regex(value: js.Any): Self = this.set("$regex", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$regex: Self = this.set("$regex", js.undefined)
    @scala.inline
    def set$size(value: js.Any): Self = this.set("$size", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    @scala.inline
    def set$type(value: js.Any): Self = this.set("$type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
    @scala.inline
    def set$undefinedin(value: js.Any): Self = this.set("$undefinedin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$undefinedin: Self = this.set("$undefinedin", js.undefined)
    @scala.inline
    def set$where(value: js.Any): Self = this.set("$where", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$where: Self = this.set("$where", js.undefined)
  }
  
}

