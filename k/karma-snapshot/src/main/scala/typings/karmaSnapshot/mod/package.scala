package typings.karmaSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Custom path resolver
    */
  type SnapshotPathResolver = js.Function2[/* basePath */ java.lang.String, /* suiteName */ java.lang.String, java.lang.String]
}
