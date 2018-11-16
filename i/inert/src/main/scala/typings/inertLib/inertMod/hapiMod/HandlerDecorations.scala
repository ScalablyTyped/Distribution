package typings
package inertLib.inertMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HandlerDecorations extends js.Object {
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
  var directory: js.UndefOr[inertLib.inertMod.inertNs.DirectoryHandlerRouteObject] = js.undefined
  /**
           * The file handler
           *
           * Generates a static file endpoint for serving a single file. file can be set to:
           *  * a relative or absolute file path string (relative paths are resolved based on the route files configuration).
           *  * a function with the signature function(request) which returns the relative or absolute file path.
           *  * an object with one or more of the following options @see IFileHandler
           * @see {@link https://github.com/hapijs/inert#the-file-handler}
           */
  var file: js.UndefOr[
    java.lang.String | inertLib.inertMod.inertNs.RequestHandler[java.lang.String] | inertLib.inertMod.inertNs.FileHandlerRouteObject
  ] = js.undefined
  var files: js.UndefOr[inertLib.Anon_RelativeTo] = js.undefined
}

