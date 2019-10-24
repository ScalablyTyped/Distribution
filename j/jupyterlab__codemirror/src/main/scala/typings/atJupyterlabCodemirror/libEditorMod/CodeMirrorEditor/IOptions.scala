package typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a code mirror editor.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IOptions * / any */ trait IOptions extends js.Object {
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[Partial[IConfig]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(config: Partial[IConfig] = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[IOptions]
  }
}

