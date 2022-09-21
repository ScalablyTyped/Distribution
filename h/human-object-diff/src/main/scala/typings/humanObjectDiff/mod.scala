package typings.humanObjectDiff

import typings.humanObjectDiff.anon.RecordTemplateTypestring
import typings.humanObjectDiff.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-object-diff", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DiffEngine {
    def this(config: Options) = this()
    
    /* CompleteClass */
    override val config: RequiredOptions = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    /* CompleteClass */
    override def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[String] = js.native
    
    /* CompleteClass */
    override val sentenceDiffs: js.Array[String] = js.native
    
    /* CompleteClass */
    override val sentences: js.Array[String] = js.native
    
    /* CompleteClass */
    override val templates: RecordTemplateTypestring = js.native
  }
  
  trait DiffEngine extends StObject {
    
    val config: RequiredOptions
    
    // tslint:disable-next-line:no-unnecessary-generics
    def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[String]
    
    val sentenceDiffs: js.Array[String]
    
    val sentences: js.Array[String]
    
    val templates: RecordTemplateTypestring
  }
  object DiffEngine {
    
    inline def apply(
      config: RequiredOptions,
      diff: (Any, Any) => js.Array[String],
      sentenceDiffs: js.Array[String],
      sentences: js.Array[String],
      templates: RecordTemplateTypestring
    ): DiffEngine = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], diff = js.Any.fromFunction2(diff), sentenceDiffs = sentenceDiffs.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEngine]
    }
    
    extension [Self <: DiffEngine](x: Self) {
      
      inline def setConfig(value: RequiredOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: (Any, Any) => js.Array[String]): Self = StObject.set(x, "diff", js.Any.fromFunction2(value))
      
      inline def setSentenceDiffs(value: js.Array[String]): Self = StObject.set(x, "sentenceDiffs", value.asInstanceOf[js.Any])
      
      inline def setSentenceDiffsVarargs(value: String*): Self = StObject.set(x, "sentenceDiffs", js.Array(value*))
      
      inline def setSentences(value: js.Array[String]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
      
      inline def setSentencesVarargs(value: String*): Self = StObject.set(x, "sentences", js.Array(value*))
      
      inline def setTemplates(value: RecordTemplateTypestring): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * @default 'MM/dd/yyyy hh:mm a'
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      */
    var dontHumanizePropertyNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var ignoreArrays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'Obj'
      */
    var objectName: js.UndefOr[String] = js.undefined
    
    var prefilter: js.UndefOr[js.Array[String] | PathPredicate] = js.undefined
    
    /**
      * @default []
      */
    var sensitivePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var templates: js.UndefOr[RecordTemplateTypestring] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNamesUndefined: Self = StObject.set(x, "dontHumanizePropertyNames", js.undefined)
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArraysUndefined: Self = StObject.set(x, "ignoreArrays", js.undefined)
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
      
      inline def setPrefilter(value: js.Array[String] | PathPredicate): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[String | Double], /* key */ String | Double) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
      
      inline def setPrefilterVarargs(value: String*): Self = StObject.set(x, "prefilter", js.Array(value*))
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsUndefined: Self = StObject.set(x, "sensitivePaths", js.undefined)
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
      
      inline def setTemplates(value: RecordTemplateTypestring): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    }
  }
  
  type PathPredicate = js.Function2[/* path */ js.Array[String | Double], /* key */ String | Double, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanObjectDiff.humanObjectDiffStrings.N
    - typings.humanObjectDiff.humanObjectDiffStrings.D
    - typings.humanObjectDiff.humanObjectDiffStrings.E
    - typings.humanObjectDiff.humanObjectDiffStrings.I
    - typings.humanObjectDiff.humanObjectDiffStrings.R
    - typings.humanObjectDiff.humanObjectDiffStrings.AE
    - typings.humanObjectDiff.humanObjectDiffStrings.NS
    - typings.humanObjectDiff.humanObjectDiffStrings.DS
    - typings.humanObjectDiff.humanObjectDiffStrings.ES
    - typings.humanObjectDiff.humanObjectDiffStrings.IS
    - typings.humanObjectDiff.humanObjectDiffStrings.RS
    - typings.humanObjectDiff.humanObjectDiffStrings.AES
  */
  trait TemplateType extends StObject
  object TemplateType {
    
    inline def AE: typings.humanObjectDiff.humanObjectDiffStrings.AE = "AE".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.AE]
    
    inline def AES: typings.humanObjectDiff.humanObjectDiffStrings.AES = "AES".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.AES]
    
    inline def D: typings.humanObjectDiff.humanObjectDiffStrings.D = "D".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.D]
    
    inline def DS: typings.humanObjectDiff.humanObjectDiffStrings.DS = "DS".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.DS]
    
    inline def E: typings.humanObjectDiff.humanObjectDiffStrings.E = "E".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.E]
    
    inline def ES: typings.humanObjectDiff.humanObjectDiffStrings.ES = "ES".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.ES]
    
    inline def I: typings.humanObjectDiff.humanObjectDiffStrings.I = "I".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.I]
    
    inline def IS: typings.humanObjectDiff.humanObjectDiffStrings.IS = "IS".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.IS]
    
    inline def N: typings.humanObjectDiff.humanObjectDiffStrings.N = "N".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.N]
    
    inline def NS: typings.humanObjectDiff.humanObjectDiffStrings.NS = "NS".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.NS]
    
    inline def R: typings.humanObjectDiff.humanObjectDiffStrings.R = "R".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.R]
    
    inline def RS: typings.humanObjectDiff.humanObjectDiffStrings.RS = "RS".asInstanceOf[typings.humanObjectDiff.humanObjectDiffStrings.RS]
  }
}
