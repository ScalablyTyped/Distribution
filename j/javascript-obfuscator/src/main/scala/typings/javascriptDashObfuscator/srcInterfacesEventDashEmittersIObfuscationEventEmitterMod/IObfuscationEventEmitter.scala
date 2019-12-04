package typings.javascriptDashObfuscator.srcInterfacesEventDashEmittersIObfuscationEventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Events * / any */ trait IObfuscationEventEmitter extends js.Object {
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def on(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def once(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type
}

object IObfuscationEventEmitter {
  @scala.inline
  def apply(
    on: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter,
    once: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter
  ): IObfuscationEventEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
  
    __obj.asInstanceOf[IObfuscationEventEmitter]
  }
}

