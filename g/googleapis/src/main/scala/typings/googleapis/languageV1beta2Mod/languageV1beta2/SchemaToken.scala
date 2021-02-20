package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the smallest syntactic building block of the text.
  */
@js.native
trait SchemaToken extends StObject {
  
  /**
    * Dependency tree parse for this token.
    */
  var dependencyEdge: js.UndefOr[SchemaDependencyEdge] = js.native
  
  /**
    * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the
    * token.
    */
  var lemma: js.UndefOr[String] = js.native
  
  /**
    * Parts of speech tag for this token.
    */
  var partOfSpeech: js.UndefOr[SchemaPartOfSpeech] = js.native
  
  /**
    * The token text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
}
object SchemaToken {
  
  @scala.inline
  def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  
  @scala.inline
  implicit class SchemaTokenMutableBuilder[Self <: SchemaToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencyEdge(value: SchemaDependencyEdge): Self = StObject.set(x, "dependencyEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyEdgeUndefined: Self = StObject.set(x, "dependencyEdge", js.undefined)
    
    @scala.inline
    def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: SchemaPartOfSpeech): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
