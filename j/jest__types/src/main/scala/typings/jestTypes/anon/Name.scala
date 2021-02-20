package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.JestGlobals
import typings.jestTypes.circusMod.Process
import typings.jestTypes.jestTypesStrings.setup
import org.scalablytyped.runtime.StObject
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
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: setup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProcess(value: Process): Self = StObject.set(x, "parentProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeGlobals(value: JestGlobals): Self = StObject.set(x, "runtimeGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
  }
}
