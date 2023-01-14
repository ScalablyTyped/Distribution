package typings.indySdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subproofindex extends StObject {
  
  var sub_proof_index: Double
  
  var values: StringDictionary[Raw]
}
object Subproofindex {
  
  inline def apply(sub_proof_index: Double, values: StringDictionary[Raw]): Subproofindex = {
    val __obj = js.Dynamic.literal(sub_proof_index = sub_proof_index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subproofindex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subproofindex] (val x: Self) extends AnyVal {
    
    inline def setSub_proof_index(value: Double): Self = StObject.set(x, "sub_proof_index", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringDictionary[Raw]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
