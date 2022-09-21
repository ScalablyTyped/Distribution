package typings.jsonld

import typings.jsonld.jsonldMod.ContextDefinition
import typings.jsonld.jsonldMod.JsonLdDocument
import typings.jsonld.jsonldSpecMod.Frame
import typings.jsonld.jsonldSpecMod.JsonLdArray
import typings.jsonld.jsonldSpecMod.JsonLdObj
import typings.jsonld.jsonldSpecMod.JsonLdProcessor
import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.jsonld.jsonldStrings.URDNA2015
import typings.jsonld.jsonldStrings.URGNA2012
import typings.jsonld.jsonldStrings.`@always`
import typings.jsonld.jsonldStrings.`@last`
import typings.jsonld.jsonldStrings.`@link`
import typings.jsonld.jsonldStrings.`@never`
import typings.jsonld.jsonldStrings.`applicationSlashn-quads`
import typings.jsonld.mod.Options.Compact
import typings.jsonld.mod.Options.Expand
import typings.jsonld.mod.Options.Flatten
import typings.jsonld.mod.Options.FromRdf
import typings.jsonld.mod.Options.Normalize
import typings.jsonld.mod.Options.ToRdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonld", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonld", "JsonLdProcessor")
  @js.native
  def JsonLdProcessor: typings.jsonld.jsonldSpecMod.JsonLdProcessor = js.native
  inline def JsonLdProcessor_=(x: JsonLdProcessor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonLdProcessor")(x.asInstanceOf[js.Any])
  
  inline def canonize(input: JsonLdDocument): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("canonize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def canonize(input: JsonLdDocument, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("canonize")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def canonize(input: JsonLdDocument, options: Normalize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("canonize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def canonize(input: JsonLdDocument, options: Normalize, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("canonize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compact(input: JsonLdDocument): js.Promise[JsonLdObj] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdObj]]
  inline def compact(input: JsonLdDocument, ctx: Unit, options: Compact): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def compact(input: JsonLdDocument, ctx: ContextDefinition): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def compact(input: JsonLdDocument, ctx: ContextDefinition, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compact(input: JsonLdDocument, ctx: ContextDefinition, options: Compact): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def compact(input: JsonLdDocument, ctx: ContextDefinition, options: Compact, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expand(input: JsonLdDocument): js.Promise[JsonLdArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdArray]]
  inline def expand(input: JsonLdDocument, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expand(input: JsonLdDocument, options: Expand): js.Promise[JsonLdArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdArray]]
  inline def expand(input: JsonLdDocument, options: Expand, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flatten(input: JsonLdDocument): js.Promise[JsonLdObj] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdObj]]
  inline def flatten(input: JsonLdDocument, ctx: Null, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flatten(input: JsonLdDocument, ctx: Null, options: Flatten, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flatten(input: JsonLdDocument, ctx: Unit, options: Flatten): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def flatten(input: JsonLdDocument, ctx: ContextDefinition): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def flatten(input: JsonLdDocument, ctx: ContextDefinition, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flatten(input: JsonLdDocument, ctx: ContextDefinition, options: Flatten): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def flatten(input: JsonLdDocument, ctx: ContextDefinition, options: Flatten, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def frame(input: JsonLdDocument, frame: Frame): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def frame(input: JsonLdDocument, frame: Frame, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def frame(input: JsonLdDocument, frame: Frame, options: typings.jsonld.mod.Options.Frame): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  inline def frame(
    input: JsonLdDocument,
    frame: Frame,
    options: typings.jsonld.mod.Options.Frame,
    callback: Callback[JsonLdObj]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromRDF(dataset: RdfDataSet): js.Promise[JsonLdArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdArray]]
  inline def fromRDF(dataset: RdfDataSet, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromRDF(dataset: RdfDataSet, options: FromRdf): js.Promise[JsonLdArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdArray]]
  inline def fromRDF(dataset: RdfDataSet, options: FromRdf, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalize(input: JsonLdDocument): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def normalize(input: JsonLdDocument, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def normalize(input: JsonLdDocument, options: Normalize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def normalize(input: JsonLdDocument, options: Normalize, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toRDF(input: JsonLdDocument): js.Promise[RdfDataSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RdfDataSet]]
  inline def toRDF(input: JsonLdDocument, callback: Callback[RdfDataSet]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toRDF(input: JsonLdDocument, options: ToRdf): js.Promise[RdfDataSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfDataSet]]
  inline def toRDF(input: JsonLdDocument, options: ToRdf, callback: Callback[RdfDataSet]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Placeholder
  type Callback[T] = js.Function2[/* err */ js.Error, /* res */ T, Unit]
  
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = `applicationSlashn-quads`
  
  object Options {
    
    trait Common
      extends StObject
         with DocLoader {
      
      var base: js.UndefOr[String] = js.undefined
      
      var expandContext: js.UndefOr[ContextDefinition] = js.undefined
    }
    object Common {
      
      inline def apply(): Common = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Common]
      }
      
      extension [Self <: Common](x: Self) {
        
        inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setExpandContext(value: ContextDefinition): Self = StObject.set(x, "expandContext", value.asInstanceOf[js.Any])
        
        inline def setExpandContextUndefined: Self = StObject.set(x, "expandContext", js.undefined)
      }
    }
    
    trait Compact
      extends StObject
         with Common
         with ExpMap {
      
      var appropriate: js.UndefOr[Boolean] = js.undefined
      
      var compactArrays: js.UndefOr[Boolean] = js.undefined
      
      var compactToRelative: js.UndefOr[Boolean] = js.undefined
      
      // TODO: Figure out type of info
      var compactionMap: js.UndefOr[js.Function1[/* info */ Any, Unit]] = js.undefined
      
      var expansion: js.UndefOr[Boolean] = js.undefined
      
      var framing: js.UndefOr[Boolean] = js.undefined
      
      var graph: js.UndefOr[Boolean] = js.undefined
      
      var skipExpansion: js.UndefOr[Boolean] = js.undefined
    }
    object Compact {
      
      inline def apply(): Compact = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Compact]
      }
      
      extension [Self <: Compact](x: Self) {
        
        inline def setAppropriate(value: Boolean): Self = StObject.set(x, "appropriate", value.asInstanceOf[js.Any])
        
        inline def setAppropriateUndefined: Self = StObject.set(x, "appropriate", js.undefined)
        
        inline def setCompactArrays(value: Boolean): Self = StObject.set(x, "compactArrays", value.asInstanceOf[js.Any])
        
        inline def setCompactArraysUndefined: Self = StObject.set(x, "compactArrays", js.undefined)
        
        inline def setCompactToRelative(value: Boolean): Self = StObject.set(x, "compactToRelative", value.asInstanceOf[js.Any])
        
        inline def setCompactToRelativeUndefined: Self = StObject.set(x, "compactToRelative", js.undefined)
        
        inline def setCompactionMap(value: /* info */ Any => Unit): Self = StObject.set(x, "compactionMap", js.Any.fromFunction1(value))
        
        inline def setCompactionMapUndefined: Self = StObject.set(x, "compactionMap", js.undefined)
        
        inline def setExpansion(value: Boolean): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
        
        inline def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
        
        inline def setFraming(value: Boolean): Self = StObject.set(x, "framing", value.asInstanceOf[js.Any])
        
        inline def setFramingUndefined: Self = StObject.set(x, "framing", js.undefined)
        
        inline def setGraph(value: Boolean): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
        
        inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
        
        inline def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        inline def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
      }
    }
    
    trait DocLoader extends StObject {
      
      var documentLoader: js.UndefOr[
            js.Function2[
              /* url */ Url, 
              /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit], 
              js.Promise[RemoteDocument]
            ]
          ] = js.undefined
    }
    object DocLoader {
      
      inline def apply(): DocLoader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocLoader]
      }
      
      extension [Self <: DocLoader](x: Self) {
        
        inline def setDocumentLoader(
          value: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument]
        ): Self = StObject.set(x, "documentLoader", js.Any.fromFunction2(value))
        
        inline def setDocumentLoaderUndefined: Self = StObject.set(x, "documentLoader", js.undefined)
      }
    }
    
    trait ExpMap extends StObject {
      
      // TODO: Figure out type of info
      var expansionMap: js.UndefOr[js.Function1[/* info */ Any, Any]] = js.undefined
    }
    object ExpMap {
      
      inline def apply(): ExpMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExpMap]
      }
      
      extension [Self <: ExpMap](x: Self) {
        
        inline def setExpansionMap(value: /* info */ Any => Any): Self = StObject.set(x, "expansionMap", js.Any.fromFunction1(value))
        
        inline def setExpansionMapUndefined: Self = StObject.set(x, "expansionMap", js.undefined)
      }
    }
    
    trait Expand
      extends StObject
         with Common
         with ExpMap {
      
      var keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
    }
    object Expand {
      
      inline def apply(): Expand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Expand]
      }
      
      extension [Self <: Expand](x: Self) {
        
        inline def setKeepFreeFloatingNodes(value: Boolean): Self = StObject.set(x, "keepFreeFloatingNodes", value.asInstanceOf[js.Any])
        
        inline def setKeepFreeFloatingNodesUndefined: Self = StObject.set(x, "keepFreeFloatingNodes", js.undefined)
      }
    }
    
    type Flatten = Common
    
    trait Frame extends StObject {
      
      var embed: js.UndefOr[`@last` | `@always` | `@never` | `@link`] = js.undefined
      
      var explicit: js.UndefOr[Boolean] = js.undefined
      
      var omitDefault: js.UndefOr[Boolean] = js.undefined
      
      var requireAll: js.UndefOr[Boolean] = js.undefined
    }
    object Frame {
      
      inline def apply(): typings.jsonld.mod.Options.Frame = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jsonld.mod.Options.Frame]
      }
      
      extension [Self <: typings.jsonld.mod.Options.Frame](x: Self) {
        
        inline def setEmbed(value: `@last` | `@always` | `@never` | `@link`): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
        
        inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
        
        inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
        
        inline def setOmitDefault(value: Boolean): Self = StObject.set(x, "omitDefault", value.asInstanceOf[js.Any])
        
        inline def setOmitDefaultUndefined: Self = StObject.set(x, "omitDefault", js.undefined)
        
        inline def setRequireAll(value: Boolean): Self = StObject.set(x, "requireAll", value.asInstanceOf[js.Any])
        
        inline def setRequireAllUndefined: Self = StObject.set(x, "requireAll", js.undefined)
      }
    }
    
    trait FromRdf extends StObject {
      
      var format: js.UndefOr[MimeNQuad] = js.undefined
      
      var rdfParser: js.UndefOr[Any] = js.undefined
      
      var useNativeTypes: js.UndefOr[Boolean] = js.undefined
      
      var useRdfType: js.UndefOr[Boolean] = js.undefined
    }
    object FromRdf {
      
      inline def apply(): FromRdf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FromRdf]
      }
      
      extension [Self <: FromRdf](x: Self) {
        
        inline def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setRdfParser(value: Any): Self = StObject.set(x, "rdfParser", value.asInstanceOf[js.Any])
        
        inline def setRdfParserUndefined: Self = StObject.set(x, "rdfParser", js.undefined)
        
        inline def setUseNativeTypes(value: Boolean): Self = StObject.set(x, "useNativeTypes", value.asInstanceOf[js.Any])
        
        inline def setUseNativeTypesUndefined: Self = StObject.set(x, "useNativeTypes", js.undefined)
        
        inline def setUseRdfType(value: Boolean): Self = StObject.set(x, "useRdfType", value.asInstanceOf[js.Any])
        
        inline def setUseRdfTypeUndefined: Self = StObject.set(x, "useRdfType", js.undefined)
      }
    }
    
    trait Normalize
      extends StObject
         with Common {
      
      var algorithm: js.UndefOr[URDNA2015 | URGNA2012] = js.undefined
      
      var expansion: js.UndefOr[Boolean] = js.undefined
      
      var format: js.UndefOr[MimeNQuad] = js.undefined
      
      var inputFormat: js.UndefOr[MimeNQuad] = js.undefined
      
      var skipExpansion: js.UndefOr[Boolean] = js.undefined
      
      var useNative: js.UndefOr[Boolean] = js.undefined
    }
    object Normalize {
      
      inline def apply(): Normalize = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Normalize]
      }
      
      extension [Self <: Normalize](x: Self) {
        
        inline def setAlgorithm(value: URDNA2015 | URGNA2012): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
        
        inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
        
        inline def setExpansion(value: Boolean): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
        
        inline def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
        
        inline def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setInputFormat(value: MimeNQuad): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
        
        inline def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
        
        inline def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        inline def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
        
        inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
      }
    }
    
    trait ToRdf
      extends StObject
         with Common {
      
      var format: js.UndefOr[MimeNQuad] = js.undefined
      
      var produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined
      
      var skipExpansion: js.UndefOr[Boolean] = js.undefined
    }
    object ToRdf {
      
      inline def apply(): ToRdf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ToRdf]
      }
      
      extension [Self <: ToRdf](x: Self) {
        
        inline def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setProduceGeneralizedRdf(value: Boolean): Self = StObject.set(x, "produceGeneralizedRdf", value.asInstanceOf[js.Any])
        
        inline def setProduceGeneralizedRdfUndefined: Self = StObject.set(x, "produceGeneralizedRdf", js.undefined)
        
        inline def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        inline def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
      }
    }
  }
  
  type RdfDataSet = js.Object
}
