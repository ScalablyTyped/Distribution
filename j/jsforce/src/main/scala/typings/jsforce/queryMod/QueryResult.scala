package typings.jsforce.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult[T] extends js.Object {
  
  var done: Boolean = js.native
  
  var nextRecordsUrl: js.UndefOr[String] = js.native
  
  var records: js.Array[T] = js.native
  
  var totalSize: Double = js.native
}
object QueryResult {
  
  @scala.inline
  def apply[T](done: Boolean, records: js.Array[T], totalSize: Double): QueryResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[T]]
  }
  
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult[_], T] (val x: Self with QueryResult[T]) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: T*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[T]): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRecordsUrl(value: String): Self = this.set("nextRecordsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRecordsUrl: Self = this.set("nextRecordsUrl", js.undefined)
  }
}
