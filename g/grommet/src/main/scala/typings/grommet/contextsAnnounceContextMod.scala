package typings.grommet

import typings.grommet.contextsAnnounceContextMod.AnnounceMessage
import typings.grommet.contextsAnnounceContextMod.AnnounceMode
import typings.grommet.contextsAnnounceContextMod.AnnounceValue
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/contexts/AnnounceContext", JSImport.Namespace)
@js.native
object contextsAnnounceContextMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.off
    - typings.grommet.grommetStrings.polite
    - typings.grommet.grommetStrings.assertive
  */
  trait AnnounceMode extends js.Object
  
  val AnnounceContext: Context[AnnounceValue] = js.native
  type AnnounceMessage = String
  type AnnounceValue = js.Function2[/* message */ AnnounceMessage, /* mode */ AnnounceMode, Unit]
}

