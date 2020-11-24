package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Derivatives extends js.Object {
  
  var derivatives: js.UndefOr[js.Array[Source]] = js.native
  
  var examples: js.UndefOr[js.Array[Source]] = js.native
  
  var senses: js.UndefOr[js.Array[Conjugations]] = js.native
  
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[Attribution] = js.native
}
object Derivatives {
  
  @scala.inline
  def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  
  @scala.inline
  implicit class DerivativesOps[Self <: Derivatives] (val x: Self) extends AnyVal {
    
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
    def setDerivativesVarargs(value: Source*): Self = this.set("derivatives", js.Array(value :_*))
    
    @scala.inline
    def setDerivatives(value: js.Array[Source]): Self = this.set("derivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDerivatives: Self = this.set("derivatives", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: Source*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[Source]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setSensesVarargs(value: Conjugations*): Self = this.set("senses", js.Array(value :_*))
    
    @scala.inline
    def setSenses(value: js.Array[Conjugations]): Self = this.set("senses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenses: Self = this.set("senses", js.undefined)
    
    @scala.inline
    def setSource(value: Attribution): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
