package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jimpLib {
  type ChangeName = jimpLib.jimpLibStrings.background | jimpLib.jimpLibStrings.scan | jimpLib.jimpLibStrings.crop
  type ColorActionName = jimpLib.jimpLibStrings.mix | jimpLib.jimpLibStrings.tint | jimpLib.jimpLibStrings.shade | jimpLib.jimpLibStrings.xor | jimpLib.jimpLibStrings.red | jimpLib.jimpLibStrings.green | jimpLib.jimpLibStrings.blue | jimpLib.jimpLibStrings.hue
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ nodeLib.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Jimp */ /* this */ js.Any, 
    /* err */ nodeLib.Error | scala.Null, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Jimp */ /* value */ js.Any, 
    /* coords */ Anon_Y, 
    U
  ]
  type ListenableName = jimpLib.jimpLibStrings.any | jimpLib.jimpLibStrings.initialized | jimpLib.jimpLibStrings.`before-change` | jimpLib.jimpLibStrings.changed | jimpLib.jimpLibStrings.`before-clone` | jimpLib.jimpLibStrings.cloned | ChangeName
  type ListenerData[T /* <: ListenableName */] = Anon_EventName[T] | Anon_Key[T]
  type PrintableText = js.Any | Anon_Text
}
