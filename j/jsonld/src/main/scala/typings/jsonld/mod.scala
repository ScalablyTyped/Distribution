package typings.jsonld

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.Document
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
import typings.std.Error
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
  @scala.inline
  def JsonLdProcessor_=(x: JsonLdProcessor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonLdProcessor")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def compact(input: Document): js.Promise[JsonLdObj] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def compact(input: Document, ctx: Unit, options: Compact): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def compact(input: Document, ctx: Context): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def compact(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compact(input: Document, ctx: Context, options: Compact): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def compact(input: Document, ctx: Context, options: Compact, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def expand(input: Document): js.Promise[JsonLdArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdArray]]
  @scala.inline
  def expand(input: Document, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def expand(input: Document, options: Expand): js.Promise[JsonLdArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdArray]]
  @scala.inline
  def expand(input: Document, options: Expand, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def flatten(input: Document): js.Promise[JsonLdObj] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def flatten(input: Document, ctx: Null, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def flatten(input: Document, ctx: Null, options: Flatten, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def flatten(input: Document, ctx: Unit, options: Flatten): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def flatten(input: Document, ctx: Context): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def flatten(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def flatten(input: Document, ctx: Context, options: Flatten): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def flatten(input: Document, ctx: Context, options: Flatten, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def frame(input: Document, frame: Frame): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def frame(input: Document, frame: Frame, callback: Callback[JsonLdObj]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def frame(input: Document, frame: Frame, options: typings.jsonld.mod.Options.Frame): js.Promise[JsonLdObj] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdObj]]
  @scala.inline
  def frame(
    input: Document,
    frame: Frame,
    options: typings.jsonld.mod.Options.Frame,
    callback: Callback[JsonLdObj]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(input.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fromRDF(dataset: RdfDataSet): js.Promise[JsonLdArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonLdArray]]
  @scala.inline
  def fromRDF(dataset: RdfDataSet, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fromRDF(dataset: RdfDataSet, options: FromRdf): js.Promise[JsonLdArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsonLdArray]]
  @scala.inline
  def fromRDF(dataset: RdfDataSet, options: FromRdf, callback: Callback[JsonLdArray]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRDF")(dataset.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def normalize(input: Document): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def normalize(input: Document, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def normalize(input: Document, options: Normalize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def normalize(input: Document, options: Normalize, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toRDF(input: Document): js.Promise[RdfDataSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RdfDataSet]]
  @scala.inline
  def toRDF(input: Document, callback: Callback[RdfDataSet]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toRDF(input: Document, options: ToRdf): js.Promise[RdfDataSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfDataSet]]
  @scala.inline
  def toRDF(input: Document, options: ToRdf, callback: Callback[RdfDataSet]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toRDF")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Placeholder
  type Callback[T] = js.Function2[/* err */ Error, /* res */ T, Unit]
  
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = `applicationSlashn-quads`
  
  object Options {
    
    trait Common
      extends StObject
         with DocLoader {
      
      var base: js.UndefOr[String] = js.undefined
      
      var expandContext: js.UndefOr[Context] = js.undefined
    }
    object Common {
      
      @scala.inline
      def apply(): Common = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Common]
      }
      
      @scala.inline
      implicit class CommonMutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        @scala.inline
        def setExpandContext(value: Context): Self = StObject.set(x, "expandContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandContextUndefined: Self = StObject.set(x, "expandContext", js.undefined)
        
        @scala.inline
        def setExpandContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "expandContext", js.Array(value :_*))
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
      var compactionMap: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.undefined
      
      var expansion: js.UndefOr[Boolean] = js.undefined
      
      var framing: js.UndefOr[Boolean] = js.undefined
      
      var graph: js.UndefOr[Boolean] = js.undefined
      
      var skipExpansion: js.UndefOr[Boolean] = js.undefined
    }
    object Compact {
      
      @scala.inline
      def apply(): Compact = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Compact]
      }
      
      @scala.inline
      implicit class CompactMutableBuilder[Self <: Compact] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppropriate(value: Boolean): Self = StObject.set(x, "appropriate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppropriateUndefined: Self = StObject.set(x, "appropriate", js.undefined)
        
        @scala.inline
        def setCompactArrays(value: Boolean): Self = StObject.set(x, "compactArrays", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompactArraysUndefined: Self = StObject.set(x, "compactArrays", js.undefined)
        
        @scala.inline
        def setCompactToRelative(value: Boolean): Self = StObject.set(x, "compactToRelative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompactToRelativeUndefined: Self = StObject.set(x, "compactToRelative", js.undefined)
        
        @scala.inline
        def setCompactionMap(value: /* info */ js.Any => Unit): Self = StObject.set(x, "compactionMap", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCompactionMapUndefined: Self = StObject.set(x, "compactionMap", js.undefined)
        
        @scala.inline
        def setExpansion(value: Boolean): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
        
        @scala.inline
        def setFraming(value: Boolean): Self = StObject.set(x, "framing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFramingUndefined: Self = StObject.set(x, "framing", js.undefined)
        
        @scala.inline
        def setGraph(value: Boolean): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
        
        @scala.inline
        def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
      }
    }
    
    trait DocLoader extends StObject {
      
      var documentLoader: js.UndefOr[
            js.Function2[
              /* url */ Url, 
              /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit], 
              js.Promise[RemoteDocument]
            ]
          ] = js.undefined
    }
    object DocLoader {
      
      @scala.inline
      def apply(): DocLoader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocLoader]
      }
      
      @scala.inline
      implicit class DocLoaderMutableBuilder[Self <: DocLoader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDocumentLoader(
          value: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument]
        ): Self = StObject.set(x, "documentLoader", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDocumentLoaderUndefined: Self = StObject.set(x, "documentLoader", js.undefined)
      }
    }
    
    trait ExpMap extends StObject {
      
      // TODO: Figure out type of info
      var expansionMap: js.UndefOr[js.Function1[/* info */ js.Any, js.Any]] = js.undefined
    }
    object ExpMap {
      
      @scala.inline
      def apply(): ExpMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExpMap]
      }
      
      @scala.inline
      implicit class ExpMapMutableBuilder[Self <: ExpMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpansionMap(value: /* info */ js.Any => js.Any): Self = StObject.set(x, "expansionMap", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExpansionMapUndefined: Self = StObject.set(x, "expansionMap", js.undefined)
      }
    }
    
    trait Expand
      extends StObject
         with Common
         with ExpMap {
      
      var keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
    }
    object Expand {
      
      @scala.inline
      def apply(): Expand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Expand]
      }
      
      @scala.inline
      implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKeepFreeFloatingNodes(value: Boolean): Self = StObject.set(x, "keepFreeFloatingNodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepFreeFloatingNodesUndefined: Self = StObject.set(x, "keepFreeFloatingNodes", js.undefined)
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
      
      @scala.inline
      def apply(): typings.jsonld.mod.Options.Frame = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jsonld.mod.Options.Frame]
      }
      
      @scala.inline
      implicit class FrameMutableBuilder[Self <: typings.jsonld.mod.Options.Frame] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmbed(value: `@last` | `@always` | `@never` | `@link`): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
        
        @scala.inline
        def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
        
        @scala.inline
        def setOmitDefault(value: Boolean): Self = StObject.set(x, "omitDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOmitDefaultUndefined: Self = StObject.set(x, "omitDefault", js.undefined)
        
        @scala.inline
        def setRequireAll(value: Boolean): Self = StObject.set(x, "requireAll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequireAllUndefined: Self = StObject.set(x, "requireAll", js.undefined)
      }
    }
    
    trait FromRdf extends StObject {
      
      var format: js.UndefOr[MimeNQuad] = js.undefined
      
      var rdfParser: js.UndefOr[js.Any] = js.undefined
      
      var useNativeTypes: js.UndefOr[Boolean] = js.undefined
      
      var useRdfType: js.UndefOr[Boolean] = js.undefined
    }
    object FromRdf {
      
      @scala.inline
      def apply(): FromRdf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FromRdf]
      }
      
      @scala.inline
      implicit class FromRdfMutableBuilder[Self <: FromRdf] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setRdfParser(value: js.Any): Self = StObject.set(x, "rdfParser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRdfParserUndefined: Self = StObject.set(x, "rdfParser", js.undefined)
        
        @scala.inline
        def setUseNativeTypes(value: Boolean): Self = StObject.set(x, "useNativeTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseNativeTypesUndefined: Self = StObject.set(x, "useNativeTypes", js.undefined)
        
        @scala.inline
        def setUseRdfType(value: Boolean): Self = StObject.set(x, "useRdfType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseRdfTypeUndefined: Self = StObject.set(x, "useRdfType", js.undefined)
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
      
      @scala.inline
      def apply(): Normalize = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Normalize]
      }
      
      @scala.inline
      implicit class NormalizeMutableBuilder[Self <: Normalize] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlgorithm(value: URDNA2015 | URGNA2012): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
        
        @scala.inline
        def setExpansion(value: Boolean): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
        
        @scala.inline
        def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setInputFormat(value: MimeNQuad): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
        
        @scala.inline
        def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
        
        @scala.inline
        def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
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
      
      @scala.inline
      def apply(): ToRdf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ToRdf]
      }
      
      @scala.inline
      implicit class ToRdfMutableBuilder[Self <: ToRdf] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: MimeNQuad): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setProduceGeneralizedRdf(value: Boolean): Self = StObject.set(x, "produceGeneralizedRdf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProduceGeneralizedRdfUndefined: Self = StObject.set(x, "produceGeneralizedRdf", js.undefined)
        
        @scala.inline
        def setSkipExpansion(value: Boolean): Self = StObject.set(x, "skipExpansion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipExpansionUndefined: Self = StObject.set(x, "skipExpansion", js.undefined)
      }
    }
  }
  
  type RdfDataSet = js.Object
}
