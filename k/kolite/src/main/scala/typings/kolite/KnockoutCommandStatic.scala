package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// when using AMD, it is exported
@js.native
trait KnockoutCommandStatic extends StObject {
  
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand = js.native
  
  def command(options: KoLiteCommandOptions): KoliteCommand = js.native
}
object KnockoutCommandStatic {
  
  @scala.inline
  def apply(
    asyncCommand: KoLiteCommandOptions => KoliteAsyncCommand,
    command: KoLiteCommandOptions => KoliteCommand
  ): KnockoutCommandStatic = {
    val __obj = js.Dynamic.literal(asyncCommand = js.Any.fromFunction1(asyncCommand), command = js.Any.fromFunction1(command))
    __obj.asInstanceOf[KnockoutCommandStatic]
  }
  
  @scala.inline
  implicit class KnockoutCommandStaticMutableBuilder[Self <: KnockoutCommandStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncCommand(value: KoLiteCommandOptions => KoliteAsyncCommand): Self = StObject.set(x, "asyncCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: KoLiteCommandOptions => KoliteCommand): Self = StObject.set(x, "command", js.Any.fromFunction1(value))
  }
}
