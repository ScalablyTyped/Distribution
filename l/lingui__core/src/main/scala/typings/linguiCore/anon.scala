package typings.linguiCore

import typings.linguiCore.mod.MessageDescriptor
import typings.linguiCore.mod.MessageOptions
import typings.linguiCore.mod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(descriptor: MessageDescriptor): String = js.native
    def apply(id: String): String = js.native
    def apply(id: String, values: Unit, options: MessageOptions): String = js.native
    def apply(id: String, values: Values): String = js.native
    def apply(id: String, values: Values, options: MessageOptions): String = js.native
  }
}
