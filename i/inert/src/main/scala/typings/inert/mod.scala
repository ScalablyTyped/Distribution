package typings.inert

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapi.mod.Plugin
import typings.hapi.mod.Request
import typings.hapi.mod.ResponseObject
import typings.inert.anon.RelativeTo
import typings.inert.inertBooleans.`false`
import typings.inert.inertStrings.`inline`
import typings.inert.inertStrings.attachment
import typings.inert.inertStrings.hash
import typings.inert.inertStrings.simple
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("inert", JSImport.Namespace)
  @js.native
  val ^ : Plugin[OptionalRegistrationOptions] = js.native
  
  @js.native
  trait DirectoryHandlerRouteObject extends StObject {
    
    /**
      * defaultExtension - optional string, appended to file requests if the requested file is not found. Defaults to no extension.
      */
    var defaultExtension: js.UndefOr[String] = js.native
    
    /**
      * etagMethod - specifies the method used to calculate the ETag header response. Available values:
      *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
      *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
      *  * false - Disable ETag computation.
      */
    var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
    
    /**
      * index - optional boolean|string|string[], determines if an index file will be served if found in the folder when requesting a directory.
      * The given string or strings specify the name(s) of the index file to look for. If true, looks for 'index.html'.
      * Any falsy value disables index file lookup. Defaults to true.
      */
    var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
    
    /**
      * listing - optional boolean, determines if directory listing is generated when a directory is requested without an index document. Defaults to false.
      */
    var listing: js.UndefOr[Boolean] = js.native
    
    /**
      * lookupCompressed - optional boolean, instructs the file processor to look for the same filename with the '.gz' suffix for a pre-compressed
      * version of the file to serve if the request supports content encoding. Defaults to false.
      */
    var lookupCompressed: js.UndefOr[Boolean] = js.native
    
    /**
      * path - (required) the directory root path (relative paths are resolved based on the route files configuration). Value can be:
      * * a single path string used as the prefix for any resources requested by appending the request path parameter to the provided string.
      * * an array of path strings. Each path will be attempted in order until a match is found (by following the same process as the single path string).
      * * a function with the signature function(request) which returns the path string or an array of path strings.
      *   If the function returns an error, the error is passed back to the client in the response.
      */
    var path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error]) = js.native
    
    /**
      * redirectToSlash - optional boolean, determines if requests for a directory without a trailing slash are redirected to the same path with the missing slash.
      * Useful for ensuring relative links inside the response are resolved correctly.
      * Disabled when the server config router.stripTrailingSlash is true.Defaults to false.
      */
    var redirectToSlash: js.UndefOr[Boolean] = js.native
    
    /**
      * showHidden - optional boolean, determines if hidden files will be shown and served. Defaults to false.
      */
    var showHidden: js.UndefOr[Boolean] = js.native
  }
  object DirectoryHandlerRouteObject {
    
    @scala.inline
    def apply(path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error])): DirectoryHandlerRouteObject = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryHandlerRouteObject]
    }
    
    @scala.inline
    implicit class DirectoryHandlerRouteObjectMutableBuilder[Self <: DirectoryHandlerRouteObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultExtension(value: String): Self = StObject.set(x, "defaultExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExtensionUndefined: Self = StObject.set(x, "defaultExtension", js.undefined)
      
      @scala.inline
      def setEtagMethod(value: hash | simple | `false`): Self = StObject.set(x, "etagMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagMethodUndefined: Self = StObject.set(x, "etagMethod", js.undefined)
      
      @scala.inline
      def setIndex(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setListing(value: Boolean): Self = StObject.set(x, "listing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListingUndefined: Self = StObject.set(x, "listing", js.undefined)
      
      @scala.inline
      def setLookupCompressed(value: Boolean): Self = StObject.set(x, "lookupCompressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupCompressedUndefined: Self = StObject.set(x, "lookupCompressed", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathFunction1(value: /* request */ Request => String | js.Array[String] | Error): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRedirectToSlash(value: Boolean): Self = StObject.set(x, "redirectToSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectToSlashUndefined: Self = StObject.set(x, "redirectToSlash", js.undefined)
      
      @scala.inline
      def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    }
  }
  
  @js.native
  trait FileHandlerRouteObject extends ReplyFileHandlerOptions {
    
    /**
      * path - a path string or function as described above (required).
      */
    var path: String | RequestHandler[String] = js.native
  }
  object FileHandlerRouteObject {
    
    @scala.inline
    def apply(path: String | RequestHandler[String]): FileHandlerRouteObject = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileHandlerRouteObject]
    }
    
    @scala.inline
    implicit class FileHandlerRouteObjectMutableBuilder[Self <: FileHandlerRouteObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String | RequestHandler[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathFunction1(value: /* request */ Request => String): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * inert accepts the following registration options
    * @see {@link https://github.com/hapijs/inert#registration-options}
    */
  @js.native
  trait OptionalRegistrationOptions extends StObject {
    
    /**
      * sets the maximum number of file etag hash values stored in the etags cache. Defaults to 10000.
      */
    var etagsCacheMaxSize: js.UndefOr[Double] = js.native
  }
  object OptionalRegistrationOptions {
    
    @scala.inline
    def apply(): OptionalRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalRegistrationOptions]
    }
    
    @scala.inline
    implicit class OptionalRegistrationOptionsMutableBuilder[Self <: OptionalRegistrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtagsCacheMaxSize(value: Double): Self = StObject.set(x, "etagsCacheMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagsCacheMaxSizeUndefined: Self = StObject.set(x, "etagsCacheMaxSize", js.undefined)
    }
  }
  
  @js.native
  trait ReplyFileHandlerOptions extends StObject {
    
    /**
      * confine - serve file relative to this directory and returns 403 Forbidden if the path resolves outside the confine directory.
      * Defaults to true which uses the relativeTo route option as the confine. Set to false to disable this security feature.
      */
    var confine: js.UndefOr[Boolean] = js.native
    
    /**
      * end - offset in file to stop reading from. If not set, will read to end of file.
      */
    var end: js.UndefOr[Double] = js.native
    
    /**
      * etagMethod - specifies the method used to calculate the ETag header response. Available values:
      *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
      *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
      *  * false - Disable ETag computation.
      */
    var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
    
    /**
      * filename - an optional filename to specify if sending a 'Content-Disposition' header, defaults to the basename of path
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * lookupCompressed - if true, looks for for a pre-compressed version of the file with the same filename with an extension, depending on the accepted encoding. Defaults to false.
      */
    var lookupCompressed: js.UndefOr[Boolean] = js.native
    
    /**
      * lookupMap - an object which maps content encoding to expected file name extension. Defaults to `{ gzip: '.gz' }.
      */
    var lookupMap: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * mode - specifies whether to include the 'Content-Disposition' header with the response. Available values:
      *  * false - header is not included. This is the default value.
      *  * 'attachment'
      *  *'inline'
      */
    var mode: js.UndefOr[`false` | attachment | `inline`] = js.native
    
    /**
      * start - offset in file to reading from, defaults to 0.
      */
    var start: js.UndefOr[Double] = js.native
  }
  object ReplyFileHandlerOptions {
    
    @scala.inline
    def apply(): ReplyFileHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplyFileHandlerOptions]
    }
    
    @scala.inline
    implicit class ReplyFileHandlerOptionsMutableBuilder[Self <: ReplyFileHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfine(value: Boolean): Self = StObject.set(x, "confine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfineUndefined: Self = StObject.set(x, "confine", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEtagMethod(value: hash | simple | `false`): Self = StObject.set(x, "etagMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagMethodUndefined: Self = StObject.set(x, "etagMethod", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLookupCompressed(value: Boolean): Self = StObject.set(x, "lookupCompressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupCompressedUndefined: Self = StObject.set(x, "lookupCompressed", js.undefined)
      
      @scala.inline
      def setLookupMap(value: StringDictionary[String]): Self = StObject.set(x, "lookupMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupMapUndefined: Self = StObject.set(x, "lookupMap", js.undefined)
      
      @scala.inline
      def setMode(value: `false` | attachment | `inline`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type RequestHandler[T] = js.Function1[/* request */ Request, T]
  
  type _To = Plugin[OptionalRegistrationOptions]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[OptionalRegistrationOptions] = ^
  
  /* augmented module */
  object hapiAugmentingMod {
    
    @js.native
    trait HandlerDecorations extends StObject {
      
      /**
        * The directory handler
        *
        * Generates a directory endpoint for serving static content from a directory.
        * Routes using the directory handler must include a path parameter at the end of the path string
        * (e.g. /path/to/somewhere/{param} where the parameter name does not matter).
        * The path parameter can use any of the parameter options (e.g. {param} for one level files only,
        * {param?} for one level files or the directory root, {param*} for any level, or {param*3} for a specific level).
        * If additional path parameters are present, they are ignored for the purpose of selecting the file system resource.
        * The directory handler is an object with the following options:
        * @see {@link https://github.com/hapijs/inert#the-directory-handler}
        */
      var directory: js.UndefOr[DirectoryHandlerRouteObject] = js.native
      
      /**
        * The file handler
        *
        * Generates a static file endpoint for serving a single file. file can be set to:
        *  * a relative or absolute file path string (relative paths are resolved based on the route files configuration).
        *  * a function with the signature function(request) which returns the relative or absolute file path.
        *  * an object with one or more of the following options @see IFileHandler
        * @see {@link https://github.com/hapijs/inert#the-file-handler}
        */
      var file: js.UndefOr[String | RequestHandler[String] | FileHandlerRouteObject] = js.native
      
      var files: js.UndefOr[RelativeTo] = js.native
    }
    object HandlerDecorations {
      
      @scala.inline
      def apply(): HandlerDecorations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HandlerDecorations]
      }
      
      @scala.inline
      implicit class HandlerDecorationsMutableBuilder[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDirectory(value: DirectoryHandlerRouteObject): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
        
        @scala.inline
        def setFile(value: String | RequestHandler[String] | FileHandlerRouteObject): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileFunction1(value: /* request */ Request => String): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        @scala.inline
        def setFiles(value: RelativeTo): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      }
    }
    
    @js.native
    trait ResponseToolkit extends StObject {
      
      /**
        * Transmits a file from the file system. The 'Content-Type' header defaults to the matching mime type based on filename extension.
        * @see {@link https://github.com/hapijs/inert#replyfilepath-options}
        */
      def file(path: String): ResponseObject = js.native
      def file(path: String, options: ReplyFileHandlerOptions): ResponseObject = js.native
    }
  }
}
