package typings.humanObjectDiff

import typings.deepDiff.mod.PreFilter
import typings.humanObjectDiff.anon.AE
import typings.humanObjectDiff.anon.PartialNstringDstringEstr
import typings.humanObjectDiff.distSentenceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait DefaultDiffConfig extends StObject {
    
    var dateFormat: String
    
    var dontHumanizePropertyNames: Boolean
    
    var ignoreArrays: Boolean
    
    var objectName: String
    
    var sensitivePaths: js.Array[String]
    
    var templates: AE
  }
  object DefaultDiffConfig {
    
    inline def apply(
      dateFormat: String,
      dontHumanizePropertyNames: Boolean,
      ignoreArrays: Boolean,
      objectName: String,
      sensitivePaths: js.Array[String],
      templates: AE
    ): DefaultDiffConfig = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dontHumanizePropertyNames = dontHumanizePropertyNames.asInstanceOf[js.Any], ignoreArrays = ignoreArrays.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], sensitivePaths = sensitivePaths.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultDiffConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultDiffConfig] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
      
      inline def setTemplates(value: AE): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffConfig
    extends StObject
       with DefaultDiffConfig {
    
    var prefilter: js.UndefOr[PreFilter[Any, Any]] = js.undefined
  }
  object DiffConfig {
    
    inline def apply(
      dateFormat: String,
      dontHumanizePropertyNames: Boolean,
      ignoreArrays: Boolean,
      objectName: String,
      sensitivePaths: js.Array[String],
      templates: AE
    ): DiffConfig = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dontHumanizePropertyNames = dontHumanizePropertyNames.asInstanceOf[js.Any], ignoreArrays = ignoreArrays.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], sensitivePaths = sensitivePaths.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffConfig] (val x: Self) extends AnyVal {
      
      inline def setPrefilter(value: PreFilter[Any, Any]): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[Any], /* key */ Any) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
    }
  }
  
  /* Inlined std.Omit<human-object-diff.human-object-diff/dist/types.DiffConfig, 'templates'> */
  trait DiffConfigWithoutTemplates extends StObject {
    
    var dateFormat: String
    
    var dontHumanizePropertyNames: Boolean
    
    var ignoreArrays: Boolean
    
    var objectName: String
    
    var prefilter: js.UndefOr[PreFilter[Any, Any]] = js.undefined
    
    var sensitivePaths: js.Array[String]
  }
  object DiffConfigWithoutTemplates {
    
    inline def apply(
      dateFormat: String,
      dontHumanizePropertyNames: Boolean,
      ignoreArrays: Boolean,
      objectName: String,
      sensitivePaths: js.Array[String]
    ): DiffConfigWithoutTemplates = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dontHumanizePropertyNames = dontHumanizePropertyNames.asInstanceOf[js.Any], ignoreArrays = ignoreArrays.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], sensitivePaths = sensitivePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffConfigWithoutTemplates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffConfigWithoutTemplates] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setPrefilter(value: PreFilter[Any, Any]): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[Any], /* key */ Any) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
    }
  }
  
  trait DiffEngineContext extends StObject {
    
    var config: DiffConfigWithoutTemplates
    
    var sentenceDiffs: js.Array[default]
    
    var sentences: js.Array[String]
    
    var templates: AE
  }
  object DiffEngineContext {
    
    inline def apply(
      config: DiffConfigWithoutTemplates,
      sentenceDiffs: js.Array[default],
      sentences: js.Array[String],
      templates: AE
    ): DiffEngineContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], sentenceDiffs = sentenceDiffs.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEngineContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffEngineContext] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: DiffConfigWithoutTemplates): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setSentenceDiffs(value: js.Array[default]): Self = StObject.set(x, "sentenceDiffs", value.asInstanceOf[js.Any])
      
      inline def setSentenceDiffsVarargs(value: default*): Self = StObject.set(x, "sentenceDiffs", js.Array(value*))
      
      inline def setSentences(value: js.Array[String]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
      
      inline def setSentencesVarargs(value: String*): Self = StObject.set(x, "sentences", js.Array(value*))
      
      inline def setTemplates(value: AE): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  dateFormat :human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['dateFormat'],   objectName :human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['objectName'],   ignoreArrays :human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['ignoreArrays'],   sensitivePaths :human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['sensitivePaths'],   dontHumanizePropertyNames :human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['dontHumanizePropertyNames'],   templates :std.Partial<human-object-diff.human-object-diff/dist/types.DefaultDiffConfig['templates']>,   prefilter :deep-diff.deep-diff.PreFilter<unknown, unknown> | undefined}> */
  trait InputDiffConfig extends StObject {
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dontHumanizePropertyNames: js.UndefOr[Boolean] = js.undefined
    
    var ignoreArrays: js.UndefOr[Boolean] = js.undefined
    
    var objectName: js.UndefOr[String] = js.undefined
    
    var prefilter: js.UndefOr[PreFilter[Any, Any]] = js.undefined
    
    var sensitivePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var templates: js.UndefOr[PartialNstringDstringEstr] = js.undefined
  }
  object InputDiffConfig {
    
    inline def apply(): InputDiffConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputDiffConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputDiffConfig] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNamesUndefined: Self = StObject.set(x, "dontHumanizePropertyNames", js.undefined)
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArraysUndefined: Self = StObject.set(x, "ignoreArrays", js.undefined)
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
      
      inline def setPrefilter(value: PreFilter[Any, Any]): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[Any], /* key */ Any) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsUndefined: Self = StObject.set(x, "sensitivePaths", js.undefined)
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
      
      inline def setTemplates(value: PartialNstringDstringEstr): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    }
  }
}
