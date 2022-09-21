package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreatePhraseSetRequest extends StObject {
  
  /**
    * Required. The phrase set to create.
    */
  var phraseSet: js.UndefOr[SchemaPhraseSet] = js.undefined
  
  /**
    * Required. The ID to use for the phrase set, which will become the final component of the phrase set's resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
    */
  var phraseSetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreatePhraseSetRequest {
  
  inline def apply(): SchemaCreatePhraseSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreatePhraseSetRequest]
  }
  
  extension [Self <: SchemaCreatePhraseSetRequest](x: Self) {
    
    inline def setPhraseSet(value: SchemaPhraseSet): Self = StObject.set(x, "phraseSet", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetId(value: String): Self = StObject.set(x, "phraseSetId", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetIdNull: Self = StObject.set(x, "phraseSetId", null)
    
    inline def setPhraseSetIdUndefined: Self = StObject.set(x, "phraseSetId", js.undefined)
    
    inline def setPhraseSetUndefined: Self = StObject.set(x, "phraseSet", js.undefined)
  }
}
