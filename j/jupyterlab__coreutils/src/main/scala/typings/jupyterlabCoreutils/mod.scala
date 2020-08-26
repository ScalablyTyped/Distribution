package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import typings.jupyterlabCoreutils.anon.Download
import typings.jupyterlabCoreutils.anon.Raw
import typings.jupyterlabCoreutils.urlMod.URLExt.IUrl
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ActivityMonitor[Sender, Args] protected ()
    extends typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor[Sender, Args] {
    /**
      * Construct a new activity monitor.
      */
    def this(options: IOptions[Sender, Args]) = this()
  }
  
  @js.native
  object MarkdownCodeBlocks extends js.Object {
    @js.native
    class MarkdownCodeBlock protected ()
      extends typings.jupyterlabCoreutils.markdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock {
      def this(startLine: Double) = this()
    }
    
    val CODE_BLOCK_MARKER: /* "```" */ String = js.native
    /**
      * Construct all code snippets from current text
      * (this could be potentially optimized if we can cache and detect differences)
      * @param text - A string to parse codeblocks from
      *
      * @returns An array of MarkdownCodeBlocks.
      */
    def findMarkdownCodeBlocks(text: String): js.Array[
        typings.jupyterlabCoreutils.markdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock
      ] = js.native
    /**
      * Check whether the given file extension is a markdown extension
      * @param extension - A file extension
      *
      * @returns true/false depending on whether this is a supported markdown extension
      */
    def isMarkdown(extension: String): Boolean = js.native
  }
  
  @js.native
  object PageConfig extends js.Object {
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    def getBaseUrl(): String = js.native
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    def getNBConvertURL(hasPathFormatDownload: Download): String = js.native
    /**
      * Get the Notebook version info [major, minor, patch].
      */
    def getNotebookVersion(): js.Tuple3[Double, Double, Double] = js.native
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
    def getOption(name: String): String = js.native
    /**
      * Get the base url for sharing links (usually baseUrl)
      */
    def getShareUrl(): String = js.native
    /**
      * Get the authorization token for a Jupyter application.
      */
    def getToken(): String = js.native
    /**
      * Get the tree url for shareable links.
      * Usually the same as treeUrl,
      * but overrideable e.g. when sharing with JupyterHub.
      */
    def getTreeShareUrl(): String = js.native
    /**
      * Get the tree url for a JupyterLab application.
      */
    def getTreeUrl(): String = js.native
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    def getWsUrl(): String = js.native
    def getWsUrl(baseUrl: String): String = js.native
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    def setOption(name: String, value: String): String = js.native
    /**
      * The namespace for page config `Extension` functions.
      */
    @js.native
    object Extension extends js.Object {
      /**
        * The collection of deferred extensions in page config.
        */
      val deferred: js.Array[Raw] = js.native
      /**
        * The collection of disabled extensions in page config.
        */
      val disabled: js.Array[Raw] = js.native
      /**
        * Returns whether a plugin is deferred.
        *
        * @param id - The plugin ID.
        */
      def isDeferred(id: String): Boolean = js.native
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      def isDisabled(id: String): Boolean = js.native
    }
    
  }
  
  @js.native
  object PathExt extends js.Object {
    /**
      * Return the last portion of a path. Similar to the Unix basename command.
      * Often used to extract the file name from a fully qualified path.
      *
      * @param path - The path to evaluate.
      *
      * @param ext - An extension to remove from the result.
      */
    def basename(path: String): String = js.native
    def basename(path: String, ext: String): String = js.native
    /**
      * Get the directory name of a path, similar to the Unix dirname command.
      * When an empty path is given, returns the root path.
      *
      * @param path - The file path.
      */
    def dirname(path: String): String = js.native
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
    def extname(path: String): String = js.native
    /**
      * Join all arguments together and normalize the resulting path.
      * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
      *
      * @param paths - The string paths to join.
      */
    def join(paths: String*): String = js.native
    /**
      * Normalize a string path, reducing '..' and '.' parts.
      * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
      * When an empty path is given, returns the root path.
      *
      * @param path - The string path to normalize.
      */
    def normalize(path: String): String = js.native
    /**
      * Normalize a file extension to be of the type `'.foo'`.
      *
      * @param extension - the file extension.
      *
      * #### Notes
      * Adds a leading dot if not present and converts to lower case.
      */
    def normalizeExtension(extension: String): String = js.native
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
    def relative(from: String, to: String): String = js.native
    /**
      * Remove the leading slash from a path.
      *
      * @param path: the path from which to remove a leading slash.
      */
    def removeSlash(path: String): String = js.native
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
    def resolve(parts: String*): String = js.native
  }
  
  @js.native
  object Text extends js.Object {
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
    def camelCase(str: String): String = js.native
    def camelCase(str: String, upper: Boolean): String = js.native
    /**
      * Convert a unicode character offset to a javascript string index.
      *
      * @param charIdx - The index in unicode characters
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The js-native index
      */
    def charIndexToJsIndex(charIdx: Double, text: String): Double = js.native
    /**
      * Convert a javascript string index into a unicode character offset
      *
      * @param jsIdx - The javascript string index (counting surrogate pairs)
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The unicode character offset
      */
    def jsIndexToCharIndex(jsIdx: Double, text: String): Double = js.native
    /**
      * Given a string, title case the words in the string.
      *
      * @param str: the string to title case.
      *
      * @returns the same string, but with each word capitalized.
      */
    def titleCase(str: String): String = js.native
  }
  
  @js.native
  object Time extends js.Object {
    /**
      * Convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @param format - The format string.
      *
      * @returns A formatted date.
      */
    def format(value: String): String = js.native
    def format(value: String, timeFormat: String): String = js.native
    def format(value: Date): String = js.native
    def format(value: Date, timeFormat: String): String = js.native
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    def formatHuman(value: String): String = js.native
    def formatHuman(value: Date): String = js.native
  }
  
  @js.native
  object URLExt extends js.Object {
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
    def encodeParts(url: String): String = js.native
    /**
      * Test whether the url is a local url.
      *
      * #### Notes
      * This function returns `false` for any fully qualified url, including
      * `data:`, `file:`, and `//` protocol URLs.
      */
    def isLocal(url: String): Boolean = js.native
    /**
      * Join a sequence of url components and normalizes as in node `path.join`.
      *
      * @param parts - The url components.
      *
      * @returns the joined url.
      */
    def join(parts: String*): String = js.native
    def normalize(): js.UndefOr[String] = js.native
    def normalize(url: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    /**
      * Normalize a url.
      */
    def normalize(url: String): String = js.native
    @JSName("normalize")
    def normalize_Union(url: String): js.UndefOr[String] = js.native
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
    def objectToQueryString(value: PartialJSONObject): String = js.native
    /**
      * Parse a url into a URL object.
      *
      * @param urlString - The URL string to parse.
      *
      * @returns A URL object.
      */
    def parse(url: String): IUrl = js.native
    /**
      * Return a parsed object that represents the values in a query string.
      */
    def queryStringToObject(value: String): StringDictionary[js.UndefOr[String]] = js.native
  }
  
}

