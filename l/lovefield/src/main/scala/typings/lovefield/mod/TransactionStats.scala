package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionStats extends StObject {
  
  def changedTableCount(): Double
  
  def deletedRowCount(): Double
  
  def insertedRowCount(): Double
  
  def success(): Boolean
  
  def updatedRowCount(): Double
}
object TransactionStats {
  
  @scala.inline
  def apply(
    changedTableCount: () => Double,
    deletedRowCount: () => Double,
    insertedRowCount: () => Double,
    success: () => Boolean,
    updatedRowCount: () => Double
  ): TransactionStats = {
    val __obj = js.Dynamic.literal(changedTableCount = js.Any.fromFunction0(changedTableCount), deletedRowCount = js.Any.fromFunction0(deletedRowCount), insertedRowCount = js.Any.fromFunction0(insertedRowCount), success = js.Any.fromFunction0(success), updatedRowCount = js.Any.fromFunction0(updatedRowCount))
    __obj.asInstanceOf[TransactionStats]
  }
  
  @scala.inline
  implicit class TransactionStatsMutableBuilder[Self <: TransactionStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedTableCount(value: () => Double): Self = StObject.set(x, "changedTableCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeletedRowCount(value: () => Double): Self = StObject.set(x, "deletedRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertedRowCount(value: () => Double): Self = StObject.set(x, "insertedRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccess(value: () => Boolean): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdatedRowCount(value: () => Double): Self = StObject.set(x, "updatedRowCount", js.Any.fromFunction0(value))
  }
}
