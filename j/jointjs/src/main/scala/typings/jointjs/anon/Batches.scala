package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batches extends StObject {
  
  var batches: Double
  
  var updated: Double
}
object Batches {
  
  inline def apply(batches: Double, updated: Double): Batches = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batches]
  }
  
  extension [Self <: Batches](x: Self) {
    
    inline def setBatches(value: Double): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
