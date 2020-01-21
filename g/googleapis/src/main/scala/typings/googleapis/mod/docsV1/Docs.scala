package typings.googleapis.mod.docsV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Docs API
  *
  * Reads and writes Google Docs documents.
  *
  * @example
  * const {google} = require('googleapis');
  * const docs = google.docs('v1');
  *
  * @namespace docs
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Docs
  */
@JSImport("googleapis", "docs_v1.Docs")
@js.native
class Docs protected ()
  extends typings.googleapis.docsV1Mod.docsV1.Docs {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

