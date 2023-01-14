package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.indySdk.anon.Credid
import typings.indySdk.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndyRequestedCredentials extends StObject {
  
  var requested_attributes: StringDictionary[Credid]
  
  var requested_predicates: StringDictionary[Timestamp]
  
  var self_attested_attributes: StringDictionary[String]
}
object IndyRequestedCredentials {
  
  inline def apply(
    requested_attributes: StringDictionary[Credid],
    requested_predicates: StringDictionary[Timestamp],
    self_attested_attributes: StringDictionary[String]
  ): IndyRequestedCredentials = {
    val __obj = js.Dynamic.literal(requested_attributes = requested_attributes.asInstanceOf[js.Any], requested_predicates = requested_predicates.asInstanceOf[js.Any], self_attested_attributes = self_attested_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndyRequestedCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndyRequestedCredentials] (val x: Self) extends AnyVal {
    
    inline def setRequested_attributes(value: StringDictionary[Credid]): Self = StObject.set(x, "requested_attributes", value.asInstanceOf[js.Any])
    
    inline def setRequested_predicates(value: StringDictionary[Timestamp]): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
    
    inline def setSelf_attested_attributes(value: StringDictionary[String]): Self = StObject.set(x, "self_attested_attributes", value.asInstanceOf[js.Any])
  }
}
