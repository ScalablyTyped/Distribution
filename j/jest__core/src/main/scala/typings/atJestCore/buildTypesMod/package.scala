package typings.atJestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestCore.Anon_Context
  import typings.atJestCore.Anon_Filtered
  import typings.atJestCore.Anon_IsMatch
  import typings.atJestCore.Anon_Path

  type Filter = js.Function1[/* testPaths */ js.Array[String], js.Promise[Anon_Filtered]]
  type TestPathCases = js.Array[Anon_IsMatch]
  type TestPathCasesWithPathPattern = TestPathCases with Anon_Path
  type TestRunData = js.Array[Anon_Context]
}
