package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.JestGlobals
import typings.jestTypes.circusMod.Process
import typings.jestTypes.jestTypesStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends AsyncEvent {
  
  var name: setup = js.native
  
  var parentProcess: Process = js.native
  
  var runtimeGlobals: JestGlobals = js.native
  
  var testNamePattern: js.UndefOr[String] = js.native
}
object Name {
  
  @scala.inline
  def apply(name: setup, parentProcess: Process, runtimeGlobals: JestGlobals): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setRuntimeGlobals(value: JestGlobals): Self = this.set("runtimeGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNamePattern(value: String): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestNamePattern: Self = this.set("testNamePattern", js.undefined)
  }
}
