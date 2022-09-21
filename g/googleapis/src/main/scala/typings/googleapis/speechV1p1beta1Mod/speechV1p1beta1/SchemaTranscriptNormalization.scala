package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranscriptNormalization extends StObject {
  
  /**
    * A list of replacement entries. We will perform replacement with one entry at a time. For example, the second entry in ["cat" =\> "dog", "mountain cat" =\> "mountain dog"] will never be applied because we will always process the first entry before it. At most 100 entries.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.undefined
}
object SchemaTranscriptNormalization {
  
  inline def apply(): SchemaTranscriptNormalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranscriptNormalization]
  }
  
  extension [Self <: SchemaTranscriptNormalization](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
