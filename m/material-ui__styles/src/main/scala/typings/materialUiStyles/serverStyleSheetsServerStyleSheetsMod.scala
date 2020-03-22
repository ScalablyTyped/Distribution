package typings.materialUiStyles

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Namespace)
@js.native
object serverStyleSheetsServerStyleSheetsMod extends js.Object {
  @js.native
  trait ServerStyleSheets extends js.Object {
    def collect(children: ReactNode): ReactElement = js.native
    def collect(children: ReactNode, options: js.Object): ReactElement = js.native
    def getStyleElement(): ReactElement = js.native
    def getStyleElement(props: js.Object): ReactElement = js.native
  }
  
  @js.native
  class default () extends ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
}

