package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSummary extends StObject {
  
  var added: Double
  
  var didUpdate: Boolean
  
  var failure: Boolean
  
  var filesAdded: Double
  
  var filesRemoved: Double
  
  var filesRemovedList: js.Array[String]
  
  var filesUnmatched: Double
  
  var filesUpdated: Double
  
  var matched: Double
  
  var total: Double
  
  var unchecked: Double
  
  var uncheckedKeysByFile: js.Array[UncheckedSnapshot]
  
  var unmatched: Double
  
  var updated: Double
}
object SnapshotSummary {
  
  @scala.inline
  def apply(
    added: Double,
    didUpdate: Boolean,
    failure: Boolean,
    filesAdded: Double,
    filesRemoved: Double,
    filesRemovedList: js.Array[String],
    filesUnmatched: Double,
    filesUpdated: Double,
    matched: Double,
    total: Double,
    unchecked: Double,
    uncheckedKeysByFile: js.Array[UncheckedSnapshot],
    unmatched: Double,
    updated: Double
  ): SnapshotSummary = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], didUpdate = didUpdate.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any], filesUnmatched = filesUnmatched.asInstanceOf[js.Any], filesUpdated = filesUpdated.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeysByFile = uncheckedKeysByFile.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSummary]
  }
  
  @scala.inline
  implicit class SnapshotSummaryMutableBuilder[Self <: SnapshotSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidUpdate(value: Boolean): Self = StObject.set(x, "didUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure(value: Boolean): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesAdded(value: Double): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesRemoved(value: Double): Self = StObject.set(x, "filesRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesRemovedList(value: js.Array[String]): Self = StObject.set(x, "filesRemovedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesRemovedListVarargs(value: String*): Self = StObject.set(x, "filesRemovedList", js.Array(value :_*))
    
    @scala.inline
    def setFilesUnmatched(value: Double): Self = StObject.set(x, "filesUnmatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUpdated(value: Double): Self = StObject.set(x, "filesUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnchecked(value: Double): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedKeysByFile(value: js.Array[UncheckedSnapshot]): Self = StObject.set(x, "uncheckedKeysByFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedKeysByFileVarargs(value: UncheckedSnapshot*): Self = StObject.set(x, "uncheckedKeysByFile", js.Array(value :_*))
    
    @scala.inline
    def setUnmatched(value: Double): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
