package typings.grunt.grunt

import typings.grunt.anon.Force
import typings.grunt.minimatch.IMinimatchOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object file {
  
  /**
    * {@link http://gruntjs.com/api/grunt.file}
    */
  @js.native
  trait FileModule extends StObject {
    
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
    
    var findup: Any = js.native
    
    // External libraries
    // TODO: Create declarations
    var glob: Any = js.native
    
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
    
    var minimatch: Any = js.native
    
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
    def readJSON(filepath: String): Any = js.native
    def readJSON(filepath: String, options: IFileEncodedOption): Buffer = js.native
    
    /**
      * Read a file's contents, parsing the data as YAML and returning the result.
      * @see FileModule.read for a list of supported options.
      */
    def readYAML(filepath: String): Any = js.native
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
  
  /**
    * These are valid for compact-format
    */
  trait IExpandedFilesConfig
    extends StObject
       with IFilesConfig {
    
    /**
      * Replace any existing extension with this value in generated {@link IExpandedFilesConfig.dest} paths.
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Remove all path parts from generated {@link IExpandedFilesConfig.dest} paths.
      */
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This function is called for each matched src file, (after extension renaming and flattening).
      * The {@link IExpandedFilesConfig.dest} and matched {@link IExpandedFilesConfig.src} path are passed in,
      * and this function must return a new dest value.
      * If the same dest is returned more than once, each src which used it will be added to an array of sources for it.
      */
    var rename: js.UndefOr[js.Function] = js.undefined
  }
  object IExpandedFilesConfig {
    
    inline def apply(): IExpandedFilesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpandedFilesConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExpandedFilesConfig] (val x: Self) extends AnyVal {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setRename(value: js.Function): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    }
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.file#grunt.file.defaultencoding}
    */
  trait IFileEncodedOption extends StObject {
    
    var encoding: String
  }
  object IFileEncodedOption {
    
    inline def apply(encoding: String): IFileEncodedOption = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileEncodedOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileEncodedOption] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link http://gruntjs.com/configuring-tasks#files-array-format}
    */
  trait IFileMap extends StObject {
    
    /**
      * destination filename.
      */
    var dest: String
    
    /**
      * source filenames.
      */
    var src: js.Array[String]
  }
  object IFileMap {
    
    inline def apply(dest: String, src: js.Array[String]): IFileMap = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileMap] (val x: Self) extends AnyVal {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
  
  /**
    * @see IFileWriteOptions
    */
  trait IFileWriteBufferOption
    extends StObject
       with IFileWriteOptions {
    
    /**
      * The source file contents and file path are passed into this function,
      * whose return value will be used as the destination file's contents. If
      * this function returns `false`, the file copy will be aborted.
      */
    var process: js.UndefOr[js.Function1[/* buffer */ Buffer, Boolean]] = js.undefined
  }
  object IFileWriteBufferOption {
    
    inline def apply(encoding: String): IFileWriteBufferOption = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileWriteBufferOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileWriteBufferOption] (val x: Self) extends AnyVal {
      
      inline def setProcess(value: /* buffer */ Buffer => Boolean): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.file#grunt.file.copy}
    *
    * @see IFileWriteBufferOption
    * @see IFileWriteStringOption
    */
  trait IFileWriteOptions
    extends StObject
       with IFileEncodedOption {
    
    /**
      * These optional globbing patterns will be matched against the filepath
      * (not the filename) using grunt.file.isMatch. If any specified globbing
      * pattern matches, the file won't be processed via the `process` function.
      * If `true` is specified, processing will be prevented.
      */
    // noProcess?: string[]
    // noProcess?: boolean
    var noProcess: js.UndefOr[Any] = js.undefined
  }
  object IFileWriteOptions {
    
    inline def apply(encoding: String): IFileWriteOptions = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileWriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileWriteOptions] (val x: Self) extends AnyVal {
      
      inline def setNoProcess(value: Any): Self = StObject.set(x, "noProcess", value.asInstanceOf[js.Any])
      
      inline def setNoProcessUndefined: Self = StObject.set(x, "noProcess", js.undefined)
    }
  }
  
  /**
    * @see IFileWriteOptions
    */
  trait IFileWriteStringOption
    extends StObject
       with IFileWriteOptions {
    
    /**
      * The source file contents, source file path, and destination file path
      * are passed into this function, whose return value will be used as the
      * destination file's contents.  
      * If this function returns 'false', the file copy will be aborted.
      * @example
      ```ts
    const copyOptions: grunt.file.IFileWriteStringOption = {
      encoding: options.encoding,
      process: (contents: string, srcpath: string, destpath: string): string | boolean => {
      // some other code
      // return the content to be written or return false to cancel
      return contents;
      },
      noProcess: options.noProcess,
    };
      ```
      */
    var process: js.UndefOr[
        js.Function3[/* contents */ String, /* srcpath */ String, /* destpath */ String, String | Boolean]
      ] = js.undefined
  }
  object IFileWriteStringOption {
    
    inline def apply(encoding: String): IFileWriteStringOption = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileWriteStringOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileWriteStringOption] (val x: Self) extends AnyVal {
      
      inline def setProcess(value: (/* contents */ String, /* srcpath */ String, /* destpath */ String) => String | Boolean): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  /**
    * A convenience type.
    *
    * {@link http://gruntjs.com/configuring-tasks#files}
    */
  type IFilesArray = js.Array[IFilesConfig]
  
  /**
    * {@link http://gruntjs.com/configuring-tasks#files}
    */
  trait IFilesConfig
    extends StObject
       with IMinimatchOptions {
    
    /**
      * Patterns will be matched relative to this path, and all returned filepaths will
      * also be relative to this path.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Destination path prefix.
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * Process a dynamic src-dest file mapping,
      * @see {@link http://gruntjs.com/configuring-tasks#building-the-files-object-dynamically for more information.
      */
    var expand: js.UndefOr[Boolean] = js.undefined
    
    // = false
    /**
      * Either a valid fs.Stats method name:
      * - isFile
      * - isDirectory
      * - isBlockDevice
      * - isCharacterDevice
      * - isSymbolicLink
      * - isFIFO
      * - isSocket
      *
      * or a function that is passed the matched src filepath and returns true or false.
      *
      * string
      * (src: string) => boolean
      */
    // filter?: string
    // filter?: (src: string) => boolean
    var filter: js.UndefOr[Any] = js.undefined
    
    /**
      * Pattern(s) to match, relative to the {@link IExpandedFilesConfig.cwd}.
      */
    var src: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IFilesConfig {
    
    inline def apply(): IFilesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilesConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFilesConfig] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
}
