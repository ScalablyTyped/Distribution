package typings.googleapis.googleapisMod.books_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Books {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

