package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Batches extends StObject {
  
  var batches: Double = js.native
  
  var updated: Double = js.native
}
object Batches {
  
  @scala.inline
  def apply(batches: Double, updated: Double): Batches = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batches]
  }
  
  @scala.inline
  implicit class BatchesMutableBuilder[Self <: Batches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatches(value: Double): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
