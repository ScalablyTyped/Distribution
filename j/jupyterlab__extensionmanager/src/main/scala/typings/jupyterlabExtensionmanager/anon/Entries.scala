package typings.jupyterlabExtensionmanager.anon

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.listingsMod.IListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries extends js.Object {
  var entries: js.Array[IListEntry]
  var mode: white | black | default | invalid
  var uris: js.Array[String]
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[IListEntry], mode: white | black | default | invalid, uris: js.Array[String]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], uris = uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
}

