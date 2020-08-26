package typings.i18nextNodeFsBackend.i18nextNodeFsBackEnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next-node-fs-backend".
  * @interface
  */
@js.native
trait i18nextNodeFsBackEndOptions extends js.Object {
  /**
    * @summary Path to post missing resources
    * @type {string}
    */
  var addPath: String = js.native
  /**
    * @summary jsonIndent to use when storing json files
    * @type {number}
    */
  var jsonIndent: Double = js.native
  /**
    * @summary Path where resources get loaded from.
    * @type {string}
    */
  var loadPath: String = js.native
  /**
    * @summary custom parser
    * @type {function}
    */
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
}

object i18nextNodeFsBackEndOptions {
  @scala.inline
  def apply(addPath: String, jsonIndent: Double, loadPath: String): i18nextNodeFsBackEndOptions = {
    val __obj = js.Dynamic.literal(addPath = addPath.asInstanceOf[js.Any], jsonIndent = jsonIndent.asInstanceOf[js.Any], loadPath = loadPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nextNodeFsBackEndOptions]
  }
  @scala.inline
  implicit class i18nextNodeFsBackEndOptionsOps[Self <: i18nextNodeFsBackEndOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPath(value: String): Self = this.set("addPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonIndent(value: Double): Self = this.set("jsonIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadPath(value: String): Self = this.set("loadPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParse(value: /* data */ js.Any => _): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
  
}

