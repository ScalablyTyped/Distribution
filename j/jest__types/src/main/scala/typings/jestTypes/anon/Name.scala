package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.setup
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.JestGlobals
import typings.jestTypes.mod.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with AsyncEvent {
  
  var name: setup
  
  var parentProcess: Process
  
  var runtimeGlobals: JestGlobals
  
  var testNamePattern: js.UndefOr[String] = js.undefined
}
object Name {
  
  inline def apply(parentProcess: Process, runtimeGlobals: JestGlobals): Name = {
    val __obj = js.Dynamic.literal(name = "setup", parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: setup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentProcess(value: Process): Self = StObject.set(x, "parentProcess", value.asInstanceOf[js.Any])
    
    inline def setRuntimeGlobals(value: JestGlobals): Self = StObject.set(x, "runtimeGlobals", value.asInstanceOf[js.Any])
    
    inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
  }
}
