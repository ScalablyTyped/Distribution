package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.setup
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameParentProcess extends Event {
  var name: setup
  var parentProcess: Process
  var testNamePattern: js.UndefOr[String] = js.undefined
}

object Anon_NameParentProcess {
  @scala.inline
  def apply(name: setup, parentProcess: Process, testNamePattern: String = null): Anon_NameParentProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameParentProcess]
  }
}

