package typings.lezerGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.distTreeMod.NodePropSource
import typings.lezerCommon.mod.NodeProp
import typings.lezerGenerator.anon.Parser
import typings.lezerLr.mod.ContextTracker
import typings.lezerLr.mod.ExternalTokenizer
import typings.lezerLr.mod.LRParser
import typings.lezerLr.mod.Stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildMod {
  
  @JSImport("@lezer/generator/dist/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildParser(text: String): LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParser")(text.asInstanceOf[js.Any]).asInstanceOf[LRParser]
  inline def buildParser(text: String, options: BuildOptions): LRParser = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParser")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LRParser]
  
  inline def buildParserFile(text: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParserFile")(text.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def buildParserFile(text: String, options: BuildOptions): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParserFile")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  trait BuildOptions extends StObject {
    
    var contextTracker: js.UndefOr[ContextTracker[Any]] = js.undefined
    
    var exportName: js.UndefOr[String] = js.undefined
    
    var externalProp: js.UndefOr[js.Function1[/* name */ String, NodeProp[Any]]] = js.undefined
    
    var externalPropSource: js.UndefOr[js.Function1[/* name */ String, NodePropSource]] = js.undefined
    
    var externalSpecializer: js.UndefOr[
        js.Function2[
          /* name */ String, 
          /* terms */ StringDictionary[Double], 
          js.Function2[/* value */ String, /* stack */ Stack, Double]
        ]
      ] = js.undefined
    
    var externalTokenizer: js.UndefOr[
        js.Function2[/* name */ String, /* terms */ StringDictionary[Double], ExternalTokenizer]
      ] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var includeNames: js.UndefOr[Boolean] = js.undefined
    
    var moduleStyle: js.UndefOr[String] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  }
  object BuildOptions {
    
    inline def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      inline def setContextTracker(value: ContextTracker[Any]): Self = StObject.set(x, "contextTracker", value.asInstanceOf[js.Any])
      
      inline def setContextTrackerUndefined: Self = StObject.set(x, "contextTracker", js.undefined)
      
      inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      inline def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
      
      inline def setExternalProp(value: /* name */ String => NodeProp[Any]): Self = StObject.set(x, "externalProp", js.Any.fromFunction1(value))
      
      inline def setExternalPropSource(value: /* name */ String => NodePropSource): Self = StObject.set(x, "externalPropSource", js.Any.fromFunction1(value))
      
      inline def setExternalPropSourceUndefined: Self = StObject.set(x, "externalPropSource", js.undefined)
      
      inline def setExternalPropUndefined: Self = StObject.set(x, "externalProp", js.undefined)
      
      inline def setExternalSpecializer(
        value: (/* name */ String, /* terms */ StringDictionary[Double]) => js.Function2[/* value */ String, /* stack */ Stack, Double]
      ): Self = StObject.set(x, "externalSpecializer", js.Any.fromFunction2(value))
      
      inline def setExternalSpecializerUndefined: Self = StObject.set(x, "externalSpecializer", js.undefined)
      
      inline def setExternalTokenizer(value: (/* name */ String, /* terms */ StringDictionary[Double]) => ExternalTokenizer): Self = StObject.set(x, "externalTokenizer", js.Any.fromFunction2(value))
      
      inline def setExternalTokenizerUndefined: Self = StObject.set(x, "externalTokenizer", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setIncludeNames(value: Boolean): Self = StObject.set(x, "includeNames", value.asInstanceOf[js.Any])
      
      inline def setIncludeNamesUndefined: Self = StObject.set(x, "includeNames", js.undefined)
      
      inline def setModuleStyle(value: String): Self = StObject.set(x, "moduleStyle", value.asInstanceOf[js.Any])
      
      inline def setModuleStyleUndefined: Self = StObject.set(x, "moduleStyle", js.undefined)
      
      inline def setWarn(value: /* message */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
