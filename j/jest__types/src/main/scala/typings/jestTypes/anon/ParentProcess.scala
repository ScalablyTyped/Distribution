package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Process
import typings.jestTypes.jestTypesStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentProcess extends Event {
  var name: setup = js.native
  var parentProcess: Process = js.native
  var testNamePattern: js.UndefOr[String] = js.native
}

object ParentProcess {
  @scala.inline
  def apply(name: setup, parentProcess: Process): ParentProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentProcess]
  }
  @scala.inline
  implicit class ParentProcessOps[Self <: ParentProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: setup): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentProcess(value: Process): Self = this.set("parentProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestNamePattern(value: String): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestNamePattern: Self = this.set("testNamePattern", js.undefined)
  }
  
}

