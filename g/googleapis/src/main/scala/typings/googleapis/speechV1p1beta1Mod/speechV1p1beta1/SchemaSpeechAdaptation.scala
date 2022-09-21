package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpeechAdaptation extends StObject {
  
  /**
    * A collection of custom classes. To specify the classes inline, leave the class' `name` blank and fill in the rest of its fields, giving it a unique `custom_class_id`. Refer to the inline defined class in phrase hints by its `custom_class_id`.
    */
  var customClasses: js.UndefOr[js.Array[SchemaCustomClass]] = js.undefined
  
  /**
    * A collection of phrase set resource names to use.
    */
  var phraseSetReferences: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A collection of phrase sets. To specify the hints inline, leave the phrase set's `name` blank and fill in the rest of its fields. Any phrase set can use any custom class.
    */
  var phraseSets: js.UndefOr[js.Array[SchemaPhraseSet]] = js.undefined
}
object SchemaSpeechAdaptation {
  
  inline def apply(): SchemaSpeechAdaptation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeechAdaptation]
  }
  
  extension [Self <: SchemaSpeechAdaptation](x: Self) {
    
    inline def setCustomClasses(value: js.Array[SchemaCustomClass]): Self = StObject.set(x, "customClasses", value.asInstanceOf[js.Any])
    
    inline def setCustomClassesUndefined: Self = StObject.set(x, "customClasses", js.undefined)
    
    inline def setCustomClassesVarargs(value: SchemaCustomClass*): Self = StObject.set(x, "customClasses", js.Array(value*))
    
    inline def setPhraseSetReferences(value: js.Array[String]): Self = StObject.set(x, "phraseSetReferences", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetReferencesNull: Self = StObject.set(x, "phraseSetReferences", null)
    
    inline def setPhraseSetReferencesUndefined: Self = StObject.set(x, "phraseSetReferences", js.undefined)
    
    inline def setPhraseSetReferencesVarargs(value: String*): Self = StObject.set(x, "phraseSetReferences", js.Array(value*))
    
    inline def setPhraseSets(value: js.Array[SchemaPhraseSet]): Self = StObject.set(x, "phraseSets", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetsUndefined: Self = StObject.set(x, "phraseSets", js.undefined)
    
    inline def setPhraseSetsVarargs(value: SchemaPhraseSet*): Self = StObject.set(x, "phraseSets", js.Array(value*))
  }
}
