package typings.javascriptObfuscator.iobfuscationeventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObfuscationEventEmitter extends js.Object {
  /**
    * @param {ObfuscationEvent} event
    * @param args
    * @returns {boolean}
    */
  def emit(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    args: js.Any*
  ): Boolean
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
    emit: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, /* repeated */ js.Any) => Boolean,
    on: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter,
    once: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter
  ): IObfuscationEventEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
  
    __obj.asInstanceOf[IObfuscationEventEmitter]
  }
}

