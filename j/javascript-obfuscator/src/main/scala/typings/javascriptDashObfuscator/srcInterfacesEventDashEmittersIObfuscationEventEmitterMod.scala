package typings.javascriptDashObfuscator

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/event-emitters/IObfuscationEventEmitter", JSImport.Namespace)
@js.native
object srcInterfacesEventDashEmittersIObfuscationEventEmitterMod extends js.Object {
  @js.native
  trait IObfuscationEventEmitter extends EventEmitter {
    /**
      * @param event
      * @param listener
      * @returns this
      */
    def on(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
      listener: js.Function
    ): this.type = js.native
    /**
      * @param event
      * @param listener
      * @returns this
      */
    def once(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
      listener: js.Function
    ): this.type = js.native
  }
  
}

