package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VName extends StObject {
  
  var corpus: String = js.native
  
  var language: String = js.native
  
  var path: String = js.native
  
  var root: String = js.native
  
  var signature: String = js.native
}
object VName {
  
  @scala.inline
  def apply(corpus: String, language: String, path: String, root: String, signature: String): VName = {
    val __obj = js.Dynamic.literal(corpus = corpus.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[VName]
  }
  
  @scala.inline
  implicit class VNameMutableBuilder[Self <: VName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
