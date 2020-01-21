package typings.hapiInert.mod.hapiHapiAugmentingMod

import typings.hapiInert.AnonRelativeTo
import typings.hapiInert.mod.DirectoryHandlerRouteObject
import typings.hapiInert.mod.FileHandlerRouteObject
import typings.hapiInert.mod.RequestHandler
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
  var directory: js.UndefOr[DirectoryHandlerRouteObject] = js.undefined
  /**
    * The file handler
    *
    * Generates a static file endpoint for serving a single file. file can be set to:
    *  * a relative or absolute file path string (relative paths are resolved based on the route files configuration).
    *  * a function with the signature function(request) which returns the relative or absolute file path.
    *  * an object with one or more of the following options @see IFileHandler
    * @see {@link https://github.com/hapijs/inert#the-file-handler}
    */
  var file: js.UndefOr[String | RequestHandler[String] | FileHandlerRouteObject] = js.undefined
  var files: js.UndefOr[AnonRelativeTo] = js.undefined
}

object HandlerDecorations {
  @scala.inline
  def apply(
    directory: DirectoryHandlerRouteObject = null,
    file: String | RequestHandler[String] | FileHandlerRouteObject = null,
    files: AnonRelativeTo = null
  ): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerDecorations]
  }
}

