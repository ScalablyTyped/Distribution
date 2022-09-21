package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaToken extends StObject {
  
  /**
    * Dependency tree parse for this token.
    */
  var dependencyEdge: js.UndefOr[SchemaDependencyEdge] = js.undefined
  
  /**
    * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
    */
  var lemma: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parts of speech tag for this token.
    */
  var partOfSpeech: js.UndefOr[SchemaPartOfSpeech] = js.undefined
  
  /**
    * The token text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.undefined
}
object SchemaToken {
  
  inline def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  
  extension [Self <: SchemaToken](x: Self) {
    
    inline def setDependencyEdge(value: SchemaDependencyEdge): Self = StObject.set(x, "dependencyEdge", value.asInstanceOf[js.Any])
    
    inline def setDependencyEdgeUndefined: Self = StObject.set(x, "dependencyEdge", js.undefined)
    
    inline def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    inline def setLemmaNull: Self = StObject.set(x, "lemma", null)
    
    inline def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    inline def setPartOfSpeech(value: SchemaPartOfSpeech): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    inline def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    inline def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
