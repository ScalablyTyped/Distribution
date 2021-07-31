package typings.jestEnvironmentJsdom

import typings.jestEnvironment.mod.EnvironmentContext
import typings.jestEnvironment.mod.JestEnvironment
import typings.jestEnvironmentJsdom.anon.EventerrorError
import typings.jestEnvironmentJsdom.anon.StackTraceLimit
import typings.jestTypes.configMod.ProjectConfig
import typings.jestTypes.globalMod.Global
import typings.node.vmMod.Context
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.VoidFunction
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-jsdom", JSImport.Namespace)
  @js.native
  class ^ protected () extends JSDOMEnvironment {
    def this(config: ProjectConfig) = this()
    def this(config: ProjectConfig, options: EnvironmentContext) = this()
  }
  
  @js.native
  trait JSDOMEnvironment extends JestEnvironment {
    
    var dom: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSDOM */ js.Any) | Null = js.native
    
    var errorEventListener: (js.Function1[/* event */ EventerrorError, Unit]) | Null = js.native
    
    @JSName("getVmContext")
    def getVmContext_MJSDOMEnvironment(): Context | Null = js.native
    
    @JSName("global")
    var global_JSDOMEnvironment: Win = js.native
  }
  
  @js.native
  trait Win
    extends StObject
       with Window
       with Global {
    
    @JSName("Error")
    var Error_FWin: StackTraceLimit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    override def queueMicrotask(callback: VoidFunction): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
