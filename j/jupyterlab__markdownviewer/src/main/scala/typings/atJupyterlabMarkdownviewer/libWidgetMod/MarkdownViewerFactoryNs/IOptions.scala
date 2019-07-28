package typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactoryNs

import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IOptions extends js.Object {
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IFileType */ js.Any
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    primaryFileType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IFileType */ js.Any,
    rendermime: IRenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(primaryFileType = primaryFileType, rendermime = rendermime)
  
    __obj.asInstanceOf[IOptions]
  }
}

