package typings.less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Less_ {
    
    @JSGlobal("Less.PluginManager")
    @js.native
    class PluginManager protected ()
      extends StObject
         with typings.less.Less.PluginManager {
      def this(less: LessStatic) = this()
    }
  }
  
  @JSGlobal("less")
  @js.native
  def less: LessStatic = js.native
  @scala.inline
  def less_=(x: LessStatic): Unit = js.Dynamic.global.updateDynamic("less")(x.asInstanceOf[js.Any])
}
