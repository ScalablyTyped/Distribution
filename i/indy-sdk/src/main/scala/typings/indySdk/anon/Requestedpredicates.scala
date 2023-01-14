package typings.indySdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestedpredicates extends StObject {
  
  var requested_predicates: StringDictionary[SubproofindexNumber]
  
  var revealed_attr_groups: StringDictionary[Subproofindex]
  
  var revealed_attrs: StringDictionary[Encoded]
  
  var self_attested_attrs: StringDictionary[String]
  
  var unrevealed_attrs: StringDictionary[SubproofindexNumber]
}
object Requestedpredicates {
  
  inline def apply(
    requested_predicates: StringDictionary[SubproofindexNumber],
    revealed_attr_groups: StringDictionary[Subproofindex],
    revealed_attrs: StringDictionary[Encoded],
    self_attested_attrs: StringDictionary[String],
    unrevealed_attrs: StringDictionary[SubproofindexNumber]
  ): Requestedpredicates = {
    val __obj = js.Dynamic.literal(requested_predicates = requested_predicates.asInstanceOf[js.Any], revealed_attr_groups = revealed_attr_groups.asInstanceOf[js.Any], revealed_attrs = revealed_attrs.asInstanceOf[js.Any], self_attested_attrs = self_attested_attrs.asInstanceOf[js.Any], unrevealed_attrs = unrevealed_attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requestedpredicates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requestedpredicates] (val x: Self) extends AnyVal {
    
    inline def setRequested_predicates(value: StringDictionary[SubproofindexNumber]): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
    
    inline def setRevealed_attr_groups(value: StringDictionary[Subproofindex]): Self = StObject.set(x, "revealed_attr_groups", value.asInstanceOf[js.Any])
    
    inline def setRevealed_attrs(value: StringDictionary[Encoded]): Self = StObject.set(x, "revealed_attrs", value.asInstanceOf[js.Any])
    
    inline def setSelf_attested_attrs(value: StringDictionary[String]): Self = StObject.set(x, "self_attested_attrs", value.asInstanceOf[js.Any])
    
    inline def setUnrevealed_attrs(value: StringDictionary[SubproofindexNumber]): Self = StObject.set(x, "unrevealed_attrs", value.asInstanceOf[js.Any])
  }
}
