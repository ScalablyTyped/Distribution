package typings.jestDashSnapshot

import typings.prettyDashFormat.buildTypesMod.Config
import typings.prettyDashFormat.buildTypesMod.Printer
import typings.prettyDashFormat.buildTypesMod.Refs
import typings.prettyDashFormat.buildTypesMod.Test
import typings.prettyDashFormat.prettyDashFormatMod.NewPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/mock_serializer", JSImport.Namespace)
@js.native
object buildMockUnderscoreSerializerMod extends js.Object {
  val default: NewPlugin = js.native
  val serialize: js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* printer */ Printer, 
    String
  ] = js.native
  val test: Test = js.native
}

