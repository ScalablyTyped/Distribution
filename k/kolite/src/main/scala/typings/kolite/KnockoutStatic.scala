package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// when not AMD, add to ko object
trait KnockoutStatic extends StObject {
  
  def DirtyFlag(): DirtyFlagResult
  @JSName("DirtyFlag")
  var DirtyFlag_Original: DirtyFlag
  
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand
  
  def command(options: KoLiteCommandOptions): KoliteCommand
}
object KnockoutStatic {
  
  @scala.inline
  def apply(
    DirtyFlag: DirtyFlag,
    asyncCommand: KoLiteCommandOptions => KoliteAsyncCommand,
    command: KoLiteCommandOptions => KoliteCommand
  ): KnockoutStatic = {
    val __obj = js.Dynamic.literal(DirtyFlag = DirtyFlag.asInstanceOf[js.Any], asyncCommand = js.Any.fromFunction1(asyncCommand), command = js.Any.fromFunction1(command))
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncCommand(value: KoLiteCommandOptions => KoliteAsyncCommand): Self = StObject.set(x, "asyncCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: KoLiteCommandOptions => KoliteCommand): Self = StObject.set(x, "command", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirtyFlag(value: DirtyFlag): Self = StObject.set(x, "DirtyFlag", value.asInstanceOf[js.Any])
  }
}
