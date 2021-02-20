package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents dependency parse tree information for a token. (For more
  * information on dependency labels, see
  * http://www.aclweb.org/anthology/P13-2017
  */
@js.native
trait SchemaDependencyEdge extends StObject {
  
  /**
    * Represents the head of this token in the dependency tree. This is the
    * index of the token which has an arc going to this token. The index is the
    * position of the token in the array of tokens returned by the API method.
    * If this token is a root token, then the `head_token_index` is its own
    * index.
    */
  var headTokenIndex: js.UndefOr[Double] = js.native
  
  /**
    * The parse label for the token.
    */
  var label: js.UndefOr[String] = js.native
}
object SchemaDependencyEdge {
  
  @scala.inline
  def apply(): SchemaDependencyEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDependencyEdge]
  }
  
  @scala.inline
  implicit class SchemaDependencyEdgeMutableBuilder[Self <: SchemaDependencyEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadTokenIndex(value: Double): Self = StObject.set(x, "headTokenIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadTokenIndexUndefined: Self = StObject.set(x, "headTokenIndex", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
