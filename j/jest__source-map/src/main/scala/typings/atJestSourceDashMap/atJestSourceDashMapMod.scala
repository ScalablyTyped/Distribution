package typings.atJestSourceDashMap

import typings.callsites.callsitesMod.CallSite
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/source-map", JSImport.Namespace)
@js.native
object atJestSourceDashMapMod extends js.Object {
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}

