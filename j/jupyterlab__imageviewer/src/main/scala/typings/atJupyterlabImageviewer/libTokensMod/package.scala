package typings.atJupyterlabImageviewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
  import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
  import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
  import typings.atJupyterlabImageviewer.libWidgetMod.ImageViewer

  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}
