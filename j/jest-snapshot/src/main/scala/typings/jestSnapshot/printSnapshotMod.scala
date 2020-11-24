package typings.jestSnapshot

import typings.jestDiff.typesMod.DiffOptionsColor
import typings.jestSnapshot.typesMod.MatchSnapshotConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/printSnapshot", JSImport.Namespace)
@js.native
object printSnapshotMod extends js.Object {
  
  val HINT_ARG: /* "hint" */ String = js.native
  
  val PROPERTIES_ARG: /* "properties" */ String = js.native
  
  val SNAPSHOT_ARG: /* "snapshot" */ String = js.native
  
  val aSnapshotColor: DiffOptionsColor = js.native
  
  val bReceivedColor: DiffOptionsColor = js.native
  
  def getReceivedColorForChalkInstance(chalkInstance: Chalk): DiffOptionsColor = js.native
  
  def getSnapshotColorForChalkInstance(chalkInstance: Chalk): DiffOptionsColor = js.native
  
  def matcherHintFromConfig(hasContextHintInlineSnapshotMatcherNameProperties: MatchSnapshotConfig, isUpdatable: Boolean): String = js.native
  
  def noColor(string: String): String = js.native
  
  def printExpected(`val`: js.Any): String = js.native
  
  def printPropertiesAndReceived(properties: js.Object, received: js.Object, expand: Boolean): String = js.native
  
  def printReceived(`val`: js.Any): String = js.native
  
  def printSnapshotAndReceived(a: String, b: String, received: js.Any, expand: Boolean): String = js.native
  
  type Chalk = typings.chalk.mod.Chalk
}
