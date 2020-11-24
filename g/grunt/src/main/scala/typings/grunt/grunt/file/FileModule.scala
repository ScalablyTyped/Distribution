package typings.grunt.grunt.file

import typings.grunt.anon.Force
import typings.grunt.minimatch.IMinimatchOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link http://gruntjs.com/api/grunt.file}
  */
@js.native
trait FileModule extends js.Object {
  
  /**
    * Do all the specified paths refer to the same path?
    */
  def arePathsEquivalent(path: String, append: String*): Boolean = js.native
  
  /**
    * Copy a source file to a destination path, creating intermediate directories if necessary.
    */
  def copy(srcpath: String, destpath: String): Unit = js.native
  def copy(srcpath: String, destpath: String, options: IFileWriteBufferOption): Unit = js.native
  def copy(srcpath: String, destpath: String, options: IFileWriteStringOption): Unit = js.native
  
  /**
    * Set this property to change the default encoding used by all grunt.file methods.
    * Defaults to 'utf8'.
    *
    * If you do have to change this value, it's recommended that you change
    * it as early as possible inside your Gruntfile.
    */
  var defaultEncoding: String = js.native
  
  /**
    * Delete the specified filepath. Will delete files and folders recursively.
    *
    * @return true if the files could be deleted, otherwise false.
    */
  def delete(filepath: String): Boolean = js.native
  def delete(filepath: String, options: Force): Boolean = js.native
  
  /**
    * Are all descendant path(s) contained within the specified ancestor path?
    */
  def doesPathContain(ancestorPath: String, decendantPaths: js.Array[String]): Boolean = js.native
  
  /*
    * Like the Node.js path.join method, the methods below will
    * join all arguments together and normalize the resulting path.
    */
  /**
    * Does the given path exist?
    */
  def exists(path: String, append: String*): Boolean = js.native
  
