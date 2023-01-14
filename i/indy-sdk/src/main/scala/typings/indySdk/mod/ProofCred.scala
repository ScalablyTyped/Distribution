package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.indySdk.anon.Credinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofCred extends StObject {
  
  var requested_attrs: StringDictionary[js.Array[IndyCredential]]
  
  var requested_predicates: StringDictionary[js.Array[Credinfo]]
}
object ProofCred {
  
  inline def apply(
    requested_attrs: StringDictionary[js.Array[IndyCredential]],
    requested_predicates: StringDictionary[js.Array[Credinfo]]
  ): ProofCred = {
    val __obj = js.Dynamic.literal(requested_attrs = requested_attrs.asInstanceOf[js.Any], requested_predicates = requested_predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofCred]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProofCred] (val x: Self) extends AnyVal {
    
    inline def setRequested_attrs(value: StringDictionary[js.Array[IndyCredential]]): Self = StObject.set(x, "requested_attrs", value.asInstanceOf[js.Any])
    
    inline def setRequested_predicates(value: StringDictionary[js.Array[Credinfo]]): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
  }
}
