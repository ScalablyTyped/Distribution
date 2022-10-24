package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabCoreutils.anon.Download
import typings.jupyterlabCoreutils.libActivitymonitorMod.ActivityMonitor.IOptions
import typings.jupyterlabCoreutils.libPageconfigMod.PageConfig.IGetUrlOptions
import typings.jupyterlabCoreutils.libUrlMod.URLExt.IUrl
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/coreutils", "ActivityMonitor")
  @js.native
  open class ActivityMonitor[Sender, Args] protected ()
    extends typings.jupyterlabCoreutils.libActivitymonitorMod.ActivityMonitor[Sender, Args] {
    /**
      * Construct a new activity monitor.
      */
    def this(options: IOptions[Sender, Args]) = this()
  }
  
  object MarkdownCodeBlocks {
    
    @JSImport("@jupyterlab/coreutils", "MarkdownCodeBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/coreutils", "MarkdownCodeBlocks.CODE_BLOCK_MARKER")
    @js.native
    val CODE_BLOCK_MARKER: /* "```" */ String = js.native
    
    @JSImport("@jupyterlab/coreutils", "MarkdownCodeBlocks.MarkdownCodeBlock")
    @js.native
    open class MarkdownCodeBlock protected ()
      extends typings.jupyterlabCoreutils.libMarkdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock {
      def this(startLine: Double) = this()
    }
    
    /**
      * Construct all code snippets from current text
      * (this could be potentially optimized if we can cache and detect differences)
      * @param text - A string to parse codeblocks from
      *
      * @returns An array of MarkdownCodeBlocks.
      */
    inline def findMarkdownCodeBlocks(text: String): js.Array[
        typings.jupyterlabCoreutils.libMarkdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findMarkdownCodeBlocks")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[
        typings.jupyterlabCoreutils.libMarkdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock
      ]]
    
    /**
      * Check whether the given file extension is a markdown extension
      * @param extension - A file extension
      *
      * @returns true/false depending on whether this is a supported markdown extension
      */
    inline def isMarkdown(`extension`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdown")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object PageConfig {
    
    @JSImport("@jupyterlab/coreutils", "PageConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The namespace for page config `Extension` functions.
      */
    object Extension {
      
      @JSImport("@jupyterlab/coreutils", "PageConfig.Extension")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The collection of deferred extensions in page config.
        */
      @JSImport("@jupyterlab/coreutils", "PageConfig.Extension.deferred")
      @js.native
      val deferred: js.Array[String] = js.native
      
      /**
        * The collection of disabled extensions in page config.
        */
      @JSImport("@jupyterlab/coreutils", "PageConfig.Extension.disabled")
      @js.native
      val disabled: js.Array[String] = js.native
      
      /**
        * Returns whether a plugin is deferred.
        *
        * @param id - The plugin ID.
        */
      inline def isDeferred(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      inline def isDisabled(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("@jupyterlab/coreutils", "PageConfig.defaultWorkspace")
    @js.native
    val defaultWorkspace: String = js.native
    
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    inline def getBaseUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseUrl")().asInstanceOf[String]
    
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    inline def getNBConvertURL(param0: Download): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNBConvertURL")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the Notebook version info [major, minor, patch].
      */
    inline def getNotebookVersion(): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotebookVersion")().asInstanceOf[js.Tuple3[Double, Double, Double]]
    
    /**
      * Get global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      *
      * @returns The config value or an empty string if not found.
      *
      * #### Notes
      * All values are treated as strings.
      * For browser based applications, it is assumed that the page HTML
      * includes a script tag with the id `jupyter-config-data` containing the
      * configuration as valid JSON.  In order to support the classic Notebook,
      * we fall back on checking for `body` data of the given `name`.
      *
      * For node applications, it is assumed that the process was launched
      * with a `--jupyter-config-data` option pointing to a JSON settings
      * file.
      */
    inline def getOption(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the base url for sharing links (usually baseUrl)
      */
    inline def getShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShareUrl")().asInstanceOf[String]
    
    /**
      * Get the authorization token for a Jupyter application.
      */
    inline def getToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[String]
    
    /**
      * Get the tree url for shareable links.
      * Usually the same as treeUrl,
      * but overrideable e.g. when sharing with JupyterHub.
      */
    inline def getTreeShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeShareUrl")().asInstanceOf[String]
    
    /**
      * Get the tree url for a JupyterLab application.
      */
    inline def getTreeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeUrl")().asInstanceOf[String]
    
    /**
      * Create a new URL given an optional mode and tree path.
      *
      * This is used to create URLS when the mode or tree path change as the user
      * changes mode or the current document in the main area. If fields in
      * options are omitted, the value in PageConfig will be used.
      *
      * @param options - IGetUrlOptions for the new path.
      */
    inline def getUrl(options: IGetUrlOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    inline def getWsUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")().asInstanceOf[String]
    inline def getWsUrl(baseUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    inline def setOption(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object PathExt {
    
    @JSImport("@jupyterlab/coreutils", "PathExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return the last portion of a path. Similar to the Unix basename command.
      * Often used to extract the file name from a fully qualified path.
      *
      * @param path - The path to evaluate.
      *
      * @param ext - An extension to remove from the result.
      */
    inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def basename(path: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Get the directory name of a path, similar to the Unix dirname command.
      * When an empty path is given, returns the root path.
      *
      * @param path - The file path.
      */
    inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the extension of the path.
      *
      * @param path - The file path.
      *
      * @returns the extension of the file.
      *
      * #### Notes
      * The extension is the string from the last occurrence of the `.`
      * character to end of string in the last portion of the path, inclusive.
      * If there is no `.` in the last portion of the path, or if the first
      * character of the basename of path [[basename]] is `.`, then an
      * empty string is returned.
      */
    inline def extname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Join all arguments together and normalize the resulting path.
      * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
      *
      * @param paths - The string paths to join.
      */
    inline def join(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    /**
      * Normalize a string path, reducing '..' and '.' parts.
      * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
      * When an empty path is given, returns the root path.
      *
      * @param path - The string path to normalize.
      */
    inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Normalize a file extension to be of the type `'.foo'`.
      *
      * @param extension - the file extension.
      *
      * #### Notes
      * Adds a leading dot if not present and converts to lower case.
      */
    inline def normalizeExtension(`extension`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Solve the relative path from {from} to {to}.
      *
      * @param from - The source path.
      *
      * @param to - The target path.
      *
      * #### Notes
      * If from and to each resolve to the same path (after calling
      * path.resolve() on each), a zero-length string is returned.
      * If a zero-length string is passed as from or to, `/`
      * will be used instead of the zero-length strings.
      */
    inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Remove the leading slash from a path.
      *
      * @param path: the path from which to remove a leading slash.
      */
    inline def removeSlash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSlash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Resolve a sequence of paths or path segments into an absolute path.
      * The root path in the application has no leading slash, so it is removed.
      *
      * @param parts - The paths to join.
      *
      * #### Notes
      * The right-most parameter is considered {to}.  Other parameters are considered an array of {from}.
      *
      * Starting from leftmost {from} parameter, resolves {to} to an absolute path.
      *
      * If {to} isn't already absolute, {from} arguments are prepended in right to left order, until an absolute path is found. If after using all {from} paths still no absolute path is found, the current working directory is used as well. The resulting path is normalized, and trailing slashes are removed unless the path gets resolved to the root directory.
      */
    inline def resolve(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  }
  
  object Text {
    
    @JSImport("@jupyterlab/coreutils", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a 'snake-case', 'snake_case', 'snake:case', or
      * 'snake case' string, will return the camel case version: 'snakeCase'.
      *
      * @param str: the snake-case input string.
      *
      * @param upper: default = false. If true, the first letter of the
      * returned string will be capitalized.
      *
      * @returns the camel case version of the input string.
      */
    inline def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def camelCase(str: String, upper: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert a unicode character offset to a javascript string index.
      *
      * @param charIdx - The index in unicode characters
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The js-native index
      */
    inline def charIndexToJsIndex(charIdx: Double, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("charIndexToJsIndex")(charIdx.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Convert a javascript string index into a unicode character offset
      *
      * @param jsIdx - The javascript string index (counting surrogate pairs)
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The unicode character offset
      */
    inline def jsIndexToCharIndex(jsIdx: Double, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jsIndexToCharIndex")(jsIdx.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Given a string, title case the words in the string.
      *
      * @param str: the string to title case.
      *
      * @returns the same string, but with each word capitalized.
      */
    inline def titleCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object Time {
    
    @JSImport("@jupyterlab/coreutils", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @param format - The format string.
      *
      * @returns A formatted date.
      */
    inline def format(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(value: String, timeFormat: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(value: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(value: js.Date, timeFormat: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    inline def formatHuman(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatHuman(value: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object URLExt {
    
    @JSImport("@jupyterlab/coreutils", "URLExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Encode the components of a multi-segment url.
      *
      * @param url - The url to encode.
      *
      * @returns the encoded url.
      *
      * #### Notes
      * Preserves the `'/'` separators.
      * Should not include the base url, since all parts are escaped.
      */
    inline def encodeParts(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParts")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Parse URL and retrieve hostname
      *
      * @param url - The URL string to parse
      *
      * @return a hostname string value
      */
    inline def getHostName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Test whether the url is a local url.
      *
      * #### Notes
      * This function returns `false` for any fully qualified url, including
      * `data:`, `file:`, and `//` protocol URLs.
      */
    inline def isLocal(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocal")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Join a sequence of url components and normalizes as in node `path.join`.
      *
      * @param parts - The url components.
      *
      * @returns the joined url.
      */
    inline def join(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def normalize(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[js.UndefOr[String]]
    /**
      * Normalize a url.
      */
    inline def normalize(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def normalize(url: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def normalize_Union(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /**
      * Return a serialized object string suitable for a query.
      *
      * @param object - The source object.
      *
      * @returns an encoded url query.
      *
      * #### Notes
      * Modified version of [stackoverflow](http://stackoverflow.com/a/30707423).
      */
    inline def objectToQueryString(value: PartialJSONObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToQueryString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Parse a url into a URL object.
      *
      * @param urlString - The URL string to parse.
      *
      * @returns A URL object.
      */
    inline def parse(url: String): IUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[IUrl]
    
    /**
      * Return a parsed object that represents the values in a query string.
      */
    inline def queryStringToObject(value: String): StringDictionary[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryStringToObject")(value.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String]]]
  }
}