  def expand(options: IFilesConfig, patterns: String): js.Array[String] = js.native
  def expand(options: IFilesConfig, patterns: js.Array[String]): js.Array[String] = js.native
  /**
    * Return a unique array of all file or directory paths that match the given globbing pattern(s).
    * This method accepts either comma separated globbing patterns or an array of globbing patterns.
    * Paths matching patterns that begin with ! will be excluded from the returned array.
    * Patterns are processed in order, so inclusion and exclusion order is significant.
    *
    * File paths are relative to the Gruntfile unless the current working directory is changed with
    * grunt.file.setBase or the --base command-line option.
    */
  def expand(patterns: String): js.Array[String] = js.native
  def expand(patterns: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Returns an array of src-dest file mapping objects.
    * For each source file matched by a specified pattern, join that file path to the specified dest.
    * This file path may be flattened or renamed, depending on the options specified.
    *
    * @see FileModule.expand method documentation for an explanation of how the patterns
    *      and options arguments may be specified.
    */
  def expandMapping(patterns: js.Array[String], dest: String, options: IExpandedFilesConfig): js.Array[IFileMap] = js.native
  
  var findup: js.Any = js.native
  
  // External libraries
  // TODO: Create declarations
  var glob: js.Any = js.native
  
  /**
    * Is the given path a symbolic link?
    */
  def isDir(path: String, append: String*): Boolean = js.native
  
  /**
    * Is the given path a file?
    */
  def isFile(path: String, append: String*): Boolean = js.native
  
  /**
    * Is the given path a symbolic link?
    */
  def isLink(path: String, append: String*): Boolean = js.native
  
  def isMatch(options: IMinimatchOptions, pattern: String, filepath: String): Boolean = js.native
  def isMatch(options: IMinimatchOptions, pattern: String, filepaths: js.Array[String]): Boolean = js.native
  def isMatch(options: IMinimatchOptions, patterns: js.Array[String], filepath: String): Boolean = js.native
  def isMatch(options: IMinimatchOptions, patterns: js.Array[String], filepaths: js.Array[String]): Boolean = js.native
  /**
    * This method contains the same signature and logic as the grunt.file.match method,
    * but simply returns true if any files were matched, otherwise false.
    *
    * @see FileModule.match
    */
  def isMatch(pattern: String, filepath: String): Boolean = js.native
  def isMatch(pattern: String, filepaths: js.Array[String]): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepath: String): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepaths: js.Array[String]): Boolean = js.native
  
  /**
    * Is a given file path absolute?
    */
  def isPathAbsolute(path: String, append: String*): Boolean = js.native
  
  /**
    * Is a given file path the current working directory (CWD)?
    */
  def isPathCwd(path: String, append: String*): Boolean = js.native
  
  def `match`(options: IMinimatchOptions, pattern: String, filepath: String): js.Array[String] = js.native
  def `match`(options: IMinimatchOptions, pattern: String, filepaths: js.Array[String]): js.Array[String] = js.native
  def `match`(options: IMinimatchOptions, patterns: js.Array[String], filepath: String): js.Array[String] = js.native
  def `match`(options: IMinimatchOptions, patterns: js.Array[String], filepaths: js.Array[String]): js.Array[String] = js.native
  /**
    * Match one or more globbing patterns against one or more file paths.
    * Returns a uniqued array of all file paths that match any of the specified globbing patterns.
    * Both the patterns and filepaths argument can be a single string or array of strings.
    * Paths matching patterns that begin with ! will be excluded from the returned array.
    * Patterns are processed in order, so inclusion and exclusion order is significant.
    */
  def `match`(pattern: String, filepath: String): js.Array[String] = js.native
  def `match`(pattern: String, filepaths: js.Array[String]): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepath: String): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepaths: js.Array[String]): js.Array[String] = js.native
  
  var minimatch: js.Any = js.native
  
  /**
    * Works like mkdir -p. Create a directory along with any intermediate directories.
    * If mode isn't specified, it defaults to 0777 & (~process.umask()).
    */
  def mkdir(dirpath: String): Unit = js.native
  def mkdir(dirpath: String, mode: String): Unit = js.native
  
  /**
    * Read and return a file's contents.
    * Returns a string, unless options.encoding is null in which case it returns a Buffer.
    */
  def read(filepath: String): String = js.native
  def read(filepath: String, options: IFileEncodedOption): Buffer = js.native
  
  /**
    * Read a file's contents, parsing the data as JSON and returning the result.
    * @see FileModule.read for a list of supported options.
    */
  def readJSON(filepath: String): js.Any = js.native
  def readJSON(filepath: String, options: IFileEncodedOption): Buffer = js.native
  
  /**
    * Read a file's contents, parsing the data as YAML and returning the result.
    * @see FileModule.read for a list of supported options.
    */
  def readYAML(filepath: String): js.Any = js.native
  def readYAML(filepath: String, options: IFileEncodedOption): Buffer = js.native
  
  /**
    * Recurse into a directory, executing callback for each file.
    *
    * Callback args:
    * abspath  - The full path to the current file,
    *            which is nothing more than the rootdir + subdir + filename arguments, joined.
    * rootdir  - The root director, as originally specified.
    * subdir   - The current file's directory, relative to rootdir.
    * filename - The filename of the current file, without any directory parts.
    */
  def recurse(
    rootdir: String,
    callback: js.Function4[
      /* abspath */ String, 
      /* rootdir */ String, 
      /* subdir */ String, 
      /* filename */ String, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Change grunt's current working directory (CWD).
    * By default, all file paths are relative to the Gruntfile.
    * This works just like the --base command-line option.
    */
  def setBase(path: String, append: String*): Unit = js.native
  
  /**
    * Write the specified contents to a file, creating intermediate directories if necessary.
    * Strings will be encoded using the specified character encoding, Buffers will be written to disk as-specified.
    *
    * @param contents If `contents` is a Buffer, encoding is ignored.
    * @param options If an encoding is not specified, default to grunt.file.defaultEncoding.
    */
  def write(filepath: String, contents: String): Unit = js.native
  def write(filepath: String, contents: String, options: IFileEncodedOption): Unit = js.native
  def write(filepath: String, contents: Buffer): Unit = js.native
}
