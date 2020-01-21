package typings.jestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Filter = js.Function1[
    /* testPaths */ js.Array[java.lang.String], 
    js.Promise[typings.jestCore.AnonFiltered]
  ]
  type TestPathCases = js.Array[typings.jestCore.AnonIsMatch]
  type TestPathCasesWithPathPattern = typings.jestCore.typesMod.TestPathCases with typings.jestCore.AnonPath
  type TestRunData = js.Array[typings.jestCore.AnonContextMatches]
}
