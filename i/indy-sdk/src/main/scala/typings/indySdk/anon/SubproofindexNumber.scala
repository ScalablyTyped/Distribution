package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubproofindexNumber extends StObject {
  
  var sub_proof_index: Double
}
object SubproofindexNumber {
  
  inline def apply(sub_proof_index: Double): SubproofindexNumber = {
    val __obj = js.Dynamic.literal(sub_proof_index = sub_proof_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubproofindexNumber]
  }
  
  extension [Self <: SubproofindexNumber](x: Self) {
    
    inline def setSub_proof_index(value: Double): Self = StObject.set(x, "sub_proof_index", value.asInstanceOf[js.Any])
  }
}
