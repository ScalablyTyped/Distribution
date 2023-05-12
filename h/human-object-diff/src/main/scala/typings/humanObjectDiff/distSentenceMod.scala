package typings.humanObjectDiff

import typings.humanObjectDiff.anon.AE
import typings.humanObjectDiff.distEngineUtilsArrayPreprocessorMod.Change
import typings.humanObjectDiff.distTypesMod.DiffConfigWithoutTemplates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSentenceMod {
  
  @JSImport("human-object-diff/dist/sentence", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DiffSentence {
    def this(diff: String, config: DiffConfigWithoutTemplates, templates: AE) = this()
    def this(
      diff: typings.humanObjectDiff.distDiffMod.default,
      config: DiffConfigWithoutTemplates,
      templates: AE
    ) = this()
    def this(diff: Change, config: DiffConfigWithoutTemplates, templates: AE) = this()
    
    /* private */ /* CompleteClass */
    override val DOTPATH: Any = js.native
    
    /* private */ /* CompleteClass */
    override val FIELD: Any = js.native
    
    /* private */ /* CompleteClass */
    override val INDEX: Any = js.native
    
    /* private */ /* CompleteClass */
    override val NEWVALUE: Any = js.native
    
    /* private */ /* CompleteClass */
    override val OLDVALUE: Any = js.native
    
    /* private */ /* CompleteClass */
    override val POSITION: Any = js.native
    
    /* private */ /* CompleteClass */
    override val diff: Any = js.native
    
    /* CompleteClass */
    override def format(): String = js.native
    
    /* CompleteClass */
    override def getTemplate(param0: DiffContext): String = js.native
    
    /* private */ /* CompleteClass */
    var getTemplateKey: Any = js.native
    
    /* private */ /* CompleteClass */
    override val template: Any = js.native
  }
  
  trait DiffContext extends StObject {
    
    var config: DiffConfigWithoutTemplates
    
    var diff: String | Change | typings.humanObjectDiff.distDiffMod.default
    
    var templates: AE
  }
  object DiffContext {
    
    inline def apply(
      config: DiffConfigWithoutTemplates,
      diff: String | Change | typings.humanObjectDiff.distDiffMod.default,
      templates: AE
    ): DiffContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffContext] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: DiffConfigWithoutTemplates): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: String | Change | typings.humanObjectDiff.distDiffMod.default): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: AE): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffSentence extends StObject {
    
    /* private */ val DOTPATH: Any
    
    /* private */ val FIELD: Any
    
    /* private */ val INDEX: Any
    
    /* private */ val NEWVALUE: Any
    
    /* private */ val OLDVALUE: Any
    
    /* private */ val POSITION: Any
    
    /* private */ val diff: Any
    
    def format(): String
    
    def getTemplate(param0: DiffContext): String
    
    /* private */ var getTemplateKey: Any
    
    /* private */ val template: Any
  }
  object DiffSentence {
    
    inline def apply(
      DOTPATH: Any,
      FIELD: Any,
      INDEX: Any,
      NEWVALUE: Any,
      OLDVALUE: Any,
      POSITION: Any,
      diff: Any,
      format: () => String,
      getTemplate: DiffContext => String,
      getTemplateKey: Any,
      template: Any
    ): DiffSentence = {
      val __obj = js.Dynamic.literal(DOTPATH = DOTPATH.asInstanceOf[js.Any], FIELD = FIELD.asInstanceOf[js.Any], INDEX = INDEX.asInstanceOf[js.Any], NEWVALUE = NEWVALUE.asInstanceOf[js.Any], OLDVALUE = OLDVALUE.asInstanceOf[js.Any], POSITION = POSITION.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], format = js.Any.fromFunction0(format), getTemplate = js.Any.fromFunction1(getTemplate), getTemplateKey = getTemplateKey.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffSentence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffSentence] (val x: Self) extends AnyVal {
      
      inline def setDOTPATH(value: Any): Self = StObject.set(x, "DOTPATH", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: Any): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setFIELD(value: Any): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
      
      inline def setGetTemplate(value: DiffContext => String): Self = StObject.set(x, "getTemplate", js.Any.fromFunction1(value))
      
      inline def setGetTemplateKey(value: Any): Self = StObject.set(x, "getTemplateKey", value.asInstanceOf[js.Any])
      
      inline def setINDEX(value: Any): Self = StObject.set(x, "INDEX", value.asInstanceOf[js.Any])
      
      inline def setNEWVALUE(value: Any): Self = StObject.set(x, "NEWVALUE", value.asInstanceOf[js.Any])
      
      inline def setOLDVALUE(value: Any): Self = StObject.set(x, "OLDVALUE", value.asInstanceOf[js.Any])
      
      inline def setPOSITION(value: Any): Self = StObject.set(x, "POSITION", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
