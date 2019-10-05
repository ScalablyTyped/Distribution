package typings.gulpDashTypescript.gulpDashTypescriptMod

import typings.gulpDashTypescript.releaseReporterMod.CompilationResult
import typings.gulpDashTypescript.releaseReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript", "reporter")
@js.native
object reporter extends js.Object {
  def countErrors(results: CompilationResult): Double = js.native
  def defaultReporter(): Reporter = js.native
  def emptyCompilationResult(noEmit: Boolean): CompilationResult = js.native
  def fullReporter(): Reporter = js.native
  def fullReporter(fullFilename: Boolean): Reporter = js.native
  def longReporter(): Reporter = js.native
  def nullReporter(): Reporter = js.native
}

