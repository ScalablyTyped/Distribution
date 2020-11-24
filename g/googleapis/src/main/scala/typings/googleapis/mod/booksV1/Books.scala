package typings.googleapis.mod.booksV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Books API
  *
  * Searches for books and manages your Google Books library.
  *
  * @example
  * const {google} = require('googleapis');
  * const books = google.books('v1');
  *
  * @namespace books
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Books
  */
@JSImport("googleapis", "books_v1.Books")
@js.native
class Books protected ()
  extends typings.googleapis.booksV1Mod.booksV1.Books {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
