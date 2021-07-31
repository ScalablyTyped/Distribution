package typings.materialUiStyles

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverStyleSheetsServerStyleSheetsMod {
  
  @JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
  @js.native
  trait ServerStyleSheets extends StObject {
    
    def collect(children: ReactNode): ReactElement = js.native
    def collect(children: ReactNode, options: js.Object): ReactElement = js.native
    
    def getStyleElement(): ReactElement = js.native
    def getStyleElement(props: js.Object): ReactElement = js.native
  }
}
