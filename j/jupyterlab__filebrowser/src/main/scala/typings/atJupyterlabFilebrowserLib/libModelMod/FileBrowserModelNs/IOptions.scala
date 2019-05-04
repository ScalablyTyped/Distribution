package typings
package atJupyterlabFilebrowserLib.libModelMod.FileBrowserModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser.
  */
trait IOptions extends js.Object {
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A document manager instance.
    */
  var manager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentManager */ js.Any
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional state database. If provided, the model will restore which
    * folder was last opened when it is restored.
    */
  var state: js.UndefOr[atJupyterlabCoreutilsLib.libStatedbMod.IStateDB] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentManager */ js.Any,
    driveName: java.lang.String = null,
    refreshInterval: scala.Int | scala.Double = null,
    state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager)
    if (driveName != null) __obj.updateDynamic("driveName")(driveName)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IOptions]
  }
}

