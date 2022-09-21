package typings.magicString

import typings.magicString.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("magic-string", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MagicString {
    def this(str: String) = this()
    def this(str: String, options: MagicStringOptions) = this()
  }
  
  @JSImport("magic-string", "Bundle")
  @js.native
  open class Bundle () extends StObject {
    def this(options: BundleOptions) = this()
    
    def addSource(source: Content): Bundle = js.native
    def addSource(source: MagicString): Bundle = js.native
    
    def append(str: String): Bundle = js.native
    def append(str: String, options: BundleOptions): Bundle = js.native
    
    def generateDecodedMap(): DecodedSourceMap = js.native
    def generateDecodedMap(options: SourceMapOptions): DecodedSourceMap = js.native
    
    def generateMap(): SourceMap = js.native
    def generateMap(options: SourceMapOptions): SourceMap = js.native
    
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
  open class SourceMap protected () extends StObject {
    def this(properties: DecodedSourceMap) = this()
    
    var file: String = js.native
    
    var mappings: String = js.native
    
    var names: js.Array[String] = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.Array[String] = js.native
    
    /**
      * Returns a DataURI containing the sourcemap. Useful for doing this sort of thing:
      * `generateMap(options?: SourceMapOptions): SourceMap;`
      */
    def toUrl(): String = js.native
    
    var version: Double = js.native
  }
  
  trait BundleOptions extends StObject {
    
    var intro: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object BundleOptions {
    
    inline def apply(): BundleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleOptions]
    }
    
    extension [Self <: BundleOptions](x: Self) {
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
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
    
    inline def apply(
      file: String,
      mappings: js.Array[js.Array[SourceMapSegment]],
      names: js.Array[String],
      sources: js.Array[String],
      sourcesContent: js.Array[String]
    ): DecodedSourceMap = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedSourceMap]
    }
    
    extension [Self <: DecodedSourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value*))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  type ExclusionRange = js.Tuple2[Double, Double]
  
  trait IndentOptions extends StObject {
    
    var exclude: js.UndefOr[ExclusionRange | js.Array[ExclusionRange]] = js.undefined
    
    var indentStart: js.UndefOr[Boolean] = js.undefined
  }
  object IndentOptions {
    
    inline def apply(): IndentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndentOptions]
    }
    
    extension [Self <: IndentOptions](x: Self) {
      
      inline def setExclude(value: ExclusionRange | js.Array[ExclusionRange]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: ExclusionRange*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIndentStart(value: Boolean): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
      
      inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    }
  }
  
  @js.native
  trait MagicString extends StObject {
    
    /**
      * Adds the specified character index (with respect to the original string) to sourcemap mappings, if `hires` is false.
      */
    def addSourcemapLocation(char: Double): Unit = js.native
    
    /**
      * Appends the specified content to the end of the string.
      */
    def append(content: String): MagicString = js.native
    
    /**
      * Appends the specified content at the index in the original string.
      * If a range *ending* with index is subsequently moved, the insert will be moved with it. 
      * See also `s.prependLeft(...)`.
      */
    def appendLeft(index: Double, content: String): MagicString = js.native
    
    /**
      * Appends the specified content at the index in the original string.
      * If a range *starting* with index is subsequently moved, the insert will be moved with it.
      * See also `s.prependRight(...)`.
      */
    def appendRight(index: Double, content: String): MagicString = js.native
    
    /**
      * Generates a sourcemap object with raw mappings in array form, rather than encoded as a string.
      * Useful if you need to manipulate the sourcemap further, but most of the time you will use `generateMap` instead.
      */
    def generateDecodedMap(): DecodedSourceMap = js.native
    def generateDecodedMap(options: SourceMapOptions): DecodedSourceMap = js.native
    
    /**
      * Generates a version 3 sourcemap.
      */
    def generateMap(): SourceMap = js.native
    def generateMap(options: SourceMapOptions): SourceMap = js.native
    
    def getIndentString(): String = js.native
    
    /**
      * Indicates if the string has been changed.
      */
    def hasChanged(): Boolean = js.native
    
    /**
      * Prefixes each line of the string with prefix.
      * If prefix is not supplied, the indentation will be guessed from the original content, falling back to a single tab character.
      */
    def indent(): MagicString = js.native
    def indent(indentStr: String): MagicString = js.native
    def indent(indentStr: String, options: IndentOptions): MagicString = js.native
    def indent(indentStr: Unit, options: IndentOptions): MagicString = js.native
    def indent(options: IndentOptions): MagicString = js.native
    
    var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
    
    /**
      * Returns true if the resulting source is empty (disregarding white space).
      */
    def isEmpty(): Boolean = js.native
    
    def lastChar(): String = js.native
    
    def lastLine(): String = js.native
    
    def length(): Double = js.native
    
    /**
      * Moves the characters from `start and `end` to `index`.
      */
    def move(start: Double, end: Double, index: Double): MagicString = js.native
    
    var original: String = js.native
    
    /**
      * Replaces the characters from `start` to `end` with `content`. The same restrictions as `s.remove()` apply.
      *
      * The fourth argument is optional. It can have a storeName property — if true, the original name will be stored
      * for later inclusion in a sourcemap's names array — and a contentOnly property which determines whether only
      * the content is overwritten, or anything that was appended/prepended to the range as well.
      */
    def overwrite(start: Double, end: Double, content: String): MagicString = js.native
    def overwrite(start: Double, end: Double, content: String, options: Boolean): MagicString = js.native
    def overwrite(start: Double, end: Double, content: String, options: OverwriteOptions): MagicString = js.native
    
    /**
      * Prepends the string with the specified content. 
      */
    def prepend(content: String): MagicString = js.native
    
    /**
      * Same as `s.appendLeft(...)`, except that the inserted content will go *before* any previous appends or prepends at index
      */
    def prependLeft(index: Double, content: String): MagicString = js.native
    
    /**
      * Same as `s.appendRight(...)`, except that the inserted content will go *before* any previous appends or prepends at `index`
      */
    def prependRight(index: Double, content: String): MagicString = js.native
    
    /**
      * Removes the characters from `start` to `end` (of the original string, **not** the generated string).
      * Removing the same content twice, or making removals that partially overlap, will cause an error.
      */
    def remove(start: Double, end: Double): MagicString = js.native
    
    def replace(regex: String, replacement: String): MagicString = js.native
    def replace(regex: String, replacement: js.Function2[/* substring */ String, /* repeated */ Any, String]): MagicString = js.native
    /**
      * String replacement with RegExp or string.
      */
    def replace(regex: js.RegExp, replacement: String): MagicString = js.native
    def replace(regex: js.RegExp, replacement: js.Function2[/* substring */ String, /* repeated */ Any, String]): MagicString = js.native
    
    /**
      * Returns the content of the generated string that corresponds to the slice between `start` and `end` of the original string.
      * Throws error if the indices are for characters that were already removed.
      */
    def slice(start: Double, end: Double): String = js.native
    
    /**
      * Returns a clone of `s`, with all content before the `start` and `end` characters of the original string removed.
      */
    def snip(start: Double, end: Double): MagicString = js.native
    
    /**
      * Trims content matching `charType` (defaults to `\s`, i.e. whitespace) from the start and end.
      */
    def trim(): MagicString = js.native
    def trim(charType: String): MagicString = js.native
    
    /**
      * Trims content matching `charType` (defaults to `\s`, i.e. whitespace) from the end.
      */
    def trimEnd(): MagicString = js.native
    def trimEnd(charType: String): MagicString = js.native
    
    /**
      * Removes empty lines from the start and end.
      */
    def trimLines(): MagicString = js.native
    
    /**
      * Trims content matching `charType` (defaults to `\s`, i.e. whitespace) from the start.
      */
    def trimStart(): MagicString = js.native
    def trimStart(charType: String): MagicString = js.native
  }
  
  trait MagicStringOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var indentExclusionRanges: js.UndefOr[ExclusionRange | js.Array[ExclusionRange]] = js.undefined
  }
  object MagicStringOptions {
    
    inline def apply(): MagicStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagicStringOptions]
    }
    
    extension [Self <: MagicStringOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIndentExclusionRanges(value: ExclusionRange | js.Array[ExclusionRange]): Self = StObject.set(x, "indentExclusionRanges", value.asInstanceOf[js.Any])
      
      inline def setIndentExclusionRangesUndefined: Self = StObject.set(x, "indentExclusionRanges", js.undefined)
      
      inline def setIndentExclusionRangesVarargs(value: ExclusionRange*): Self = StObject.set(x, "indentExclusionRanges", js.Array(value*))
    }
  }
  
  trait OverwriteOptions extends StObject {
    
    var contentOnly: js.UndefOr[Boolean] = js.undefined
    
    var storeName: js.UndefOr[Boolean] = js.undefined
  }
  object OverwriteOptions {
    
    inline def apply(): OverwriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverwriteOptions]
    }
    
    extension [Self <: OverwriteOptions](x: Self) {
      
      inline def setContentOnly(value: Boolean): Self = StObject.set(x, "contentOnly", value.asInstanceOf[js.Any])
      
      inline def setContentOnlyUndefined: Self = StObject.set(x, "contentOnly", js.undefined)
      
      inline def setStoreName(value: Boolean): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
  
  trait SourceMapOptions extends StObject {
    
    /**
      * The filename where you plan to write the sourcemap.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the mapping should be high-resolution.
      * Hi-res mappings map every single character, meaning (for example) your devtools will always
      * be able to pinpoint the exact location of function calls and so on.
      * With lo-res mappings, devtools may only be able to identify the correct
      * line - but they're quicker to generate and less bulky.
      * If sourcemap locations have been specified with s.addSourceMapLocation(), they will be used here.
      */
    var hires: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include the original content in the map's sourcesContent array.
      */
    var includeContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The filename of the file containing the original source.
      */
    var source: js.UndefOr[String] = js.undefined
  }
  object SourceMapOptions {
    
    inline def apply(): SourceMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    extension [Self <: SourceMapOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHires(value: Boolean): Self = StObject.set(x, "hires", value.asInstanceOf[js.Any])
      
      inline def setHiresUndefined: Self = StObject.set(x, "hires", js.undefined)
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}
