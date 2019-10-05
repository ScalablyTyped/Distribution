package typings.grunt.grunt.file

import typings.grunt.Anon_Force
import typings.grunt.minimatch.IMinimatchOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file}
  */
@js.native
trait FileModule extends js.Object {
  /**
    * Set this property to change the default encoding used by all grunt.file methods.
    * Defaults to 'utf8'.
    *
    * If you do have to change this value, it's recommended that you change
    * it as early as possible inside your Gruntfile.
    */
  var defaultEncoding: java.lang.String = js.native
  var findup: js.Any = js.native
  // External libraries
  // TODO: Create declarations
  var glob: js.Any = js.native
  var minimatch: js.Any = js.native
  /**
    * Do all the specified paths refer to the same path?
    */
  def arePathsEquivalent(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  /**
    * Copy a source file to a destination path, creating intermediate directories if necessary.
    */
  def copy(srcpath: java.lang.String, destpath: java.lang.String): Unit = js.native
  def copy(srcpath: java.lang.String, destpath: java.lang.String, options: IFileWriteBufferOption): Unit = js.native
  def copy(srcpath: java.lang.String, destpath: java.lang.String, options: IFileWriteStringOption): Unit = js.native
  /**
    * Delete the specified filepath. Will delete files and folders recursively.
    *
    * @return true if the files could be deleted, otherwise false.
    */
  def delete(filepath: java.lang.String): Boolean = js.native
  def delete(filepath: java.lang.String, options: Anon_Force): Boolean = js.native
  /**
    * Are all descendant path(s) contained within the specified ancestor path?
    */
  def doesPathContain(ancestorPath: java.lang.String, decendantPaths: js.Array[java.lang.String]): Boolean = js.native
  /*
    * Like the Node.js path.join method, the methods below will
    * join all arguments together and normalize the resulting path.
    */
  /**
    * Does the given path exist?
    */
  def exists(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  def expand(options: IFilesConfig, patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def expand(options: IFilesConfig, patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Return a unique array of all file or directory paths that match the given globbing pattern(s).
    * This method accepts either comma separated globbing patterns or an array of globbing patterns.
    * Paths matching patterns that begin with ! will be excluded from the returned array.
    * Patterns are processed in order, so inclusion and exclusion order is significant.
    *
    * File paths are relative to the Gruntfile unless the current working directory is changed with
    * grunt.file.setBase or the --base command-line option.
    */
  def expand(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def expand(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Returns an array of src-dest file mapping objects.
    * For each source file matched by a specified pattern, join that file path to the specified dest.
    * This file path may be flattened or renamed, depending on the options specified.
    *
    * @see FileModule.expand method documentation for an explanation of how the patterns
    *      and options arguments may be specified.
    */
  def expandMapping(patterns: js.Array[java.lang.String], dest: java.lang.String, options: IExpandedFilesConfig): js.Array[IFileMap] = js.native
  /**
    * Is the given path a symbolic link?
    */
  def isDir(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  /**
    * Is the given path a file?
    */
  def isFile(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  /**
    * Is the given path a symbolic link?
    */
  def isLink(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  def isMatch(options: IMinimatchOptions, pattern: java.lang.String, filepath: java.lang.String): Boolean = js.native
  def isMatch(options: IMinimatchOptions, pattern: java.lang.String, filepaths: js.Array[java.lang.String]): Boolean = js.native
  def isMatch(options: IMinimatchOptions, patterns: js.Array[java.lang.String], filepath: java.lang.String): Boolean = js.native
  def isMatch(
    options: IMinimatchOptions,
    patterns: js.Array[java.lang.String],
    filepaths: js.Array[java.lang.String]
  ): Boolean = js.native
  /**
    * This method contains the same signature and logic as the grunt.file.match method,
    * but simply returns true if any files were matched, otherwise false.
    *
    * @see FileModule.match
    */
  def isMatch(pattern: java.lang.String, filepath: java.lang.String): Boolean = js.native
  def isMatch(pattern: java.lang.String, filepaths: js.Array[java.lang.String]): Boolean = js.native
  def isMatch(patterns: js.Array[java.lang.String], filepath: java.lang.String): Boolean = js.native
  def isMatch(patterns: js.Array[java.lang.String], filepaths: js.Array[java.lang.String]): Boolean = js.native
  /**
    * Is a given file path absolute?
    */
  def isPathAbsolute(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  /**
    * Is a given file path the current working directory (CWD)?
    */
  def isPathCwd(path: java.lang.String, append: java.lang.String*): Boolean = js.native
  def `match`(options: IMinimatchOptions, pattern: java.lang.String, filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(options: IMinimatchOptions, pattern: java.lang.String, filepaths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def `match`(options: IMinimatchOptions, patterns: js.Array[java.lang.String], filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(
    options: IMinimatchOptions,
    patterns: js.Array[java.lang.String],
    filepaths: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  /**
    * Match one or more globbing patterns against one or more file paths.
    * Returns a uniqued array of all file paths that match any of the specified globbing patterns.
    * Both the patterns and filepaths argument can be a single string or array of strings.
    * Paths matching patterns that begin with ! will be excluded from the returned array.
    * Patterns are processed in order, so inclusion and exclusion order is significant.
    */
  def `match`(pattern: java.lang.String, filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(pattern: java.lang.String, filepaths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def `match`(patterns: js.Array[java.lang.String], filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(patterns: js.Array[java.lang.String], filepaths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Works like mkdir -p. Create a directory along with any intermediate directories.
    * If mode isn't specified, it defaults to 0777 & (~process.umask()).
    */
  def mkdir(dirpath: java.lang.String): Unit = js.native
  def mkdir(dirpath: java.lang.String, mode: java.lang.String): Unit = js.native
  /**
    * Read and return a file's contents.
    * Returns a string, unless options.encoding is null in which case it returns a Buffer.
    */
  def read(filepath: java.lang.String): java.lang.String = js.native
  def read(filepath: java.lang.String, options: IFileEncodedOption): Buffer = js.native
  /**
    * Read a file's contents, parsing the data as JSON and returning the result.
    * @see FileModule.read for a list of supported options.
    */
  def readJSON(filepath: java.lang.String): js.Any = js.native
  def readJSON(filepath: java.lang.String, options: IFileEncodedOption): Buffer = js.native
  /**
    * Read a file's contents, parsing the data as YAML and returning the result.
    * @see FileModule.read for a list of supported options.
    */
  def readYAML(filepath: java.lang.String): js.Any = js.native
  def readYAML(filepath: java.lang.String, options: IFileEncodedOption): Buffer = js.native
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
    rootdir: java.lang.String,
    callback: js.Function4[
      /* abspath */ java.lang.String, 
      /* rootdir */ java.lang.String, 
      /* subdir */ java.lang.String, 
      /* filename */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Change grunt's current working directory (CWD).
    * By default, all file paths are relative to the Gruntfile.
    * This works just like the --base command-line option.
    */
  def setBase(path: java.lang.String, append: java.lang.String*): Unit = js.native
  /**
    * Write the specified contents to a file, creating intermediate directories if necessary.
    * Strings will be encoded using the specified character encoding, Buffers will be written to disk as-specified.
    *
    * @param contents If `contents` is a Buffer, encoding is ignored.
    * @param options If an encoding is not specified, default to grunt.file.defaultEncoding.
    */
  def write(filepath: java.lang.String, contents: java.lang.String): Unit = js.native
  def write(filepath: java.lang.String, contents: java.lang.String, options: IFileEncodedOption): Unit = js.native
  def write(filepath: java.lang.String, contents: Buffer): Unit = js.native
}

