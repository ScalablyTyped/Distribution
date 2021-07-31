package typings.magicString

import typings.magicString.anon.Content
import typings.magicString.anon.PartialSourceMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("magic-string", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MagicString {
    def this(str: String) = this()
    def this(str: String, options: MagicStringOptions) = this()
  }
  
  @JSImport("magic-string", "Bundle")
  @js.native
  class Bundle () extends StObject {
    def this(options: BundleOptions) = this()
    
    def addSource(source: Content): Bundle = js.native
    def addSource(source: MagicString): Bundle = js.native
    
    def append(str: String): Bundle = js.native
    def append(str: String, options: BundleOptions): Bundle = js.native
    
    def generateDecodedMap(): DecodedSourceMap = js.native
    def generateDecodedMap(options: PartialSourceMapOptions): DecodedSourceMap = js.native
    
    def generateMap(): SourceMap = js.native
    def generateMap(options: PartialSourceMapOptions): SourceMap = js.native
    
    def getIndentString(): String = js.native
    
    def indent(): Bundle = js.native
    def indent(indentStr: String): Bundle = js.native
    
    var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def prepend(str: String): Bundle = js.native
    
    def trim(): Bundle = js.native
    def trim(charType: String): Bundle = js.native
    
    def trimEnd(): Bundle = js.native
    def trimEnd(charType: String): Bundle = js.native
    
    def trimLines(): Bundle = js.native
    
    def trimStart(): Bundle = js.native
    def trimStart(charType: String): Bundle = js.native
  }
  
  @JSImport("magic-string", "SourceMap")
  @js.native
  class SourceMap protected () extends StObject {
    def this(properties: DecodedSourceMap) = this()
    
    var file: String = js.native
    
    var mappings: String = js.native
    
    var names: js.Array[String] = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.Array[String] = js.native
    
    def toUrl(): String = js.native
    
    var version: Double = js.native
  }
  
  trait BundleOptions extends StObject {
    
    var intro: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object BundleOptions {
    
    @scala.inline
    def apply(): BundleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleOptions]
    }
    
    @scala.inline
    implicit class BundleOptionsMutableBuilder[Self <: BundleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait DecodedSourceMap extends StObject {
    
    var file: String
    
    var mappings: js.Array[js.Array[SourceMapSegment]]
    
    var names: js.Array[String]
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String]
  }
  object DecodedSourceMap {
    
    @scala.inline
    def apply(
      file: String,
      mappings: js.Array[js.Array[SourceMapSegment]],
      names: js.Array[String],
      sources: js.Array[String],
      sourcesContent: js.Array[String]
    ): DecodedSourceMap = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedSourceMap]
    }
    
    @scala.inline
    implicit class DecodedSourceMapMutableBuilder[Self <: DecodedSourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value :_*))
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  type ExclusionRange = js.Tuple2[Double, Double]
  
  trait IndentOptions extends StObject {
    
    var exclude: ExclusionRange | js.Array[ExclusionRange]
    
    var indentStart: Boolean
  }
  object IndentOptions {
    
    @scala.inline
    def apply(exclude: ExclusionRange | js.Array[ExclusionRange], indentStart: Boolean): IndentOptions = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], indentStart = indentStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentOptions]
    }
    
    @scala.inline
    implicit class IndentOptionsMutableBuilder[Self <: IndentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: ExclusionRange | js.Array[ExclusionRange]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: ExclusionRange*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIndentStart(value: Boolean): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MagicString extends StObject {
    
    def addSourcemapLocation(char: Double): Unit = js.native
    
    def append(content: String): MagicString = js.native
    
    def appendLeft(index: Double, content: String): MagicString = js.native
    
    def appendRight(index: Double, content: String): MagicString = js.native
    
    def generateDecodedMap(): DecodedSourceMap = js.native
    def generateDecodedMap(options: PartialSourceMapOptions): DecodedSourceMap = js.native
    
    def generateMap(): SourceMap = js.native
    def generateMap(options: PartialSourceMapOptions): SourceMap = js.native
    
    def getIndentString(): String = js.native
    
    def indent(): MagicString = js.native
    def indent(indentStr: String): MagicString = js.native
    def indent(indentStr: String, options: IndentOptions): MagicString = js.native
    def indent(indentStr: Unit, options: IndentOptions): MagicString = js.native
    def indent(options: IndentOptions): MagicString = js.native
    
    var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def lastChar(): String = js.native
    
    def lastLine(): String = js.native
    
    def length(): Double = js.native
    
    def move(start: Double, end: Double, index: Double): MagicString = js.native
    
    var original: String = js.native
    
    def overwrite(start: Double, end: Double, content: String): MagicString = js.native
    def overwrite(start: Double, end: Double, content: String, options: Boolean): MagicString = js.native
    def overwrite(start: Double, end: Double, content: String, options: OverwriteOptions): MagicString = js.native
    
    def prepend(content: String): MagicString = js.native
    
    def prependLeft(index: Double, content: String): MagicString = js.native
    
    def prependRight(index: Double, content: String): MagicString = js.native
    
    def remove(start: Double, end: Double): MagicString = js.native
    
    def slice(start: Double, end: Double): String = js.native
    
    def snip(start: Double, end: Double): MagicString = js.native
    
    def trim(): MagicString = js.native
    def trim(charType: String): MagicString = js.native
    
    def trimEnd(): MagicString = js.native
    def trimEnd(charType: String): MagicString = js.native
    
    def trimLines(): MagicString = js.native
    
    def trimStart(): MagicString = js.native
    def trimStart(charType: String): MagicString = js.native
  }
  
  trait MagicStringOptions extends StObject {
    
    var filename: String
    
    var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]
  }
  object MagicStringOptions {
    
    @scala.inline
    def apply(filename: String, indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]): MagicStringOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], indentExclusionRanges = indentExclusionRanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagicStringOptions]
    }
    
    @scala.inline
    implicit class MagicStringOptionsMutableBuilder[Self <: MagicStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentExclusionRanges(value: ExclusionRange | js.Array[ExclusionRange]): Self = StObject.set(x, "indentExclusionRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentExclusionRangesVarargs(value: ExclusionRange*): Self = StObject.set(x, "indentExclusionRanges", js.Array(value :_*))
    }
  }
  
  trait OverwriteOptions extends StObject {
    
    var contentOnly: js.UndefOr[Boolean] = js.undefined
    
    var storeName: js.UndefOr[Boolean] = js.undefined
  }
  object OverwriteOptions {
    
    @scala.inline
    def apply(): OverwriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverwriteOptions]
    }
    
    @scala.inline
    implicit class OverwriteOptionsMutableBuilder[Self <: OverwriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentOnly(value: Boolean): Self = StObject.set(x, "contentOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentOnlyUndefined: Self = StObject.set(x, "contentOnly", js.undefined)
      
      @scala.inline
      def setStoreName(value: Boolean): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
  
  trait SourceMapOptions extends StObject {
    
    var file: String
    
    var hires: Boolean
    
    var includeContent: Boolean
    
    var source: String
  }
  object SourceMapOptions {
    
    @scala.inline
    def apply(file: String, hires: Boolean, includeContent: Boolean, source: String): SourceMapOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], hires = hires.asInstanceOf[js.Any], includeContent = includeContent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    @scala.inline
    implicit class SourceMapOptionsMutableBuilder[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHires(value: Boolean): Self = StObject.set(x, "hires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}
