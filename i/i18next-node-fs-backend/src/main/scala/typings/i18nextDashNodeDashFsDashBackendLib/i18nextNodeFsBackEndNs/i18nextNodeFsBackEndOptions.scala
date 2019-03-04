package typings
package i18nextDashNodeDashFsDashBackendLib.i18nextNodeFsBackEndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next-node-fs-backend".
  * @interface
  */
trait i18nextNodeFsBackEndOptions extends js.Object {
  /**
    * @summary Path to post missing resources
    * @type {string}
    */
  var addPath: java.lang.String
  /**
    * @summary jsonIndent to use when storing json files
    * @type {number}
    */
  var jsonIndent: scala.Double
  /**
    * @summary Path where resources get loaded from.
    * @type {string}
    */
  var loadPath: java.lang.String
  /**
    * @summary custom parser
    * @type {function}
    */
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
}

object i18nextNodeFsBackEndOptions {
  @scala.inline
  def apply(
    addPath: java.lang.String,
    jsonIndent: scala.Double,
    loadPath: java.lang.String,
    parse: js.Function1[/* data */ js.Any, _] = null
  ): i18nextNodeFsBackEndOptions = {
    val __obj = js.Dynamic.literal(addPath = addPath, jsonIndent = jsonIndent, loadPath = loadPath)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[i18nextNodeFsBackEndOptions]
  }
}

