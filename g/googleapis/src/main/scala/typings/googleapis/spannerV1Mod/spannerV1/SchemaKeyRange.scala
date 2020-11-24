package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KeyRange represents a range of rows in a table or index.  A range has a
  * start key and an end key. These keys can be open or closed, indicating if
  * the range includes rows with that key.  Keys are represented by lists,
  * where the ith value in the list corresponds to the ith component of the
  * table or index primary key. Individual values are encoded as described
  * here.  For example, consider the following table definition:      CREATE
  * TABLE UserEvents (       UserName STRING(MAX),       EventDate STRING(10)
  * ) PRIMARY KEY(UserName, EventDate);  The following keys name rows in this
  * table:      &quot;Bob&quot;, &quot;2014-09-23&quot;  Since the `UserEvents`
  * table&#39;s `PRIMARY KEY` clause names two columns, each `UserEvents` key
  * has two elements; the first is the `UserName`, and the second is the
  * `EventDate`.  Key ranges with multiple components are interpreted
  * lexicographically by component using the table or index key&#39;s declared
  * sort order. For example, the following range returns all events for user
  * `&quot;Bob&quot;` that occurred in the year 2015: &quot;start_closed&quot;:
  * [&quot;Bob&quot;, &quot;2015-01-01&quot;]     &quot;end_closed&quot;:
  * [&quot;Bob&quot;, &quot;2015-12-31&quot;]  Start and end keys can omit
  * trailing key components. This affects the inclusion and exclusion of rows
  * that exactly match the provided key components: if the key is closed, then
  * rows that exactly match the provided components are included; if the key is
  * open, then rows that exactly match are not included.  For example, the
  * following range includes all events for `&quot;Bob&quot;` that occurred
  * during and after the year 2000:      &quot;start_closed&quot;:
  * [&quot;Bob&quot;, &quot;2000-01-01&quot;]     &quot;end_closed&quot;:
  * [&quot;Bob&quot;]  The next example retrieves all events for
  * `&quot;Bob&quot;`:      &quot;start_closed&quot;: [&quot;Bob&quot;]
  * &quot;end_closed&quot;: [&quot;Bob&quot;]  To retrieve events before the
  * year 2000:      &quot;start_closed&quot;: [&quot;Bob&quot;]
  * &quot;end_open&quot;: [&quot;Bob&quot;, &quot;2000-01-01&quot;]  The
  * following range includes all rows in the table: &quot;start_closed&quot;:
  * []     &quot;end_closed&quot;: []  This range returns all users whose
  * `UserName` begins with any character from A to C: &quot;start_closed&quot;:
  * [&quot;A&quot;]     &quot;end_open&quot;: [&quot;D&quot;]  This range
  * returns all users whose `UserName` begins with B: &quot;start_closed&quot;:
  * [&quot;B&quot;]     &quot;end_open&quot;: [&quot;C&quot;]  Key ranges honor
  * column sort order. For example, suppose a table is defined as follows:
  * CREATE TABLE DescendingSortedTable {       Key INT64,       ...     )
  * PRIMARY KEY(Key DESC);  The following range retrieves all rows with key
  * values between 1 and 100 inclusive:      &quot;start_closed&quot;:
  * [&quot;100&quot;]     &quot;end_closed&quot;: [&quot;1&quot;]  Note that
  * 100 is passed as the start, and 1 is passed as the end, because `Key` is a
  * descending column in the schema.
  */
@js.native
trait SchemaKeyRange extends js.Object {
  
  /**
    * If the end is closed, then the range includes all rows whose first
    * `len(end_closed)` key columns exactly match `end_closed`.
    */
  var endClosed: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * If the end is open, then the range excludes rows whose first
    * `len(end_open)` key columns exactly match `end_open`.
    */
  var endOpen: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * If the start is closed, then the range includes all rows whose first
    * `len(start_closed)` key columns exactly match `start_closed`.
    */
  var startClosed: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * If the start is open, then the range excludes rows whose first
    * `len(start_open)` key columns exactly match `start_open`.
    */
  var startOpen: js.UndefOr[js.Array[_]] = js.native
}
object SchemaKeyRange {
  
  @scala.inline
  def apply(): SchemaKeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRange]
  }
  
  @scala.inline
  implicit class SchemaKeyRangeOps[Self <: SchemaKeyRange] (val x: Self) extends AnyVal {
    
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
    def setEndClosedVarargs(value: js.Any*): Self = this.set("endClosed", js.Array(value :_*))
    
    @scala.inline
    def setEndClosed(value: js.Array[_]): Self = this.set("endClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndClosed: Self = this.set("endClosed", js.undefined)
    
    @scala.inline
    def setEndOpenVarargs(value: js.Any*): Self = this.set("endOpen", js.Array(value :_*))
    
    @scala.inline
    def setEndOpen(value: js.Array[_]): Self = this.set("endOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOpen: Self = this.set("endOpen", js.undefined)
    
    @scala.inline
    def setStartClosedVarargs(value: js.Any*): Self = this.set("startClosed", js.Array(value :_*))
    
    @scala.inline
    def setStartClosed(value: js.Array[_]): Self = this.set("startClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartClosed: Self = this.set("startClosed", js.undefined)
    
    @scala.inline
    def setStartOpenVarargs(value: js.Any*): Self = this.set("startOpen", js.Array(value :_*))
    
    @scala.inline
    def setStartOpen(value: js.Array[_]): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
  }
}
