package typings.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the smallest syntactic building block of the text.
  */
@js.native
trait SchemaToken extends js.Object {
  
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
  implicit class SchemaTokenOps[Self <: SchemaToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependencyEdge(value: SchemaDependencyEdge): Self = this.set("dependencyEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyEdge: Self = this.set("dependencyEdge", js.undefined)
    
    @scala.inline
    def setLemma(value: String): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLemma: Self = this.set("lemma", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: SchemaPartOfSpeech): Self = this.set("partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOfSpeech: Self = this.set("partOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextSpan): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
