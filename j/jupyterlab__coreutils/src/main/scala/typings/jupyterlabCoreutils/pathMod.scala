package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  object PathExt {
    
    @JSImport("@jupyterlab/coreutils/lib/path", "PathExt")
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
    @scala.inline
    def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def basename(path: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Get the directory name of a path, similar to the Unix dirname command.
      * When an empty path is given, returns the root path.
      *
      * @param path - The file path.
      */
    @scala.inline
    def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
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
    @scala.inline
    def extname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Join all arguments together and normalize the resulting path.
      * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
      *
      * @param paths - The string paths to join.
      */
    @scala.inline
    def join(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Normalize a string path, reducing '..' and '.' parts.
      * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
      * When an empty path is given, returns the root path.
      *
      * @param path - The string path to normalize.
      */
    @scala.inline
    def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Normalize a file extension to be of the type `'.foo'`.
      *
      * @param extension - the file extension.
      *
      * #### Notes
      * Adds a leading dot if not present and converts to lower case.
      */
    @scala.inline
    def normalizeExtension(`extension`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String]
    
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
    @scala.inline
    def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Remove the leading slash from a path.
      *
      * @param path: the path from which to remove a leading slash.
      */
    @scala.inline
    def removeSlash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSlash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
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
    @scala.inline
    def resolve(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
