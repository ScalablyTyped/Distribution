package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSideInputInfo extends StObject {
  
  /**
    * How to interpret the source element(s) as a side input value.
    */
  var kind: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The source(s) to read element(s) from to get the value of this side input. If more than one source, then the elements are taken from the sources, in the specified order if order matters. At least one source is required.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.undefined
  
  /**
    * The id of the tag the user code will access this side input by; this should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaSideInputInfo {
  
  inline def apply(): SchemaSideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSideInputInfo]
  }
  
  extension [Self <: SchemaSideInputInfo](x: Self) {
    
    inline def setKind(value: StringDictionary[Any]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
