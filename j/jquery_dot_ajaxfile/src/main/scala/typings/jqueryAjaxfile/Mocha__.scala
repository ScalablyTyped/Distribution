package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.Mocha_.IRunner
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha")
@js.native
class Mocha__ () extends js.Object {
  def this(options: AnonBail) = this()
  def addFile(file: String): Mocha_ = js.native
  def asyncOnly(value: Boolean): Mocha_ = js.native
  def bail(): Mocha_ = js.native
  def bail(value: Boolean): Mocha_ = js.native
  def checkLeaks(): Mocha_ = js.native
  def enableTimeouts(value: Boolean): Mocha_ = js.native
  def globals(value: String): Mocha_ = js.native
  def globals(values: js.Array[String]): Mocha_ = js.native
  def grep(value: String): Mocha_ = js.native
  def grep(value: RegExp): Mocha_ = js.native
  /** Enables growl support. */
  def growl(): Mocha_ = js.native
  def ignoreLeaks(value: Boolean): Mocha_ = js.native
  def invert(): Mocha_ = js.native
  def noHighlighting(value: Boolean): Mocha_ = js.native
  /** Sets reporter by name, defaults to "spec". */
  def reporter(name: String): Mocha_ = js.native
  /** Sets reporter constructor, defaults to mocha.reporters.Spec. */
  def reporter(reporter: js.Function2[/* runner */ IRunner, /* options */ js.Any, _]): Mocha_ = js.native
  /** Runs tests and invokes `onComplete()` when finished. */
  def run(): IRunner = js.native
  def run(onComplete: js.Function1[/* failures */ Double, Unit]): IRunner = js.native
  /** Setup mocha with the given options. */
  def setup(options: MochaSetupOptions): Mocha_ = js.native
  def slow(value: Double): Mocha_ = js.native
  def timeout(value: Double): Mocha_ = js.native
  def ui(value: String): Mocha_ = js.native
  def useColors(value: Boolean): Mocha_ = js.native
  def useInlineDiffs(value: Boolean): Mocha_ = js.native
}

