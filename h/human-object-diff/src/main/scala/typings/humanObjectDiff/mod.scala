package typings.humanObjectDiff

import typings.humanObjectDiff.distSentenceMod.default
import typings.humanObjectDiff.distTypesMod.InputDiffConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-object-diff", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DiffEngine {
    def this(config: InputDiffConfig) = this()
    
    /* private */ /* CompleteClass */
    override val config: Any = js.native
    
    /* CompleteClass */
    override def diff(lhs: Any, rhs: Any): js.Array[String] = js.native
    
    /* protected */ /* CompleteClass */
    override val sentenceDiffs: js.Array[default] = js.native
    
    /* protected */ /* CompleteClass */
    override val sentences: js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    override val templates: Any = js.native
  }
  
  trait DiffEngine extends StObject {
    
    /* private */ val config: Any
    
    def diff(lhs: Any, rhs: Any): js.Array[String]
    
    /* protected */ val sentenceDiffs: js.Array[default]
    
    /* protected */ val sentences: js.Array[String]
    
    /* private */ val templates: Any
  }
  object DiffEngine {
    
    inline def apply(
      config: Any,
      diff: (Any, Any) => js.Array[String],
      sentenceDiffs: js.Array[default],
      sentences: js.Array[String],
      templates: Any
    ): DiffEngine = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], diff = js.Any.fromFunction2(diff), sentenceDiffs = sentenceDiffs.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEngine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffEngine] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: (Any, Any) => js.Array[String]): Self = StObject.set(x, "diff", js.Any.fromFunction2(value))
      
      inline def setSentenceDiffs(value: js.Array[default]): Self = StObject.set(x, "sentenceDiffs", value.asInstanceOf[js.Any])
      
      inline def setSentenceDiffsVarargs(value: default*): Self = StObject.set(x, "sentenceDiffs", js.Array(value*))
      
      inline def setSentences(value: js.Array[String]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
      
      inline def setSentencesVarargs(value: String*): Self = StObject.set(x, "sentences", js.Array(value*))
      
      inline def setTemplates(value: Any): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
}
