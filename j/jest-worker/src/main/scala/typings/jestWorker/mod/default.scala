package typings.jestWorker.mod

import typings.jestWorker.typesMod.FarmOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker", JSImport.Default)
@js.native
class default protected () extends JestWorker {
  def this(workerPath: String) = this()
  def this(workerPath: String, options: FarmOptions) = this()
}

